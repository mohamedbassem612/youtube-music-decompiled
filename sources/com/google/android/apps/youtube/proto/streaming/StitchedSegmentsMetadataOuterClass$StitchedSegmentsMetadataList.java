package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aifs;
import defpackage.aigj;
import defpackage.aigm;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiie;
import defpackage.aiis;
import defpackage.aiix;
import defpackage.fxd;
import defpackage.jqz;
import defpackage.jrr;
import defpackage.jrs;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList extends aihn implements aiis {
    private static final StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList DEFAULT_INSTANCE;
    public static final int MEDIA_HEADER_ID_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 1;
    public static final int TRACK_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int mediaHeaderId_;
    private aiie metadata_ = emptyProtobufList();
    private int trackType_ = 1;

    static {
        StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList = new StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList();
        DEFAULT_INSTANCE = stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList;
        aihn.registerDefaultInstance(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList.class, stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList);
    }

    private StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetadata(Iterable iterable) {
        ensureMetadataIsMutable();
        aifs.addAll(iterable, this.metadata_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetadata(int i, StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata) {
        stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata.getClass();
        ensureMetadataIsMutable();
        this.metadata_.add(i, stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaHeaderId() {
        this.bitField0_ &= -3;
        this.mediaHeaderId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackType() {
        this.bitField0_ &= -2;
        this.trackType_ = 1;
    }

    private void ensureMetadataIsMutable() {
        aiie aiieVar = this.metadata_;
        if (aiieVar.c()) {
            return;
        }
        this.metadata_ = aihn.mutableCopy(aiieVar);
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jrr newBuilder() {
        return (jrr) DEFAULT_INSTANCE.createBuilder();
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList parseDelimitedFrom(InputStream inputStream) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList parseFrom(aigj aigjVar) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) aihn.parseFrom(DEFAULT_INSTANCE, aigjVar);
    }

    public static aiix parser() {
        return aihn.getParserForClass(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetadata(int i) {
        ensureMetadataIsMutable();
        this.metadata_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaHeaderId(int i) {
        this.bitField0_ |= 2;
        this.mediaHeaderId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(int i, StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata) {
        stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata.getClass();
        ensureMetadataIsMutable();
        this.metadata_.set(i, stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackType(jqz jqzVar) {
        this.trackType_ = jqzVar.d;
        this.bitField0_ |= 1;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000\u0003ဋ\u0001", new Object[]{"bitField0_", "metadata_", StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata.class, "trackType_", fxd.f, "mediaHeaderId_"});
        }
        if (iOrdinal == 3) {
            return new StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList();
        }
        if (iOrdinal == 4) {
            return new jrr();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList.class);
    }

    public int getMediaHeaderId() {
        return this.mediaHeaderId_;
    }

    public StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata getMetadata(int i) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata) this.metadata_.get(i);
    }

    public int getMetadataCount() {
        return this.metadata_.size();
    }

    public List getMetadataList() {
        return this.metadata_;
    }

    public jrs getMetadataOrBuilder(int i) {
        return (jrs) this.metadata_.get(i);
    }

    public List getMetadataOrBuilderList() {
        return this.metadata_;
    }

    public jqz getTrackType() {
        jqz jqzVarA = jqz.a(this.trackType_);
        return jqzVarA == null ? jqz.TRACK_TYPE_AUDIO : jqzVarA;
    }

    public boolean hasMediaHeaderId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTrackType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static jrr newBuilder(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) {
        return (jrr) DEFAULT_INSTANCE.createBuilder(stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList);
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList parseFrom(aigj aigjVar, ExtensionRegistryLite extensionRegistryLite) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) aihn.parseFrom(DEFAULT_INSTANCE, aigjVar, extensionRegistryLite);
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList parseFrom(aigm aigmVar) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) aihn.parseFrom(DEFAULT_INSTANCE, aigmVar);
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList parseFrom(aigm aigmVar, ExtensionRegistryLite extensionRegistryLite) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) aihn.parseFrom(DEFAULT_INSTANCE, aigmVar, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetadata(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata) {
        stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata.getClass();
        ensureMetadataIsMutable();
        this.metadata_.add(stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata);
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList parseFrom(InputStream inputStream) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) aihn.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) aihn.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList parseFrom(ByteBuffer byteBuffer) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) aihn.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) aihn.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList parseFrom(byte[] bArr) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) aihn.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) aihn.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
