package com.verdin.jsf.hdfs;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fs.azure.user.agent.prefix",
    "fs.defaultFS",
    "fs.s3a.fast.upload",
    "fs.s3a.fast.upload.buffer",
    "fs.s3a.multipart.size",
    "fs.s3a.user.agent.prefix",
    "fs.trash.interval",
    "ha.failover-controller.active-standby-elector.zk.op.retries",
    "hadoop.http.authentication.simple.anonymous.allowed",
    "hadoop.http.cross-origin.allowed-headers",
    "hadoop.http.cross-origin.allowed-methods",
    "hadoop.http.cross-origin.allowed-origins",
    "hadoop.http.cross-origin.max-age",
    "hadoop.http.filter.initializers",
    "hadoop.proxyuser.ambari.groups",
    "hadoop.proxyuser.ambari.hosts",
    "hadoop.proxyuser.hdfs.groups",
    "hadoop.proxyuser.hdfs.hosts",
    "hadoop.security.auth_to_local",
    "hadoop.security.authentication",
    "hadoop.security.authorization",
    "hadoop.security.instrumentation.requires.admin",
    "io.compression.codecs",
    "io.file.buffer.size",
    "io.serializations",
    "ipc.client.connect.max.retries",
    "ipc.client.connection.maxidletime",
    "ipc.client.idlethreshold",
    "ipc.server.tcpnodelay",
    "mapreduce.jobtracker.webinterface.trusted",
    "net.topology.script.file.name",
    "content",
    "dtnode_heapsize",
    "hadoop_heapsize",
    "hadoop_pid_dir_prefix",
    "hadoop_root_logger",
    "hdfs_log_dir_prefix",
    "hdfs_tmp_dir",
    "hdfs_user",
    "hdfs_user_nofile_limit",
    "hdfs_user_nproc_limit",
    "keyserver_host",
    "keyserver_port",
    "namenode_backup_dir",
    "namenode_heapsize",
    "namenode_opt_maxnewsize",
    "namenode_opt_maxpermsize",
    "namenode_opt_newsize",
    "namenode_opt_permsize",
    "nfsgateway_heapsize",
    "proxyuser_group",
    "security.admin.operations.protocol.acl",
    "security.client.datanode.protocol.acl",
    "security.client.protocol.acl",
    "security.datanode.protocol.acl",
    "security.inter.datanode.protocol.acl",
    "security.inter.tracker.protocol.acl",
    "security.job.client.protocol.acl",
    "security.job.task.protocol.acl",
    "security.namenode.protocol.acl",
    "security.refresh.policy.protocol.acl",
    "security.refresh.usertogroups.mappings.protocol.acl",
    "hadoop_log_max_backup_size",
    "hadoop_log_number_of_backup_files",
    "hadoop_security_log_max_backup_size",
    "hadoop_security_log_number_of_backup_files",
    "dfs.block.access.token.enable",
    "dfs.blockreport.initialDelay",
    "dfs.blocksize",
    "dfs.client.read.shortcircuit",
    "dfs.client.read.shortcircuit.streams.cache.size",
    "dfs.client.retry.policy.enabled",
    "dfs.cluster.administrators",
    "dfs.content-summary.limit",
    "dfs.datanode.address",
    "dfs.datanode.balance.bandwidthPerSec",
    "dfs.datanode.data.dir",
    "dfs.datanode.data.dir.perm",
    "dfs.datanode.du.reserved",
    "dfs.datanode.failed.volumes.tolerated",
    "dfs.datanode.http.address",
    "dfs.datanode.https.address",
    "dfs.datanode.ipc.address",
    "dfs.datanode.max.transfer.threads",
    "dfs.domain.socket.path",
    "dfs.encrypt.data.transfer.cipher.suites",
    "dfs.heartbeat.interval",
    "dfs.hosts.exclude",
    "dfs.http.policy",
    "dfs.https.port",
    "dfs.journalnode.edits.dir",
    "dfs.journalnode.http-address",
    "dfs.journalnode.https-address",
    "dfs.namenode.accesstime.precision",
    "dfs.namenode.acls.enabled",
    "dfs.namenode.audit.log.async",
    "dfs.namenode.avoid.read.stale.datanode",
    "dfs.namenode.avoid.write.stale.datanode",
    "dfs.namenode.checkpoint.dir",
    "dfs.namenode.checkpoint.edits.dir",
    "dfs.namenode.checkpoint.period",
    "dfs.namenode.checkpoint.txns",
    "dfs.namenode.fslock.fair",
    "dfs.namenode.handler.count",
    "dfs.namenode.http-address",
    "dfs.namenode.https-address",
    "dfs.namenode.name.dir",
    "dfs.namenode.name.dir.restore",
    "dfs.namenode.rpc-address",
    "dfs.namenode.safemode.threshold-pct",
    "dfs.namenode.secondary.http-address",
    "dfs.namenode.stale.datanode.interval",
    "dfs.namenode.startup.delay.block.deletion.sec",
    "dfs.namenode.write.stale.datanode.ratio",
    "dfs.permissions.enabled",
    "dfs.permissions.superusergroup",
    "dfs.replication",
    "dfs.replication.max",
    "dfs.webhdfs.enabled",
    "fs.permissions.umask-mode",
    "hadoop.caller.context.enabled",
    "manage.include.files",
    "nfs.exports.allowed.hosts",
    "nfs.file.dump.dir",
    "ranger.plugin.hdfs.ambari.cluster.name",
    "xasecure.audit.destination.hdfs",
    "xasecure.audit.destination.hdfs.batch.filespool.dir",
    "xasecure.audit.destination.hdfs.dir",
    "xasecure.audit.destination.solr",
    "xasecure.audit.destination.solr.batch.filespool.dir",
    "xasecure.audit.destination.solr.urls",
    "xasecure.audit.destination.solr.zookeepers",
    "xasecure.audit.is.enabled",
    "xasecure.audit.provider.summary.enabled",
    "REPOSITORY_CONFIG_PASSWORD",
    "REPOSITORY_CONFIG_USERNAME",
    "common.name.for.certificate",
    "hadoop.rpc.protection",
    "policy_user",
    "ranger-hdfs-plugin-enabled",
    "xasecure.policymgr.clientssl.keystore",
    "xasecure.policymgr.clientssl.keystore.credential.file",
    "xasecure.policymgr.clientssl.keystore.password",
    "xasecure.policymgr.clientssl.truststore",
    "xasecure.policymgr.clientssl.truststore.credential.file",
    "xasecure.policymgr.clientssl.truststore.password",
    "ranger.plugin.hdfs.policy.cache.dir",
    "ranger.plugin.hdfs.policy.pollIntervalMs",
    "ranger.plugin.hdfs.policy.rest.ssl.config.file",
    "ranger.plugin.hdfs.policy.rest.url",
    "ranger.plugin.hdfs.policy.source.impl",
    "ranger.plugin.hdfs.service.name",
    "xasecure.add-hadoop-authorization",
    "ssl.client.keystore.location",
    "ssl.client.keystore.password",
    "ssl.client.keystore.type",
    "ssl.client.truststore.location",
    "ssl.client.truststore.password",
    "ssl.client.truststore.reload.interval",
    "ssl.client.truststore.type",
    "ssl.server.keystore.keypassword",
    "ssl.server.keystore.location",
    "ssl.server.keystore.password",
    "ssl.server.keystore.type",
    "ssl.server.truststore.location",
    "ssl.server.truststore.password",
    "ssl.server.truststore.reload.interval",
    "ssl.server.truststore.type",
    "hadoop.proxyuser.hive.groups",
    "hadoop.proxyuser.hive.hosts",
    "hadoop.security.key.provider.path",
    "dfs.encryption.key.provider.uri"
})
public class Properties {

    @JsonProperty("fs.azure.user.agent.prefix")
    private String fsAzureUserAgentPrefix;
    @JsonProperty("fs.defaultFS")
    private String fsDefaultFS;
    @JsonProperty("fs.s3a.fast.upload")
    private String fsS3aFastUpload;
    @JsonProperty("fs.s3a.fast.upload.buffer")
    private String fsS3aFastUploadBuffer;
    @JsonProperty("fs.s3a.multipart.size")
    private String fsS3aMultipartSize;
    @JsonProperty("fs.s3a.user.agent.prefix")
    private String fsS3aUserAgentPrefix;
    @JsonProperty("fs.trash.interval")
    private String fsTrashInterval;
    @JsonProperty("ha.failover-controller.active-standby-elector.zk.op.retries")
    private String haFailoverControllerActiveStandbyElectorZkOpRetries;
    @JsonProperty("hadoop.http.authentication.simple.anonymous.allowed")
    private String hadoopHttpAuthenticationSimpleAnonymousAllowed;
    @JsonProperty("hadoop.http.cross-origin.allowed-headers")
    private String hadoopHttpCrossOriginAllowedHeaders;
    @JsonProperty("hadoop.http.cross-origin.allowed-methods")
    private String hadoopHttpCrossOriginAllowedMethods;
    @JsonProperty("hadoop.http.cross-origin.allowed-origins")
    private String hadoopHttpCrossOriginAllowedOrigins;
    @JsonProperty("hadoop.http.cross-origin.max-age")
    private String hadoopHttpCrossOriginMaxAge;
    @JsonProperty("hadoop.http.filter.initializers")
    private String hadoopHttpFilterInitializers;
    @JsonProperty("hadoop.proxyuser.ambari.groups")
    private String hadoopProxyuserAmbariGroups;
    @JsonProperty("hadoop.proxyuser.ambari.hosts")
    private String hadoopProxyuserAmbariHosts;
    @JsonProperty("hadoop.proxyuser.hdfs.groups")
    private String hadoopProxyuserHdfsGroups;
    @JsonProperty("hadoop.proxyuser.hdfs.hosts")
    private String hadoopProxyuserHdfsHosts;
    @JsonProperty("hadoop.security.auth_to_local")
    private String hadoopSecurityAuthToLocal;
    @JsonProperty("hadoop.security.authentication")
    private String hadoopSecurityAuthentication;
    @JsonProperty("hadoop.security.authorization")
    private String hadoopSecurityAuthorization;
    @JsonProperty("hadoop.security.instrumentation.requires.admin")
    private String hadoopSecurityInstrumentationRequiresAdmin;
    @JsonProperty("io.compression.codecs")
    private String ioCompressionCodecs;
    @JsonProperty("io.file.buffer.size")
    private String ioFileBufferSize;
    @JsonProperty("io.serializations")
    private String ioSerializations;
    @JsonProperty("ipc.client.connect.max.retries")
    private String ipcClientConnectMaxRetries;
    @JsonProperty("ipc.client.connection.maxidletime")
    private String ipcClientConnectionMaxidletime;
    @JsonProperty("ipc.client.idlethreshold")
    private String ipcClientIdlethreshold;
    @JsonProperty("ipc.server.tcpnodelay")
    private String ipcServerTcpnodelay;
    @JsonProperty("mapreduce.jobtracker.webinterface.trusted")
    private String mapreduceJobtrackerWebinterfaceTrusted;
    @JsonProperty("net.topology.script.file.name")
    private String netTopologyScriptFileName;
    @JsonProperty("content")
    private String content;
    @JsonProperty("dtnode_heapsize")
    private String dtnodeHeapsize;
    @JsonProperty("hadoop_heapsize")
    private String hadoopHeapsize;
    @JsonProperty("hadoop_pid_dir_prefix")
    private String hadoopPidDirPrefix;
    @JsonProperty("hadoop_root_logger")
    private String hadoopRootLogger;
    @JsonProperty("hdfs_log_dir_prefix")
    private String hdfsLogDirPrefix;
    @JsonProperty("hdfs_tmp_dir")
    private String hdfsTmpDir;
    @JsonProperty("hdfs_user")
    private String hdfsUser;
    @JsonProperty("hdfs_user_nofile_limit")
    private String hdfsUserNofileLimit;
    @JsonProperty("hdfs_user_nproc_limit")
    private String hdfsUserNprocLimit;
    @JsonProperty("keyserver_host")
    private String keyserverHost;
    @JsonProperty("keyserver_port")
    private String keyserverPort;
    @JsonProperty("namenode_backup_dir")
    private String namenodeBackupDir;
    @JsonProperty("namenode_heapsize")
    private String namenodeHeapsize;
    @JsonProperty("namenode_opt_maxnewsize")
    private String namenodeOptMaxnewsize;
    @JsonProperty("namenode_opt_maxpermsize")
    private String namenodeOptMaxpermsize;
    @JsonProperty("namenode_opt_newsize")
    private String namenodeOptNewsize;
    @JsonProperty("namenode_opt_permsize")
    private String namenodeOptPermsize;
    @JsonProperty("nfsgateway_heapsize")
    private String nfsgatewayHeapsize;
    @JsonProperty("proxyuser_group")
    private String proxyuserGroup;
    @JsonProperty("security.admin.operations.protocol.acl")
    private String securityAdminOperationsProtocolAcl;
    @JsonProperty("security.client.datanode.protocol.acl")
    private String securityClientDatanodeProtocolAcl;
    @JsonProperty("security.client.protocol.acl")
    private String securityClientProtocolAcl;
    @JsonProperty("security.datanode.protocol.acl")
    private String securityDatanodeProtocolAcl;
    @JsonProperty("security.inter.datanode.protocol.acl")
    private String securityInterDatanodeProtocolAcl;
    @JsonProperty("security.inter.tracker.protocol.acl")
    private String securityInterTrackerProtocolAcl;
    @JsonProperty("security.job.client.protocol.acl")
    private String securityJobClientProtocolAcl;
    @JsonProperty("security.job.task.protocol.acl")
    private String securityJobTaskProtocolAcl;
    @JsonProperty("security.namenode.protocol.acl")
    private String securityNamenodeProtocolAcl;
    @JsonProperty("security.refresh.policy.protocol.acl")
    private String securityRefreshPolicyProtocolAcl;
    @JsonProperty("security.refresh.usertogroups.mappings.protocol.acl")
    private String securityRefreshUsertogroupsMappingsProtocolAcl;
    @JsonProperty("hadoop_log_max_backup_size")
    private String hadoopLogMaxBackupSize;
    @JsonProperty("hadoop_log_number_of_backup_files")
    private String hadoopLogNumberOfBackupFiles;
    @JsonProperty("hadoop_security_log_max_backup_size")
    private String hadoopSecurityLogMaxBackupSize;
    @JsonProperty("hadoop_security_log_number_of_backup_files")
    private String hadoopSecurityLogNumberOfBackupFiles;
    @JsonProperty("dfs.block.access.token.enable")
    private String dfsBlockAccessTokenEnable;
    @JsonProperty("dfs.blockreport.initialDelay")
    private String dfsBlockreportInitialDelay;
    @JsonProperty("dfs.blocksize")
    private String dfsBlocksize;
    @JsonProperty("dfs.client.read.shortcircuit")
    private String dfsClientReadShortcircuit;
    @JsonProperty("dfs.client.read.shortcircuit.streams.cache.size")
    private String dfsClientReadShortcircuitStreamsCacheSize;
    @JsonProperty("dfs.client.retry.policy.enabled")
    private String dfsClientRetryPolicyEnabled;
    @JsonProperty("dfs.cluster.administrators")
    private String dfsClusterAdministrators;
    @JsonProperty("dfs.content-summary.limit")
    private String dfsContentSummaryLimit;
    @JsonProperty("dfs.datanode.address")
    private String dfsDatanodeAddress;
    @JsonProperty("dfs.datanode.balance.bandwidthPerSec")
    private String dfsDatanodeBalanceBandwidthPerSec;
    @JsonProperty("dfs.datanode.data.dir")
    private String dfsDatanodeDataDir;
    @JsonProperty("dfs.datanode.data.dir.perm")
    private String dfsDatanodeDataDirPerm;
    @JsonProperty("dfs.datanode.du.reserved")
    private String dfsDatanodeDuReserved;
    @JsonProperty("dfs.datanode.failed.volumes.tolerated")
    private String dfsDatanodeFailedVolumesTolerated;
    @JsonProperty("dfs.datanode.http.address")
    private String dfsDatanodeHttpAddress;
    @JsonProperty("dfs.datanode.https.address")
    private String dfsDatanodeHttpsAddress;
    @JsonProperty("dfs.datanode.ipc.address")
    private String dfsDatanodeIpcAddress;
    @JsonProperty("dfs.datanode.max.transfer.threads")
    private String dfsDatanodeMaxTransferThreads;
    @JsonProperty("dfs.domain.socket.path")
    private String dfsDomainSocketPath;
    @JsonProperty("dfs.encrypt.data.transfer.cipher.suites")
    private String dfsEncryptDataTransferCipherSuites;
    @JsonProperty("dfs.heartbeat.interval")
    private String dfsHeartbeatInterval;
    @JsonProperty("dfs.hosts.exclude")
    private String dfsHostsExclude;
    @JsonProperty("dfs.http.policy")
    private String dfsHttpPolicy;
    @JsonProperty("dfs.https.port")
    private String dfsHttpsPort;
    @JsonProperty("dfs.journalnode.edits.dir")
    private String dfsJournalnodeEditsDir;
    @JsonProperty("dfs.journalnode.http-address")
    private String dfsJournalnodeHttpAddress;
    @JsonProperty("dfs.journalnode.https-address")
    private String dfsJournalnodeHttpsAddress;
    @JsonProperty("dfs.namenode.accesstime.precision")
    private String dfsNamenodeAccesstimePrecision;
    @JsonProperty("dfs.namenode.acls.enabled")
    private String dfsNamenodeAclsEnabled;
    @JsonProperty("dfs.namenode.audit.log.async")
    private String dfsNamenodeAuditLogAsync;
    @JsonProperty("dfs.namenode.avoid.read.stale.datanode")
    private String dfsNamenodeAvoidReadStaleDatanode;
    @JsonProperty("dfs.namenode.avoid.write.stale.datanode")
    private String dfsNamenodeAvoidWriteStaleDatanode;
    @JsonProperty("dfs.namenode.checkpoint.dir")
    private String dfsNamenodeCheckpointDir;
    @JsonProperty("dfs.namenode.checkpoint.edits.dir")
    private String dfsNamenodeCheckpointEditsDir;
    @JsonProperty("dfs.namenode.checkpoint.period")
    private String dfsNamenodeCheckpointPeriod;
    @JsonProperty("dfs.namenode.checkpoint.txns")
    private String dfsNamenodeCheckpointTxns;
    @JsonProperty("dfs.namenode.fslock.fair")
    private String dfsNamenodeFslockFair;
    @JsonProperty("dfs.namenode.handler.count")
    private String dfsNamenodeHandlerCount;
    @JsonProperty("dfs.namenode.http-address")
    private String dfsNamenodeHttpAddress;
    @JsonProperty("dfs.namenode.https-address")
    private String dfsNamenodeHttpsAddress;
    @JsonProperty("dfs.namenode.name.dir")
    private String dfsNamenodeNameDir;
    @JsonProperty("dfs.namenode.name.dir.restore")
    private String dfsNamenodeNameDirRestore;
    @JsonProperty("dfs.namenode.rpc-address")
    private String dfsNamenodeRpcAddress;
    @JsonProperty("dfs.namenode.safemode.threshold-pct")
    private String dfsNamenodeSafemodeThresholdPct;
    @JsonProperty("dfs.namenode.secondary.http-address")
    private String dfsNamenodeSecondaryHttpAddress;
    @JsonProperty("dfs.namenode.stale.datanode.interval")
    private String dfsNamenodeStaleDatanodeInterval;
    @JsonProperty("dfs.namenode.startup.delay.block.deletion.sec")
    private String dfsNamenodeStartupDelayBlockDeletionSec;
    @JsonProperty("dfs.namenode.write.stale.datanode.ratio")
    private String dfsNamenodeWriteStaleDatanodeRatio;
    @JsonProperty("dfs.permissions.enabled")
    private String dfsPermissionsEnabled;
    @JsonProperty("dfs.permissions.superusergroup")
    private String dfsPermissionsSuperusergroup;
    @JsonProperty("dfs.replication")
    private String dfsReplication;
    @JsonProperty("dfs.replication.max")
    private String dfsReplicationMax;
    @JsonProperty("dfs.webhdfs.enabled")
    private String dfsWebhdfsEnabled;
    @JsonProperty("fs.permissions.umask-mode")
    private String fsPermissionsUmaskMode;
    @JsonProperty("hadoop.caller.context.enabled")
    private String hadoopCallerContextEnabled;
    @JsonProperty("manage.include.files")
    private String manageIncludeFiles;
    @JsonProperty("nfs.exports.allowed.hosts")
    private String nfsExportsAllowedHosts;
    @JsonProperty("nfs.file.dump.dir")
    private String nfsFileDumpDir;
    @JsonProperty("ranger.plugin.hdfs.ambari.cluster.name")
    private String rangerPluginHdfsAmbariClusterName;
    @JsonProperty("xasecure.audit.destination.hdfs")
    private String xasecureAuditDestinationHdfs;
    @JsonProperty("xasecure.audit.destination.hdfs.batch.filespool.dir")
    private String xasecureAuditDestinationHdfsBatchFilespoolDir;
    @JsonProperty("xasecure.audit.destination.hdfs.dir")
    private String xasecureAuditDestinationHdfsDir;
    @JsonProperty("xasecure.audit.destination.solr")
    private String xasecureAuditDestinationSolr;
    @JsonProperty("xasecure.audit.destination.solr.batch.filespool.dir")
    private String xasecureAuditDestinationSolrBatchFilespoolDir;
    @JsonProperty("xasecure.audit.destination.solr.urls")
    private String xasecureAuditDestinationSolrUrls;
    @JsonProperty("xasecure.audit.destination.solr.zookeepers")
    private String xasecureAuditDestinationSolrZookeepers;
    @JsonProperty("xasecure.audit.is.enabled")
    private String xasecureAuditIsEnabled;
    @JsonProperty("xasecure.audit.provider.summary.enabled")
    private String xasecureAuditProviderSummaryEnabled;
    @JsonProperty("REPOSITORY_CONFIG_PASSWORD")
    private String repositoryConfigPassword;
    @JsonProperty("REPOSITORY_CONFIG_USERNAME")
    private String repositoryConfigUsername;
    @JsonProperty("common.name.for.certificate")
    private String commonNameForCertificate;
    @JsonProperty("hadoop.rpc.protection")
    private String hadoopRpcProtection;
    @JsonProperty("policy_user")
    private String policyUser;
    @JsonProperty("ranger-hdfs-plugin-enabled")
    private String rangerHdfsPluginEnabled;
    @JsonProperty("xasecure.policymgr.clientssl.keystore")
    private String xasecurePolicymgrClientsslKeystore;
    @JsonProperty("xasecure.policymgr.clientssl.keystore.credential.file")
    private String xasecurePolicymgrClientsslKeystoreCredentialFile;
    @JsonProperty("xasecure.policymgr.clientssl.keystore.password")
    private String xasecurePolicymgrClientsslKeystorePassword;
    @JsonProperty("xasecure.policymgr.clientssl.truststore")
    private String xasecurePolicymgrClientsslTruststore;
    @JsonProperty("xasecure.policymgr.clientssl.truststore.credential.file")
    private String xasecurePolicymgrClientsslTruststoreCredentialFile;
    @JsonProperty("xasecure.policymgr.clientssl.truststore.password")
    private String xasecurePolicymgrClientsslTruststorePassword;
    @JsonProperty("ranger.plugin.hdfs.policy.cache.dir")
    private String rangerPluginHdfsPolicyCacheDir;
    @JsonProperty("ranger.plugin.hdfs.policy.pollIntervalMs")
    private String rangerPluginHdfsPolicyPollIntervalMs;
    @JsonProperty("ranger.plugin.hdfs.policy.rest.ssl.config.file")
    private String rangerPluginHdfsPolicyRestSslConfigFile;
    @JsonProperty("ranger.plugin.hdfs.policy.rest.url")
    private String rangerPluginHdfsPolicyRestUrl;
    @JsonProperty("ranger.plugin.hdfs.policy.source.impl")
    private String rangerPluginHdfsPolicySourceImpl;
    @JsonProperty("ranger.plugin.hdfs.service.name")
    private String rangerPluginHdfsServiceName;
    @JsonProperty("xasecure.add-hadoop-authorization")
    private String xasecureAddHadoopAuthorization;
    @JsonProperty("ssl.client.keystore.location")
    private String sslClientKeystoreLocation;
    @JsonProperty("ssl.client.keystore.password")
    private String sslClientKeystorePassword;
    @JsonProperty("ssl.client.keystore.type")
    private String sslClientKeystoreType;
    @JsonProperty("ssl.client.truststore.location")
    private String sslClientTruststoreLocation;
    @JsonProperty("ssl.client.truststore.password")
    private String sslClientTruststorePassword;
    @JsonProperty("ssl.client.truststore.reload.interval")
    private String sslClientTruststoreReloadInterval;
    @JsonProperty("ssl.client.truststore.type")
    private String sslClientTruststoreType;
    @JsonProperty("ssl.server.keystore.keypassword")
    private String sslServerKeystoreKeypassword;
    @JsonProperty("ssl.server.keystore.location")
    private String sslServerKeystoreLocation;
    @JsonProperty("ssl.server.keystore.password")
    private String sslServerKeystorePassword;
    @JsonProperty("ssl.server.keystore.type")
    private String sslServerKeystoreType;
    @JsonProperty("ssl.server.truststore.location")
    private String sslServerTruststoreLocation;
    @JsonProperty("ssl.server.truststore.password")
    private String sslServerTruststorePassword;
    @JsonProperty("ssl.server.truststore.reload.interval")
    private String sslServerTruststoreReloadInterval;
    @JsonProperty("ssl.server.truststore.type")
    private String sslServerTruststoreType;
    @JsonProperty("hadoop.proxyuser.hive.groups")
    private String hadoopProxyuserHiveGroups;
    @JsonProperty("hadoop.proxyuser.hive.hosts")
    private String hadoopProxyuserHiveHosts;
    @JsonProperty("hadoop.security.key.provider.path")
    private String hadoopSecurityKeyProviderPath;
    @JsonProperty("dfs.encryption.key.provider.uri")
    private String dfsEncryptionKeyProviderUri;

    @JsonProperty("fs.azure.user.agent.prefix")
    public String getFsAzureUserAgentPrefix() {
        return fsAzureUserAgentPrefix;
    }

    @JsonProperty("fs.azure.user.agent.prefix")
    public void setFsAzureUserAgentPrefix(String fsAzureUserAgentPrefix) {
        this.fsAzureUserAgentPrefix = fsAzureUserAgentPrefix;
    }

    @JsonProperty("fs.defaultFS")
    public String getFsDefaultFS() {
        return fsDefaultFS;
    }

    @JsonProperty("fs.defaultFS")
    public void setFsDefaultFS(String fsDefaultFS) {
        this.fsDefaultFS = fsDefaultFS;
    }

    @JsonProperty("fs.s3a.fast.upload")
    public String getFsS3aFastUpload() {
        return fsS3aFastUpload;
    }

    @JsonProperty("fs.s3a.fast.upload")
    public void setFsS3aFastUpload(String fsS3aFastUpload) {
        this.fsS3aFastUpload = fsS3aFastUpload;
    }

    @JsonProperty("fs.s3a.fast.upload.buffer")
    public String getFsS3aFastUploadBuffer() {
        return fsS3aFastUploadBuffer;
    }

    @JsonProperty("fs.s3a.fast.upload.buffer")
    public void setFsS3aFastUploadBuffer(String fsS3aFastUploadBuffer) {
        this.fsS3aFastUploadBuffer = fsS3aFastUploadBuffer;
    }

    @JsonProperty("fs.s3a.multipart.size")
    public String getFsS3aMultipartSize() {
        return fsS3aMultipartSize;
    }

    @JsonProperty("fs.s3a.multipart.size")
    public void setFsS3aMultipartSize(String fsS3aMultipartSize) {
        this.fsS3aMultipartSize = fsS3aMultipartSize;
    }

    @JsonProperty("fs.s3a.user.agent.prefix")
    public String getFsS3aUserAgentPrefix() {
        return fsS3aUserAgentPrefix;
    }

    @JsonProperty("fs.s3a.user.agent.prefix")
    public void setFsS3aUserAgentPrefix(String fsS3aUserAgentPrefix) {
        this.fsS3aUserAgentPrefix = fsS3aUserAgentPrefix;
    }

    @JsonProperty("fs.trash.interval")
    public String getFsTrashInterval() {
        return fsTrashInterval;
    }

    @JsonProperty("fs.trash.interval")
    public void setFsTrashInterval(String fsTrashInterval) {
        this.fsTrashInterval = fsTrashInterval;
    }

    @JsonProperty("ha.failover-controller.active-standby-elector.zk.op.retries")
    public String getHaFailoverControllerActiveStandbyElectorZkOpRetries() {
        return haFailoverControllerActiveStandbyElectorZkOpRetries;
    }

    @JsonProperty("ha.failover-controller.active-standby-elector.zk.op.retries")
    public void setHaFailoverControllerActiveStandbyElectorZkOpRetries(String haFailoverControllerActiveStandbyElectorZkOpRetries) {
        this.haFailoverControllerActiveStandbyElectorZkOpRetries = haFailoverControllerActiveStandbyElectorZkOpRetries;
    }

    @JsonProperty("hadoop.http.authentication.simple.anonymous.allowed")
    public String getHadoopHttpAuthenticationSimpleAnonymousAllowed() {
        return hadoopHttpAuthenticationSimpleAnonymousAllowed;
    }

    @JsonProperty("hadoop.http.authentication.simple.anonymous.allowed")
    public void setHadoopHttpAuthenticationSimpleAnonymousAllowed(String hadoopHttpAuthenticationSimpleAnonymousAllowed) {
        this.hadoopHttpAuthenticationSimpleAnonymousAllowed = hadoopHttpAuthenticationSimpleAnonymousAllowed;
    }

    @JsonProperty("hadoop.http.cross-origin.allowed-headers")
    public String getHadoopHttpCrossOriginAllowedHeaders() {
        return hadoopHttpCrossOriginAllowedHeaders;
    }

    @JsonProperty("hadoop.http.cross-origin.allowed-headers")
    public void setHadoopHttpCrossOriginAllowedHeaders(String hadoopHttpCrossOriginAllowedHeaders) {
        this.hadoopHttpCrossOriginAllowedHeaders = hadoopHttpCrossOriginAllowedHeaders;
    }

    @JsonProperty("hadoop.http.cross-origin.allowed-methods")
    public String getHadoopHttpCrossOriginAllowedMethods() {
        return hadoopHttpCrossOriginAllowedMethods;
    }

    @JsonProperty("hadoop.http.cross-origin.allowed-methods")
    public void setHadoopHttpCrossOriginAllowedMethods(String hadoopHttpCrossOriginAllowedMethods) {
        this.hadoopHttpCrossOriginAllowedMethods = hadoopHttpCrossOriginAllowedMethods;
    }

    @JsonProperty("hadoop.http.cross-origin.allowed-origins")
    public String getHadoopHttpCrossOriginAllowedOrigins() {
        return hadoopHttpCrossOriginAllowedOrigins;
    }

    @JsonProperty("hadoop.http.cross-origin.allowed-origins")
    public void setHadoopHttpCrossOriginAllowedOrigins(String hadoopHttpCrossOriginAllowedOrigins) {
        this.hadoopHttpCrossOriginAllowedOrigins = hadoopHttpCrossOriginAllowedOrigins;
    }

    @JsonProperty("hadoop.http.cross-origin.max-age")
    public String getHadoopHttpCrossOriginMaxAge() {
        return hadoopHttpCrossOriginMaxAge;
    }

    @JsonProperty("hadoop.http.cross-origin.max-age")
    public void setHadoopHttpCrossOriginMaxAge(String hadoopHttpCrossOriginMaxAge) {
        this.hadoopHttpCrossOriginMaxAge = hadoopHttpCrossOriginMaxAge;
    }

    @JsonProperty("hadoop.http.filter.initializers")
    public String getHadoopHttpFilterInitializers() {
        return hadoopHttpFilterInitializers;
    }

    @JsonProperty("hadoop.http.filter.initializers")
    public void setHadoopHttpFilterInitializers(String hadoopHttpFilterInitializers) {
        this.hadoopHttpFilterInitializers = hadoopHttpFilterInitializers;
    }

    @JsonProperty("hadoop.proxyuser.ambari.groups")
    public String getHadoopProxyuserAmbariGroups() {
        return hadoopProxyuserAmbariGroups;
    }

    @JsonProperty("hadoop.proxyuser.ambari.groups")
    public void setHadoopProxyuserAmbariGroups(String hadoopProxyuserAmbariGroups) {
        this.hadoopProxyuserAmbariGroups = hadoopProxyuserAmbariGroups;
    }

    @JsonProperty("hadoop.proxyuser.ambari.hosts")
    public String getHadoopProxyuserAmbariHosts() {
        return hadoopProxyuserAmbariHosts;
    }

    @JsonProperty("hadoop.proxyuser.ambari.hosts")
    public void setHadoopProxyuserAmbariHosts(String hadoopProxyuserAmbariHosts) {
        this.hadoopProxyuserAmbariHosts = hadoopProxyuserAmbariHosts;
    }

    @JsonProperty("hadoop.proxyuser.hdfs.groups")
    public String getHadoopProxyuserHdfsGroups() {
        return hadoopProxyuserHdfsGroups;
    }

    @JsonProperty("hadoop.proxyuser.hdfs.groups")
    public void setHadoopProxyuserHdfsGroups(String hadoopProxyuserHdfsGroups) {
        this.hadoopProxyuserHdfsGroups = hadoopProxyuserHdfsGroups;
    }

    @JsonProperty("hadoop.proxyuser.hdfs.hosts")
    public String getHadoopProxyuserHdfsHosts() {
        return hadoopProxyuserHdfsHosts;
    }

    @JsonProperty("hadoop.proxyuser.hdfs.hosts")
    public void setHadoopProxyuserHdfsHosts(String hadoopProxyuserHdfsHosts) {
        this.hadoopProxyuserHdfsHosts = hadoopProxyuserHdfsHosts;
    }

    @JsonProperty("hadoop.security.auth_to_local")
    public String getHadoopSecurityAuthToLocal() {
        return hadoopSecurityAuthToLocal;
    }

    @JsonProperty("hadoop.security.auth_to_local")
    public void setHadoopSecurityAuthToLocal(String hadoopSecurityAuthToLocal) {
        this.hadoopSecurityAuthToLocal = hadoopSecurityAuthToLocal;
    }

    @JsonProperty("hadoop.security.authentication")
    public String getHadoopSecurityAuthentication() {
        return hadoopSecurityAuthentication;
    }

    @JsonProperty("hadoop.security.authentication")
    public void setHadoopSecurityAuthentication(String hadoopSecurityAuthentication) {
        this.hadoopSecurityAuthentication = hadoopSecurityAuthentication;
    }

    @JsonProperty("hadoop.security.authorization")
    public String getHadoopSecurityAuthorization() {
        return hadoopSecurityAuthorization;
    }

    @JsonProperty("hadoop.security.authorization")
    public void setHadoopSecurityAuthorization(String hadoopSecurityAuthorization) {
        this.hadoopSecurityAuthorization = hadoopSecurityAuthorization;
    }

    @JsonProperty("hadoop.security.instrumentation.requires.admin")
    public String getHadoopSecurityInstrumentationRequiresAdmin() {
        return hadoopSecurityInstrumentationRequiresAdmin;
    }

    @JsonProperty("hadoop.security.instrumentation.requires.admin")
    public void setHadoopSecurityInstrumentationRequiresAdmin(String hadoopSecurityInstrumentationRequiresAdmin) {
        this.hadoopSecurityInstrumentationRequiresAdmin = hadoopSecurityInstrumentationRequiresAdmin;
    }

    @JsonProperty("io.compression.codecs")
    public String getIoCompressionCodecs() {
        return ioCompressionCodecs;
    }

    @JsonProperty("io.compression.codecs")
    public void setIoCompressionCodecs(String ioCompressionCodecs) {
        this.ioCompressionCodecs = ioCompressionCodecs;
    }

    @JsonProperty("io.file.buffer.size")
    public String getIoFileBufferSize() {
        return ioFileBufferSize;
    }

    @JsonProperty("io.file.buffer.size")
    public void setIoFileBufferSize(String ioFileBufferSize) {
        this.ioFileBufferSize = ioFileBufferSize;
    }

    @JsonProperty("io.serializations")
    public String getIoSerializations() {
        return ioSerializations;
    }

    @JsonProperty("io.serializations")
    public void setIoSerializations(String ioSerializations) {
        this.ioSerializations = ioSerializations;
    }

    @JsonProperty("ipc.client.connect.max.retries")
    public String getIpcClientConnectMaxRetries() {
        return ipcClientConnectMaxRetries;
    }

    @JsonProperty("ipc.client.connect.max.retries")
    public void setIpcClientConnectMaxRetries(String ipcClientConnectMaxRetries) {
        this.ipcClientConnectMaxRetries = ipcClientConnectMaxRetries;
    }

    @JsonProperty("ipc.client.connection.maxidletime")
    public String getIpcClientConnectionMaxidletime() {
        return ipcClientConnectionMaxidletime;
    }

    @JsonProperty("ipc.client.connection.maxidletime")
    public void setIpcClientConnectionMaxidletime(String ipcClientConnectionMaxidletime) {
        this.ipcClientConnectionMaxidletime = ipcClientConnectionMaxidletime;
    }

    @JsonProperty("ipc.client.idlethreshold")
    public String getIpcClientIdlethreshold() {
        return ipcClientIdlethreshold;
    }

    @JsonProperty("ipc.client.idlethreshold")
    public void setIpcClientIdlethreshold(String ipcClientIdlethreshold) {
        this.ipcClientIdlethreshold = ipcClientIdlethreshold;
    }

    @JsonProperty("ipc.server.tcpnodelay")
    public String getIpcServerTcpnodelay() {
        return ipcServerTcpnodelay;
    }

    @JsonProperty("ipc.server.tcpnodelay")
    public void setIpcServerTcpnodelay(String ipcServerTcpnodelay) {
        this.ipcServerTcpnodelay = ipcServerTcpnodelay;
    }

    @JsonProperty("mapreduce.jobtracker.webinterface.trusted")
    public String getMapreduceJobtrackerWebinterfaceTrusted() {
        return mapreduceJobtrackerWebinterfaceTrusted;
    }

    @JsonProperty("mapreduce.jobtracker.webinterface.trusted")
    public void setMapreduceJobtrackerWebinterfaceTrusted(String mapreduceJobtrackerWebinterfaceTrusted) {
        this.mapreduceJobtrackerWebinterfaceTrusted = mapreduceJobtrackerWebinterfaceTrusted;
    }

    @JsonProperty("net.topology.script.file.name")
    public String getNetTopologyScriptFileName() {
        return netTopologyScriptFileName;
    }

    @JsonProperty("net.topology.script.file.name")
    public void setNetTopologyScriptFileName(String netTopologyScriptFileName) {
        this.netTopologyScriptFileName = netTopologyScriptFileName;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("dtnode_heapsize")
    public String getDtnodeHeapsize() {
        return dtnodeHeapsize;
    }

    @JsonProperty("dtnode_heapsize")
    public void setDtnodeHeapsize(String dtnodeHeapsize) {
        this.dtnodeHeapsize = dtnodeHeapsize;
    }

    @JsonProperty("hadoop_heapsize")
    public String getHadoopHeapsize() {
        return hadoopHeapsize;
    }

    @JsonProperty("hadoop_heapsize")
    public void setHadoopHeapsize(String hadoopHeapsize) {
        this.hadoopHeapsize = hadoopHeapsize;
    }

    @JsonProperty("hadoop_pid_dir_prefix")
    public String getHadoopPidDirPrefix() {
        return hadoopPidDirPrefix;
    }

    @JsonProperty("hadoop_pid_dir_prefix")
    public void setHadoopPidDirPrefix(String hadoopPidDirPrefix) {
        this.hadoopPidDirPrefix = hadoopPidDirPrefix;
    }

    @JsonProperty("hadoop_root_logger")
    public String getHadoopRootLogger() {
        return hadoopRootLogger;
    }

    @JsonProperty("hadoop_root_logger")
    public void setHadoopRootLogger(String hadoopRootLogger) {
        this.hadoopRootLogger = hadoopRootLogger;
    }

    @JsonProperty("hdfs_log_dir_prefix")
    public String getHdfsLogDirPrefix() {
        return hdfsLogDirPrefix;
    }

    @JsonProperty("hdfs_log_dir_prefix")
    public void setHdfsLogDirPrefix(String hdfsLogDirPrefix) {
        this.hdfsLogDirPrefix = hdfsLogDirPrefix;
    }

    @JsonProperty("hdfs_tmp_dir")
    public String getHdfsTmpDir() {
        return hdfsTmpDir;
    }

    @JsonProperty("hdfs_tmp_dir")
    public void setHdfsTmpDir(String hdfsTmpDir) {
        this.hdfsTmpDir = hdfsTmpDir;
    }

    @JsonProperty("hdfs_user")
    public String getHdfsUser() {
        return hdfsUser;
    }

    @JsonProperty("hdfs_user")
    public void setHdfsUser(String hdfsUser) {
        this.hdfsUser = hdfsUser;
    }

    @JsonProperty("hdfs_user_nofile_limit")
    public String getHdfsUserNofileLimit() {
        return hdfsUserNofileLimit;
    }

    @JsonProperty("hdfs_user_nofile_limit")
    public void setHdfsUserNofileLimit(String hdfsUserNofileLimit) {
        this.hdfsUserNofileLimit = hdfsUserNofileLimit;
    }

    @JsonProperty("hdfs_user_nproc_limit")
    public String getHdfsUserNprocLimit() {
        return hdfsUserNprocLimit;
    }

    @JsonProperty("hdfs_user_nproc_limit")
    public void setHdfsUserNprocLimit(String hdfsUserNprocLimit) {
        this.hdfsUserNprocLimit = hdfsUserNprocLimit;
    }

    @JsonProperty("keyserver_host")
    public String getKeyserverHost() {
        return keyserverHost;
    }

    @JsonProperty("keyserver_host")
    public void setKeyserverHost(String keyserverHost) {
        this.keyserverHost = keyserverHost;
    }

    @JsonProperty("keyserver_port")
    public String getKeyserverPort() {
        return keyserverPort;
    }

    @JsonProperty("keyserver_port")
    public void setKeyserverPort(String keyserverPort) {
        this.keyserverPort = keyserverPort;
    }

    @JsonProperty("namenode_backup_dir")
    public String getNamenodeBackupDir() {
        return namenodeBackupDir;
    }

    @JsonProperty("namenode_backup_dir")
    public void setNamenodeBackupDir(String namenodeBackupDir) {
        this.namenodeBackupDir = namenodeBackupDir;
    }

    @JsonProperty("namenode_heapsize")
    public String getNamenodeHeapsize() {
        return namenodeHeapsize;
    }

    @JsonProperty("namenode_heapsize")
    public void setNamenodeHeapsize(String namenodeHeapsize) {
        this.namenodeHeapsize = namenodeHeapsize;
    }

    @JsonProperty("namenode_opt_maxnewsize")
    public String getNamenodeOptMaxnewsize() {
        return namenodeOptMaxnewsize;
    }

    @JsonProperty("namenode_opt_maxnewsize")
    public void setNamenodeOptMaxnewsize(String namenodeOptMaxnewsize) {
        this.namenodeOptMaxnewsize = namenodeOptMaxnewsize;
    }

    @JsonProperty("namenode_opt_maxpermsize")
    public String getNamenodeOptMaxpermsize() {
        return namenodeOptMaxpermsize;
    }

    @JsonProperty("namenode_opt_maxpermsize")
    public void setNamenodeOptMaxpermsize(String namenodeOptMaxpermsize) {
        this.namenodeOptMaxpermsize = namenodeOptMaxpermsize;
    }

    @JsonProperty("namenode_opt_newsize")
    public String getNamenodeOptNewsize() {
        return namenodeOptNewsize;
    }

    @JsonProperty("namenode_opt_newsize")
    public void setNamenodeOptNewsize(String namenodeOptNewsize) {
        this.namenodeOptNewsize = namenodeOptNewsize;
    }

    @JsonProperty("namenode_opt_permsize")
    public String getNamenodeOptPermsize() {
        return namenodeOptPermsize;
    }

    @JsonProperty("namenode_opt_permsize")
    public void setNamenodeOptPermsize(String namenodeOptPermsize) {
        this.namenodeOptPermsize = namenodeOptPermsize;
    }

    @JsonProperty("nfsgateway_heapsize")
    public String getNfsgatewayHeapsize() {
        return nfsgatewayHeapsize;
    }

    @JsonProperty("nfsgateway_heapsize")
    public void setNfsgatewayHeapsize(String nfsgatewayHeapsize) {
        this.nfsgatewayHeapsize = nfsgatewayHeapsize;
    }

    @JsonProperty("proxyuser_group")
    public String getProxyuserGroup() {
        return proxyuserGroup;
    }

    @JsonProperty("proxyuser_group")
    public void setProxyuserGroup(String proxyuserGroup) {
        this.proxyuserGroup = proxyuserGroup;
    }

    @JsonProperty("security.admin.operations.protocol.acl")
    public String getSecurityAdminOperationsProtocolAcl() {
        return securityAdminOperationsProtocolAcl;
    }

    @JsonProperty("security.admin.operations.protocol.acl")
    public void setSecurityAdminOperationsProtocolAcl(String securityAdminOperationsProtocolAcl) {
        this.securityAdminOperationsProtocolAcl = securityAdminOperationsProtocolAcl;
    }

    @JsonProperty("security.client.datanode.protocol.acl")
    public String getSecurityClientDatanodeProtocolAcl() {
        return securityClientDatanodeProtocolAcl;
    }

    @JsonProperty("security.client.datanode.protocol.acl")
    public void setSecurityClientDatanodeProtocolAcl(String securityClientDatanodeProtocolAcl) {
        this.securityClientDatanodeProtocolAcl = securityClientDatanodeProtocolAcl;
    }

    @JsonProperty("security.client.protocol.acl")
    public String getSecurityClientProtocolAcl() {
        return securityClientProtocolAcl;
    }

    @JsonProperty("security.client.protocol.acl")
    public void setSecurityClientProtocolAcl(String securityClientProtocolAcl) {
        this.securityClientProtocolAcl = securityClientProtocolAcl;
    }

    @JsonProperty("security.datanode.protocol.acl")
    public String getSecurityDatanodeProtocolAcl() {
        return securityDatanodeProtocolAcl;
    }

    @JsonProperty("security.datanode.protocol.acl")
    public void setSecurityDatanodeProtocolAcl(String securityDatanodeProtocolAcl) {
        this.securityDatanodeProtocolAcl = securityDatanodeProtocolAcl;
    }

    @JsonProperty("security.inter.datanode.protocol.acl")
    public String getSecurityInterDatanodeProtocolAcl() {
        return securityInterDatanodeProtocolAcl;
    }

    @JsonProperty("security.inter.datanode.protocol.acl")
    public void setSecurityInterDatanodeProtocolAcl(String securityInterDatanodeProtocolAcl) {
        this.securityInterDatanodeProtocolAcl = securityInterDatanodeProtocolAcl;
    }

    @JsonProperty("security.inter.tracker.protocol.acl")
    public String getSecurityInterTrackerProtocolAcl() {
        return securityInterTrackerProtocolAcl;
    }

    @JsonProperty("security.inter.tracker.protocol.acl")
    public void setSecurityInterTrackerProtocolAcl(String securityInterTrackerProtocolAcl) {
        this.securityInterTrackerProtocolAcl = securityInterTrackerProtocolAcl;
    }

    @JsonProperty("security.job.client.protocol.acl")
    public String getSecurityJobClientProtocolAcl() {
        return securityJobClientProtocolAcl;
    }

    @JsonProperty("security.job.client.protocol.acl")
    public void setSecurityJobClientProtocolAcl(String securityJobClientProtocolAcl) {
        this.securityJobClientProtocolAcl = securityJobClientProtocolAcl;
    }

    @JsonProperty("security.job.task.protocol.acl")
    public String getSecurityJobTaskProtocolAcl() {
        return securityJobTaskProtocolAcl;
    }

    @JsonProperty("security.job.task.protocol.acl")
    public void setSecurityJobTaskProtocolAcl(String securityJobTaskProtocolAcl) {
        this.securityJobTaskProtocolAcl = securityJobTaskProtocolAcl;
    }

    @JsonProperty("security.namenode.protocol.acl")
    public String getSecurityNamenodeProtocolAcl() {
        return securityNamenodeProtocolAcl;
    }

    @JsonProperty("security.namenode.protocol.acl")
    public void setSecurityNamenodeProtocolAcl(String securityNamenodeProtocolAcl) {
        this.securityNamenodeProtocolAcl = securityNamenodeProtocolAcl;
    }

    @JsonProperty("security.refresh.policy.protocol.acl")
    public String getSecurityRefreshPolicyProtocolAcl() {
        return securityRefreshPolicyProtocolAcl;
    }

    @JsonProperty("security.refresh.policy.protocol.acl")
    public void setSecurityRefreshPolicyProtocolAcl(String securityRefreshPolicyProtocolAcl) {
        this.securityRefreshPolicyProtocolAcl = securityRefreshPolicyProtocolAcl;
    }

    @JsonProperty("security.refresh.usertogroups.mappings.protocol.acl")
    public String getSecurityRefreshUsertogroupsMappingsProtocolAcl() {
        return securityRefreshUsertogroupsMappingsProtocolAcl;
    }

    @JsonProperty("security.refresh.usertogroups.mappings.protocol.acl")
    public void setSecurityRefreshUsertogroupsMappingsProtocolAcl(String securityRefreshUsertogroupsMappingsProtocolAcl) {
        this.securityRefreshUsertogroupsMappingsProtocolAcl = securityRefreshUsertogroupsMappingsProtocolAcl;
    }

    @JsonProperty("hadoop_log_max_backup_size")
    public String getHadoopLogMaxBackupSize() {
        return hadoopLogMaxBackupSize;
    }

    @JsonProperty("hadoop_log_max_backup_size")
    public void setHadoopLogMaxBackupSize(String hadoopLogMaxBackupSize) {
        this.hadoopLogMaxBackupSize = hadoopLogMaxBackupSize;
    }

    @JsonProperty("hadoop_log_number_of_backup_files")
    public String getHadoopLogNumberOfBackupFiles() {
        return hadoopLogNumberOfBackupFiles;
    }

    @JsonProperty("hadoop_log_number_of_backup_files")
    public void setHadoopLogNumberOfBackupFiles(String hadoopLogNumberOfBackupFiles) {
        this.hadoopLogNumberOfBackupFiles = hadoopLogNumberOfBackupFiles;
    }

    @JsonProperty("hadoop_security_log_max_backup_size")
    public String getHadoopSecurityLogMaxBackupSize() {
        return hadoopSecurityLogMaxBackupSize;
    }

    @JsonProperty("hadoop_security_log_max_backup_size")
    public void setHadoopSecurityLogMaxBackupSize(String hadoopSecurityLogMaxBackupSize) {
        this.hadoopSecurityLogMaxBackupSize = hadoopSecurityLogMaxBackupSize;
    }

    @JsonProperty("hadoop_security_log_number_of_backup_files")
    public String getHadoopSecurityLogNumberOfBackupFiles() {
        return hadoopSecurityLogNumberOfBackupFiles;
    }

    @JsonProperty("hadoop_security_log_number_of_backup_files")
    public void setHadoopSecurityLogNumberOfBackupFiles(String hadoopSecurityLogNumberOfBackupFiles) {
        this.hadoopSecurityLogNumberOfBackupFiles = hadoopSecurityLogNumberOfBackupFiles;
    }

    @JsonProperty("dfs.block.access.token.enable")
    public String getDfsBlockAccessTokenEnable() {
        return dfsBlockAccessTokenEnable;
    }

    @JsonProperty("dfs.block.access.token.enable")
    public void setDfsBlockAccessTokenEnable(String dfsBlockAccessTokenEnable) {
        this.dfsBlockAccessTokenEnable = dfsBlockAccessTokenEnable;
    }

    @JsonProperty("dfs.blockreport.initialDelay")
    public String getDfsBlockreportInitialDelay() {
        return dfsBlockreportInitialDelay;
    }

    @JsonProperty("dfs.blockreport.initialDelay")
    public void setDfsBlockreportInitialDelay(String dfsBlockreportInitialDelay) {
        this.dfsBlockreportInitialDelay = dfsBlockreportInitialDelay;
    }

    @JsonProperty("dfs.blocksize")
    public String getDfsBlocksize() {
        return dfsBlocksize;
    }

    @JsonProperty("dfs.blocksize")
    public void setDfsBlocksize(String dfsBlocksize) {
        this.dfsBlocksize = dfsBlocksize;
    }

    @JsonProperty("dfs.client.read.shortcircuit")
    public String getDfsClientReadShortcircuit() {
        return dfsClientReadShortcircuit;
    }

    @JsonProperty("dfs.client.read.shortcircuit")
    public void setDfsClientReadShortcircuit(String dfsClientReadShortcircuit) {
        this.dfsClientReadShortcircuit = dfsClientReadShortcircuit;
    }

    @JsonProperty("dfs.client.read.shortcircuit.streams.cache.size")
    public String getDfsClientReadShortcircuitStreamsCacheSize() {
        return dfsClientReadShortcircuitStreamsCacheSize;
    }

    @JsonProperty("dfs.client.read.shortcircuit.streams.cache.size")
    public void setDfsClientReadShortcircuitStreamsCacheSize(String dfsClientReadShortcircuitStreamsCacheSize) {
        this.dfsClientReadShortcircuitStreamsCacheSize = dfsClientReadShortcircuitStreamsCacheSize;
    }

    @JsonProperty("dfs.client.retry.policy.enabled")
    public String getDfsClientRetryPolicyEnabled() {
        return dfsClientRetryPolicyEnabled;
    }

    @JsonProperty("dfs.client.retry.policy.enabled")
    public void setDfsClientRetryPolicyEnabled(String dfsClientRetryPolicyEnabled) {
        this.dfsClientRetryPolicyEnabled = dfsClientRetryPolicyEnabled;
    }

    @JsonProperty("dfs.cluster.administrators")
    public String getDfsClusterAdministrators() {
        return dfsClusterAdministrators;
    }

    @JsonProperty("dfs.cluster.administrators")
    public void setDfsClusterAdministrators(String dfsClusterAdministrators) {
        this.dfsClusterAdministrators = dfsClusterAdministrators;
    }

    @JsonProperty("dfs.content-summary.limit")
    public String getDfsContentSummaryLimit() {
        return dfsContentSummaryLimit;
    }

    @JsonProperty("dfs.content-summary.limit")
    public void setDfsContentSummaryLimit(String dfsContentSummaryLimit) {
        this.dfsContentSummaryLimit = dfsContentSummaryLimit;
    }

    @JsonProperty("dfs.datanode.address")
    public String getDfsDatanodeAddress() {
        return dfsDatanodeAddress;
    }

    @JsonProperty("dfs.datanode.address")
    public void setDfsDatanodeAddress(String dfsDatanodeAddress) {
        this.dfsDatanodeAddress = dfsDatanodeAddress;
    }

    @JsonProperty("dfs.datanode.balance.bandwidthPerSec")
    public String getDfsDatanodeBalanceBandwidthPerSec() {
        return dfsDatanodeBalanceBandwidthPerSec;
    }

    @JsonProperty("dfs.datanode.balance.bandwidthPerSec")
    public void setDfsDatanodeBalanceBandwidthPerSec(String dfsDatanodeBalanceBandwidthPerSec) {
        this.dfsDatanodeBalanceBandwidthPerSec = dfsDatanodeBalanceBandwidthPerSec;
    }

    @JsonProperty("dfs.datanode.data.dir")
    public String getDfsDatanodeDataDir() {
        return dfsDatanodeDataDir;
    }

    @JsonProperty("dfs.datanode.data.dir")
    public void setDfsDatanodeDataDir(String dfsDatanodeDataDir) {
        this.dfsDatanodeDataDir = dfsDatanodeDataDir;
    }

    @JsonProperty("dfs.datanode.data.dir.perm")
    public String getDfsDatanodeDataDirPerm() {
        return dfsDatanodeDataDirPerm;
    }

    @JsonProperty("dfs.datanode.data.dir.perm")
    public void setDfsDatanodeDataDirPerm(String dfsDatanodeDataDirPerm) {
        this.dfsDatanodeDataDirPerm = dfsDatanodeDataDirPerm;
    }

    @JsonProperty("dfs.datanode.du.reserved")
    public String getDfsDatanodeDuReserved() {
        return dfsDatanodeDuReserved;
    }

    @JsonProperty("dfs.datanode.du.reserved")
    public void setDfsDatanodeDuReserved(String dfsDatanodeDuReserved) {
        this.dfsDatanodeDuReserved = dfsDatanodeDuReserved;
    }

    @JsonProperty("dfs.datanode.failed.volumes.tolerated")
    public String getDfsDatanodeFailedVolumesTolerated() {
        return dfsDatanodeFailedVolumesTolerated;
    }

    @JsonProperty("dfs.datanode.failed.volumes.tolerated")
    public void setDfsDatanodeFailedVolumesTolerated(String dfsDatanodeFailedVolumesTolerated) {
        this.dfsDatanodeFailedVolumesTolerated = dfsDatanodeFailedVolumesTolerated;
    }

    @JsonProperty("dfs.datanode.http.address")
    public String getDfsDatanodeHttpAddress() {
        return dfsDatanodeHttpAddress;
    }

    @JsonProperty("dfs.datanode.http.address")
    public void setDfsDatanodeHttpAddress(String dfsDatanodeHttpAddress) {
        this.dfsDatanodeHttpAddress = dfsDatanodeHttpAddress;
    }

    @JsonProperty("dfs.datanode.https.address")
    public String getDfsDatanodeHttpsAddress() {
        return dfsDatanodeHttpsAddress;
    }

    @JsonProperty("dfs.datanode.https.address")
    public void setDfsDatanodeHttpsAddress(String dfsDatanodeHttpsAddress) {
        this.dfsDatanodeHttpsAddress = dfsDatanodeHttpsAddress;
    }

    @JsonProperty("dfs.datanode.ipc.address")
    public String getDfsDatanodeIpcAddress() {
        return dfsDatanodeIpcAddress;
    }

    @JsonProperty("dfs.datanode.ipc.address")
    public void setDfsDatanodeIpcAddress(String dfsDatanodeIpcAddress) {
        this.dfsDatanodeIpcAddress = dfsDatanodeIpcAddress;
    }

    @JsonProperty("dfs.datanode.max.transfer.threads")
    public String getDfsDatanodeMaxTransferThreads() {
        return dfsDatanodeMaxTransferThreads;
    }

    @JsonProperty("dfs.datanode.max.transfer.threads")
    public void setDfsDatanodeMaxTransferThreads(String dfsDatanodeMaxTransferThreads) {
        this.dfsDatanodeMaxTransferThreads = dfsDatanodeMaxTransferThreads;
    }

    @JsonProperty("dfs.domain.socket.path")
    public String getDfsDomainSocketPath() {
        return dfsDomainSocketPath;
    }

    @JsonProperty("dfs.domain.socket.path")
    public void setDfsDomainSocketPath(String dfsDomainSocketPath) {
        this.dfsDomainSocketPath = dfsDomainSocketPath;
    }

    @JsonProperty("dfs.encrypt.data.transfer.cipher.suites")
    public String getDfsEncryptDataTransferCipherSuites() {
        return dfsEncryptDataTransferCipherSuites;
    }

    @JsonProperty("dfs.encrypt.data.transfer.cipher.suites")
    public void setDfsEncryptDataTransferCipherSuites(String dfsEncryptDataTransferCipherSuites) {
        this.dfsEncryptDataTransferCipherSuites = dfsEncryptDataTransferCipherSuites;
    }

    @JsonProperty("dfs.heartbeat.interval")
    public String getDfsHeartbeatInterval() {
        return dfsHeartbeatInterval;
    }

    @JsonProperty("dfs.heartbeat.interval")
    public void setDfsHeartbeatInterval(String dfsHeartbeatInterval) {
        this.dfsHeartbeatInterval = dfsHeartbeatInterval;
    }

    @JsonProperty("dfs.hosts.exclude")
    public String getDfsHostsExclude() {
        return dfsHostsExclude;
    }

    @JsonProperty("dfs.hosts.exclude")
    public void setDfsHostsExclude(String dfsHostsExclude) {
        this.dfsHostsExclude = dfsHostsExclude;
    }

    @JsonProperty("dfs.http.policy")
    public String getDfsHttpPolicy() {
        return dfsHttpPolicy;
    }

    @JsonProperty("dfs.http.policy")
    public void setDfsHttpPolicy(String dfsHttpPolicy) {
        this.dfsHttpPolicy = dfsHttpPolicy;
    }

    @JsonProperty("dfs.https.port")
    public String getDfsHttpsPort() {
        return dfsHttpsPort;
    }

    @JsonProperty("dfs.https.port")
    public void setDfsHttpsPort(String dfsHttpsPort) {
        this.dfsHttpsPort = dfsHttpsPort;
    }

    @JsonProperty("dfs.journalnode.edits.dir")
    public String getDfsJournalnodeEditsDir() {
        return dfsJournalnodeEditsDir;
    }

    @JsonProperty("dfs.journalnode.edits.dir")
    public void setDfsJournalnodeEditsDir(String dfsJournalnodeEditsDir) {
        this.dfsJournalnodeEditsDir = dfsJournalnodeEditsDir;
    }

    @JsonProperty("dfs.journalnode.http-address")
    public String getDfsJournalnodeHttpAddress() {
        return dfsJournalnodeHttpAddress;
    }

    @JsonProperty("dfs.journalnode.http-address")
    public void setDfsJournalnodeHttpAddress(String dfsJournalnodeHttpAddress) {
        this.dfsJournalnodeHttpAddress = dfsJournalnodeHttpAddress;
    }

    @JsonProperty("dfs.journalnode.https-address")
    public String getDfsJournalnodeHttpsAddress() {
        return dfsJournalnodeHttpsAddress;
    }

    @JsonProperty("dfs.journalnode.https-address")
    public void setDfsJournalnodeHttpsAddress(String dfsJournalnodeHttpsAddress) {
        this.dfsJournalnodeHttpsAddress = dfsJournalnodeHttpsAddress;
    }

    @JsonProperty("dfs.namenode.accesstime.precision")
    public String getDfsNamenodeAccesstimePrecision() {
        return dfsNamenodeAccesstimePrecision;
    }

    @JsonProperty("dfs.namenode.accesstime.precision")
    public void setDfsNamenodeAccesstimePrecision(String dfsNamenodeAccesstimePrecision) {
        this.dfsNamenodeAccesstimePrecision = dfsNamenodeAccesstimePrecision;
    }

    @JsonProperty("dfs.namenode.acls.enabled")
    public String getDfsNamenodeAclsEnabled() {
        return dfsNamenodeAclsEnabled;
    }

    @JsonProperty("dfs.namenode.acls.enabled")
    public void setDfsNamenodeAclsEnabled(String dfsNamenodeAclsEnabled) {
        this.dfsNamenodeAclsEnabled = dfsNamenodeAclsEnabled;
    }

    @JsonProperty("dfs.namenode.audit.log.async")
    public String getDfsNamenodeAuditLogAsync() {
        return dfsNamenodeAuditLogAsync;
    }

    @JsonProperty("dfs.namenode.audit.log.async")
    public void setDfsNamenodeAuditLogAsync(String dfsNamenodeAuditLogAsync) {
        this.dfsNamenodeAuditLogAsync = dfsNamenodeAuditLogAsync;
    }

    @JsonProperty("dfs.namenode.avoid.read.stale.datanode")
    public String getDfsNamenodeAvoidReadStaleDatanode() {
        return dfsNamenodeAvoidReadStaleDatanode;
    }

    @JsonProperty("dfs.namenode.avoid.read.stale.datanode")
    public void setDfsNamenodeAvoidReadStaleDatanode(String dfsNamenodeAvoidReadStaleDatanode) {
        this.dfsNamenodeAvoidReadStaleDatanode = dfsNamenodeAvoidReadStaleDatanode;
    }

    @JsonProperty("dfs.namenode.avoid.write.stale.datanode")
    public String getDfsNamenodeAvoidWriteStaleDatanode() {
        return dfsNamenodeAvoidWriteStaleDatanode;
    }

    @JsonProperty("dfs.namenode.avoid.write.stale.datanode")
    public void setDfsNamenodeAvoidWriteStaleDatanode(String dfsNamenodeAvoidWriteStaleDatanode) {
        this.dfsNamenodeAvoidWriteStaleDatanode = dfsNamenodeAvoidWriteStaleDatanode;
    }

    @JsonProperty("dfs.namenode.checkpoint.dir")
    public String getDfsNamenodeCheckpointDir() {
        return dfsNamenodeCheckpointDir;
    }

    @JsonProperty("dfs.namenode.checkpoint.dir")
    public void setDfsNamenodeCheckpointDir(String dfsNamenodeCheckpointDir) {
        this.dfsNamenodeCheckpointDir = dfsNamenodeCheckpointDir;
    }

    @JsonProperty("dfs.namenode.checkpoint.edits.dir")
    public String getDfsNamenodeCheckpointEditsDir() {
        return dfsNamenodeCheckpointEditsDir;
    }

    @JsonProperty("dfs.namenode.checkpoint.edits.dir")
    public void setDfsNamenodeCheckpointEditsDir(String dfsNamenodeCheckpointEditsDir) {
        this.dfsNamenodeCheckpointEditsDir = dfsNamenodeCheckpointEditsDir;
    }

    @JsonProperty("dfs.namenode.checkpoint.period")
    public String getDfsNamenodeCheckpointPeriod() {
        return dfsNamenodeCheckpointPeriod;
    }

    @JsonProperty("dfs.namenode.checkpoint.period")
    public void setDfsNamenodeCheckpointPeriod(String dfsNamenodeCheckpointPeriod) {
        this.dfsNamenodeCheckpointPeriod = dfsNamenodeCheckpointPeriod;
    }

    @JsonProperty("dfs.namenode.checkpoint.txns")
    public String getDfsNamenodeCheckpointTxns() {
        return dfsNamenodeCheckpointTxns;
    }

    @JsonProperty("dfs.namenode.checkpoint.txns")
    public void setDfsNamenodeCheckpointTxns(String dfsNamenodeCheckpointTxns) {
        this.dfsNamenodeCheckpointTxns = dfsNamenodeCheckpointTxns;
    }

    @JsonProperty("dfs.namenode.fslock.fair")
    public String getDfsNamenodeFslockFair() {
        return dfsNamenodeFslockFair;
    }

    @JsonProperty("dfs.namenode.fslock.fair")
    public void setDfsNamenodeFslockFair(String dfsNamenodeFslockFair) {
        this.dfsNamenodeFslockFair = dfsNamenodeFslockFair;
    }

    @JsonProperty("dfs.namenode.handler.count")
    public String getDfsNamenodeHandlerCount() {
        return dfsNamenodeHandlerCount;
    }

    @JsonProperty("dfs.namenode.handler.count")
    public void setDfsNamenodeHandlerCount(String dfsNamenodeHandlerCount) {
        this.dfsNamenodeHandlerCount = dfsNamenodeHandlerCount;
    }

    @JsonProperty("dfs.namenode.http-address")
    public String getDfsNamenodeHttpAddress() {
        return dfsNamenodeHttpAddress;
    }

    @JsonProperty("dfs.namenode.http-address")
    public void setDfsNamenodeHttpAddress(String dfsNamenodeHttpAddress) {
        this.dfsNamenodeHttpAddress = dfsNamenodeHttpAddress;
    }

    @JsonProperty("dfs.namenode.https-address")
    public String getDfsNamenodeHttpsAddress() {
        return dfsNamenodeHttpsAddress;
    }

    @JsonProperty("dfs.namenode.https-address")
    public void setDfsNamenodeHttpsAddress(String dfsNamenodeHttpsAddress) {
        this.dfsNamenodeHttpsAddress = dfsNamenodeHttpsAddress;
    }

    @JsonProperty("dfs.namenode.name.dir")
    public String getDfsNamenodeNameDir() {
        return dfsNamenodeNameDir;
    }

    @JsonProperty("dfs.namenode.name.dir")
    public void setDfsNamenodeNameDir(String dfsNamenodeNameDir) {
        this.dfsNamenodeNameDir = dfsNamenodeNameDir;
    }

    @JsonProperty("dfs.namenode.name.dir.restore")
    public String getDfsNamenodeNameDirRestore() {
        return dfsNamenodeNameDirRestore;
    }

    @JsonProperty("dfs.namenode.name.dir.restore")
    public void setDfsNamenodeNameDirRestore(String dfsNamenodeNameDirRestore) {
        this.dfsNamenodeNameDirRestore = dfsNamenodeNameDirRestore;
    }

    @JsonProperty("dfs.namenode.rpc-address")
    public String getDfsNamenodeRpcAddress() {
        return dfsNamenodeRpcAddress;
    }

    @JsonProperty("dfs.namenode.rpc-address")
    public void setDfsNamenodeRpcAddress(String dfsNamenodeRpcAddress) {
        this.dfsNamenodeRpcAddress = dfsNamenodeRpcAddress;
    }

    @JsonProperty("dfs.namenode.safemode.threshold-pct")
    public String getDfsNamenodeSafemodeThresholdPct() {
        return dfsNamenodeSafemodeThresholdPct;
    }

    @JsonProperty("dfs.namenode.safemode.threshold-pct")
    public void setDfsNamenodeSafemodeThresholdPct(String dfsNamenodeSafemodeThresholdPct) {
        this.dfsNamenodeSafemodeThresholdPct = dfsNamenodeSafemodeThresholdPct;
    }

    @JsonProperty("dfs.namenode.secondary.http-address")
    public String getDfsNamenodeSecondaryHttpAddress() {
        return dfsNamenodeSecondaryHttpAddress;
    }

    @JsonProperty("dfs.namenode.secondary.http-address")
    public void setDfsNamenodeSecondaryHttpAddress(String dfsNamenodeSecondaryHttpAddress) {
        this.dfsNamenodeSecondaryHttpAddress = dfsNamenodeSecondaryHttpAddress;
    }

    @JsonProperty("dfs.namenode.stale.datanode.interval")
    public String getDfsNamenodeStaleDatanodeInterval() {
        return dfsNamenodeStaleDatanodeInterval;
    }

    @JsonProperty("dfs.namenode.stale.datanode.interval")
    public void setDfsNamenodeStaleDatanodeInterval(String dfsNamenodeStaleDatanodeInterval) {
        this.dfsNamenodeStaleDatanodeInterval = dfsNamenodeStaleDatanodeInterval;
    }

    @JsonProperty("dfs.namenode.startup.delay.block.deletion.sec")
    public String getDfsNamenodeStartupDelayBlockDeletionSec() {
        return dfsNamenodeStartupDelayBlockDeletionSec;
    }

    @JsonProperty("dfs.namenode.startup.delay.block.deletion.sec")
    public void setDfsNamenodeStartupDelayBlockDeletionSec(String dfsNamenodeStartupDelayBlockDeletionSec) {
        this.dfsNamenodeStartupDelayBlockDeletionSec = dfsNamenodeStartupDelayBlockDeletionSec;
    }

    @JsonProperty("dfs.namenode.write.stale.datanode.ratio")
    public String getDfsNamenodeWriteStaleDatanodeRatio() {
        return dfsNamenodeWriteStaleDatanodeRatio;
    }

    @JsonProperty("dfs.namenode.write.stale.datanode.ratio")
    public void setDfsNamenodeWriteStaleDatanodeRatio(String dfsNamenodeWriteStaleDatanodeRatio) {
        this.dfsNamenodeWriteStaleDatanodeRatio = dfsNamenodeWriteStaleDatanodeRatio;
    }

    @JsonProperty("dfs.permissions.enabled")
    public String getDfsPermissionsEnabled() {
        return dfsPermissionsEnabled;
    }

    @JsonProperty("dfs.permissions.enabled")
    public void setDfsPermissionsEnabled(String dfsPermissionsEnabled) {
        this.dfsPermissionsEnabled = dfsPermissionsEnabled;
    }

    @JsonProperty("dfs.permissions.superusergroup")
    public String getDfsPermissionsSuperusergroup() {
        return dfsPermissionsSuperusergroup;
    }

    @JsonProperty("dfs.permissions.superusergroup")
    public void setDfsPermissionsSuperusergroup(String dfsPermissionsSuperusergroup) {
        this.dfsPermissionsSuperusergroup = dfsPermissionsSuperusergroup;
    }

    @JsonProperty("dfs.replication")
    public String getDfsReplication() {
        return dfsReplication;
    }

    @JsonProperty("dfs.replication")
    public void setDfsReplication(String dfsReplication) {
        this.dfsReplication = dfsReplication;
    }

    @JsonProperty("dfs.replication.max")
    public String getDfsReplicationMax() {
        return dfsReplicationMax;
    }

    @JsonProperty("dfs.replication.max")
    public void setDfsReplicationMax(String dfsReplicationMax) {
        this.dfsReplicationMax = dfsReplicationMax;
    }

    @JsonProperty("dfs.webhdfs.enabled")
    public String getDfsWebhdfsEnabled() {
        return dfsWebhdfsEnabled;
    }

    @JsonProperty("dfs.webhdfs.enabled")
    public void setDfsWebhdfsEnabled(String dfsWebhdfsEnabled) {
        this.dfsWebhdfsEnabled = dfsWebhdfsEnabled;
    }

    @JsonProperty("fs.permissions.umask-mode")
    public String getFsPermissionsUmaskMode() {
        return fsPermissionsUmaskMode;
    }

    @JsonProperty("fs.permissions.umask-mode")
    public void setFsPermissionsUmaskMode(String fsPermissionsUmaskMode) {
        this.fsPermissionsUmaskMode = fsPermissionsUmaskMode;
    }

    @JsonProperty("hadoop.caller.context.enabled")
    public String getHadoopCallerContextEnabled() {
        return hadoopCallerContextEnabled;
    }

    @JsonProperty("hadoop.caller.context.enabled")
    public void setHadoopCallerContextEnabled(String hadoopCallerContextEnabled) {
        this.hadoopCallerContextEnabled = hadoopCallerContextEnabled;
    }

    @JsonProperty("manage.include.files")
    public String getManageIncludeFiles() {
        return manageIncludeFiles;
    }

    @JsonProperty("manage.include.files")
    public void setManageIncludeFiles(String manageIncludeFiles) {
        this.manageIncludeFiles = manageIncludeFiles;
    }

    @JsonProperty("nfs.exports.allowed.hosts")
    public String getNfsExportsAllowedHosts() {
        return nfsExportsAllowedHosts;
    }

    @JsonProperty("nfs.exports.allowed.hosts")
    public void setNfsExportsAllowedHosts(String nfsExportsAllowedHosts) {
        this.nfsExportsAllowedHosts = nfsExportsAllowedHosts;
    }

    @JsonProperty("nfs.file.dump.dir")
    public String getNfsFileDumpDir() {
        return nfsFileDumpDir;
    }

    @JsonProperty("nfs.file.dump.dir")
    public void setNfsFileDumpDir(String nfsFileDumpDir) {
        this.nfsFileDumpDir = nfsFileDumpDir;
    }

    @JsonProperty("ranger.plugin.hdfs.ambari.cluster.name")
    public String getRangerPluginHdfsAmbariClusterName() {
        return rangerPluginHdfsAmbariClusterName;
    }

    @JsonProperty("ranger.plugin.hdfs.ambari.cluster.name")
    public void setRangerPluginHdfsAmbariClusterName(String rangerPluginHdfsAmbariClusterName) {
        this.rangerPluginHdfsAmbariClusterName = rangerPluginHdfsAmbariClusterName;
    }

    @JsonProperty("xasecure.audit.destination.hdfs")
    public String getXasecureAuditDestinationHdfs() {
        return xasecureAuditDestinationHdfs;
    }

    @JsonProperty("xasecure.audit.destination.hdfs")
    public void setXasecureAuditDestinationHdfs(String xasecureAuditDestinationHdfs) {
        this.xasecureAuditDestinationHdfs = xasecureAuditDestinationHdfs;
    }

    @JsonProperty("xasecure.audit.destination.hdfs.batch.filespool.dir")
    public String getXasecureAuditDestinationHdfsBatchFilespoolDir() {
        return xasecureAuditDestinationHdfsBatchFilespoolDir;
    }

    @JsonProperty("xasecure.audit.destination.hdfs.batch.filespool.dir")
    public void setXasecureAuditDestinationHdfsBatchFilespoolDir(String xasecureAuditDestinationHdfsBatchFilespoolDir) {
        this.xasecureAuditDestinationHdfsBatchFilespoolDir = xasecureAuditDestinationHdfsBatchFilespoolDir;
    }

    @JsonProperty("xasecure.audit.destination.hdfs.dir")
    public String getXasecureAuditDestinationHdfsDir() {
        return xasecureAuditDestinationHdfsDir;
    }

    @JsonProperty("xasecure.audit.destination.hdfs.dir")
    public void setXasecureAuditDestinationHdfsDir(String xasecureAuditDestinationHdfsDir) {
        this.xasecureAuditDestinationHdfsDir = xasecureAuditDestinationHdfsDir;
    }

    @JsonProperty("xasecure.audit.destination.solr")
    public String getXasecureAuditDestinationSolr() {
        return xasecureAuditDestinationSolr;
    }

    @JsonProperty("xasecure.audit.destination.solr")
    public void setXasecureAuditDestinationSolr(String xasecureAuditDestinationSolr) {
        this.xasecureAuditDestinationSolr = xasecureAuditDestinationSolr;
    }

    @JsonProperty("xasecure.audit.destination.solr.batch.filespool.dir")
    public String getXasecureAuditDestinationSolrBatchFilespoolDir() {
        return xasecureAuditDestinationSolrBatchFilespoolDir;
    }

    @JsonProperty("xasecure.audit.destination.solr.batch.filespool.dir")
    public void setXasecureAuditDestinationSolrBatchFilespoolDir(String xasecureAuditDestinationSolrBatchFilespoolDir) {
        this.xasecureAuditDestinationSolrBatchFilespoolDir = xasecureAuditDestinationSolrBatchFilespoolDir;
    }

    @JsonProperty("xasecure.audit.destination.solr.urls")
    public String getXasecureAuditDestinationSolrUrls() {
        return xasecureAuditDestinationSolrUrls;
    }

    @JsonProperty("xasecure.audit.destination.solr.urls")
    public void setXasecureAuditDestinationSolrUrls(String xasecureAuditDestinationSolrUrls) {
        this.xasecureAuditDestinationSolrUrls = xasecureAuditDestinationSolrUrls;
    }

    @JsonProperty("xasecure.audit.destination.solr.zookeepers")
    public String getXasecureAuditDestinationSolrZookeepers() {
        return xasecureAuditDestinationSolrZookeepers;
    }

    @JsonProperty("xasecure.audit.destination.solr.zookeepers")
    public void setXasecureAuditDestinationSolrZookeepers(String xasecureAuditDestinationSolrZookeepers) {
        this.xasecureAuditDestinationSolrZookeepers = xasecureAuditDestinationSolrZookeepers;
    }

    @JsonProperty("xasecure.audit.is.enabled")
    public String getXasecureAuditIsEnabled() {
        return xasecureAuditIsEnabled;
    }

    @JsonProperty("xasecure.audit.is.enabled")
    public void setXasecureAuditIsEnabled(String xasecureAuditIsEnabled) {
        this.xasecureAuditIsEnabled = xasecureAuditIsEnabled;
    }

    @JsonProperty("xasecure.audit.provider.summary.enabled")
    public String getXasecureAuditProviderSummaryEnabled() {
        return xasecureAuditProviderSummaryEnabled;
    }

    @JsonProperty("xasecure.audit.provider.summary.enabled")
    public void setXasecureAuditProviderSummaryEnabled(String xasecureAuditProviderSummaryEnabled) {
        this.xasecureAuditProviderSummaryEnabled = xasecureAuditProviderSummaryEnabled;
    }

    @JsonProperty("REPOSITORY_CONFIG_PASSWORD")
    public String getRepositoryConfigPassword() {
        return repositoryConfigPassword;
    }

    @JsonProperty("REPOSITORY_CONFIG_PASSWORD")
    public void setRepositoryConfigPassword(String repositoryConfigPassword) {
        this.repositoryConfigPassword = repositoryConfigPassword;
    }

    @JsonProperty("REPOSITORY_CONFIG_USERNAME")
    public String getRepositoryConfigUsername() {
        return repositoryConfigUsername;
    }

    @JsonProperty("REPOSITORY_CONFIG_USERNAME")
    public void setRepositoryConfigUsername(String repositoryConfigUsername) {
        this.repositoryConfigUsername = repositoryConfigUsername;
    }

    @JsonProperty("common.name.for.certificate")
    public String getCommonNameForCertificate() {
        return commonNameForCertificate;
    }

    @JsonProperty("common.name.for.certificate")
    public void setCommonNameForCertificate(String commonNameForCertificate) {
        this.commonNameForCertificate = commonNameForCertificate;
    }

    @JsonProperty("hadoop.rpc.protection")
    public String getHadoopRpcProtection() {
        return hadoopRpcProtection;
    }

    @JsonProperty("hadoop.rpc.protection")
    public void setHadoopRpcProtection(String hadoopRpcProtection) {
        this.hadoopRpcProtection = hadoopRpcProtection;
    }

    @JsonProperty("policy_user")
    public String getPolicyUser() {
        return policyUser;
    }

    @JsonProperty("policy_user")
    public void setPolicyUser(String policyUser) {
        this.policyUser = policyUser;
    }

    @JsonProperty("ranger-hdfs-plugin-enabled")
    public String getRangerHdfsPluginEnabled() {
        return rangerHdfsPluginEnabled;
    }

    @JsonProperty("ranger-hdfs-plugin-enabled")
    public void setRangerHdfsPluginEnabled(String rangerHdfsPluginEnabled) {
        this.rangerHdfsPluginEnabled = rangerHdfsPluginEnabled;
    }

    @JsonProperty("xasecure.policymgr.clientssl.keystore")
    public String getXasecurePolicymgrClientsslKeystore() {
        return xasecurePolicymgrClientsslKeystore;
    }

    @JsonProperty("xasecure.policymgr.clientssl.keystore")
    public void setXasecurePolicymgrClientsslKeystore(String xasecurePolicymgrClientsslKeystore) {
        this.xasecurePolicymgrClientsslKeystore = xasecurePolicymgrClientsslKeystore;
    }

    @JsonProperty("xasecure.policymgr.clientssl.keystore.credential.file")
    public String getXasecurePolicymgrClientsslKeystoreCredentialFile() {
        return xasecurePolicymgrClientsslKeystoreCredentialFile;
    }

    @JsonProperty("xasecure.policymgr.clientssl.keystore.credential.file")
    public void setXasecurePolicymgrClientsslKeystoreCredentialFile(String xasecurePolicymgrClientsslKeystoreCredentialFile) {
        this.xasecurePolicymgrClientsslKeystoreCredentialFile = xasecurePolicymgrClientsslKeystoreCredentialFile;
    }

    @JsonProperty("xasecure.policymgr.clientssl.keystore.password")
    public String getXasecurePolicymgrClientsslKeystorePassword() {
        return xasecurePolicymgrClientsslKeystorePassword;
    }

    @JsonProperty("xasecure.policymgr.clientssl.keystore.password")
    public void setXasecurePolicymgrClientsslKeystorePassword(String xasecurePolicymgrClientsslKeystorePassword) {
        this.xasecurePolicymgrClientsslKeystorePassword = xasecurePolicymgrClientsslKeystorePassword;
    }

    @JsonProperty("xasecure.policymgr.clientssl.truststore")
    public String getXasecurePolicymgrClientsslTruststore() {
        return xasecurePolicymgrClientsslTruststore;
    }

    @JsonProperty("xasecure.policymgr.clientssl.truststore")
    public void setXasecurePolicymgrClientsslTruststore(String xasecurePolicymgrClientsslTruststore) {
        this.xasecurePolicymgrClientsslTruststore = xasecurePolicymgrClientsslTruststore;
    }

    @JsonProperty("xasecure.policymgr.clientssl.truststore.credential.file")
    public String getXasecurePolicymgrClientsslTruststoreCredentialFile() {
        return xasecurePolicymgrClientsslTruststoreCredentialFile;
    }

    @JsonProperty("xasecure.policymgr.clientssl.truststore.credential.file")
    public void setXasecurePolicymgrClientsslTruststoreCredentialFile(String xasecurePolicymgrClientsslTruststoreCredentialFile) {
        this.xasecurePolicymgrClientsslTruststoreCredentialFile = xasecurePolicymgrClientsslTruststoreCredentialFile;
    }

    @JsonProperty("xasecure.policymgr.clientssl.truststore.password")
    public String getXasecurePolicymgrClientsslTruststorePassword() {
        return xasecurePolicymgrClientsslTruststorePassword;
    }

    @JsonProperty("xasecure.policymgr.clientssl.truststore.password")
    public void setXasecurePolicymgrClientsslTruststorePassword(String xasecurePolicymgrClientsslTruststorePassword) {
        this.xasecurePolicymgrClientsslTruststorePassword = xasecurePolicymgrClientsslTruststorePassword;
    }

    @JsonProperty("ranger.plugin.hdfs.policy.cache.dir")
    public String getRangerPluginHdfsPolicyCacheDir() {
        return rangerPluginHdfsPolicyCacheDir;
    }

    @JsonProperty("ranger.plugin.hdfs.policy.cache.dir")
    public void setRangerPluginHdfsPolicyCacheDir(String rangerPluginHdfsPolicyCacheDir) {
        this.rangerPluginHdfsPolicyCacheDir = rangerPluginHdfsPolicyCacheDir;
    }

    @JsonProperty("ranger.plugin.hdfs.policy.pollIntervalMs")
    public String getRangerPluginHdfsPolicyPollIntervalMs() {
        return rangerPluginHdfsPolicyPollIntervalMs;
    }

    @JsonProperty("ranger.plugin.hdfs.policy.pollIntervalMs")
    public void setRangerPluginHdfsPolicyPollIntervalMs(String rangerPluginHdfsPolicyPollIntervalMs) {
        this.rangerPluginHdfsPolicyPollIntervalMs = rangerPluginHdfsPolicyPollIntervalMs;
    }

    @JsonProperty("ranger.plugin.hdfs.policy.rest.ssl.config.file")
    public String getRangerPluginHdfsPolicyRestSslConfigFile() {
        return rangerPluginHdfsPolicyRestSslConfigFile;
    }

    @JsonProperty("ranger.plugin.hdfs.policy.rest.ssl.config.file")
    public void setRangerPluginHdfsPolicyRestSslConfigFile(String rangerPluginHdfsPolicyRestSslConfigFile) {
        this.rangerPluginHdfsPolicyRestSslConfigFile = rangerPluginHdfsPolicyRestSslConfigFile;
    }

    @JsonProperty("ranger.plugin.hdfs.policy.rest.url")
    public String getRangerPluginHdfsPolicyRestUrl() {
        return rangerPluginHdfsPolicyRestUrl;
    }

    @JsonProperty("ranger.plugin.hdfs.policy.rest.url")
    public void setRangerPluginHdfsPolicyRestUrl(String rangerPluginHdfsPolicyRestUrl) {
        this.rangerPluginHdfsPolicyRestUrl = rangerPluginHdfsPolicyRestUrl;
    }

    @JsonProperty("ranger.plugin.hdfs.policy.source.impl")
    public String getRangerPluginHdfsPolicySourceImpl() {
        return rangerPluginHdfsPolicySourceImpl;
    }

    @JsonProperty("ranger.plugin.hdfs.policy.source.impl")
    public void setRangerPluginHdfsPolicySourceImpl(String rangerPluginHdfsPolicySourceImpl) {
        this.rangerPluginHdfsPolicySourceImpl = rangerPluginHdfsPolicySourceImpl;
    }

    @JsonProperty("ranger.plugin.hdfs.service.name")
    public String getRangerPluginHdfsServiceName() {
        return rangerPluginHdfsServiceName;
    }

    @JsonProperty("ranger.plugin.hdfs.service.name")
    public void setRangerPluginHdfsServiceName(String rangerPluginHdfsServiceName) {
        this.rangerPluginHdfsServiceName = rangerPluginHdfsServiceName;
    }

    @JsonProperty("xasecure.add-hadoop-authorization")
    public String getXasecureAddHadoopAuthorization() {
        return xasecureAddHadoopAuthorization;
    }

    @JsonProperty("xasecure.add-hadoop-authorization")
    public void setXasecureAddHadoopAuthorization(String xasecureAddHadoopAuthorization) {
        this.xasecureAddHadoopAuthorization = xasecureAddHadoopAuthorization;
    }

    @JsonProperty("ssl.client.keystore.location")
    public String getSslClientKeystoreLocation() {
        return sslClientKeystoreLocation;
    }

    @JsonProperty("ssl.client.keystore.location")
    public void setSslClientKeystoreLocation(String sslClientKeystoreLocation) {
        this.sslClientKeystoreLocation = sslClientKeystoreLocation;
    }

    @JsonProperty("ssl.client.keystore.password")
    public String getSslClientKeystorePassword() {
        return sslClientKeystorePassword;
    }

    @JsonProperty("ssl.client.keystore.password")
    public void setSslClientKeystorePassword(String sslClientKeystorePassword) {
        this.sslClientKeystorePassword = sslClientKeystorePassword;
    }

    @JsonProperty("ssl.client.keystore.type")
    public String getSslClientKeystoreType() {
        return sslClientKeystoreType;
    }

    @JsonProperty("ssl.client.keystore.type")
    public void setSslClientKeystoreType(String sslClientKeystoreType) {
        this.sslClientKeystoreType = sslClientKeystoreType;
    }

    @JsonProperty("ssl.client.truststore.location")
    public String getSslClientTruststoreLocation() {
        return sslClientTruststoreLocation;
    }

    @JsonProperty("ssl.client.truststore.location")
    public void setSslClientTruststoreLocation(String sslClientTruststoreLocation) {
        this.sslClientTruststoreLocation = sslClientTruststoreLocation;
    }

    @JsonProperty("ssl.client.truststore.password")
    public String getSslClientTruststorePassword() {
        return sslClientTruststorePassword;
    }

    @JsonProperty("ssl.client.truststore.password")
    public void setSslClientTruststorePassword(String sslClientTruststorePassword) {
        this.sslClientTruststorePassword = sslClientTruststorePassword;
    }

    @JsonProperty("ssl.client.truststore.reload.interval")
    public String getSslClientTruststoreReloadInterval() {
        return sslClientTruststoreReloadInterval;
    }

    @JsonProperty("ssl.client.truststore.reload.interval")
    public void setSslClientTruststoreReloadInterval(String sslClientTruststoreReloadInterval) {
        this.sslClientTruststoreReloadInterval = sslClientTruststoreReloadInterval;
    }

    @JsonProperty("ssl.client.truststore.type")
    public String getSslClientTruststoreType() {
        return sslClientTruststoreType;
    }

    @JsonProperty("ssl.client.truststore.type")
    public void setSslClientTruststoreType(String sslClientTruststoreType) {
        this.sslClientTruststoreType = sslClientTruststoreType;
    }

    @JsonProperty("ssl.server.keystore.keypassword")
    public String getSslServerKeystoreKeypassword() {
        return sslServerKeystoreKeypassword;
    }

    @JsonProperty("ssl.server.keystore.keypassword")
    public void setSslServerKeystoreKeypassword(String sslServerKeystoreKeypassword) {
        this.sslServerKeystoreKeypassword = sslServerKeystoreKeypassword;
    }

    @JsonProperty("ssl.server.keystore.location")
    public String getSslServerKeystoreLocation() {
        return sslServerKeystoreLocation;
    }

    @JsonProperty("ssl.server.keystore.location")
    public void setSslServerKeystoreLocation(String sslServerKeystoreLocation) {
        this.sslServerKeystoreLocation = sslServerKeystoreLocation;
    }

    @JsonProperty("ssl.server.keystore.password")
    public String getSslServerKeystorePassword() {
        return sslServerKeystorePassword;
    }

    @JsonProperty("ssl.server.keystore.password")
    public void setSslServerKeystorePassword(String sslServerKeystorePassword) {
        this.sslServerKeystorePassword = sslServerKeystorePassword;
    }

    @JsonProperty("ssl.server.keystore.type")
    public String getSslServerKeystoreType() {
        return sslServerKeystoreType;
    }

    @JsonProperty("ssl.server.keystore.type")
    public void setSslServerKeystoreType(String sslServerKeystoreType) {
        this.sslServerKeystoreType = sslServerKeystoreType;
    }

    @JsonProperty("ssl.server.truststore.location")
    public String getSslServerTruststoreLocation() {
        return sslServerTruststoreLocation;
    }

    @JsonProperty("ssl.server.truststore.location")
    public void setSslServerTruststoreLocation(String sslServerTruststoreLocation) {
        this.sslServerTruststoreLocation = sslServerTruststoreLocation;
    }

    @JsonProperty("ssl.server.truststore.password")
    public String getSslServerTruststorePassword() {
        return sslServerTruststorePassword;
    }

    @JsonProperty("ssl.server.truststore.password")
    public void setSslServerTruststorePassword(String sslServerTruststorePassword) {
        this.sslServerTruststorePassword = sslServerTruststorePassword;
    }

    @JsonProperty("ssl.server.truststore.reload.interval")
    public String getSslServerTruststoreReloadInterval() {
        return sslServerTruststoreReloadInterval;
    }

    @JsonProperty("ssl.server.truststore.reload.interval")
    public void setSslServerTruststoreReloadInterval(String sslServerTruststoreReloadInterval) {
        this.sslServerTruststoreReloadInterval = sslServerTruststoreReloadInterval;
    }

    @JsonProperty("ssl.server.truststore.type")
    public String getSslServerTruststoreType() {
        return sslServerTruststoreType;
    }

    @JsonProperty("ssl.server.truststore.type")
    public void setSslServerTruststoreType(String sslServerTruststoreType) {
        this.sslServerTruststoreType = sslServerTruststoreType;
    }

    @JsonProperty("hadoop.proxyuser.hive.groups")
    public String getHadoopProxyuserHiveGroups() {
        return hadoopProxyuserHiveGroups;
    }

    @JsonProperty("hadoop.proxyuser.hive.groups")
    public void setHadoopProxyuserHiveGroups(String hadoopProxyuserHiveGroups) {
        this.hadoopProxyuserHiveGroups = hadoopProxyuserHiveGroups;
    }

    @JsonProperty("hadoop.proxyuser.hive.hosts")
    public String getHadoopProxyuserHiveHosts() {
        return hadoopProxyuserHiveHosts;
    }

    @JsonProperty("hadoop.proxyuser.hive.hosts")
    public void setHadoopProxyuserHiveHosts(String hadoopProxyuserHiveHosts) {
        this.hadoopProxyuserHiveHosts = hadoopProxyuserHiveHosts;
    }

    @JsonProperty("hadoop.security.key.provider.path")
    public String getHadoopSecurityKeyProviderPath() {
        return hadoopSecurityKeyProviderPath;
    }

    @JsonProperty("hadoop.security.key.provider.path")
    public void setHadoopSecurityKeyProviderPath(String hadoopSecurityKeyProviderPath) {
        this.hadoopSecurityKeyProviderPath = hadoopSecurityKeyProviderPath;
    }

    @JsonProperty("dfs.encryption.key.provider.uri")
    public String getDfsEncryptionKeyProviderUri() {
        return dfsEncryptionKeyProviderUri;
    }

    @JsonProperty("dfs.encryption.key.provider.uri")
    public void setDfsEncryptionKeyProviderUri(String dfsEncryptionKeyProviderUri) {
        this.dfsEncryptionKeyProviderUri = dfsEncryptionKeyProviderUri;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Properties.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsAzureUserAgentPrefix");
        sb.append('=');
        sb.append(((this.fsAzureUserAgentPrefix == null)?"<null>":this.fsAzureUserAgentPrefix));
        sb.append(',');
        sb.append("fsDefaultFS");
        sb.append('=');
        sb.append(((this.fsDefaultFS == null)?"<null>":this.fsDefaultFS));
        sb.append(',');
        sb.append("fsS3aFastUpload");
        sb.append('=');
        sb.append(((this.fsS3aFastUpload == null)?"<null>":this.fsS3aFastUpload));
        sb.append(',');
        sb.append("fsS3aFastUploadBuffer");
        sb.append('=');
        sb.append(((this.fsS3aFastUploadBuffer == null)?"<null>":this.fsS3aFastUploadBuffer));
        sb.append(',');
        sb.append("fsS3aMultipartSize");
        sb.append('=');
        sb.append(((this.fsS3aMultipartSize == null)?"<null>":this.fsS3aMultipartSize));
        sb.append(',');
        sb.append("fsS3aUserAgentPrefix");
        sb.append('=');
        sb.append(((this.fsS3aUserAgentPrefix == null)?"<null>":this.fsS3aUserAgentPrefix));
        sb.append(',');
        sb.append("fsTrashInterval");
        sb.append('=');
        sb.append(((this.fsTrashInterval == null)?"<null>":this.fsTrashInterval));
        sb.append(',');
        sb.append("haFailoverControllerActiveStandbyElectorZkOpRetries");
        sb.append('=');
        sb.append(((this.haFailoverControllerActiveStandbyElectorZkOpRetries == null)?"<null>":this.haFailoverControllerActiveStandbyElectorZkOpRetries));
        sb.append(',');
        sb.append("hadoopHttpAuthenticationSimpleAnonymousAllowed");
        sb.append('=');
        sb.append(((this.hadoopHttpAuthenticationSimpleAnonymousAllowed == null)?"<null>":this.hadoopHttpAuthenticationSimpleAnonymousAllowed));
        sb.append(',');
        sb.append("hadoopHttpCrossOriginAllowedHeaders");
        sb.append('=');
        sb.append(((this.hadoopHttpCrossOriginAllowedHeaders == null)?"<null>":this.hadoopHttpCrossOriginAllowedHeaders));
        sb.append(',');
        sb.append("hadoopHttpCrossOriginAllowedMethods");
        sb.append('=');
        sb.append(((this.hadoopHttpCrossOriginAllowedMethods == null)?"<null>":this.hadoopHttpCrossOriginAllowedMethods));
        sb.append(',');
        sb.append("hadoopHttpCrossOriginAllowedOrigins");
        sb.append('=');
        sb.append(((this.hadoopHttpCrossOriginAllowedOrigins == null)?"<null>":this.hadoopHttpCrossOriginAllowedOrigins));
        sb.append(',');
        sb.append("hadoopHttpCrossOriginMaxAge");
        sb.append('=');
        sb.append(((this.hadoopHttpCrossOriginMaxAge == null)?"<null>":this.hadoopHttpCrossOriginMaxAge));
        sb.append(',');
        sb.append("hadoopHttpFilterInitializers");
        sb.append('=');
        sb.append(((this.hadoopHttpFilterInitializers == null)?"<null>":this.hadoopHttpFilterInitializers));
        sb.append(',');
        sb.append("hadoopProxyuserAmbariGroups");
        sb.append('=');
        sb.append(((this.hadoopProxyuserAmbariGroups == null)?"<null>":this.hadoopProxyuserAmbariGroups));
        sb.append(',');
        sb.append("hadoopProxyuserAmbariHosts");
        sb.append('=');
        sb.append(((this.hadoopProxyuserAmbariHosts == null)?"<null>":this.hadoopProxyuserAmbariHosts));
        sb.append(',');
        sb.append("hadoopProxyuserHdfsGroups");
        sb.append('=');
        sb.append(((this.hadoopProxyuserHdfsGroups == null)?"<null>":this.hadoopProxyuserHdfsGroups));
        sb.append(',');
        sb.append("hadoopProxyuserHdfsHosts");
        sb.append('=');
        sb.append(((this.hadoopProxyuserHdfsHosts == null)?"<null>":this.hadoopProxyuserHdfsHosts));
        sb.append(',');
        sb.append("hadoopSecurityAuthToLocal");
        sb.append('=');
        sb.append(((this.hadoopSecurityAuthToLocal == null)?"<null>":this.hadoopSecurityAuthToLocal));
        sb.append(',');
        sb.append("hadoopSecurityAuthentication");
        sb.append('=');
        sb.append(((this.hadoopSecurityAuthentication == null)?"<null>":this.hadoopSecurityAuthentication));
        sb.append(',');
        sb.append("hadoopSecurityAuthorization");
        sb.append('=');
        sb.append(((this.hadoopSecurityAuthorization == null)?"<null>":this.hadoopSecurityAuthorization));
        sb.append(',');
        sb.append("hadoopSecurityInstrumentationRequiresAdmin");
        sb.append('=');
        sb.append(((this.hadoopSecurityInstrumentationRequiresAdmin == null)?"<null>":this.hadoopSecurityInstrumentationRequiresAdmin));
        sb.append(',');
        sb.append("ioCompressionCodecs");
        sb.append('=');
        sb.append(((this.ioCompressionCodecs == null)?"<null>":this.ioCompressionCodecs));
        sb.append(',');
        sb.append("ioFileBufferSize");
        sb.append('=');
        sb.append(((this.ioFileBufferSize == null)?"<null>":this.ioFileBufferSize));
        sb.append(',');
        sb.append("ioSerializations");
        sb.append('=');
        sb.append(((this.ioSerializations == null)?"<null>":this.ioSerializations));
        sb.append(',');
        sb.append("ipcClientConnectMaxRetries");
        sb.append('=');
        sb.append(((this.ipcClientConnectMaxRetries == null)?"<null>":this.ipcClientConnectMaxRetries));
        sb.append(',');
        sb.append("ipcClientConnectionMaxidletime");
        sb.append('=');
        sb.append(((this.ipcClientConnectionMaxidletime == null)?"<null>":this.ipcClientConnectionMaxidletime));
        sb.append(',');
        sb.append("ipcClientIdlethreshold");
        sb.append('=');
        sb.append(((this.ipcClientIdlethreshold == null)?"<null>":this.ipcClientIdlethreshold));
        sb.append(',');
        sb.append("ipcServerTcpnodelay");
        sb.append('=');
        sb.append(((this.ipcServerTcpnodelay == null)?"<null>":this.ipcServerTcpnodelay));
        sb.append(',');
        sb.append("mapreduceJobtrackerWebinterfaceTrusted");
        sb.append('=');
        sb.append(((this.mapreduceJobtrackerWebinterfaceTrusted == null)?"<null>":this.mapreduceJobtrackerWebinterfaceTrusted));
        sb.append(',');
        sb.append("netTopologyScriptFileName");
        sb.append('=');
        sb.append(((this.netTopologyScriptFileName == null)?"<null>":this.netTopologyScriptFileName));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("dtnodeHeapsize");
        sb.append('=');
        sb.append(((this.dtnodeHeapsize == null)?"<null>":this.dtnodeHeapsize));
        sb.append(',');
        sb.append("hadoopHeapsize");
        sb.append('=');
        sb.append(((this.hadoopHeapsize == null)?"<null>":this.hadoopHeapsize));
        sb.append(',');
        sb.append("hadoopPidDirPrefix");
        sb.append('=');
        sb.append(((this.hadoopPidDirPrefix == null)?"<null>":this.hadoopPidDirPrefix));
        sb.append(',');
        sb.append("hadoopRootLogger");
        sb.append('=');
        sb.append(((this.hadoopRootLogger == null)?"<null>":this.hadoopRootLogger));
        sb.append(',');
        sb.append("hdfsLogDirPrefix");
        sb.append('=');
        sb.append(((this.hdfsLogDirPrefix == null)?"<null>":this.hdfsLogDirPrefix));
        sb.append(',');
        sb.append("hdfsTmpDir");
        sb.append('=');
        sb.append(((this.hdfsTmpDir == null)?"<null>":this.hdfsTmpDir));
        sb.append(',');
        sb.append("hdfsUser");
        sb.append('=');
        sb.append(((this.hdfsUser == null)?"<null>":this.hdfsUser));
        sb.append(',');
        sb.append("hdfsUserNofileLimit");
        sb.append('=');
        sb.append(((this.hdfsUserNofileLimit == null)?"<null>":this.hdfsUserNofileLimit));
        sb.append(',');
        sb.append("hdfsUserNprocLimit");
        sb.append('=');
        sb.append(((this.hdfsUserNprocLimit == null)?"<null>":this.hdfsUserNprocLimit));
        sb.append(',');
        sb.append("keyserverHost");
        sb.append('=');
        sb.append(((this.keyserverHost == null)?"<null>":this.keyserverHost));
        sb.append(',');
        sb.append("keyserverPort");
        sb.append('=');
        sb.append(((this.keyserverPort == null)?"<null>":this.keyserverPort));
        sb.append(',');
        sb.append("namenodeBackupDir");
        sb.append('=');
        sb.append(((this.namenodeBackupDir == null)?"<null>":this.namenodeBackupDir));
        sb.append(',');
        sb.append("namenodeHeapsize");
        sb.append('=');
        sb.append(((this.namenodeHeapsize == null)?"<null>":this.namenodeHeapsize));
        sb.append(',');
        sb.append("namenodeOptMaxnewsize");
        sb.append('=');
        sb.append(((this.namenodeOptMaxnewsize == null)?"<null>":this.namenodeOptMaxnewsize));
        sb.append(',');
        sb.append("namenodeOptMaxpermsize");
        sb.append('=');
        sb.append(((this.namenodeOptMaxpermsize == null)?"<null>":this.namenodeOptMaxpermsize));
        sb.append(',');
        sb.append("namenodeOptNewsize");
        sb.append('=');
        sb.append(((this.namenodeOptNewsize == null)?"<null>":this.namenodeOptNewsize));
        sb.append(',');
        sb.append("namenodeOptPermsize");
        sb.append('=');
        sb.append(((this.namenodeOptPermsize == null)?"<null>":this.namenodeOptPermsize));
        sb.append(',');
        sb.append("nfsgatewayHeapsize");
        sb.append('=');
        sb.append(((this.nfsgatewayHeapsize == null)?"<null>":this.nfsgatewayHeapsize));
        sb.append(',');
        sb.append("proxyuserGroup");
        sb.append('=');
        sb.append(((this.proxyuserGroup == null)?"<null>":this.proxyuserGroup));
        sb.append(',');
        sb.append("securityAdminOperationsProtocolAcl");
        sb.append('=');
        sb.append(((this.securityAdminOperationsProtocolAcl == null)?"<null>":this.securityAdminOperationsProtocolAcl));
        sb.append(',');
        sb.append("securityClientDatanodeProtocolAcl");
        sb.append('=');
        sb.append(((this.securityClientDatanodeProtocolAcl == null)?"<null>":this.securityClientDatanodeProtocolAcl));
        sb.append(',');
        sb.append("securityClientProtocolAcl");
        sb.append('=');
        sb.append(((this.securityClientProtocolAcl == null)?"<null>":this.securityClientProtocolAcl));
        sb.append(',');
        sb.append("securityDatanodeProtocolAcl");
        sb.append('=');
        sb.append(((this.securityDatanodeProtocolAcl == null)?"<null>":this.securityDatanodeProtocolAcl));
        sb.append(',');
        sb.append("securityInterDatanodeProtocolAcl");
        sb.append('=');
        sb.append(((this.securityInterDatanodeProtocolAcl == null)?"<null>":this.securityInterDatanodeProtocolAcl));
        sb.append(',');
        sb.append("securityInterTrackerProtocolAcl");
        sb.append('=');
        sb.append(((this.securityInterTrackerProtocolAcl == null)?"<null>":this.securityInterTrackerProtocolAcl));
        sb.append(',');
        sb.append("securityJobClientProtocolAcl");
        sb.append('=');
        sb.append(((this.securityJobClientProtocolAcl == null)?"<null>":this.securityJobClientProtocolAcl));
        sb.append(',');
        sb.append("securityJobTaskProtocolAcl");
        sb.append('=');
        sb.append(((this.securityJobTaskProtocolAcl == null)?"<null>":this.securityJobTaskProtocolAcl));
        sb.append(',');
        sb.append("securityNamenodeProtocolAcl");
        sb.append('=');
        sb.append(((this.securityNamenodeProtocolAcl == null)?"<null>":this.securityNamenodeProtocolAcl));
        sb.append(',');
        sb.append("securityRefreshPolicyProtocolAcl");
        sb.append('=');
        sb.append(((this.securityRefreshPolicyProtocolAcl == null)?"<null>":this.securityRefreshPolicyProtocolAcl));
        sb.append(',');
        sb.append("securityRefreshUsertogroupsMappingsProtocolAcl");
        sb.append('=');
        sb.append(((this.securityRefreshUsertogroupsMappingsProtocolAcl == null)?"<null>":this.securityRefreshUsertogroupsMappingsProtocolAcl));
        sb.append(',');
        sb.append("hadoopLogMaxBackupSize");
        sb.append('=');
        sb.append(((this.hadoopLogMaxBackupSize == null)?"<null>":this.hadoopLogMaxBackupSize));
        sb.append(',');
        sb.append("hadoopLogNumberOfBackupFiles");
        sb.append('=');
        sb.append(((this.hadoopLogNumberOfBackupFiles == null)?"<null>":this.hadoopLogNumberOfBackupFiles));
        sb.append(',');
        sb.append("hadoopSecurityLogMaxBackupSize");
        sb.append('=');
        sb.append(((this.hadoopSecurityLogMaxBackupSize == null)?"<null>":this.hadoopSecurityLogMaxBackupSize));
        sb.append(',');
        sb.append("hadoopSecurityLogNumberOfBackupFiles");
        sb.append('=');
        sb.append(((this.hadoopSecurityLogNumberOfBackupFiles == null)?"<null>":this.hadoopSecurityLogNumberOfBackupFiles));
        sb.append(',');
        sb.append("dfsBlockAccessTokenEnable");
        sb.append('=');
        sb.append(((this.dfsBlockAccessTokenEnable == null)?"<null>":this.dfsBlockAccessTokenEnable));
        sb.append(',');
        sb.append("dfsBlockreportInitialDelay");
        sb.append('=');
        sb.append(((this.dfsBlockreportInitialDelay == null)?"<null>":this.dfsBlockreportInitialDelay));
        sb.append(',');
        sb.append("dfsBlocksize");
        sb.append('=');
        sb.append(((this.dfsBlocksize == null)?"<null>":this.dfsBlocksize));
        sb.append(',');
        sb.append("dfsClientReadShortcircuit");
        sb.append('=');
        sb.append(((this.dfsClientReadShortcircuit == null)?"<null>":this.dfsClientReadShortcircuit));
        sb.append(',');
        sb.append("dfsClientReadShortcircuitStreamsCacheSize");
        sb.append('=');
        sb.append(((this.dfsClientReadShortcircuitStreamsCacheSize == null)?"<null>":this.dfsClientReadShortcircuitStreamsCacheSize));
        sb.append(',');
        sb.append("dfsClientRetryPolicyEnabled");
        sb.append('=');
        sb.append(((this.dfsClientRetryPolicyEnabled == null)?"<null>":this.dfsClientRetryPolicyEnabled));
        sb.append(',');
        sb.append("dfsClusterAdministrators");
        sb.append('=');
        sb.append(((this.dfsClusterAdministrators == null)?"<null>":this.dfsClusterAdministrators));
        sb.append(',');
        sb.append("dfsContentSummaryLimit");
        sb.append('=');
        sb.append(((this.dfsContentSummaryLimit == null)?"<null>":this.dfsContentSummaryLimit));
        sb.append(',');
        sb.append("dfsDatanodeAddress");
        sb.append('=');
        sb.append(((this.dfsDatanodeAddress == null)?"<null>":this.dfsDatanodeAddress));
        sb.append(',');
        sb.append("dfsDatanodeBalanceBandwidthPerSec");
        sb.append('=');
        sb.append(((this.dfsDatanodeBalanceBandwidthPerSec == null)?"<null>":this.dfsDatanodeBalanceBandwidthPerSec));
        sb.append(',');
        sb.append("dfsDatanodeDataDir");
        sb.append('=');
        sb.append(((this.dfsDatanodeDataDir == null)?"<null>":this.dfsDatanodeDataDir));
        sb.append(',');
        sb.append("dfsDatanodeDataDirPerm");
        sb.append('=');
        sb.append(((this.dfsDatanodeDataDirPerm == null)?"<null>":this.dfsDatanodeDataDirPerm));
        sb.append(',');
        sb.append("dfsDatanodeDuReserved");
        sb.append('=');
        sb.append(((this.dfsDatanodeDuReserved == null)?"<null>":this.dfsDatanodeDuReserved));
        sb.append(',');
        sb.append("dfsDatanodeFailedVolumesTolerated");
        sb.append('=');
        sb.append(((this.dfsDatanodeFailedVolumesTolerated == null)?"<null>":this.dfsDatanodeFailedVolumesTolerated));
        sb.append(',');
        sb.append("dfsDatanodeHttpAddress");
        sb.append('=');
        sb.append(((this.dfsDatanodeHttpAddress == null)?"<null>":this.dfsDatanodeHttpAddress));
        sb.append(',');
        sb.append("dfsDatanodeHttpsAddress");
        sb.append('=');
        sb.append(((this.dfsDatanodeHttpsAddress == null)?"<null>":this.dfsDatanodeHttpsAddress));
        sb.append(',');
        sb.append("dfsDatanodeIpcAddress");
        sb.append('=');
        sb.append(((this.dfsDatanodeIpcAddress == null)?"<null>":this.dfsDatanodeIpcAddress));
        sb.append(',');
        sb.append("dfsDatanodeMaxTransferThreads");
        sb.append('=');
        sb.append(((this.dfsDatanodeMaxTransferThreads == null)?"<null>":this.dfsDatanodeMaxTransferThreads));
        sb.append(',');
        sb.append("dfsDomainSocketPath");
        sb.append('=');
        sb.append(((this.dfsDomainSocketPath == null)?"<null>":this.dfsDomainSocketPath));
        sb.append(',');
        sb.append("dfsEncryptDataTransferCipherSuites");
        sb.append('=');
        sb.append(((this.dfsEncryptDataTransferCipherSuites == null)?"<null>":this.dfsEncryptDataTransferCipherSuites));
        sb.append(',');
        sb.append("dfsHeartbeatInterval");
        sb.append('=');
        sb.append(((this.dfsHeartbeatInterval == null)?"<null>":this.dfsHeartbeatInterval));
        sb.append(',');
        sb.append("dfsHostsExclude");
        sb.append('=');
        sb.append(((this.dfsHostsExclude == null)?"<null>":this.dfsHostsExclude));
        sb.append(',');
        sb.append("dfsHttpPolicy");
        sb.append('=');
        sb.append(((this.dfsHttpPolicy == null)?"<null>":this.dfsHttpPolicy));
        sb.append(',');
        sb.append("dfsHttpsPort");
        sb.append('=');
        sb.append(((this.dfsHttpsPort == null)?"<null>":this.dfsHttpsPort));
        sb.append(',');
        sb.append("dfsJournalnodeEditsDir");
        sb.append('=');
        sb.append(((this.dfsJournalnodeEditsDir == null)?"<null>":this.dfsJournalnodeEditsDir));
        sb.append(',');
        sb.append("dfsJournalnodeHttpAddress");
        sb.append('=');
        sb.append(((this.dfsJournalnodeHttpAddress == null)?"<null>":this.dfsJournalnodeHttpAddress));
        sb.append(',');
        sb.append("dfsJournalnodeHttpsAddress");
        sb.append('=');
        sb.append(((this.dfsJournalnodeHttpsAddress == null)?"<null>":this.dfsJournalnodeHttpsAddress));
        sb.append(',');
        sb.append("dfsNamenodeAccesstimePrecision");
        sb.append('=');
        sb.append(((this.dfsNamenodeAccesstimePrecision == null)?"<null>":this.dfsNamenodeAccesstimePrecision));
        sb.append(',');
        sb.append("dfsNamenodeAclsEnabled");
        sb.append('=');
        sb.append(((this.dfsNamenodeAclsEnabled == null)?"<null>":this.dfsNamenodeAclsEnabled));
        sb.append(',');
        sb.append("dfsNamenodeAuditLogAsync");
        sb.append('=');
        sb.append(((this.dfsNamenodeAuditLogAsync == null)?"<null>":this.dfsNamenodeAuditLogAsync));
        sb.append(',');
        sb.append("dfsNamenodeAvoidReadStaleDatanode");
        sb.append('=');
        sb.append(((this.dfsNamenodeAvoidReadStaleDatanode == null)?"<null>":this.dfsNamenodeAvoidReadStaleDatanode));
        sb.append(',');
        sb.append("dfsNamenodeAvoidWriteStaleDatanode");
        sb.append('=');
        sb.append(((this.dfsNamenodeAvoidWriteStaleDatanode == null)?"<null>":this.dfsNamenodeAvoidWriteStaleDatanode));
        sb.append(',');
        sb.append("dfsNamenodeCheckpointDir");
        sb.append('=');
        sb.append(((this.dfsNamenodeCheckpointDir == null)?"<null>":this.dfsNamenodeCheckpointDir));
        sb.append(',');
        sb.append("dfsNamenodeCheckpointEditsDir");
        sb.append('=');
        sb.append(((this.dfsNamenodeCheckpointEditsDir == null)?"<null>":this.dfsNamenodeCheckpointEditsDir));
        sb.append(',');
        sb.append("dfsNamenodeCheckpointPeriod");
        sb.append('=');
        sb.append(((this.dfsNamenodeCheckpointPeriod == null)?"<null>":this.dfsNamenodeCheckpointPeriod));
        sb.append(',');
        sb.append("dfsNamenodeCheckpointTxns");
        sb.append('=');
        sb.append(((this.dfsNamenodeCheckpointTxns == null)?"<null>":this.dfsNamenodeCheckpointTxns));
        sb.append(',');
        sb.append("dfsNamenodeFslockFair");
        sb.append('=');
        sb.append(((this.dfsNamenodeFslockFair == null)?"<null>":this.dfsNamenodeFslockFair));
        sb.append(',');
        sb.append("dfsNamenodeHandlerCount");
        sb.append('=');
        sb.append(((this.dfsNamenodeHandlerCount == null)?"<null>":this.dfsNamenodeHandlerCount));
        sb.append(',');
        sb.append("dfsNamenodeHttpAddress");
        sb.append('=');
        sb.append(((this.dfsNamenodeHttpAddress == null)?"<null>":this.dfsNamenodeHttpAddress));
        sb.append(',');
        sb.append("dfsNamenodeHttpsAddress");
        sb.append('=');
        sb.append(((this.dfsNamenodeHttpsAddress == null)?"<null>":this.dfsNamenodeHttpsAddress));
        sb.append(',');
        sb.append("dfsNamenodeNameDir");
        sb.append('=');
        sb.append(((this.dfsNamenodeNameDir == null)?"<null>":this.dfsNamenodeNameDir));
        sb.append(',');
        sb.append("dfsNamenodeNameDirRestore");
        sb.append('=');
        sb.append(((this.dfsNamenodeNameDirRestore == null)?"<null>":this.dfsNamenodeNameDirRestore));
        sb.append(',');
        sb.append("dfsNamenodeRpcAddress");
        sb.append('=');
        sb.append(((this.dfsNamenodeRpcAddress == null)?"<null>":this.dfsNamenodeRpcAddress));
        sb.append(',');
        sb.append("dfsNamenodeSafemodeThresholdPct");
        sb.append('=');
        sb.append(((this.dfsNamenodeSafemodeThresholdPct == null)?"<null>":this.dfsNamenodeSafemodeThresholdPct));
        sb.append(',');
        sb.append("dfsNamenodeSecondaryHttpAddress");
        sb.append('=');
        sb.append(((this.dfsNamenodeSecondaryHttpAddress == null)?"<null>":this.dfsNamenodeSecondaryHttpAddress));
        sb.append(',');
        sb.append("dfsNamenodeStaleDatanodeInterval");
        sb.append('=');
        sb.append(((this.dfsNamenodeStaleDatanodeInterval == null)?"<null>":this.dfsNamenodeStaleDatanodeInterval));
        sb.append(',');
        sb.append("dfsNamenodeStartupDelayBlockDeletionSec");
        sb.append('=');
        sb.append(((this.dfsNamenodeStartupDelayBlockDeletionSec == null)?"<null>":this.dfsNamenodeStartupDelayBlockDeletionSec));
        sb.append(',');
        sb.append("dfsNamenodeWriteStaleDatanodeRatio");
        sb.append('=');
        sb.append(((this.dfsNamenodeWriteStaleDatanodeRatio == null)?"<null>":this.dfsNamenodeWriteStaleDatanodeRatio));
        sb.append(',');
        sb.append("dfsPermissionsEnabled");
        sb.append('=');
        sb.append(((this.dfsPermissionsEnabled == null)?"<null>":this.dfsPermissionsEnabled));
        sb.append(',');
        sb.append("dfsPermissionsSuperusergroup");
        sb.append('=');
        sb.append(((this.dfsPermissionsSuperusergroup == null)?"<null>":this.dfsPermissionsSuperusergroup));
        sb.append(',');
        sb.append("dfsReplication");
        sb.append('=');
        sb.append(((this.dfsReplication == null)?"<null>":this.dfsReplication));
        sb.append(',');
        sb.append("dfsReplicationMax");
        sb.append('=');
        sb.append(((this.dfsReplicationMax == null)?"<null>":this.dfsReplicationMax));
        sb.append(',');
        sb.append("dfsWebhdfsEnabled");
        sb.append('=');
        sb.append(((this.dfsWebhdfsEnabled == null)?"<null>":this.dfsWebhdfsEnabled));
        sb.append(',');
        sb.append("fsPermissionsUmaskMode");
        sb.append('=');
        sb.append(((this.fsPermissionsUmaskMode == null)?"<null>":this.fsPermissionsUmaskMode));
        sb.append(',');
        sb.append("hadoopCallerContextEnabled");
        sb.append('=');
        sb.append(((this.hadoopCallerContextEnabled == null)?"<null>":this.hadoopCallerContextEnabled));
        sb.append(',');
        sb.append("manageIncludeFiles");
        sb.append('=');
        sb.append(((this.manageIncludeFiles == null)?"<null>":this.manageIncludeFiles));
        sb.append(',');
        sb.append("nfsExportsAllowedHosts");
        sb.append('=');
        sb.append(((this.nfsExportsAllowedHosts == null)?"<null>":this.nfsExportsAllowedHosts));
        sb.append(',');
        sb.append("nfsFileDumpDir");
        sb.append('=');
        sb.append(((this.nfsFileDumpDir == null)?"<null>":this.nfsFileDumpDir));
        sb.append(',');
        sb.append("rangerPluginHdfsAmbariClusterName");
        sb.append('=');
        sb.append(((this.rangerPluginHdfsAmbariClusterName == null)?"<null>":this.rangerPluginHdfsAmbariClusterName));
        sb.append(',');
        sb.append("xasecureAuditDestinationHdfs");
        sb.append('=');
        sb.append(((this.xasecureAuditDestinationHdfs == null)?"<null>":this.xasecureAuditDestinationHdfs));
        sb.append(',');
        sb.append("xasecureAuditDestinationHdfsBatchFilespoolDir");
        sb.append('=');
        sb.append(((this.xasecureAuditDestinationHdfsBatchFilespoolDir == null)?"<null>":this.xasecureAuditDestinationHdfsBatchFilespoolDir));
        sb.append(',');
        sb.append("xasecureAuditDestinationHdfsDir");
        sb.append('=');
        sb.append(((this.xasecureAuditDestinationHdfsDir == null)?"<null>":this.xasecureAuditDestinationHdfsDir));
        sb.append(',');
        sb.append("xasecureAuditDestinationSolr");
        sb.append('=');
        sb.append(((this.xasecureAuditDestinationSolr == null)?"<null>":this.xasecureAuditDestinationSolr));
        sb.append(',');
        sb.append("xasecureAuditDestinationSolrBatchFilespoolDir");
        sb.append('=');
        sb.append(((this.xasecureAuditDestinationSolrBatchFilespoolDir == null)?"<null>":this.xasecureAuditDestinationSolrBatchFilespoolDir));
        sb.append(',');
        sb.append("xasecureAuditDestinationSolrUrls");
        sb.append('=');
        sb.append(((this.xasecureAuditDestinationSolrUrls == null)?"<null>":this.xasecureAuditDestinationSolrUrls));
        sb.append(',');
        sb.append("xasecureAuditDestinationSolrZookeepers");
        sb.append('=');
        sb.append(((this.xasecureAuditDestinationSolrZookeepers == null)?"<null>":this.xasecureAuditDestinationSolrZookeepers));
        sb.append(',');
        sb.append("xasecureAuditIsEnabled");
        sb.append('=');
        sb.append(((this.xasecureAuditIsEnabled == null)?"<null>":this.xasecureAuditIsEnabled));
        sb.append(',');
        sb.append("xasecureAuditProviderSummaryEnabled");
        sb.append('=');
        sb.append(((this.xasecureAuditProviderSummaryEnabled == null)?"<null>":this.xasecureAuditProviderSummaryEnabled));
        sb.append(',');
        sb.append("repositoryConfigPassword");
        sb.append('=');
        sb.append(((this.repositoryConfigPassword == null)?"<null>":this.repositoryConfigPassword));
        sb.append(',');
        sb.append("repositoryConfigUsername");
        sb.append('=');
        sb.append(((this.repositoryConfigUsername == null)?"<null>":this.repositoryConfigUsername));
        sb.append(',');
        sb.append("commonNameForCertificate");
        sb.append('=');
        sb.append(((this.commonNameForCertificate == null)?"<null>":this.commonNameForCertificate));
        sb.append(',');
        sb.append("hadoopRpcProtection");
        sb.append('=');
        sb.append(((this.hadoopRpcProtection == null)?"<null>":this.hadoopRpcProtection));
        sb.append(',');
        sb.append("policyUser");
        sb.append('=');
        sb.append(((this.policyUser == null)?"<null>":this.policyUser));
        sb.append(',');
        sb.append("rangerHdfsPluginEnabled");
        sb.append('=');
        sb.append(((this.rangerHdfsPluginEnabled == null)?"<null>":this.rangerHdfsPluginEnabled));
        sb.append(',');
        sb.append("xasecurePolicymgrClientsslKeystore");
        sb.append('=');
        sb.append(((this.xasecurePolicymgrClientsslKeystore == null)?"<null>":this.xasecurePolicymgrClientsslKeystore));
        sb.append(',');
        sb.append("xasecurePolicymgrClientsslKeystoreCredentialFile");
        sb.append('=');
        sb.append(((this.xasecurePolicymgrClientsslKeystoreCredentialFile == null)?"<null>":this.xasecurePolicymgrClientsslKeystoreCredentialFile));
        sb.append(',');
        sb.append("xasecurePolicymgrClientsslKeystorePassword");
        sb.append('=');
        sb.append(((this.xasecurePolicymgrClientsslKeystorePassword == null)?"<null>":this.xasecurePolicymgrClientsslKeystorePassword));
        sb.append(',');
        sb.append("xasecurePolicymgrClientsslTruststore");
        sb.append('=');
        sb.append(((this.xasecurePolicymgrClientsslTruststore == null)?"<null>":this.xasecurePolicymgrClientsslTruststore));
        sb.append(',');
        sb.append("xasecurePolicymgrClientsslTruststoreCredentialFile");
        sb.append('=');
        sb.append(((this.xasecurePolicymgrClientsslTruststoreCredentialFile == null)?"<null>":this.xasecurePolicymgrClientsslTruststoreCredentialFile));
        sb.append(',');
        sb.append("xasecurePolicymgrClientsslTruststorePassword");
        sb.append('=');
        sb.append(((this.xasecurePolicymgrClientsslTruststorePassword == null)?"<null>":this.xasecurePolicymgrClientsslTruststorePassword));
        sb.append(',');
        sb.append("rangerPluginHdfsPolicyCacheDir");
        sb.append('=');
        sb.append(((this.rangerPluginHdfsPolicyCacheDir == null)?"<null>":this.rangerPluginHdfsPolicyCacheDir));
        sb.append(',');
        sb.append("rangerPluginHdfsPolicyPollIntervalMs");
        sb.append('=');
        sb.append(((this.rangerPluginHdfsPolicyPollIntervalMs == null)?"<null>":this.rangerPluginHdfsPolicyPollIntervalMs));
        sb.append(',');
        sb.append("rangerPluginHdfsPolicyRestSslConfigFile");
        sb.append('=');
        sb.append(((this.rangerPluginHdfsPolicyRestSslConfigFile == null)?"<null>":this.rangerPluginHdfsPolicyRestSslConfigFile));
        sb.append(',');
        sb.append("rangerPluginHdfsPolicyRestUrl");
        sb.append('=');
        sb.append(((this.rangerPluginHdfsPolicyRestUrl == null)?"<null>":this.rangerPluginHdfsPolicyRestUrl));
        sb.append(',');
        sb.append("rangerPluginHdfsPolicySourceImpl");
        sb.append('=');
        sb.append(((this.rangerPluginHdfsPolicySourceImpl == null)?"<null>":this.rangerPluginHdfsPolicySourceImpl));
        sb.append(',');
        sb.append("rangerPluginHdfsServiceName");
        sb.append('=');
        sb.append(((this.rangerPluginHdfsServiceName == null)?"<null>":this.rangerPluginHdfsServiceName));
        sb.append(',');
        sb.append("xasecureAddHadoopAuthorization");
        sb.append('=');
        sb.append(((this.xasecureAddHadoopAuthorization == null)?"<null>":this.xasecureAddHadoopAuthorization));
        sb.append(',');
        sb.append("sslClientKeystoreLocation");
        sb.append('=');
        sb.append(((this.sslClientKeystoreLocation == null)?"<null>":this.sslClientKeystoreLocation));
        sb.append(',');
        sb.append("sslClientKeystorePassword");
        sb.append('=');
        sb.append(((this.sslClientKeystorePassword == null)?"<null>":this.sslClientKeystorePassword));
        sb.append(',');
        sb.append("sslClientKeystoreType");
        sb.append('=');
        sb.append(((this.sslClientKeystoreType == null)?"<null>":this.sslClientKeystoreType));
        sb.append(',');
        sb.append("sslClientTruststoreLocation");
        sb.append('=');
        sb.append(((this.sslClientTruststoreLocation == null)?"<null>":this.sslClientTruststoreLocation));
        sb.append(',');
        sb.append("sslClientTruststorePassword");
        sb.append('=');
        sb.append(((this.sslClientTruststorePassword == null)?"<null>":this.sslClientTruststorePassword));
        sb.append(',');
        sb.append("sslClientTruststoreReloadInterval");
        sb.append('=');
        sb.append(((this.sslClientTruststoreReloadInterval == null)?"<null>":this.sslClientTruststoreReloadInterval));
        sb.append(',');
        sb.append("sslClientTruststoreType");
        sb.append('=');
        sb.append(((this.sslClientTruststoreType == null)?"<null>":this.sslClientTruststoreType));
        sb.append(',');
        sb.append("sslServerKeystoreKeypassword");
        sb.append('=');
        sb.append(((this.sslServerKeystoreKeypassword == null)?"<null>":this.sslServerKeystoreKeypassword));
        sb.append(',');
        sb.append("sslServerKeystoreLocation");
        sb.append('=');
        sb.append(((this.sslServerKeystoreLocation == null)?"<null>":this.sslServerKeystoreLocation));
        sb.append(',');
        sb.append("sslServerKeystorePassword");
        sb.append('=');
        sb.append(((this.sslServerKeystorePassword == null)?"<null>":this.sslServerKeystorePassword));
        sb.append(',');
        sb.append("sslServerKeystoreType");
        sb.append('=');
        sb.append(((this.sslServerKeystoreType == null)?"<null>":this.sslServerKeystoreType));
        sb.append(',');
        sb.append("sslServerTruststoreLocation");
        sb.append('=');
        sb.append(((this.sslServerTruststoreLocation == null)?"<null>":this.sslServerTruststoreLocation));
        sb.append(',');
        sb.append("sslServerTruststorePassword");
        sb.append('=');
        sb.append(((this.sslServerTruststorePassword == null)?"<null>":this.sslServerTruststorePassword));
        sb.append(',');
        sb.append("sslServerTruststoreReloadInterval");
        sb.append('=');
        sb.append(((this.sslServerTruststoreReloadInterval == null)?"<null>":this.sslServerTruststoreReloadInterval));
        sb.append(',');
        sb.append("sslServerTruststoreType");
        sb.append('=');
        sb.append(((this.sslServerTruststoreType == null)?"<null>":this.sslServerTruststoreType));
        sb.append(',');
        sb.append("hadoopProxyuserHiveGroups");
        sb.append('=');
        sb.append(((this.hadoopProxyuserHiveGroups == null)?"<null>":this.hadoopProxyuserHiveGroups));
        sb.append(',');
        sb.append("hadoopProxyuserHiveHosts");
        sb.append('=');
        sb.append(((this.hadoopProxyuserHiveHosts == null)?"<null>":this.hadoopProxyuserHiveHosts));
        sb.append(',');
        sb.append("hadoopSecurityKeyProviderPath");
        sb.append('=');
        sb.append(((this.hadoopSecurityKeyProviderPath == null)?"<null>":this.hadoopSecurityKeyProviderPath));
        sb.append(',');
        sb.append("dfsEncryptionKeyProviderUri");
        sb.append('=');
        sb.append(((this.dfsEncryptionKeyProviderUri == null)?"<null>":this.dfsEncryptionKeyProviderUri));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.nfsgatewayHeapsize == null)? 0 :this.nfsgatewayHeapsize.hashCode()));
        result = ((result* 31)+((this.namenodeOptNewsize == null)? 0 :this.namenodeOptNewsize.hashCode()));
        result = ((result* 31)+((this.securityRefreshPolicyProtocolAcl == null)? 0 :this.securityRefreshPolicyProtocolAcl.hashCode()));
        result = ((result* 31)+((this.sslClientTruststoreType == null)? 0 :this.sslClientTruststoreType.hashCode()));
        result = ((result* 31)+((this.hadoopRootLogger == null)? 0 :this.hadoopRootLogger.hashCode()));
        result = ((result* 31)+((this.hadoopSecurityInstrumentationRequiresAdmin == null)? 0 :this.hadoopSecurityInstrumentationRequiresAdmin.hashCode()));
        result = ((result* 31)+((this.xasecurePolicymgrClientsslTruststorePassword == null)? 0 :this.xasecurePolicymgrClientsslTruststorePassword.hashCode()));
        result = ((result* 31)+((this.sslServerTruststorePassword == null)? 0 :this.sslServerTruststorePassword.hashCode()));
        result = ((result* 31)+((this.fsAzureUserAgentPrefix == null)? 0 :this.fsAzureUserAgentPrefix.hashCode()));
        result = ((result* 31)+((this.sslClientTruststorePassword == null)? 0 :this.sslClientTruststorePassword.hashCode()));
        result = ((result* 31)+((this.xasecureAuditDestinationHdfsBatchFilespoolDir == null)? 0 :this.xasecureAuditDestinationHdfsBatchFilespoolDir.hashCode()));
        result = ((result* 31)+((this.ioSerializations == null)? 0 :this.ioSerializations.hashCode()));
        result = ((result* 31)+((this.xasecurePolicymgrClientsslKeystoreCredentialFile == null)? 0 :this.xasecurePolicymgrClientsslKeystoreCredentialFile.hashCode()));
        result = ((result* 31)+((this.hadoopHeapsize == null)? 0 :this.hadoopHeapsize.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeRpcAddress == null)? 0 :this.dfsNamenodeRpcAddress.hashCode()));
        result = ((result* 31)+((this.keyserverPort == null)? 0 :this.keyserverPort.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeCheckpointPeriod == null)? 0 :this.dfsNamenodeCheckpointPeriod.hashCode()));
        result = ((result* 31)+((this.dfsHttpPolicy == null)? 0 :this.dfsHttpPolicy.hashCode()));
        result = ((result* 31)+((this.securityRefreshUsertogroupsMappingsProtocolAcl == null)? 0 :this.securityRefreshUsertogroupsMappingsProtocolAcl.hashCode()));
        result = ((result* 31)+((this.rangerPluginHdfsPolicySourceImpl == null)? 0 :this.rangerPluginHdfsPolicySourceImpl.hashCode()));
        result = ((result* 31)+((this.manageIncludeFiles == null)? 0 :this.manageIncludeFiles.hashCode()));
        result = ((result* 31)+((this.xasecureAuditIsEnabled == null)? 0 :this.xasecureAuditIsEnabled.hashCode()));
        result = ((result* 31)+((this.sslServerKeystoreLocation == null)? 0 :this.sslServerKeystoreLocation.hashCode()));
        result = ((result* 31)+((this.fsTrashInterval == null)? 0 :this.fsTrashInterval.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeNameDirRestore == null)? 0 :this.dfsNamenodeNameDirRestore.hashCode()));
        result = ((result* 31)+((this.sslServerTruststoreReloadInterval == null)? 0 :this.sslServerTruststoreReloadInterval.hashCode()));
        result = ((result* 31)+((this.securityNamenodeProtocolAcl == null)? 0 :this.securityNamenodeProtocolAcl.hashCode()));
        result = ((result* 31)+((this.sslServerKeystoreType == null)? 0 :this.sslServerKeystoreType.hashCode()));
        result = ((result* 31)+((this.dfsJournalnodeEditsDir == null)? 0 :this.dfsJournalnodeEditsDir.hashCode()));
        result = ((result* 31)+((this.dfsEncryptDataTransferCipherSuites == null)? 0 :this.dfsEncryptDataTransferCipherSuites.hashCode()));
        result = ((result* 31)+((this.ioCompressionCodecs == null)? 0 :this.ioCompressionCodecs.hashCode()));
        result = ((result* 31)+((this.securityJobTaskProtocolAcl == null)? 0 :this.securityJobTaskProtocolAcl.hashCode()));
        result = ((result* 31)+((this.dfsDatanodeDuReserved == null)? 0 :this.dfsDatanodeDuReserved.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeFslockFair == null)? 0 :this.dfsNamenodeFslockFair.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeStaleDatanodeInterval == null)? 0 :this.dfsNamenodeStaleDatanodeInterval.hashCode()));
        result = ((result* 31)+((this.ipcServerTcpnodelay == null)? 0 :this.ipcServerTcpnodelay.hashCode()));
        result = ((result* 31)+((this.ioFileBufferSize == null)? 0 :this.ioFileBufferSize.hashCode()));
        result = ((result* 31)+((this.namenodeHeapsize == null)? 0 :this.namenodeHeapsize.hashCode()));
        result = ((result* 31)+((this.repositoryConfigUsername == null)? 0 :this.repositoryConfigUsername.hashCode()));
        result = ((result* 31)+((this.hadoopHttpCrossOriginAllowedMethods == null)? 0 :this.hadoopHttpCrossOriginAllowedMethods.hashCode()));
        result = ((result* 31)+((this.hadoopProxyuserAmbariGroups == null)? 0 :this.hadoopProxyuserAmbariGroups.hashCode()));
        result = ((result* 31)+((this.dfsReplicationMax == null)? 0 :this.dfsReplicationMax.hashCode()));
        result = ((result* 31)+((this.hadoopSecurityKeyProviderPath == null)? 0 :this.hadoopSecurityKeyProviderPath.hashCode()));
        result = ((result* 31)+((this.ipcClientConnectMaxRetries == null)? 0 :this.ipcClientConnectMaxRetries.hashCode()));
        result = ((result* 31)+((this.fsS3aUserAgentPrefix == null)? 0 :this.fsS3aUserAgentPrefix.hashCode()));
        result = ((result* 31)+((this.hadoopSecurityAuthentication == null)? 0 :this.hadoopSecurityAuthentication.hashCode()));
        result = ((result* 31)+((this.keyserverHost == null)? 0 :this.keyserverHost.hashCode()));
        result = ((result* 31)+((this.namenodeOptMaxnewsize == null)? 0 :this.namenodeOptMaxnewsize.hashCode()));
        result = ((result* 31)+((this.dfsClientRetryPolicyEnabled == null)? 0 :this.dfsClientRetryPolicyEnabled.hashCode()));
        result = ((result* 31)+((this.fsS3aMultipartSize == null)? 0 :this.fsS3aMultipartSize.hashCode()));
        result = ((result* 31)+((this.dfsDatanodeHttpAddress == null)? 0 :this.dfsDatanodeHttpAddress.hashCode()));
        result = ((result* 31)+((this.dfsJournalnodeHttpsAddress == null)? 0 :this.dfsJournalnodeHttpsAddress.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeCheckpointDir == null)? 0 :this.dfsNamenodeCheckpointDir.hashCode()));
        result = ((result* 31)+((this.hadoopProxyuserHdfsGroups == null)? 0 :this.hadoopProxyuserHdfsGroups.hashCode()));
        result = ((result* 31)+((this.dfsDatanodeBalanceBandwidthPerSec == null)? 0 :this.dfsDatanodeBalanceBandwidthPerSec.hashCode()));
        result = ((result* 31)+((this.hadoopHttpCrossOriginAllowedOrigins == null)? 0 :this.hadoopHttpCrossOriginAllowedOrigins.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeHttpsAddress == null)? 0 :this.dfsNamenodeHttpsAddress.hashCode()));
        result = ((result* 31)+((this.sslClientKeystoreLocation == null)? 0 :this.sslClientKeystoreLocation.hashCode()));
        result = ((result* 31)+((this.fsPermissionsUmaskMode == null)? 0 :this.fsPermissionsUmaskMode.hashCode()));
        result = ((result* 31)+((this.xasecureAuditProviderSummaryEnabled == null)? 0 :this.xasecureAuditProviderSummaryEnabled.hashCode()));
        result = ((result* 31)+((this.rangerHdfsPluginEnabled == null)? 0 :this.rangerHdfsPluginEnabled.hashCode()));
        result = ((result* 31)+((this.hdfsTmpDir == null)? 0 :this.hdfsTmpDir.hashCode()));
        result = ((result* 31)+((this.hadoopLogNumberOfBackupFiles == null)? 0 :this.hadoopLogNumberOfBackupFiles.hashCode()));
        result = ((result* 31)+((this.sslServerKeystoreKeypassword == null)? 0 :this.sslServerKeystoreKeypassword.hashCode()));
        result = ((result* 31)+((this.hadoopSecurityLogNumberOfBackupFiles == null)? 0 :this.hadoopSecurityLogNumberOfBackupFiles.hashCode()));
        result = ((result* 31)+((this.dfsReplication == null)? 0 :this.dfsReplication.hashCode()));
        result = ((result* 31)+((this.xasecureAuditDestinationSolrBatchFilespoolDir == null)? 0 :this.xasecureAuditDestinationSolrBatchFilespoolDir.hashCode()));
        result = ((result* 31)+((this.hadoopHttpFilterInitializers == null)? 0 :this.hadoopHttpFilterInitializers.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeAccesstimePrecision == null)? 0 :this.dfsNamenodeAccesstimePrecision.hashCode()));
        result = ((result* 31)+((this.xasecureAuditDestinationSolrZookeepers == null)? 0 :this.xasecureAuditDestinationSolrZookeepers.hashCode()));
        result = ((result* 31)+((this.dfsEncryptionKeyProviderUri == null)? 0 :this.dfsEncryptionKeyProviderUri.hashCode()));
        result = ((result* 31)+((this.rangerPluginHdfsAmbariClusterName == null)? 0 :this.rangerPluginHdfsAmbariClusterName.hashCode()));
        result = ((result* 31)+((this.dfsDatanodeHttpsAddress == null)? 0 :this.dfsDatanodeHttpsAddress.hashCode()));
        result = ((result* 31)+((this.sslClientKeystorePassword == null)? 0 :this.sslClientKeystorePassword.hashCode()));
        result = ((result* 31)+((this.hadoopSecurityAuthorization == null)? 0 :this.hadoopSecurityAuthorization.hashCode()));
        result = ((result* 31)+((this.dfsHttpsPort == null)? 0 :this.dfsHttpsPort.hashCode()));
        result = ((result* 31)+((this.hadoopSecurityAuthToLocal == null)? 0 :this.hadoopSecurityAuthToLocal.hashCode()));
        result = ((result* 31)+((this.rangerPluginHdfsServiceName == null)? 0 :this.rangerPluginHdfsServiceName.hashCode()));
        result = ((result* 31)+((this.ipcClientConnectionMaxidletime == null)? 0 :this.ipcClientConnectionMaxidletime.hashCode()));
        result = ((result* 31)+((this.namenodeOptMaxpermsize == null)? 0 :this.namenodeOptMaxpermsize.hashCode()));
        result = ((result* 31)+((this.hadoopSecurityLogMaxBackupSize == null)? 0 :this.hadoopSecurityLogMaxBackupSize.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeStartupDelayBlockDeletionSec == null)? 0 :this.dfsNamenodeStartupDelayBlockDeletionSec.hashCode()));
        result = ((result* 31)+((this.hadoopLogMaxBackupSize == null)? 0 :this.hadoopLogMaxBackupSize.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeSecondaryHttpAddress == null)? 0 :this.dfsNamenodeSecondaryHttpAddress.hashCode()));
        result = ((result* 31)+((this.securityJobClientProtocolAcl == null)? 0 :this.securityJobClientProtocolAcl.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeCheckpointEditsDir == null)? 0 :this.dfsNamenodeCheckpointEditsDir.hashCode()));
        result = ((result* 31)+((this.hadoopHttpAuthenticationSimpleAnonymousAllowed == null)? 0 :this.hadoopHttpAuthenticationSimpleAnonymousAllowed.hashCode()));
        result = ((result* 31)+((this.hadoopProxyuserAmbariHosts == null)? 0 :this.hadoopProxyuserAmbariHosts.hashCode()));
        result = ((result* 31)+((this.fsDefaultFS == null)? 0 :this.fsDefaultFS.hashCode()));
        result = ((result* 31)+((this.dfsDatanodeAddress == null)? 0 :this.dfsDatanodeAddress.hashCode()));
        result = ((result* 31)+((this.dfsClientReadShortcircuit == null)? 0 :this.dfsClientReadShortcircuit.hashCode()));
        result = ((result* 31)+((this.nfsFileDumpDir == null)? 0 :this.nfsFileDumpDir.hashCode()));
        result = ((result* 31)+((this.repositoryConfigPassword == null)? 0 :this.repositoryConfigPassword.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeHttpAddress == null)? 0 :this.dfsNamenodeHttpAddress.hashCode()));
        result = ((result* 31)+((this.dfsHeartbeatInterval == null)? 0 :this.dfsHeartbeatInterval.hashCode()));
        result = ((result* 31)+((this.hdfsUserNofileLimit == null)? 0 :this.hdfsUserNofileLimit.hashCode()));
        result = ((result* 31)+((this.rangerPluginHdfsPolicyCacheDir == null)? 0 :this.rangerPluginHdfsPolicyCacheDir.hashCode()));
        result = ((result* 31)+((this.hadoopHttpCrossOriginMaxAge == null)? 0 :this.hadoopHttpCrossOriginMaxAge.hashCode()));
        result = ((result* 31)+((this.dfsContentSummaryLimit == null)? 0 :this.dfsContentSummaryLimit.hashCode()));
        result = ((result* 31)+((this.hadoopProxyuserHdfsHosts == null)? 0 :this.hadoopProxyuserHdfsHosts.hashCode()));
        result = ((result* 31)+((this.dfsWebhdfsEnabled == null)? 0 :this.dfsWebhdfsEnabled.hashCode()));
        result = ((result* 31)+((this.xasecurePolicymgrClientsslKeystore == null)? 0 :this.xasecurePolicymgrClientsslKeystore.hashCode()));
        result = ((result* 31)+((this.xasecurePolicymgrClientsslTruststoreCredentialFile == null)? 0 :this.xasecurePolicymgrClientsslTruststoreCredentialFile.hashCode()));
        result = ((result* 31)+((this.rangerPluginHdfsPolicyPollIntervalMs == null)? 0 :this.rangerPluginHdfsPolicyPollIntervalMs.hashCode()));
        result = ((result* 31)+((this.xasecureAuditDestinationHdfs == null)? 0 :this.xasecureAuditDestinationHdfs.hashCode()));
        result = ((result* 31)+((this.securityDatanodeProtocolAcl == null)? 0 :this.securityDatanodeProtocolAcl.hashCode()));
        result = ((result* 31)+((this.haFailoverControllerActiveStandbyElectorZkOpRetries == null)? 0 :this.haFailoverControllerActiveStandbyElectorZkOpRetries.hashCode()));
        result = ((result* 31)+((this.commonNameForCertificate == null)? 0 :this.commonNameForCertificate.hashCode()));
        result = ((result* 31)+((this.rangerPluginHdfsPolicyRestUrl == null)? 0 :this.rangerPluginHdfsPolicyRestUrl.hashCode()));
        result = ((result* 31)+((this.securityInterTrackerProtocolAcl == null)? 0 :this.securityInterTrackerProtocolAcl.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeAvoidReadStaleDatanode == null)? 0 :this.dfsNamenodeAvoidReadStaleDatanode.hashCode()));
        result = ((result* 31)+((this.hdfsLogDirPrefix == null)? 0 :this.hdfsLogDirPrefix.hashCode()));
        result = ((result* 31)+((this.xasecurePolicymgrClientsslKeystorePassword == null)? 0 :this.xasecurePolicymgrClientsslKeystorePassword.hashCode()));
        result = ((result* 31)+((this.fsS3aFastUpload == null)? 0 :this.fsS3aFastUpload.hashCode()));
        result = ((result* 31)+((this.netTopologyScriptFileName == null)? 0 :this.netTopologyScriptFileName.hashCode()));
        result = ((result* 31)+((this.dfsDomainSocketPath == null)? 0 :this.dfsDomainSocketPath.hashCode()));
        result = ((result* 31)+((this.dfsClusterAdministrators == null)? 0 :this.dfsClusterAdministrators.hashCode()));
        result = ((result* 31)+((this.xasecureAuditDestinationSolr == null)? 0 :this.xasecureAuditDestinationSolr.hashCode()));
        result = ((result* 31)+((this.hadoopRpcProtection == null)? 0 :this.hadoopRpcProtection.hashCode()));
        result = ((result* 31)+((this.dfsDatanodeIpcAddress == null)? 0 :this.dfsDatanodeIpcAddress.hashCode()));
        result = ((result* 31)+((this.dfsJournalnodeHttpAddress == null)? 0 :this.dfsJournalnodeHttpAddress.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeNameDir == null)? 0 :this.dfsNamenodeNameDir.hashCode()));
        result = ((result* 31)+((this.xasecureAuditDestinationSolrUrls == null)? 0 :this.xasecureAuditDestinationSolrUrls.hashCode()));
        result = ((result* 31)+((this.dfsDatanodeFailedVolumesTolerated == null)? 0 :this.dfsDatanodeFailedVolumesTolerated.hashCode()));
        result = ((result* 31)+((this.nfsExportsAllowedHosts == null)? 0 :this.nfsExportsAllowedHosts.hashCode()));
        result = ((result* 31)+((this.sslServerKeystorePassword == null)? 0 :this.sslServerKeystorePassword.hashCode()));
        result = ((result* 31)+((this.hadoopPidDirPrefix == null)? 0 :this.hadoopPidDirPrefix.hashCode()));
        result = ((result* 31)+((this.hadoopProxyuserHiveHosts == null)? 0 :this.hadoopProxyuserHiveHosts.hashCode()));
        result = ((result* 31)+((this.hdfsUser == null)? 0 :this.hdfsUser.hashCode()));
        result = ((result* 31)+((this.ipcClientIdlethreshold == null)? 0 :this.ipcClientIdlethreshold.hashCode()));
        result = ((result* 31)+((this.dfsBlockAccessTokenEnable == null)? 0 :this.dfsBlockAccessTokenEnable.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeAuditLogAsync == null)? 0 :this.dfsNamenodeAuditLogAsync.hashCode()));
        result = ((result* 31)+((this.sslServerTruststoreLocation == null)? 0 :this.sslServerTruststoreLocation.hashCode()));
        result = ((result* 31)+((this.namenodeOptPermsize == null)? 0 :this.namenodeOptPermsize.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        result = ((result* 31)+((this.securityInterDatanodeProtocolAcl == null)? 0 :this.securityInterDatanodeProtocolAcl.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeHandlerCount == null)? 0 :this.dfsNamenodeHandlerCount.hashCode()));
        result = ((result* 31)+((this.dfsPermissionsSuperusergroup == null)? 0 :this.dfsPermissionsSuperusergroup.hashCode()));
        result = ((result* 31)+((this.securityClientDatanodeProtocolAcl == null)? 0 :this.securityClientDatanodeProtocolAcl.hashCode()));
        result = ((result* 31)+((this.dfsHostsExclude == null)? 0 :this.dfsHostsExclude.hashCode()));
        result = ((result* 31)+((this.dfsDatanodeDataDirPerm == null)? 0 :this.dfsDatanodeDataDirPerm.hashCode()));
        result = ((result* 31)+((this.namenodeBackupDir == null)? 0 :this.namenodeBackupDir.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeCheckpointTxns == null)? 0 :this.dfsNamenodeCheckpointTxns.hashCode()));
        result = ((result* 31)+((this.xasecurePolicymgrClientsslTruststore == null)? 0 :this.xasecurePolicymgrClientsslTruststore.hashCode()));
        result = ((result* 31)+((this.dfsBlockreportInitialDelay == null)? 0 :this.dfsBlockreportInitialDelay.hashCode()));
        result = ((result* 31)+((this.dfsClientReadShortcircuitStreamsCacheSize == null)? 0 :this.dfsClientReadShortcircuitStreamsCacheSize.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeAvoidWriteStaleDatanode == null)? 0 :this.dfsNamenodeAvoidWriteStaleDatanode.hashCode()));
        result = ((result* 31)+((this.dfsDatanodeMaxTransferThreads == null)? 0 :this.dfsDatanodeMaxTransferThreads.hashCode()));
        result = ((result* 31)+((this.xasecureAddHadoopAuthorization == null)? 0 :this.xasecureAddHadoopAuthorization.hashCode()));
        result = ((result* 31)+((this.dfsDatanodeDataDir == null)? 0 :this.dfsDatanodeDataDir.hashCode()));
        result = ((result* 31)+((this.securityClientProtocolAcl == null)? 0 :this.securityClientProtocolAcl.hashCode()));
        result = ((result* 31)+((this.sslClientKeystoreType == null)? 0 :this.sslClientKeystoreType.hashCode()));
        result = ((result* 31)+((this.hdfsUserNprocLimit == null)? 0 :this.hdfsUserNprocLimit.hashCode()));
        result = ((result* 31)+((this.rangerPluginHdfsPolicyRestSslConfigFile == null)? 0 :this.rangerPluginHdfsPolicyRestSslConfigFile.hashCode()));
        result = ((result* 31)+((this.dtnodeHeapsize == null)? 0 :this.dtnodeHeapsize.hashCode()));
        result = ((result* 31)+((this.dfsBlocksize == null)? 0 :this.dfsBlocksize.hashCode()));
        result = ((result* 31)+((this.hadoopProxyuserHiveGroups == null)? 0 :this.hadoopProxyuserHiveGroups.hashCode()));
        result = ((result* 31)+((this.policyUser == null)? 0 :this.policyUser.hashCode()));
        result = ((result* 31)+((this.sslClientTruststoreLocation == null)? 0 :this.sslClientTruststoreLocation.hashCode()));
        result = ((result* 31)+((this.securityAdminOperationsProtocolAcl == null)? 0 :this.securityAdminOperationsProtocolAcl.hashCode()));
        result = ((result* 31)+((this.hadoopCallerContextEnabled == null)? 0 :this.hadoopCallerContextEnabled.hashCode()));
        result = ((result* 31)+((this.hadoopHttpCrossOriginAllowedHeaders == null)? 0 :this.hadoopHttpCrossOriginAllowedHeaders.hashCode()));
        result = ((result* 31)+((this.mapreduceJobtrackerWebinterfaceTrusted == null)? 0 :this.mapreduceJobtrackerWebinterfaceTrusted.hashCode()));
        result = ((result* 31)+((this.dfsPermissionsEnabled == null)? 0 :this.dfsPermissionsEnabled.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeAclsEnabled == null)? 0 :this.dfsNamenodeAclsEnabled.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeWriteStaleDatanodeRatio == null)? 0 :this.dfsNamenodeWriteStaleDatanodeRatio.hashCode()));
        result = ((result* 31)+((this.sslServerTruststoreType == null)? 0 :this.sslServerTruststoreType.hashCode()));
        result = ((result* 31)+((this.fsS3aFastUploadBuffer == null)? 0 :this.fsS3aFastUploadBuffer.hashCode()));
        result = ((result* 31)+((this.dfsNamenodeSafemodeThresholdPct == null)? 0 :this.dfsNamenodeSafemodeThresholdPct.hashCode()));
        result = ((result* 31)+((this.proxyuserGroup == null)? 0 :this.proxyuserGroup.hashCode()));
        result = ((result* 31)+((this.xasecureAuditDestinationHdfsDir == null)? 0 :this.xasecureAuditDestinationHdfsDir.hashCode()));
        result = ((result* 31)+((this.sslClientTruststoreReloadInterval == null)? 0 :this.sslClientTruststoreReloadInterval.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties) == false) {
            return false;
        }
        Properties rhs = ((Properties) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.nfsgatewayHeapsize == rhs.nfsgatewayHeapsize)||((this.nfsgatewayHeapsize!= null)&&this.nfsgatewayHeapsize.equals(rhs.nfsgatewayHeapsize)))&&((this.namenodeOptNewsize == rhs.namenodeOptNewsize)||((this.namenodeOptNewsize!= null)&&this.namenodeOptNewsize.equals(rhs.namenodeOptNewsize))))&&((this.securityRefreshPolicyProtocolAcl == rhs.securityRefreshPolicyProtocolAcl)||((this.securityRefreshPolicyProtocolAcl!= null)&&this.securityRefreshPolicyProtocolAcl.equals(rhs.securityRefreshPolicyProtocolAcl))))&&((this.sslClientTruststoreType == rhs.sslClientTruststoreType)||((this.sslClientTruststoreType!= null)&&this.sslClientTruststoreType.equals(rhs.sslClientTruststoreType))))&&((this.hadoopRootLogger == rhs.hadoopRootLogger)||((this.hadoopRootLogger!= null)&&this.hadoopRootLogger.equals(rhs.hadoopRootLogger))))&&((this.hadoopSecurityInstrumentationRequiresAdmin == rhs.hadoopSecurityInstrumentationRequiresAdmin)||((this.hadoopSecurityInstrumentationRequiresAdmin!= null)&&this.hadoopSecurityInstrumentationRequiresAdmin.equals(rhs.hadoopSecurityInstrumentationRequiresAdmin))))&&((this.xasecurePolicymgrClientsslTruststorePassword == rhs.xasecurePolicymgrClientsslTruststorePassword)||((this.xasecurePolicymgrClientsslTruststorePassword!= null)&&this.xasecurePolicymgrClientsslTruststorePassword.equals(rhs.xasecurePolicymgrClientsslTruststorePassword))))&&((this.sslServerTruststorePassword == rhs.sslServerTruststorePassword)||((this.sslServerTruststorePassword!= null)&&this.sslServerTruststorePassword.equals(rhs.sslServerTruststorePassword))))&&((this.fsAzureUserAgentPrefix == rhs.fsAzureUserAgentPrefix)||((this.fsAzureUserAgentPrefix!= null)&&this.fsAzureUserAgentPrefix.equals(rhs.fsAzureUserAgentPrefix))))&&((this.sslClientTruststorePassword == rhs.sslClientTruststorePassword)||((this.sslClientTruststorePassword!= null)&&this.sslClientTruststorePassword.equals(rhs.sslClientTruststorePassword))))&&((this.xasecureAuditDestinationHdfsBatchFilespoolDir == rhs.xasecureAuditDestinationHdfsBatchFilespoolDir)||((this.xasecureAuditDestinationHdfsBatchFilespoolDir!= null)&&this.xasecureAuditDestinationHdfsBatchFilespoolDir.equals(rhs.xasecureAuditDestinationHdfsBatchFilespoolDir))))&&((this.ioSerializations == rhs.ioSerializations)||((this.ioSerializations!= null)&&this.ioSerializations.equals(rhs.ioSerializations))))&&((this.xasecurePolicymgrClientsslKeystoreCredentialFile == rhs.xasecurePolicymgrClientsslKeystoreCredentialFile)||((this.xasecurePolicymgrClientsslKeystoreCredentialFile!= null)&&this.xasecurePolicymgrClientsslKeystoreCredentialFile.equals(rhs.xasecurePolicymgrClientsslKeystoreCredentialFile))))&&((this.hadoopHeapsize == rhs.hadoopHeapsize)||((this.hadoopHeapsize!= null)&&this.hadoopHeapsize.equals(rhs.hadoopHeapsize))))&&((this.dfsNamenodeRpcAddress == rhs.dfsNamenodeRpcAddress)||((this.dfsNamenodeRpcAddress!= null)&&this.dfsNamenodeRpcAddress.equals(rhs.dfsNamenodeRpcAddress))))&&((this.keyserverPort == rhs.keyserverPort)||((this.keyserverPort!= null)&&this.keyserverPort.equals(rhs.keyserverPort))))&&((this.dfsNamenodeCheckpointPeriod == rhs.dfsNamenodeCheckpointPeriod)||((this.dfsNamenodeCheckpointPeriod!= null)&&this.dfsNamenodeCheckpointPeriod.equals(rhs.dfsNamenodeCheckpointPeriod))))&&((this.dfsHttpPolicy == rhs.dfsHttpPolicy)||((this.dfsHttpPolicy!= null)&&this.dfsHttpPolicy.equals(rhs.dfsHttpPolicy))))&&((this.securityRefreshUsertogroupsMappingsProtocolAcl == rhs.securityRefreshUsertogroupsMappingsProtocolAcl)||((this.securityRefreshUsertogroupsMappingsProtocolAcl!= null)&&this.securityRefreshUsertogroupsMappingsProtocolAcl.equals(rhs.securityRefreshUsertogroupsMappingsProtocolAcl))))&&((this.rangerPluginHdfsPolicySourceImpl == rhs.rangerPluginHdfsPolicySourceImpl)||((this.rangerPluginHdfsPolicySourceImpl!= null)&&this.rangerPluginHdfsPolicySourceImpl.equals(rhs.rangerPluginHdfsPolicySourceImpl))))&&((this.manageIncludeFiles == rhs.manageIncludeFiles)||((this.manageIncludeFiles!= null)&&this.manageIncludeFiles.equals(rhs.manageIncludeFiles))))&&((this.xasecureAuditIsEnabled == rhs.xasecureAuditIsEnabled)||((this.xasecureAuditIsEnabled!= null)&&this.xasecureAuditIsEnabled.equals(rhs.xasecureAuditIsEnabled))))&&((this.sslServerKeystoreLocation == rhs.sslServerKeystoreLocation)||((this.sslServerKeystoreLocation!= null)&&this.sslServerKeystoreLocation.equals(rhs.sslServerKeystoreLocation))))&&((this.fsTrashInterval == rhs.fsTrashInterval)||((this.fsTrashInterval!= null)&&this.fsTrashInterval.equals(rhs.fsTrashInterval))))&&((this.dfsNamenodeNameDirRestore == rhs.dfsNamenodeNameDirRestore)||((this.dfsNamenodeNameDirRestore!= null)&&this.dfsNamenodeNameDirRestore.equals(rhs.dfsNamenodeNameDirRestore))))&&((this.sslServerTruststoreReloadInterval == rhs.sslServerTruststoreReloadInterval)||((this.sslServerTruststoreReloadInterval!= null)&&this.sslServerTruststoreReloadInterval.equals(rhs.sslServerTruststoreReloadInterval))))&&((this.securityNamenodeProtocolAcl == rhs.securityNamenodeProtocolAcl)||((this.securityNamenodeProtocolAcl!= null)&&this.securityNamenodeProtocolAcl.equals(rhs.securityNamenodeProtocolAcl))))&&((this.sslServerKeystoreType == rhs.sslServerKeystoreType)||((this.sslServerKeystoreType!= null)&&this.sslServerKeystoreType.equals(rhs.sslServerKeystoreType))))&&((this.dfsJournalnodeEditsDir == rhs.dfsJournalnodeEditsDir)||((this.dfsJournalnodeEditsDir!= null)&&this.dfsJournalnodeEditsDir.equals(rhs.dfsJournalnodeEditsDir))))&&((this.dfsEncryptDataTransferCipherSuites == rhs.dfsEncryptDataTransferCipherSuites)||((this.dfsEncryptDataTransferCipherSuites!= null)&&this.dfsEncryptDataTransferCipherSuites.equals(rhs.dfsEncryptDataTransferCipherSuites))))&&((this.ioCompressionCodecs == rhs.ioCompressionCodecs)||((this.ioCompressionCodecs!= null)&&this.ioCompressionCodecs.equals(rhs.ioCompressionCodecs))))&&((this.securityJobTaskProtocolAcl == rhs.securityJobTaskProtocolAcl)||((this.securityJobTaskProtocolAcl!= null)&&this.securityJobTaskProtocolAcl.equals(rhs.securityJobTaskProtocolAcl))))&&((this.dfsDatanodeDuReserved == rhs.dfsDatanodeDuReserved)||((this.dfsDatanodeDuReserved!= null)&&this.dfsDatanodeDuReserved.equals(rhs.dfsDatanodeDuReserved))))&&((this.dfsNamenodeFslockFair == rhs.dfsNamenodeFslockFair)||((this.dfsNamenodeFslockFair!= null)&&this.dfsNamenodeFslockFair.equals(rhs.dfsNamenodeFslockFair))))&&((this.dfsNamenodeStaleDatanodeInterval == rhs.dfsNamenodeStaleDatanodeInterval)||((this.dfsNamenodeStaleDatanodeInterval!= null)&&this.dfsNamenodeStaleDatanodeInterval.equals(rhs.dfsNamenodeStaleDatanodeInterval))))&&((this.ipcServerTcpnodelay == rhs.ipcServerTcpnodelay)||((this.ipcServerTcpnodelay!= null)&&this.ipcServerTcpnodelay.equals(rhs.ipcServerTcpnodelay))))&&((this.ioFileBufferSize == rhs.ioFileBufferSize)||((this.ioFileBufferSize!= null)&&this.ioFileBufferSize.equals(rhs.ioFileBufferSize))))&&((this.namenodeHeapsize == rhs.namenodeHeapsize)||((this.namenodeHeapsize!= null)&&this.namenodeHeapsize.equals(rhs.namenodeHeapsize))))&&((this.repositoryConfigUsername == rhs.repositoryConfigUsername)||((this.repositoryConfigUsername!= null)&&this.repositoryConfigUsername.equals(rhs.repositoryConfigUsername))))&&((this.hadoopHttpCrossOriginAllowedMethods == rhs.hadoopHttpCrossOriginAllowedMethods)||((this.hadoopHttpCrossOriginAllowedMethods!= null)&&this.hadoopHttpCrossOriginAllowedMethods.equals(rhs.hadoopHttpCrossOriginAllowedMethods))))&&((this.hadoopProxyuserAmbariGroups == rhs.hadoopProxyuserAmbariGroups)||((this.hadoopProxyuserAmbariGroups!= null)&&this.hadoopProxyuserAmbariGroups.equals(rhs.hadoopProxyuserAmbariGroups))))&&((this.dfsReplicationMax == rhs.dfsReplicationMax)||((this.dfsReplicationMax!= null)&&this.dfsReplicationMax.equals(rhs.dfsReplicationMax))))&&((this.hadoopSecurityKeyProviderPath == rhs.hadoopSecurityKeyProviderPath)||((this.hadoopSecurityKeyProviderPath!= null)&&this.hadoopSecurityKeyProviderPath.equals(rhs.hadoopSecurityKeyProviderPath))))&&((this.ipcClientConnectMaxRetries == rhs.ipcClientConnectMaxRetries)||((this.ipcClientConnectMaxRetries!= null)&&this.ipcClientConnectMaxRetries.equals(rhs.ipcClientConnectMaxRetries))))&&((this.fsS3aUserAgentPrefix == rhs.fsS3aUserAgentPrefix)||((this.fsS3aUserAgentPrefix!= null)&&this.fsS3aUserAgentPrefix.equals(rhs.fsS3aUserAgentPrefix))))&&((this.hadoopSecurityAuthentication == rhs.hadoopSecurityAuthentication)||((this.hadoopSecurityAuthentication!= null)&&this.hadoopSecurityAuthentication.equals(rhs.hadoopSecurityAuthentication))))&&((this.keyserverHost == rhs.keyserverHost)||((this.keyserverHost!= null)&&this.keyserverHost.equals(rhs.keyserverHost))))&&((this.namenodeOptMaxnewsize == rhs.namenodeOptMaxnewsize)||((this.namenodeOptMaxnewsize!= null)&&this.namenodeOptMaxnewsize.equals(rhs.namenodeOptMaxnewsize))))&&((this.dfsClientRetryPolicyEnabled == rhs.dfsClientRetryPolicyEnabled)||((this.dfsClientRetryPolicyEnabled!= null)&&this.dfsClientRetryPolicyEnabled.equals(rhs.dfsClientRetryPolicyEnabled))))&&((this.fsS3aMultipartSize == rhs.fsS3aMultipartSize)||((this.fsS3aMultipartSize!= null)&&this.fsS3aMultipartSize.equals(rhs.fsS3aMultipartSize))))&&((this.dfsDatanodeHttpAddress == rhs.dfsDatanodeHttpAddress)||((this.dfsDatanodeHttpAddress!= null)&&this.dfsDatanodeHttpAddress.equals(rhs.dfsDatanodeHttpAddress))))&&((this.dfsJournalnodeHttpsAddress == rhs.dfsJournalnodeHttpsAddress)||((this.dfsJournalnodeHttpsAddress!= null)&&this.dfsJournalnodeHttpsAddress.equals(rhs.dfsJournalnodeHttpsAddress))))&&((this.dfsNamenodeCheckpointDir == rhs.dfsNamenodeCheckpointDir)||((this.dfsNamenodeCheckpointDir!= null)&&this.dfsNamenodeCheckpointDir.equals(rhs.dfsNamenodeCheckpointDir))))&&((this.hadoopProxyuserHdfsGroups == rhs.hadoopProxyuserHdfsGroups)||((this.hadoopProxyuserHdfsGroups!= null)&&this.hadoopProxyuserHdfsGroups.equals(rhs.hadoopProxyuserHdfsGroups))))&&((this.dfsDatanodeBalanceBandwidthPerSec == rhs.dfsDatanodeBalanceBandwidthPerSec)||((this.dfsDatanodeBalanceBandwidthPerSec!= null)&&this.dfsDatanodeBalanceBandwidthPerSec.equals(rhs.dfsDatanodeBalanceBandwidthPerSec))))&&((this.hadoopHttpCrossOriginAllowedOrigins == rhs.hadoopHttpCrossOriginAllowedOrigins)||((this.hadoopHttpCrossOriginAllowedOrigins!= null)&&this.hadoopHttpCrossOriginAllowedOrigins.equals(rhs.hadoopHttpCrossOriginAllowedOrigins))))&&((this.dfsNamenodeHttpsAddress == rhs.dfsNamenodeHttpsAddress)||((this.dfsNamenodeHttpsAddress!= null)&&this.dfsNamenodeHttpsAddress.equals(rhs.dfsNamenodeHttpsAddress))))&&((this.sslClientKeystoreLocation == rhs.sslClientKeystoreLocation)||((this.sslClientKeystoreLocation!= null)&&this.sslClientKeystoreLocation.equals(rhs.sslClientKeystoreLocation))))&&((this.fsPermissionsUmaskMode == rhs.fsPermissionsUmaskMode)||((this.fsPermissionsUmaskMode!= null)&&this.fsPermissionsUmaskMode.equals(rhs.fsPermissionsUmaskMode))))&&((this.xasecureAuditProviderSummaryEnabled == rhs.xasecureAuditProviderSummaryEnabled)||((this.xasecureAuditProviderSummaryEnabled!= null)&&this.xasecureAuditProviderSummaryEnabled.equals(rhs.xasecureAuditProviderSummaryEnabled))))&&((this.rangerHdfsPluginEnabled == rhs.rangerHdfsPluginEnabled)||((this.rangerHdfsPluginEnabled!= null)&&this.rangerHdfsPluginEnabled.equals(rhs.rangerHdfsPluginEnabled))))&&((this.hdfsTmpDir == rhs.hdfsTmpDir)||((this.hdfsTmpDir!= null)&&this.hdfsTmpDir.equals(rhs.hdfsTmpDir))))&&((this.hadoopLogNumberOfBackupFiles == rhs.hadoopLogNumberOfBackupFiles)||((this.hadoopLogNumberOfBackupFiles!= null)&&this.hadoopLogNumberOfBackupFiles.equals(rhs.hadoopLogNumberOfBackupFiles))))&&((this.sslServerKeystoreKeypassword == rhs.sslServerKeystoreKeypassword)||((this.sslServerKeystoreKeypassword!= null)&&this.sslServerKeystoreKeypassword.equals(rhs.sslServerKeystoreKeypassword))))&&((this.hadoopSecurityLogNumberOfBackupFiles == rhs.hadoopSecurityLogNumberOfBackupFiles)||((this.hadoopSecurityLogNumberOfBackupFiles!= null)&&this.hadoopSecurityLogNumberOfBackupFiles.equals(rhs.hadoopSecurityLogNumberOfBackupFiles))))&&((this.dfsReplication == rhs.dfsReplication)||((this.dfsReplication!= null)&&this.dfsReplication.equals(rhs.dfsReplication))))&&((this.xasecureAuditDestinationSolrBatchFilespoolDir == rhs.xasecureAuditDestinationSolrBatchFilespoolDir)||((this.xasecureAuditDestinationSolrBatchFilespoolDir!= null)&&this.xasecureAuditDestinationSolrBatchFilespoolDir.equals(rhs.xasecureAuditDestinationSolrBatchFilespoolDir))))&&((this.hadoopHttpFilterInitializers == rhs.hadoopHttpFilterInitializers)||((this.hadoopHttpFilterInitializers!= null)&&this.hadoopHttpFilterInitializers.equals(rhs.hadoopHttpFilterInitializers))))&&((this.dfsNamenodeAccesstimePrecision == rhs.dfsNamenodeAccesstimePrecision)||((this.dfsNamenodeAccesstimePrecision!= null)&&this.dfsNamenodeAccesstimePrecision.equals(rhs.dfsNamenodeAccesstimePrecision))))&&((this.xasecureAuditDestinationSolrZookeepers == rhs.xasecureAuditDestinationSolrZookeepers)||((this.xasecureAuditDestinationSolrZookeepers!= null)&&this.xasecureAuditDestinationSolrZookeepers.equals(rhs.xasecureAuditDestinationSolrZookeepers))))&&((this.dfsEncryptionKeyProviderUri == rhs.dfsEncryptionKeyProviderUri)||((this.dfsEncryptionKeyProviderUri!= null)&&this.dfsEncryptionKeyProviderUri.equals(rhs.dfsEncryptionKeyProviderUri))))&&((this.rangerPluginHdfsAmbariClusterName == rhs.rangerPluginHdfsAmbariClusterName)||((this.rangerPluginHdfsAmbariClusterName!= null)&&this.rangerPluginHdfsAmbariClusterName.equals(rhs.rangerPluginHdfsAmbariClusterName))))&&((this.dfsDatanodeHttpsAddress == rhs.dfsDatanodeHttpsAddress)||((this.dfsDatanodeHttpsAddress!= null)&&this.dfsDatanodeHttpsAddress.equals(rhs.dfsDatanodeHttpsAddress))))&&((this.sslClientKeystorePassword == rhs.sslClientKeystorePassword)||((this.sslClientKeystorePassword!= null)&&this.sslClientKeystorePassword.equals(rhs.sslClientKeystorePassword))))&&((this.hadoopSecurityAuthorization == rhs.hadoopSecurityAuthorization)||((this.hadoopSecurityAuthorization!= null)&&this.hadoopSecurityAuthorization.equals(rhs.hadoopSecurityAuthorization))))&&((this.dfsHttpsPort == rhs.dfsHttpsPort)||((this.dfsHttpsPort!= null)&&this.dfsHttpsPort.equals(rhs.dfsHttpsPort))))&&((this.hadoopSecurityAuthToLocal == rhs.hadoopSecurityAuthToLocal)||((this.hadoopSecurityAuthToLocal!= null)&&this.hadoopSecurityAuthToLocal.equals(rhs.hadoopSecurityAuthToLocal))))&&((this.rangerPluginHdfsServiceName == rhs.rangerPluginHdfsServiceName)||((this.rangerPluginHdfsServiceName!= null)&&this.rangerPluginHdfsServiceName.equals(rhs.rangerPluginHdfsServiceName))))&&((this.ipcClientConnectionMaxidletime == rhs.ipcClientConnectionMaxidletime)||((this.ipcClientConnectionMaxidletime!= null)&&this.ipcClientConnectionMaxidletime.equals(rhs.ipcClientConnectionMaxidletime))))&&((this.namenodeOptMaxpermsize == rhs.namenodeOptMaxpermsize)||((this.namenodeOptMaxpermsize!= null)&&this.namenodeOptMaxpermsize.equals(rhs.namenodeOptMaxpermsize))))&&((this.hadoopSecurityLogMaxBackupSize == rhs.hadoopSecurityLogMaxBackupSize)||((this.hadoopSecurityLogMaxBackupSize!= null)&&this.hadoopSecurityLogMaxBackupSize.equals(rhs.hadoopSecurityLogMaxBackupSize))))&&((this.dfsNamenodeStartupDelayBlockDeletionSec == rhs.dfsNamenodeStartupDelayBlockDeletionSec)||((this.dfsNamenodeStartupDelayBlockDeletionSec!= null)&&this.dfsNamenodeStartupDelayBlockDeletionSec.equals(rhs.dfsNamenodeStartupDelayBlockDeletionSec))))&&((this.hadoopLogMaxBackupSize == rhs.hadoopLogMaxBackupSize)||((this.hadoopLogMaxBackupSize!= null)&&this.hadoopLogMaxBackupSize.equals(rhs.hadoopLogMaxBackupSize))))&&((this.dfsNamenodeSecondaryHttpAddress == rhs.dfsNamenodeSecondaryHttpAddress)||((this.dfsNamenodeSecondaryHttpAddress!= null)&&this.dfsNamenodeSecondaryHttpAddress.equals(rhs.dfsNamenodeSecondaryHttpAddress))))&&((this.securityJobClientProtocolAcl == rhs.securityJobClientProtocolAcl)||((this.securityJobClientProtocolAcl!= null)&&this.securityJobClientProtocolAcl.equals(rhs.securityJobClientProtocolAcl))))&&((this.dfsNamenodeCheckpointEditsDir == rhs.dfsNamenodeCheckpointEditsDir)||((this.dfsNamenodeCheckpointEditsDir!= null)&&this.dfsNamenodeCheckpointEditsDir.equals(rhs.dfsNamenodeCheckpointEditsDir))))&&((this.hadoopHttpAuthenticationSimpleAnonymousAllowed == rhs.hadoopHttpAuthenticationSimpleAnonymousAllowed)||((this.hadoopHttpAuthenticationSimpleAnonymousAllowed!= null)&&this.hadoopHttpAuthenticationSimpleAnonymousAllowed.equals(rhs.hadoopHttpAuthenticationSimpleAnonymousAllowed))))&&((this.hadoopProxyuserAmbariHosts == rhs.hadoopProxyuserAmbariHosts)||((this.hadoopProxyuserAmbariHosts!= null)&&this.hadoopProxyuserAmbariHosts.equals(rhs.hadoopProxyuserAmbariHosts))))&&((this.fsDefaultFS == rhs.fsDefaultFS)||((this.fsDefaultFS!= null)&&this.fsDefaultFS.equals(rhs.fsDefaultFS))))&&((this.dfsDatanodeAddress == rhs.dfsDatanodeAddress)||((this.dfsDatanodeAddress!= null)&&this.dfsDatanodeAddress.equals(rhs.dfsDatanodeAddress))))&&((this.dfsClientReadShortcircuit == rhs.dfsClientReadShortcircuit)||((this.dfsClientReadShortcircuit!= null)&&this.dfsClientReadShortcircuit.equals(rhs.dfsClientReadShortcircuit))))&&((this.nfsFileDumpDir == rhs.nfsFileDumpDir)||((this.nfsFileDumpDir!= null)&&this.nfsFileDumpDir.equals(rhs.nfsFileDumpDir))))&&((this.repositoryConfigPassword == rhs.repositoryConfigPassword)||((this.repositoryConfigPassword!= null)&&this.repositoryConfigPassword.equals(rhs.repositoryConfigPassword))))&&((this.dfsNamenodeHttpAddress == rhs.dfsNamenodeHttpAddress)||((this.dfsNamenodeHttpAddress!= null)&&this.dfsNamenodeHttpAddress.equals(rhs.dfsNamenodeHttpAddress))))&&((this.dfsHeartbeatInterval == rhs.dfsHeartbeatInterval)||((this.dfsHeartbeatInterval!= null)&&this.dfsHeartbeatInterval.equals(rhs.dfsHeartbeatInterval))))&&((this.hdfsUserNofileLimit == rhs.hdfsUserNofileLimit)||((this.hdfsUserNofileLimit!= null)&&this.hdfsUserNofileLimit.equals(rhs.hdfsUserNofileLimit))))&&((this.rangerPluginHdfsPolicyCacheDir == rhs.rangerPluginHdfsPolicyCacheDir)||((this.rangerPluginHdfsPolicyCacheDir!= null)&&this.rangerPluginHdfsPolicyCacheDir.equals(rhs.rangerPluginHdfsPolicyCacheDir))))&&((this.hadoopHttpCrossOriginMaxAge == rhs.hadoopHttpCrossOriginMaxAge)||((this.hadoopHttpCrossOriginMaxAge!= null)&&this.hadoopHttpCrossOriginMaxAge.equals(rhs.hadoopHttpCrossOriginMaxAge))))&&((this.dfsContentSummaryLimit == rhs.dfsContentSummaryLimit)||((this.dfsContentSummaryLimit!= null)&&this.dfsContentSummaryLimit.equals(rhs.dfsContentSummaryLimit))))&&((this.hadoopProxyuserHdfsHosts == rhs.hadoopProxyuserHdfsHosts)||((this.hadoopProxyuserHdfsHosts!= null)&&this.hadoopProxyuserHdfsHosts.equals(rhs.hadoopProxyuserHdfsHosts))))&&((this.dfsWebhdfsEnabled == rhs.dfsWebhdfsEnabled)||((this.dfsWebhdfsEnabled!= null)&&this.dfsWebhdfsEnabled.equals(rhs.dfsWebhdfsEnabled))))&&((this.xasecurePolicymgrClientsslKeystore == rhs.xasecurePolicymgrClientsslKeystore)||((this.xasecurePolicymgrClientsslKeystore!= null)&&this.xasecurePolicymgrClientsslKeystore.equals(rhs.xasecurePolicymgrClientsslKeystore))))&&((this.xasecurePolicymgrClientsslTruststoreCredentialFile == rhs.xasecurePolicymgrClientsslTruststoreCredentialFile)||((this.xasecurePolicymgrClientsslTruststoreCredentialFile!= null)&&this.xasecurePolicymgrClientsslTruststoreCredentialFile.equals(rhs.xasecurePolicymgrClientsslTruststoreCredentialFile))))&&((this.rangerPluginHdfsPolicyPollIntervalMs == rhs.rangerPluginHdfsPolicyPollIntervalMs)||((this.rangerPluginHdfsPolicyPollIntervalMs!= null)&&this.rangerPluginHdfsPolicyPollIntervalMs.equals(rhs.rangerPluginHdfsPolicyPollIntervalMs))))&&((this.xasecureAuditDestinationHdfs == rhs.xasecureAuditDestinationHdfs)||((this.xasecureAuditDestinationHdfs!= null)&&this.xasecureAuditDestinationHdfs.equals(rhs.xasecureAuditDestinationHdfs))))&&((this.securityDatanodeProtocolAcl == rhs.securityDatanodeProtocolAcl)||((this.securityDatanodeProtocolAcl!= null)&&this.securityDatanodeProtocolAcl.equals(rhs.securityDatanodeProtocolAcl))))&&((this.haFailoverControllerActiveStandbyElectorZkOpRetries == rhs.haFailoverControllerActiveStandbyElectorZkOpRetries)||((this.haFailoverControllerActiveStandbyElectorZkOpRetries!= null)&&this.haFailoverControllerActiveStandbyElectorZkOpRetries.equals(rhs.haFailoverControllerActiveStandbyElectorZkOpRetries))))&&((this.commonNameForCertificate == rhs.commonNameForCertificate)||((this.commonNameForCertificate!= null)&&this.commonNameForCertificate.equals(rhs.commonNameForCertificate))))&&((this.rangerPluginHdfsPolicyRestUrl == rhs.rangerPluginHdfsPolicyRestUrl)||((this.rangerPluginHdfsPolicyRestUrl!= null)&&this.rangerPluginHdfsPolicyRestUrl.equals(rhs.rangerPluginHdfsPolicyRestUrl))))&&((this.securityInterTrackerProtocolAcl == rhs.securityInterTrackerProtocolAcl)||((this.securityInterTrackerProtocolAcl!= null)&&this.securityInterTrackerProtocolAcl.equals(rhs.securityInterTrackerProtocolAcl))))&&((this.dfsNamenodeAvoidReadStaleDatanode == rhs.dfsNamenodeAvoidReadStaleDatanode)||((this.dfsNamenodeAvoidReadStaleDatanode!= null)&&this.dfsNamenodeAvoidReadStaleDatanode.equals(rhs.dfsNamenodeAvoidReadStaleDatanode))))&&((this.hdfsLogDirPrefix == rhs.hdfsLogDirPrefix)||((this.hdfsLogDirPrefix!= null)&&this.hdfsLogDirPrefix.equals(rhs.hdfsLogDirPrefix))))&&((this.xasecurePolicymgrClientsslKeystorePassword == rhs.xasecurePolicymgrClientsslKeystorePassword)||((this.xasecurePolicymgrClientsslKeystorePassword!= null)&&this.xasecurePolicymgrClientsslKeystorePassword.equals(rhs.xasecurePolicymgrClientsslKeystorePassword))))&&((this.fsS3aFastUpload == rhs.fsS3aFastUpload)||((this.fsS3aFastUpload!= null)&&this.fsS3aFastUpload.equals(rhs.fsS3aFastUpload))))&&((this.netTopologyScriptFileName == rhs.netTopologyScriptFileName)||((this.netTopologyScriptFileName!= null)&&this.netTopologyScriptFileName.equals(rhs.netTopologyScriptFileName))))&&((this.dfsDomainSocketPath == rhs.dfsDomainSocketPath)||((this.dfsDomainSocketPath!= null)&&this.dfsDomainSocketPath.equals(rhs.dfsDomainSocketPath))))&&((this.dfsClusterAdministrators == rhs.dfsClusterAdministrators)||((this.dfsClusterAdministrators!= null)&&this.dfsClusterAdministrators.equals(rhs.dfsClusterAdministrators))))&&((this.xasecureAuditDestinationSolr == rhs.xasecureAuditDestinationSolr)||((this.xasecureAuditDestinationSolr!= null)&&this.xasecureAuditDestinationSolr.equals(rhs.xasecureAuditDestinationSolr))))&&((this.hadoopRpcProtection == rhs.hadoopRpcProtection)||((this.hadoopRpcProtection!= null)&&this.hadoopRpcProtection.equals(rhs.hadoopRpcProtection))))&&((this.dfsDatanodeIpcAddress == rhs.dfsDatanodeIpcAddress)||((this.dfsDatanodeIpcAddress!= null)&&this.dfsDatanodeIpcAddress.equals(rhs.dfsDatanodeIpcAddress))))&&((this.dfsJournalnodeHttpAddress == rhs.dfsJournalnodeHttpAddress)||((this.dfsJournalnodeHttpAddress!= null)&&this.dfsJournalnodeHttpAddress.equals(rhs.dfsJournalnodeHttpAddress))))&&((this.dfsNamenodeNameDir == rhs.dfsNamenodeNameDir)||((this.dfsNamenodeNameDir!= null)&&this.dfsNamenodeNameDir.equals(rhs.dfsNamenodeNameDir))))&&((this.xasecureAuditDestinationSolrUrls == rhs.xasecureAuditDestinationSolrUrls)||((this.xasecureAuditDestinationSolrUrls!= null)&&this.xasecureAuditDestinationSolrUrls.equals(rhs.xasecureAuditDestinationSolrUrls))))&&((this.dfsDatanodeFailedVolumesTolerated == rhs.dfsDatanodeFailedVolumesTolerated)||((this.dfsDatanodeFailedVolumesTolerated!= null)&&this.dfsDatanodeFailedVolumesTolerated.equals(rhs.dfsDatanodeFailedVolumesTolerated))))&&((this.nfsExportsAllowedHosts == rhs.nfsExportsAllowedHosts)||((this.nfsExportsAllowedHosts!= null)&&this.nfsExportsAllowedHosts.equals(rhs.nfsExportsAllowedHosts))))&&((this.sslServerKeystorePassword == rhs.sslServerKeystorePassword)||((this.sslServerKeystorePassword!= null)&&this.sslServerKeystorePassword.equals(rhs.sslServerKeystorePassword))))&&((this.hadoopPidDirPrefix == rhs.hadoopPidDirPrefix)||((this.hadoopPidDirPrefix!= null)&&this.hadoopPidDirPrefix.equals(rhs.hadoopPidDirPrefix))))&&((this.hadoopProxyuserHiveHosts == rhs.hadoopProxyuserHiveHosts)||((this.hadoopProxyuserHiveHosts!= null)&&this.hadoopProxyuserHiveHosts.equals(rhs.hadoopProxyuserHiveHosts))))&&((this.hdfsUser == rhs.hdfsUser)||((this.hdfsUser!= null)&&this.hdfsUser.equals(rhs.hdfsUser))))&&((this.ipcClientIdlethreshold == rhs.ipcClientIdlethreshold)||((this.ipcClientIdlethreshold!= null)&&this.ipcClientIdlethreshold.equals(rhs.ipcClientIdlethreshold))))&&((this.dfsBlockAccessTokenEnable == rhs.dfsBlockAccessTokenEnable)||((this.dfsBlockAccessTokenEnable!= null)&&this.dfsBlockAccessTokenEnable.equals(rhs.dfsBlockAccessTokenEnable))))&&((this.dfsNamenodeAuditLogAsync == rhs.dfsNamenodeAuditLogAsync)||((this.dfsNamenodeAuditLogAsync!= null)&&this.dfsNamenodeAuditLogAsync.equals(rhs.dfsNamenodeAuditLogAsync))))&&((this.sslServerTruststoreLocation == rhs.sslServerTruststoreLocation)||((this.sslServerTruststoreLocation!= null)&&this.sslServerTruststoreLocation.equals(rhs.sslServerTruststoreLocation))))&&((this.namenodeOptPermsize == rhs.namenodeOptPermsize)||((this.namenodeOptPermsize!= null)&&this.namenodeOptPermsize.equals(rhs.namenodeOptPermsize))))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))))&&((this.securityInterDatanodeProtocolAcl == rhs.securityInterDatanodeProtocolAcl)||((this.securityInterDatanodeProtocolAcl!= null)&&this.securityInterDatanodeProtocolAcl.equals(rhs.securityInterDatanodeProtocolAcl))))&&((this.dfsNamenodeHandlerCount == rhs.dfsNamenodeHandlerCount)||((this.dfsNamenodeHandlerCount!= null)&&this.dfsNamenodeHandlerCount.equals(rhs.dfsNamenodeHandlerCount))))&&((this.dfsPermissionsSuperusergroup == rhs.dfsPermissionsSuperusergroup)||((this.dfsPermissionsSuperusergroup!= null)&&this.dfsPermissionsSuperusergroup.equals(rhs.dfsPermissionsSuperusergroup))))&&((this.securityClientDatanodeProtocolAcl == rhs.securityClientDatanodeProtocolAcl)||((this.securityClientDatanodeProtocolAcl!= null)&&this.securityClientDatanodeProtocolAcl.equals(rhs.securityClientDatanodeProtocolAcl))))&&((this.dfsHostsExclude == rhs.dfsHostsExclude)||((this.dfsHostsExclude!= null)&&this.dfsHostsExclude.equals(rhs.dfsHostsExclude))))&&((this.dfsDatanodeDataDirPerm == rhs.dfsDatanodeDataDirPerm)||((this.dfsDatanodeDataDirPerm!= null)&&this.dfsDatanodeDataDirPerm.equals(rhs.dfsDatanodeDataDirPerm))))&&((this.namenodeBackupDir == rhs.namenodeBackupDir)||((this.namenodeBackupDir!= null)&&this.namenodeBackupDir.equals(rhs.namenodeBackupDir))))&&((this.dfsNamenodeCheckpointTxns == rhs.dfsNamenodeCheckpointTxns)||((this.dfsNamenodeCheckpointTxns!= null)&&this.dfsNamenodeCheckpointTxns.equals(rhs.dfsNamenodeCheckpointTxns))))&&((this.xasecurePolicymgrClientsslTruststore == rhs.xasecurePolicymgrClientsslTruststore)||((this.xasecurePolicymgrClientsslTruststore!= null)&&this.xasecurePolicymgrClientsslTruststore.equals(rhs.xasecurePolicymgrClientsslTruststore))))&&((this.dfsBlockreportInitialDelay == rhs.dfsBlockreportInitialDelay)||((this.dfsBlockreportInitialDelay!= null)&&this.dfsBlockreportInitialDelay.equals(rhs.dfsBlockreportInitialDelay))))&&((this.dfsClientReadShortcircuitStreamsCacheSize == rhs.dfsClientReadShortcircuitStreamsCacheSize)||((this.dfsClientReadShortcircuitStreamsCacheSize!= null)&&this.dfsClientReadShortcircuitStreamsCacheSize.equals(rhs.dfsClientReadShortcircuitStreamsCacheSize))))&&((this.dfsNamenodeAvoidWriteStaleDatanode == rhs.dfsNamenodeAvoidWriteStaleDatanode)||((this.dfsNamenodeAvoidWriteStaleDatanode!= null)&&this.dfsNamenodeAvoidWriteStaleDatanode.equals(rhs.dfsNamenodeAvoidWriteStaleDatanode))))&&((this.dfsDatanodeMaxTransferThreads == rhs.dfsDatanodeMaxTransferThreads)||((this.dfsDatanodeMaxTransferThreads!= null)&&this.dfsDatanodeMaxTransferThreads.equals(rhs.dfsDatanodeMaxTransferThreads))))&&((this.xasecureAddHadoopAuthorization == rhs.xasecureAddHadoopAuthorization)||((this.xasecureAddHadoopAuthorization!= null)&&this.xasecureAddHadoopAuthorization.equals(rhs.xasecureAddHadoopAuthorization))))&&((this.dfsDatanodeDataDir == rhs.dfsDatanodeDataDir)||((this.dfsDatanodeDataDir!= null)&&this.dfsDatanodeDataDir.equals(rhs.dfsDatanodeDataDir))))&&((this.securityClientProtocolAcl == rhs.securityClientProtocolAcl)||((this.securityClientProtocolAcl!= null)&&this.securityClientProtocolAcl.equals(rhs.securityClientProtocolAcl))))&&((this.sslClientKeystoreType == rhs.sslClientKeystoreType)||((this.sslClientKeystoreType!= null)&&this.sslClientKeystoreType.equals(rhs.sslClientKeystoreType))))&&((this.hdfsUserNprocLimit == rhs.hdfsUserNprocLimit)||((this.hdfsUserNprocLimit!= null)&&this.hdfsUserNprocLimit.equals(rhs.hdfsUserNprocLimit))))&&((this.rangerPluginHdfsPolicyRestSslConfigFile == rhs.rangerPluginHdfsPolicyRestSslConfigFile)||((this.rangerPluginHdfsPolicyRestSslConfigFile!= null)&&this.rangerPluginHdfsPolicyRestSslConfigFile.equals(rhs.rangerPluginHdfsPolicyRestSslConfigFile))))&&((this.dtnodeHeapsize == rhs.dtnodeHeapsize)||((this.dtnodeHeapsize!= null)&&this.dtnodeHeapsize.equals(rhs.dtnodeHeapsize))))&&((this.dfsBlocksize == rhs.dfsBlocksize)||((this.dfsBlocksize!= null)&&this.dfsBlocksize.equals(rhs.dfsBlocksize))))&&((this.hadoopProxyuserHiveGroups == rhs.hadoopProxyuserHiveGroups)||((this.hadoopProxyuserHiveGroups!= null)&&this.hadoopProxyuserHiveGroups.equals(rhs.hadoopProxyuserHiveGroups))))&&((this.policyUser == rhs.policyUser)||((this.policyUser!= null)&&this.policyUser.equals(rhs.policyUser))))&&((this.sslClientTruststoreLocation == rhs.sslClientTruststoreLocation)||((this.sslClientTruststoreLocation!= null)&&this.sslClientTruststoreLocation.equals(rhs.sslClientTruststoreLocation))))&&((this.securityAdminOperationsProtocolAcl == rhs.securityAdminOperationsProtocolAcl)||((this.securityAdminOperationsProtocolAcl!= null)&&this.securityAdminOperationsProtocolAcl.equals(rhs.securityAdminOperationsProtocolAcl))))&&((this.hadoopCallerContextEnabled == rhs.hadoopCallerContextEnabled)||((this.hadoopCallerContextEnabled!= null)&&this.hadoopCallerContextEnabled.equals(rhs.hadoopCallerContextEnabled))))&&((this.hadoopHttpCrossOriginAllowedHeaders == rhs.hadoopHttpCrossOriginAllowedHeaders)||((this.hadoopHttpCrossOriginAllowedHeaders!= null)&&this.hadoopHttpCrossOriginAllowedHeaders.equals(rhs.hadoopHttpCrossOriginAllowedHeaders))))&&((this.mapreduceJobtrackerWebinterfaceTrusted == rhs.mapreduceJobtrackerWebinterfaceTrusted)||((this.mapreduceJobtrackerWebinterfaceTrusted!= null)&&this.mapreduceJobtrackerWebinterfaceTrusted.equals(rhs.mapreduceJobtrackerWebinterfaceTrusted))))&&((this.dfsPermissionsEnabled == rhs.dfsPermissionsEnabled)||((this.dfsPermissionsEnabled!= null)&&this.dfsPermissionsEnabled.equals(rhs.dfsPermissionsEnabled))))&&((this.dfsNamenodeAclsEnabled == rhs.dfsNamenodeAclsEnabled)||((this.dfsNamenodeAclsEnabled!= null)&&this.dfsNamenodeAclsEnabled.equals(rhs.dfsNamenodeAclsEnabled))))&&((this.dfsNamenodeWriteStaleDatanodeRatio == rhs.dfsNamenodeWriteStaleDatanodeRatio)||((this.dfsNamenodeWriteStaleDatanodeRatio!= null)&&this.dfsNamenodeWriteStaleDatanodeRatio.equals(rhs.dfsNamenodeWriteStaleDatanodeRatio))))&&((this.sslServerTruststoreType == rhs.sslServerTruststoreType)||((this.sslServerTruststoreType!= null)&&this.sslServerTruststoreType.equals(rhs.sslServerTruststoreType))))&&((this.fsS3aFastUploadBuffer == rhs.fsS3aFastUploadBuffer)||((this.fsS3aFastUploadBuffer!= null)&&this.fsS3aFastUploadBuffer.equals(rhs.fsS3aFastUploadBuffer))))&&((this.dfsNamenodeSafemodeThresholdPct == rhs.dfsNamenodeSafemodeThresholdPct)||((this.dfsNamenodeSafemodeThresholdPct!= null)&&this.dfsNamenodeSafemodeThresholdPct.equals(rhs.dfsNamenodeSafemodeThresholdPct))))&&((this.proxyuserGroup == rhs.proxyuserGroup)||((this.proxyuserGroup!= null)&&this.proxyuserGroup.equals(rhs.proxyuserGroup))))&&((this.xasecureAuditDestinationHdfsDir == rhs.xasecureAuditDestinationHdfsDir)||((this.xasecureAuditDestinationHdfsDir!= null)&&this.xasecureAuditDestinationHdfsDir.equals(rhs.xasecureAuditDestinationHdfsDir))))&&((this.sslClientTruststoreReloadInterval == rhs.sslClientTruststoreReloadInterval)||((this.sslClientTruststoreReloadInterval!= null)&&this.sslClientTruststoreReloadInterval.equals(rhs.sslClientTruststoreReloadInterval))));
    }

}
