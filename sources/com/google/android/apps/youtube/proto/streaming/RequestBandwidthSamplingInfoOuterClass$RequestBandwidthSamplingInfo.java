package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aifs;
import defpackage.aigj;
import defpackage.aigm;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aihy;
import defpackage.aiis;
import defpackage.aiix;
import defpackage.ajhk;
import defpackage.ajuf;
import defpackage.jrq;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo extends aihn implements aiis {
    public static final int BYTES_RECEIVED_FIELD_NUMBER = 3;
    public static final int CLIENT_CONNECTION_TYPE_FIELD_NUMBER = 5;
    private static final RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo DEFAULT_INSTANCE;
    public static final int LATENCY_MS_FIELD_NUMBER = 4;
    public static final int REQUEST_END_TIMESTAMP_MS_FIELD_NUMBER = 7;
    public static final int REQUEST_START_TIMESTAMP_MS_FIELD_NUMBER = 1;
    public static final int TIME_ELAPSED_MS_FIELD_NUMBER = 2;
    public static final int TIME_TO_NEXT_REQUEST_MS_FIELD_NUMBER = 6;
    private int bitField0_;
    private int clientConnectionType_;
    private long latencyMs_;
    private long requestEndTimestampMs_;
    private long requestStartTimestampMs_;
    private long timeToNextRequestMs_;
    private int timeElapsedMsMemoizedSerializedSize = -1;
    private int bytesReceivedMemoizedSerializedSize = -1;
    private aihy timeElapsedMs_ = emptyLongList();
    private aihy bytesReceived_ = emptyLongList();

    static {
        RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo requestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo = new RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo();
        DEFAULT_INSTANCE = requestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo;
        aihn.registerDefaultInstance(RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo.class, requestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo);
    }

    private RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBytesReceived(Iterable iterable) {
        ensureBytesReceivedIsMutable();
        aifs.addAll(iterable, this.bytesReceived_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTimeElapsedMs(Iterable iterable) {
        ensureTimeElapsedMsIsMutable();
        aifs.addAll(iterable, this.timeElapsedMs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBytesReceived(long j) {
        ensureBytesReceivedIsMutable();
        this.bytesReceived_.g(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimeElapsedMs(long j) {
        ensureTimeElapsedMsIsMutable();
        this.timeElapsedMs_.g(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytesReceived() {
        this.bytesReceived_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientConnectionType() {
        this.bitField0_ &= -5;
        this.clientConnectionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -3;
        this.latencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestEndTimestampMs() {
        this.bitField0_ &= -17;
        this.requestEndTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestStartTimestampMs() {
        this.bitField0_ &= -2;
        this.requestStartTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeElapsedMs() {
        this.timeElapsedMs_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToNextRequestMs() {
        this.bitField0_ &= -9;
        this.timeToNextRequestMs_ = 0L;
    }

    private void ensureBytesReceivedIsMutable() {
        aihy aihyVar = this.bytesReceived_;
        if (aihyVar.c()) {
            return;
        }
        this.bytesReceived_ = aihn.mutableCopy(aihyVar);
    }

    private void ensureTimeElapsedMsIsMutable() {
        aihy aihyVar = this.timeElapsedMs_;
        if (aihyVar.c()) {
            return;
        }
        this.timeElapsedMs_ = aihn.mutableCopy(aihyVar);
    }

    public static RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jrq newBuilder() {
        return (jrq) DEFAULT_INSTANCE.createBuilder();
    }

    public static RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo parseDelimitedFrom(InputStream inputStream) {
        return (RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo parseFrom(aigj aigjVar) {
        return (RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) aihn.parseFrom(DEFAULT_INSTANCE, aigjVar);
    }

    public static aiix parser() {
        return aihn.getParserForClass(RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytesReceived(int i, long j) {
        ensureBytesReceivedIsMutable();
        this.bytesReceived_.d(i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientConnectionType(ajuf ajufVar) {
        this.clientConnectionType_ = ajufVar.p;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j) {
        this.bitField0_ |= 2;
        this.latencyMs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestEndTimestampMs(long j) {
        this.bitField0_ |= 16;
        this.requestEndTimestampMs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestStartTimestampMs(long j) {
        this.bitField0_ |= 1;
        this.requestStartTimestampMs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeElapsedMs(int i, long j) {
        ensureTimeElapsedMsIsMutable();
        this.timeElapsedMs_.d(i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToNextRequestMs(long j) {
        this.bitField0_ |= 8;
        this.timeToNextRequestMs_ = j;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဂ\u0000\u0002%\u0003%\u0004ဂ\u0001\u0005᠌\u0002\u0006ဂ\u0003\u0007ဂ\u0004", new Object[]{"bitField0_", "requestStartTimestampMs_", "timeElapsedMs_", "bytesReceived_", "latencyMs_", "clientConnectionType_", ajhk.o, "timeToNextRequestMs_", "requestEndTimestampMs_"});
        }
        if (iOrdinal == 3) {
            return new RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo();
        }
        if (iOrdinal == 4) {
            return new jrq();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo.class);
    }

    public long getBytesReceived(int i) {
        return this.bytesReceived_.a(i);
    }

    public int getBytesReceivedCount() {
        return this.bytesReceived_.size();
    }

    public List getBytesReceivedList() {
        return this.bytesReceived_;
    }

    public ajuf getClientConnectionType() {
        ajuf ajufVarA = ajuf.a(this.clientConnectionType_);
        return ajufVarA == null ? ajuf.CONN_DEFAULT : ajufVarA;
    }

    public long getLatencyMs() {
        return this.latencyMs_;
    }

    public long getRequestEndTimestampMs() {
        return this.requestEndTimestampMs_;
    }

    public long getRequestStartTimestampMs() {
        return this.requestStartTimestampMs_;
    }

    public long getTimeElapsedMs(int i) {
        return this.timeElapsedMs_.a(i);
    }

    public int getTimeElapsedMsCount() {
        return this.timeElapsedMs_.size();
    }

    public List getTimeElapsedMsList() {
        return this.timeElapsedMs_;
    }

    public long getTimeToNextRequestMs() {
        return this.timeToNextRequestMs_;
    }

    public boolean hasClientConnectionType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRequestEndTimestampMs() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRequestStartTimestampMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTimeToNextRequestMs() {
        return (this.bitField0_ & 8) != 0;
    }

    public static jrq newBuilder(RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo requestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) {
        return (jrq) DEFAULT_INSTANCE.createBuilder(requestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo);
    }

    public static RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo parseFrom(aigj aigjVar, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) aihn.parseFrom(DEFAULT_INSTANCE, aigjVar, extensionRegistryLite);
    }

    public static RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo parseFrom(aigm aigmVar) {
        return (RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) aihn.parseFrom(DEFAULT_INSTANCE, aigmVar);
    }

    public static RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo parseFrom(aigm aigmVar, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) aihn.parseFrom(DEFAULT_INSTANCE, aigmVar, extensionRegistryLite);
    }

    public static RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo parseFrom(InputStream inputStream) {
        return (RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) aihn.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) aihn.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo parseFrom(ByteBuffer byteBuffer) {
        return (RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) aihn.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) aihn.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo parseFrom(byte[] bArr) {
        return (RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) aihn.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) aihn.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
