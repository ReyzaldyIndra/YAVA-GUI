package com.verdin.jsf.model;

import org.primefaces.model.chart.MeterGaugeChartModel;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@ManagedBean
@ViewScoped
public class CpuUsageBean {
    private AtomicInteger cpuUsage;
    private MeterGaugeChartModel gaugeModel;

    @PostConstruct
    public void init() {
        initCpuGaugeModel();
        initCpuSimulator();
    }

    private void initCpuGaugeModel() {
        gaugeModel = new MeterGaugeChartModel();
        gaugeModel.setIntervals(Arrays.asList(20, 40, 60, 80, 100));
        gaugeModel.setTitle("CPU Usage %");
        gaugeModel.setSeriesColors("aa6666,bb6666,cc6666,dd6666,ee6666");
    }

    private void initCpuSimulator() {
        cpuUsage = new AtomicInteger(50);
        ExecutorService es = Executors.newFixedThreadPool(1);
        es.execute(() -> {
            while (true) {
                int i = ThreadLocalRandom.current()
                                         .nextInt(-15, 16);
                int usage = cpuUsage.get();
                usage += i;
                if (usage < 0) {
                    usage = 0;
                } else if (usage > 100) {
                    usage = 100;
                }
                cpuUsage.set(usage);
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        });
    }


    public MeterGaugeChartModel getMeterGaugeModel() {
        gaugeModel.setValue(cpuUsage.get());
        return gaugeModel;
    }
}