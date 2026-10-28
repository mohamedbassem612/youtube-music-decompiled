package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl;
import defpackage.agke;
import defpackage.atqq;
import defpackage.awmj;
import defpackage.awrc;
import defpackage.jqz;
import defpackage.wgs;
import defpackage.yhm;
import defpackage.yhv;
import defpackage.yhw;
import defpackage.yhx;
import defpackage.yno;
import defpackage.zcf;
import defpackage.zic;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackControllerFormatInitMetadataHelper {

    /* JADX INFO: compiled from: PG */
    public final class FormatIdsForTracks {
        public final wgs a;
        public final FormatInitializationMetadataOuterClass$FormatInitializationMetadata b;
        public final wgs c;
        public final FormatInitializationMetadataOuterClass$FormatInitializationMetadata d;

        public FormatIdsForTracks(wgs wgsVar, FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata, wgs wgsVar2, FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata2) {
            this.a = wgsVar;
            this.b = formatInitializationMetadataOuterClass$FormatInitializationMetadata;
            this.c = wgsVar2;
            this.d = formatInitializationMetadataOuterClass$FormatInitializationMetadata2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FormatIdsForTracks) {
                FormatIdsForTracks formatIdsForTracks = (FormatIdsForTracks) obj;
                if (awrc.c(this.a, formatIdsForTracks.a) && awrc.c(this.b, formatIdsForTracks.b) && awrc.c(this.c, formatIdsForTracks.c) && awrc.c(this.d, formatIdsForTracks.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            wgs wgsVar = this.a;
            int iHashCode = wgsVar == null ? 0 : wgsVar.hashCode();
            FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata = this.b;
            int iHashCode2 = formatInitializationMetadataOuterClass$FormatInitializationMetadata == null ? 0 : formatInitializationMetadataOuterClass$FormatInitializationMetadata.hashCode();
            int i = iHashCode * 31;
            wgs wgsVar2 = this.c;
            int iHashCode3 = (((i + iHashCode2) * 31) + (wgsVar2 == null ? 0 : wgsVar2.hashCode())) * 31;
            FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata2 = this.d;
            return iHashCode3 + (formatInitializationMetadataOuterClass$FormatInitializationMetadata2 != null ? formatInitializationMetadataOuterClass$FormatInitializationMetadata2.hashCode() : 0);
        }

        public final String toString() {
            return "FormatIdsForTracks(videoFormat=" + this.a + ", videoFmtInit=" + this.b + ", audioFormat=" + this.c + ", audioFmtInit=" + this.d + ')';
        }
    }

    /* JADX INFO: compiled from: PG */
    final class FormatInitMetadataFetchResult {
        public final wgs a;
        public final FormatInitializationMetadataOuterClass$FormatInitializationMetadata b;

        public FormatInitMetadataFetchResult(wgs wgsVar, FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata) {
            this.a = wgsVar;
            this.b = formatInitializationMetadataOuterClass$FormatInitializationMetadata;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FormatInitMetadataFetchResult) {
                FormatInitMetadataFetchResult formatInitMetadataFetchResult = (FormatInitMetadataFetchResult) obj;
                if (awrc.c(this.a, formatInitMetadataFetchResult.a) && awrc.c(this.b, formatInitMetadataFetchResult.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            wgs wgsVar = this.a;
            int iHashCode = wgsVar == null ? 0 : wgsVar.hashCode();
            FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata = this.b;
            return (iHashCode * 31) + (formatInitializationMetadataOuterClass$FormatInitializationMetadata != null ? formatInitializationMetadataOuterClass$FormatInitializationMetadata.hashCode() : 0);
        }

        public final String toString() {
            return "FormatInitMetadataFetchResult(formatStream=" + this.a + ", formatInitMetadata=" + this.b + ')';
        }
    }

    private PlaybackControllerFormatInitMetadataHelper() {
    }

    public static final FormatIdsForTracks a(boolean z, boolean z2, BufferManagerImpl bufferManagerImpl, yhm yhmVar, yhm yhmVar2, zcf zcfVar) {
        boolean z3;
        wgs wgsVarC;
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata;
        wgs wgsVarC2;
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata2;
        agke agkeVar;
        agke agkeVar2;
        zcfVar.getClass();
        Map mapD = null;
        if (z2) {
            FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadataB = bufferManagerImpl.b(jqz.TRACK_TYPE_AUDIO);
            if (formatInitializationMetadataOuterClass$FormatInitializationMetadataB != null) {
                FormatIdOuterClass$FormatId defaultInstance = formatInitializationMetadataOuterClass$FormatInitializationMetadataB.d;
                if (defaultInstance == null) {
                    defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
                }
                defaultInstance.getClass();
                wgsVarC = c(zcfVar, defaultInstance);
                formatInitializationMetadataOuterClass$FormatInitializationMetadata = formatInitializationMetadataOuterClass$FormatInitializationMetadataB;
                z3 = false;
            } else {
                formatInitializationMetadataOuterClass$FormatInitializationMetadata = formatInitializationMetadataOuterClass$FormatInitializationMetadataB;
                z3 = z2;
                wgsVarC = null;
            }
        } else {
            z3 = z2;
            wgsVarC = null;
            formatInitializationMetadataOuterClass$FormatInitializationMetadata = null;
        }
        if (z) {
            FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadataB2 = bufferManagerImpl.b(jqz.TRACK_TYPE_VIDEO);
            if (formatInitializationMetadataOuterClass$FormatInitializationMetadataB2 != null) {
                FormatIdOuterClass$FormatId defaultInstance2 = formatInitializationMetadataOuterClass$FormatInitializationMetadataB2.d;
                if (defaultInstance2 == null) {
                    defaultInstance2 = FormatIdOuterClass$FormatId.getDefaultInstance();
                }
                defaultInstance2.getClass();
                wgsVarC2 = c(zcfVar, defaultInstance2);
                z = false;
                formatInitializationMetadataOuterClass$FormatInitializationMetadata2 = formatInitializationMetadataOuterClass$FormatInitializationMetadataB2;
            } else {
                formatInitializationMetadataOuterClass$FormatInitializationMetadata2 = formatInitializationMetadataOuterClass$FormatInitializationMetadataB2;
                wgsVarC2 = null;
            }
        } else {
            wgsVarC2 = null;
            formatInitializationMetadataOuterClass$FormatInitializationMetadata2 = null;
        }
        if (true == zcfVar.A.E()) {
            yhmVar = yhmVar2;
        }
        if (yhmVar == null) {
            return new FormatIdsForTracks(wgsVarC2, formatInitializationMetadataOuterClass$FormatInitializationMetadata2, wgsVarC, formatInitializationMetadataOuterClass$FormatInitializationMetadata);
        }
        if (z) {
            if (z3) {
                List list = zcfVar.A.t;
                list.getClass();
                mapD = yhmVar.d(list);
            } else {
                List list2 = zcfVar.A.v;
                list2.getClass();
                mapD = yhmVar.d(list2);
            }
        } else if (z3) {
            List list3 = zcfVar.A.u;
            list3.getClass();
            mapD = yhmVar.d(list3);
        }
        if (z && mapD != null && (agkeVar2 = (agke) mapD.get(jqz.TRACK_TYPE_VIDEO)) != null) {
            FormatInitMetadataFetchResult formatInitMetadataFetchResultB = b(agkeVar2, yhmVar);
            wgsVarC2 = formatInitMetadataFetchResultB.a;
            formatInitializationMetadataOuterClass$FormatInitializationMetadata2 = formatInitMetadataFetchResultB.b;
        }
        if (z3 && mapD != null && (agkeVar = (agke) mapD.get(jqz.TRACK_TYPE_AUDIO)) != null) {
            FormatInitMetadataFetchResult formatInitMetadataFetchResultB2 = b(agkeVar, yhmVar);
            wgsVarC = formatInitMetadataFetchResultB2.a;
            formatInitializationMetadataOuterClass$FormatInitializationMetadata = formatInitMetadataFetchResultB2.b;
        }
        return new FormatIdsForTracks(wgsVarC2, formatInitializationMetadataOuterClass$FormatInitializationMetadata2, wgsVarC, formatInitializationMetadataOuterClass$FormatInitializationMetadata);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    private static final FormatInitMetadataFetchResult b(List list, yhm yhmVar) {
        FormatInitMetadataFetchResult formatInitMetadataFetchResult;
        Iterator itA = atqq.ax(list).a();
        while (itA.hasNext()) {
            wgs wgsVar = (wgs) itA.next();
            FormatIdOuterClass$FormatId formatIdOuterClass$FormatIdO = wgsVar.o();
            formatIdOuterClass$FormatIdO.getClass();
            yno ynoVarE = yhmVar.e(formatIdOuterClass$FormatIdO);
            Objects.checkIndex(0, 4);
            if (ynoVarE instanceof yhx) {
                formatInitMetadataFetchResult = null;
            } else if (ynoVarE instanceof yhw) {
                formatInitMetadataFetchResult = new FormatInitMetadataFetchResult(wgsVar, ((yhw) ynoVarE).a);
            } else {
                if (!(ynoVarE instanceof yhv)) {
                    throw new awmj();
                }
                formatInitMetadataFetchResult = new FormatInitMetadataFetchResult(wgsVar, ((yhv) ynoVarE).a);
            }
            if (formatInitMetadataFetchResult != null) {
                if (formatInitMetadataFetchResult == null) {
                    return new FormatInitMetadataFetchResult(null, null);
                }
                return formatInitMetadataFetchResult;
            }
        }
        formatInitMetadataFetchResult = null;
        if (formatInitMetadataFetchResult == null) {
            return new FormatInitMetadataFetchResult(null, null);
        }
        return formatInitMetadataFetchResult;
    }

    private static final wgs c(zcf zcfVar, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId) {
        return zic.c(formatIdOuterClass$FormatId, zcfVar.A.t);
    }
}
