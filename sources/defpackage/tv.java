package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.AtomicFile;
import android.util.Log;
import android.util.Pair;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.icing.IcingSearchEngineImpl;
import j$.util.DesugarCollections;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tv implements Closeable {
    static final luv a = luv.RECOVERY_PROOF;
    public static final /* synthetic */ int m = 0;
    private static final luc n;
    public final ReadWriteLock b;
    public final Map c;
    public int d;
    lth e;
    public final ujb f;
    final dep g;
    public final a h;
    public final dep i;
    public volatile auzc j;
    public final eol k;
    eol l;
    private final File o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private final AtomicReference u;
    private final xsc v;

    static {
        lxq lxqVarC = luc.c();
        lwj lwjVarB = lwk.b();
        lwjVarB.d("*");
        lxqVarC.s();
        luc lucVar = (luc) lxqVarC.a;
        lwk lwkVar = (lwk) lwjVarB.o();
        lwkVar.getClass();
        lucVar.b();
        lucVar.typePropertyMasks_.add(lwkVar);
        n = (luc) lxqVarC.o();
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0762 A[Catch: all -> 0x076b, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x076b, blocks: (B:61:0x0561, B:136:0x0762, B:62:0x057e, B:64:0x059b, B:66:0x05a5, B:67:0x05de, B:69:0x05f0, B:70:0x0604, B:71:0x0607, B:73:0x060d, B:74:0x062d, B:75:0x0643, B:77:0x0649, B:78:0x0653, B:79:0x065a, B:81:0x0660, B:82:0x0674, B:84:0x0678, B:85:0x067b, B:87:0x0681, B:88:0x0697, B:90:0x06a6, B:93:0x06b5, B:95:0x06ca, B:97:0x06d0, B:98:0x06e5, B:99:0x06e6, B:101:0x06f9, B:112:0x072c, B:102:0x06ff, B:103:0x0704, B:110:0x0724, B:111:0x0727, B:121:0x073c, B:120:0x0739, B:123:0x073e, B:124:0x0746), top: B:205:0x0561 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x078b A[Catch: all -> 0x08d5, TryCatch #3 {all -> 0x08d5, blocks: (B:4:0x006b, B:134:0x0756, B:140:0x076d, B:142:0x078b, B:143:0x07a1, B:144:0x07d7, B:148:0x07e0, B:149:0x0806, B:151:0x081a, B:153:0x0822, B:154:0x082b, B:155:0x082c, B:157:0x0834, B:159:0x083c, B:160:0x0845, B:161:0x0846, B:164:0x084f, B:166:0x0852, B:168:0x085a, B:169:0x086d, B:170:0x0870, B:172:0x0874, B:174:0x088f, B:175:0x0892, B:176:0x089a, B:179:0x08c7, B:180:0x08d0, B:182:0x08d2, B:145:0x07d8, B:146:0x07dd), top: B:198:0x006b, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x07e0 A[Catch: all -> 0x08d5, TRY_ENTER, TryCatch #3 {all -> 0x08d5, blocks: (B:4:0x006b, B:134:0x0756, B:140:0x076d, B:142:0x078b, B:143:0x07a1, B:144:0x07d7, B:148:0x07e0, B:149:0x0806, B:151:0x081a, B:153:0x0822, B:154:0x082b, B:155:0x082c, B:157:0x0834, B:159:0x083c, B:160:0x0845, B:161:0x0846, B:164:0x084f, B:166:0x0852, B:168:0x085a, B:169:0x086d, B:170:0x0870, B:172:0x0874, B:174:0x088f, B:175:0x0892, B:176:0x089a, B:179:0x08c7, B:180:0x08d0, B:182:0x08d2, B:145:0x07d8, B:146:0x07dd), top: B:198:0x006b, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x084e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0852 A[Catch: all -> 0x08d5, TryCatch #3 {all -> 0x08d5, blocks: (B:4:0x006b, B:134:0x0756, B:140:0x076d, B:142:0x078b, B:143:0x07a1, B:144:0x07d7, B:148:0x07e0, B:149:0x0806, B:151:0x081a, B:153:0x0822, B:154:0x082b, B:155:0x082c, B:157:0x0834, B:159:0x083c, B:160:0x0845, B:161:0x0846, B:164:0x084f, B:166:0x0852, B:168:0x085a, B:169:0x086d, B:170:0x0870, B:172:0x0874, B:174:0x088f, B:175:0x0892, B:176:0x089a, B:179:0x08c7, B:180:0x08d0, B:182:0x08d2, B:145:0x07d8, B:146:0x07dd), top: B:198:0x006b, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x085a A[Catch: all -> 0x08d5, TryCatch #3 {all -> 0x08d5, blocks: (B:4:0x006b, B:134:0x0756, B:140:0x076d, B:142:0x078b, B:143:0x07a1, B:144:0x07d7, B:148:0x07e0, B:149:0x0806, B:151:0x081a, B:153:0x0822, B:154:0x082b, B:155:0x082c, B:157:0x0834, B:159:0x083c, B:160:0x0845, B:161:0x0846, B:164:0x084f, B:166:0x0852, B:168:0x085a, B:169:0x086d, B:170:0x0870, B:172:0x0874, B:174:0x088f, B:175:0x0892, B:176:0x089a, B:179:0x08c7, B:180:0x08d0, B:182:0x08d2, B:145:0x07d8, B:146:0x07dd), top: B:198:0x006b, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0874 A[Catch: all -> 0x08d5, TryCatch #3 {all -> 0x08d5, blocks: (B:4:0x006b, B:134:0x0756, B:140:0x076d, B:142:0x078b, B:143:0x07a1, B:144:0x07d7, B:148:0x07e0, B:149:0x0806, B:151:0x081a, B:153:0x0822, B:154:0x082b, B:155:0x082c, B:157:0x0834, B:159:0x083c, B:160:0x0845, B:161:0x0846, B:164:0x084f, B:166:0x0852, B:168:0x085a, B:169:0x086d, B:170:0x0870, B:172:0x0874, B:174:0x088f, B:175:0x0892, B:176:0x089a, B:179:0x08c7, B:180:0x08d0, B:182:0x08d2, B:145:0x07d8, B:146:0x07dd), top: B:198:0x006b, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x088f A[Catch: all -> 0x08d5, TryCatch #3 {all -> 0x08d5, blocks: (B:4:0x006b, B:134:0x0756, B:140:0x076d, B:142:0x078b, B:143:0x07a1, B:144:0x07d7, B:148:0x07e0, B:149:0x0806, B:151:0x081a, B:153:0x0822, B:154:0x082b, B:155:0x082c, B:157:0x0834, B:159:0x083c, B:160:0x0845, B:161:0x0846, B:164:0x084f, B:166:0x0852, B:168:0x085a, B:169:0x086d, B:170:0x0870, B:172:0x0874, B:174:0x088f, B:175:0x0892, B:176:0x089a, B:179:0x08c7, B:180:0x08d0, B:182:0x08d2, B:145:0x07d8, B:146:0x07dd), top: B:198:0x006b, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x08c7 A[Catch: all -> 0x08d5, TRY_ENTER, TryCatch #3 {all -> 0x08d5, blocks: (B:4:0x006b, B:134:0x0756, B:140:0x076d, B:142:0x078b, B:143:0x07a1, B:144:0x07d7, B:148:0x07e0, B:149:0x0806, B:151:0x081a, B:153:0x0822, B:154:0x082b, B:155:0x082c, B:157:0x0834, B:159:0x083c, B:160:0x0845, B:161:0x0846, B:164:0x084f, B:166:0x0852, B:168:0x085a, B:169:0x086d, B:170:0x0870, B:172:0x0874, B:174:0x088f, B:175:0x0892, B:176:0x089a, B:179:0x08c7, B:180:0x08d0, B:182:0x08d2, B:145:0x07d8, B:146:0x07dd), top: B:198:0x006b, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x07d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x086d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v77, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v78, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v79, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Map] */
    public tv(File file, a aVar, eol eolVar) throws Throwable {
        long jElapsedRealtime;
        int i;
        int i2;
        Map mapB;
        byte[] bArrNativeReset;
        lyo lyoVarC;
        lvh lvhVar;
        File[] fileArrListFiles;
        int i3;
        eol eolVar2;
        File file2;
        AtomicFile atomicFile;
        Object obj;
        eol eolVar3;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.b = reentrantReadWriteLock;
        this.i = new dep();
        this.k = new eol((byte[]) null, (byte[]) null);
        this.c = new afv();
        this.f = new ujb();
        int i4 = 0;
        this.d = 0;
        this.t = false;
        luv luvVar = luv.UNKNOWN;
        AtomicReference atomicReference = new AtomicReference(luvVar);
        this.u = atomicReference;
        this.o = new File(file, "blob_dir/blob_files");
        this.h = aVar;
        this.v = (xsc) eolVar.a;
        Object obj2 = eolVar.b;
        new afv();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        reentrantReadWriteLock.writeLock().lock();
        int i5 = 1;
        try {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                String absolutePath = file.getAbsolutePath();
                lxq lxqVarS = luf.DEFAULT_INSTANCE.s();
                lxqVarS.s();
                luf lufVar = (luf) lxqVarS.a;
                absolutePath.getClass();
                lufVar.bitField0_ |= 1;
                lufVar.baseDir_ = absolutePath;
                lxqVarS.s();
                luf lufVar2 = (luf) lxqVarS.a;
                lufVar2.bitField0_ |= 2;
                lufVar2.maxTokenLength_ = 30;
                lxqVarS.s();
                luf lufVar3 = (luf) lxqVarS.a;
                lufVar3.bitField0_ |= 4;
                lufVar3.indexMergeSize_ = 1048576;
                lxqVarS.s();
                luf lufVar4 = (luf) lxqVarS.a;
                lufVar4.bitField0_ |= 16;
                lufVar4.optimizeRebuildIndexThreshold_ = 0.9f;
                lxqVarS.s();
                luf lufVar5 = (luf) lxqVarS.a;
                lufVar5.bitField0_ |= 32;
                lufVar5.compressionLevel_ = 3;
                lxqVarS.s();
                luf lufVar6 = (luf) lxqVarS.a;
                lufVar6.bitField0_ |= SemanticState.Focused;
                lufVar6.allowCircularSchemaDefinitions_ = true;
                lxqVarS.s();
                luf lufVar7 = (luf) lxqVarS.a;
                lufVar7.bitField0_ |= SemanticState.Hidden;
                lufVar7.preMappingFbv_ = false;
                lxqVarS.s();
                luf lufVar8 = (luf) lxqVarS.a;
                lufVar8.bitField0_ |= SemanticState.ReadOnly;
                lufVar8.integerIndexBucketSplitThreshold_ = 65536;
                lxqVarS.s();
                luf lufVar9 = (luf) lxqVarS.a;
                lufVar9.bitField0_ |= SemanticState.Obscured;
                lufVar9.liteIndexSortSize_ = SemanticState.Multiline;
                lxqVarS.s();
                luf lufVar10 = (luf) lxqVarS.a;
                lufVar10.bitField0_ |= 65536;
                luv luvVar2 = luvVar;
                lufVar10.orphanBlobTimeToLiveMs_ = 604800000L;
                lxqVarS.s();
                luf lufVar11 = (luf) lxqVarS.a;
                lufVar11.bitField0_ |= 524288;
                lufVar11.enableScorableProperties_ = true;
                lxqVarS.s();
                luf lufVar12 = (luf) lxqVarS.a;
                lufVar12.bitField0_ |= 16777216;
                lufVar12.icuDataFileAbsolutePath_ = "";
                lxqVarS.s();
                luf lufVar13 = (luf) lxqVarS.a;
                lufVar13.bitField0_ |= Integer.MIN_VALUE;
                lufVar13.manageBlobFiles_ = false;
                lxqVarS.s();
                luf lufVar14 = (luf) lxqVarS.a;
                lufVar14.bitField0_ |= 268435456;
                lufVar14.enableDeletePropagationFrom_ = false;
                lxqVarS.s();
                luf lufVar15 = (luf) lxqVarS.a;
                lufVar15.bitField1_ |= SemanticState.Obscured;
                lufVar15.expiredDocumentPurgeThresholdMs_ = 60000L;
                lxqVarS.s();
                luf lufVar16 = (luf) lxqVarS.a;
                lufVar16.bitField1_ |= 4;
                lufVar16.compressionThresholdBytes_ = 600;
                lxqVarS.s();
                luf lufVar17 = (luf) lxqVarS.a;
                lufVar17.bitField0_ |= 64;
                lufVar17.compressionMemLevel_ = 1;
                lxqVarS.s();
                luf lufVar18 = (luf) lxqVarS.a;
                lufVar18.bitField1_ |= SemanticState.ReadOnly;
                lufVar18.embeddingIndexNumShards_ = 32;
                lxqVarS.s();
                luf lufVar19 = (luf) lxqVarS.a;
                lufVar19.bitField1_ |= SemanticState.Modal;
                lufVar19.enableOptimizeImprovements_ = false;
                lxqVarS.s();
                luf lufVar20 = (luf) lxqVarS.a;
                lufVar20.bitField0_ |= 8388608;
                lufVar20.enableRepeatedFieldJoins_ = true;
                lxqVarS.s();
                luf lufVar21 = (luf) lxqVarS.a;
                lufVar21.bitField1_ |= SemanticState.Multiline;
                lufVar21.enableNonExistentQualifiedIdJoin_ = true;
                lxqVarS.s();
                luf lufVar22 = (luf) lxqVarS.a;
                lufVar22.bitField1_ |= 16384;
                lufVar22.enableSkipSetSchemaTypeEqualityCheck_ = true;
                lxqVarS.s();
                luf lufVar23 = (luf) lxqVarS.a;
                lufVar23.bitField1_ |= 32768;
                lufVar23.enableBackgroundTaskScheduler_ = true;
                lxqVarS.s();
                luf lufVar24 = (luf) lxqVarS.a;
                lufVar24.bitField1_ |= 131072;
                lufVar24.enableSchemaDefinitionDeduping_ = false;
                lxqVarS.s();
                luf lufVar25 = (luf) lxqVarS.a;
                lufVar25.bitField1_ |= 262144;
                lufVar25.enableDatabaseStablenessLog_ = false;
                lxqVarS.s();
                luf lufVar26 = (luf) lxqVarS.a;
                lufVar26.bitField1_ |= 1048576;
                lufVar26.enableAccountPropertyIncompatibilityCheck_ = false;
                lxqVarS.s();
                luf lufVar27 = (luf) lxqVarS.a;
                lufVar27.bitField1_ |= 2097152;
                lufVar27.schemaStoreReleaseCachedProtoAfterUse_ = false;
                lxqVarS.s();
                luf lufVar28 = (luf) lxqVarS.a;
                lufVar28.bitField1_ |= 8388608;
                lufVar28.removeSchemaStoreMoveAssignment_ = false;
                lxqVarS.s();
                luf lufVar29 = (luf) lxqVarS.a;
                lufVar29.bitField1_ |= 16777216;
                lufVar29.enableFineGrainedIndexRebuild_ = true;
                lxqVarS.s();
                luf lufVar30 = (luf) lxqVarS.a;
                lufVar30.bitField1_ |= 33554432;
                lufVar30.enableReadDuringAnnMaintenance_ = true;
                lxqVarS.s();
                luf lufVar31 = (luf) lxqVarS.a;
                lufVar31.bitField1_ |= 67108864;
                lufVar31.enableOptimizeResultStates_ = false;
                lxqVarS.s();
                luf lufVar32 = (luf) lxqVarS.a;
                lufVar32.bitField1_ |= 134217728;
                lufVar32.enableIndexRestorationCriticalErrorHandlingFix_ = false;
                luf lufVar33 = (luf) lxqVarS.o();
                boolean z = vo.a;
                lth lthVar = new lth(lufVar33);
                this.e = lthVar;
                aie.e(lthVar);
                try {
                    try {
                        luh luhVarC = this.e.c();
                        int i6 = 2;
                        while (i6 > 0) {
                            try {
                                if (u(luhVarC.c())) {
                                    break;
                                }
                                Log.e("AppSearchImpl", String.format("INIT: Initialize failed with status (%d:%s). %d retries left!", Integer.valueOf(luhVarC.c().b() - 1), luhVarC.c().message_, Integer.valueOf(i6)));
                                i6--;
                                luhVarC = this.e.c();
                            } catch (Throwable th) {
                                th = th;
                                i = 1;
                            }
                        }
                        luhVarC.c();
                        if (obj2 != null) {
                            uj ujVar = (uj) ((vk) obj2).e((int) (jElapsedRealtime - jElapsedRealtime2));
                            ujVar.c(t(luhVarC.c()));
                            ujVar.a();
                            ((uj) ((uj) ujVar.i()).h()).d(luhVarC.getVmLatencyMs_);
                            luj lujVarB = luhVarC.b();
                            azs.l(lujVarB);
                            int i7 = lujVarB.latencyMs_;
                            ((uj) obj2).a();
                            ((uj) obj2).e = i7;
                            int iC = lujVarB.c() - 1;
                            ((uj) obj2).a();
                            ((uj) obj2).f = iC;
                            int iE = lujVarB.e() - 1;
                            ((uj) obj2).a();
                            ((uj) obj2).g = iE;
                            int iH = lujVarB.h() - 1;
                            ((uj) obj2).a();
                            ((uj) obj2).h = iH;
                            int i8 = lujVarB.documentStoreRecoveryLatencyMs_;
                            ((uj) obj2).a();
                            ((uj) obj2).i = i8;
                            int i9 = lujVarB.indexRestorationLatencyMs_;
                            ((uj) obj2).a();
                            ((uj) obj2).j = i9;
                            int i10 = lujVarB.schemaStoreRecoveryLatencyMs_;
                            ((uj) obj2).a();
                            ((uj) obj2).k = i10;
                            int iB = lujVarB.b() - 1;
                            ((uj) obj2).a();
                            ((uj) obj2).l = iB;
                            int i11 = lujVarB.numDocuments_;
                            ((uj) obj2).a();
                            ((uj) obj2).m = i11;
                            int i12 = lujVarB.numSchemaTypes_;
                            ((uj) obj2).a();
                            ((uj) obj2).n = i12;
                            int i13 = lujVarB.numPreviousInitFailures_;
                            ((uj) obj2).a();
                            ((uj) obj2).o = i13;
                            int iF = lujVarB.f() - 1;
                            ((uj) obj2).a();
                            ((uj) obj2).p = iF;
                            int iG = lujVarB.g() - 1;
                            ((uj) obj2).a();
                            ((uj) obj2).q = iG;
                            int iD = lujVarB.d() - 1;
                            ((uj) obj2).a();
                            ((uj) obj2).r = iD;
                            lwf lwfVar = lujVarB.initializeIcuDataStatus_;
                            int iB2 = (lwfVar == null ? lwf.DEFAULT_INSTANCE : lwfVar).b() - 1;
                            ((uj) obj2).a();
                            ((uj) obj2).s = iB2;
                            int i14 = lujVarB.numFailedReindexedDocuments_;
                            ((uj) obj2).a();
                            ((uj) obj2).t = i14;
                            int iQ = ixt.Q(lujVarB.failureStage_);
                            iQ = iQ == 0 ? 1 : iQ;
                            ((uj) obj2).a();
                            ((uj) obj2).E = iQ;
                            lwf lwfVar2 = lujVarB.icuSegmenterCreationStatus_;
                            int iB3 = (lwfVar2 == null ? lwf.DEFAULT_INSTANCE : lwfVar2).b() - 1;
                            ((uj) obj2).a();
                            ((uj) obj2).u = iB3;
                            lwf lwfVar3 = lujVarB.icuNormalizerCreationStatus_;
                            int iB4 = (lwfVar3 == null ? lwf.DEFAULT_INSTANCE : lwfVar3).b() - 1;
                            ((uj) obj2).a();
                            ((uj) obj2).v = iB4;
                            luv luvVarA = luv.a(lujVarB.lastPersistToDiskType_);
                            luvVar2 = luvVarA != null ? luvVarA : luvVar2;
                            ((uj) obj2).a();
                            ((uj) obj2).w = luvVar2;
                            lyc lycVar = new lyc(lujVarB.afterLastFlushFullCallTypes_, luj.afterLastFlushFullCallTypes_converter_);
                            ((uj) obj2).a();
                            ((uj) obj2).x.addAll(lycVar);
                            lyc lycVar2 = new lyc(lujVarB.afterLastFlushRecoveryProofCallTypes_, luj.afterLastFlushRecoveryProofCallTypes_converter_);
                            ((uj) obj2).a();
                            ((uj) obj2).y.addAll(lycVar2);
                            lyc lycVar3 = new lyc(lujVarB.afterLastFlushLiteCallTypes_, luj.afterLastFlushLiteCallTypes_converter_);
                            ((uj) obj2).a();
                            ((uj) obj2).z.addAll(lycVar3);
                            long j = lujVarB.schemaProtoByteSize_;
                            ((uj) obj2).a();
                            ((uj) obj2).A = j;
                        }
                        d(luhVarC.c());
                        luj lujVarB2 = luhVarC.b();
                        if (lujVarB2.b() != 1 || lujVarB2.h() != 1 || lujVarB2.c() != 1 || lujVarB2.e() != 1 || lujVarB2.f() != 1 || lujVarB2.g() != 1 || lujVarB2.d() != 1) {
                            f(a);
                        }
                        if (!this.o.exists() && !this.o.mkdirs()) {
                            throw new ts(4, "Cannot create the blob file directory: " + this.o.getAbsolutePath(), null);
                        }
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        lud ludVarB = this.e.b();
                        for (int i15 = 2; i6 > 0 && !y(ludVarB.c(), i15, 5); i15 = 2) {
                            Integer numValueOf = Integer.valueOf(ludVarB.c().b() - 1);
                            String str = ludVarB.c().message_;
                            Integer numValueOf2 = Integer.valueOf(i6);
                            i2 = i5;
                            try {
                                try {
                                    Object[] objArr = new Object[3];
                                    objArr[0] = numValueOf;
                                    objArr[i2] = str;
                                    objArr[2] = numValueOf2;
                                    Log.e("AppSearchImpl", String.format("INIT: GetSchema failed with status (%d:%s). %d retries left!", objArr));
                                    i6--;
                                    ludVarB = this.e.b();
                                    i5 = i2;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (ts e) {
                                e = e;
                                rx.a();
                                Log.e("AppSearchImpl", "Error initializing, attempting to reset IcingSearchEngine.", e);
                                if (obj2 != null) {
                                    ((uj) obj2).c(e.a);
                                }
                                IcingSearchEngineImpl icingSearchEngineImpl = this.e.a;
                                icingSearchEngineImpl.a();
                                bArrNativeReset = IcingSearchEngineImpl.nativeReset(icingSearchEngineImpl);
                                int i16 = ltk.a;
                                lyoVarC = ltk.c(bArrNativeReset, lvh.c(), new lti(i2));
                                if (bArrNativeReset != null) {
                                    ((lxq) lyoVarC).s();
                                    lvh lvhVar2 = (lvh) ((lxq) lyoVarC).a;
                                    lvhVar2.bitField0_ |= 8;
                                    lvhVar2.responseBytes_ = bArrNativeReset.length;
                                }
                                lvhVar = (lvh) ((lxq) lyoVarC).o();
                                lvhVar.b();
                                this.d = 0;
                                dep depVar = this.i;
                                depVar.b.clear();
                                depVar.c.clear();
                                depVar.d.clear();
                                eol eolVar4 = this.k;
                                eolVar4.b.clear();
                                eolVar4.a.clear();
                                this.j = new auzc(Collections.EMPTY_LIST);
                                synchronized (this.c) {
                                    this.c.clear();
                                    if (obj2 != null) {
                                        ((uj) obj2).a();
                                        ((uj) obj2).B = true;
                                        int iT = t(lvhVar.b());
                                        ((uj) obj2).a();
                                        ((uj) obj2).C = iT;
                                        Objects.toString(lvhVar.b());
                                    }
                                    d(lvhVar.b());
                                    f(a);
                                    if (!this.o.isFile()) {
                                    }
                                    if (this.o.exists()) {
                                    }
                                    fileArrListFiles = this.o.listFiles();
                                    if (fileArrListFiles != null) {
                                        throw new ts(4, "Cannot list the blob files.", null);
                                    }
                                    for (File file3 : fileArrListFiles) {
                                        if (!file3.delete()) {
                                            Log.e("AppSearchImpl", "Cannot delete the blob file: ".concat(String.valueOf(file3.getName())));
                                        }
                                    }
                                    eolVar2 = this.l;
                                    if (eolVar2 != null) {
                                        file2 = new File((File) eolVar2.a, "accounts_file");
                                        atomicFile = new AtomicFile(file2);
                                        eolVar2.b.clear();
                                        if (file2.exists()) {
                                            atomicFile.delete();
                                        }
                                    }
                                    mapB = B(this.v, (uj) obj2);
                                    this.g = (dep) mapB.get("VS#Db");
                                    this.p = 1;
                                    int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                    this.r = iElapsedRealtime;
                                    this.q = this.p;
                                    this.s = iElapsedRealtime;
                                    this.b.writeLock().unlock();
                                    return;
                                }
                            }
                        }
                        i2 = i5;
                        ludVarB.c();
                        x(ludVarB.c(), 2, 5);
                        lvm lvmVarB = ludVarB.b();
                        lwh lwhVarD = this.e.d();
                        while (i6 > 0 && !u(lwhVarD.b())) {
                            Integer numValueOf3 = Integer.valueOf(lwhVarD.b().b() - 1);
                            String str2 = lwhVarD.b().message_;
                            Integer numValueOf4 = Integer.valueOf(i6);
                            int i17 = i4;
                            Object[] objArr2 = new Object[3];
                            objArr2[i17] = numValueOf3;
                            objArr2[i2] = str2;
                            objArr2[2] = numValueOf4;
                            Log.e("AppSearchImpl", String.format("INIT: GetStorageInfo failed with status (%d:%s). %d retries left!", objArr2));
                            i6--;
                            lwhVarD = this.e.d();
                            i4 = i17;
                        }
                        int i18 = i4;
                        lwhVarD.b();
                        d(lwhVarD.b());
                        lwg lwgVarC = lwhVarD.c();
                        if (obj2 != null) {
                            ((uj) obj2).c(i18);
                            ((uj) obj2).b((int) (SystemClock.elapsedRealtime() - jElapsedRealtime3));
                        }
                        lye lyeVar = lvmVarB.types_;
                        for (int i19 = 0; i19 < lyeVar.size(); i19++) {
                            lvq lvqVar = (lvq) lyeVar.get(i19);
                            String str3 = lvqVar.schemaType_;
                            this.i.h(ed.g(str3), lvqVar);
                            this.i.i(str3, new afx(lvqVar.accountProperties_));
                        }
                        dep depVar2 = this.i;
                        depVar2.c.clear();
                        depVar2.d.clear();
                        Iterator it = depVar2.b.keySet().iterator();
                        while (it.hasNext()) {
                            depVar2.j((String) it.next());
                        }
                        lye lyeVar2 = lwgVarC.b().namespaceStorageInfo_;
                        for (int i20 = 0; i20 < lyeVar2.size(); i20++) {
                            String str4 = ((luq) lyeVar2.get(i20)).namespace_;
                            this.k.x(ed.g(str4), str4);
                        }
                        if (this.v != null) {
                            lye lyeVar3 = lwgVarC.namespaceBlobStorageInfo_;
                            for (int i21 = 0; i21 < lyeVar3.size(); i21++) {
                                String str5 = ((luo) lyeVar3.get(i21)).namespace_;
                                eol.y(this.k.a, ed.g(str5), str5);
                            }
                        }
                        this.j = new auzc(lwgVarC.b().namespaceStorageInfo_);
                        if (obj2 != null) {
                            ((uj) obj2).b((int) (SystemClock.elapsedRealtime() - jElapsedRealtime3));
                            obj = obj2;
                        } else {
                            obj = null;
                        }
                        try {
                            mapB = B(this.v, (uj) obj2);
                            File file4 = new File(file, "account_dir");
                            if (!file4.exists() && !file4.mkdirs()) {
                                throw new ts(4, "Cannot create the account file directory: ".concat(String.valueOf(file4.getAbsolutePath())), null);
                            }
                            File file5 = new File(file4, "accounts_file");
                            afx afxVar = new afx(0);
                            if (file5.exists()) {
                                try {
                                    FileInputStream fileInputStreamOpenRead = new AtomicFile(file5).openRead();
                                    try {
                                        lxd lxdVarD = lxd.d(fileInputStreamOpenRead);
                                        while (!lxdVarD.a()) {
                                            afxVar.add((jru) lxt.y(jru.DEFAULT_INSTANCE, lxdVarD.b()));
                                        }
                                        if (fileInputStreamOpenRead != null) {
                                            fileInputStreamOpenRead.close();
                                        }
                                        eolVar3 = new eol(file4, afxVar);
                                    } catch (Throwable th3) {
                                        if (fileInputStreamOpenRead == null) {
                                            throw th3;
                                        }
                                        try {
                                            fileInputStreamOpenRead.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                    }
                                } catch (IOException e2) {
                                    throw new ts(4, "Cannot read AppSearch Account file.", e2);
                                }
                            } else {
                                eolVar3 = new eol(file4, afxVar);
                            }
                            this.l = eolVar3;
                            this.g = (dep) mapB.get("VS#Db");
                            this.p = 1;
                            int iElapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                            this.r = iElapsedRealtime2;
                            this.q = this.p;
                            this.s = iElapsedRealtime2;
                            this.b.writeLock().unlock();
                            return;
                        } catch (ts e3) {
                            e = e3;
                            obj2 = obj;
                            rx.a();
                            Log.e("AppSearchImpl", "Error initializing, attempting to reset IcingSearchEngine.", e);
                            if (obj2 != null) {
                                ((uj) obj2).c(e.a);
                            }
                            IcingSearchEngineImpl icingSearchEngineImpl2 = this.e.a;
                            icingSearchEngineImpl2.a();
                            bArrNativeReset = IcingSearchEngineImpl.nativeReset(icingSearchEngineImpl2);
                            int i110 = ltk.a;
                            lyoVarC = ltk.c(bArrNativeReset, lvh.c(), new lti(i2));
                            if (bArrNativeReset != null) {
                                ((lxq) lyoVarC).s();
                                lvh lvhVar3 = (lvh) ((lxq) lyoVarC).a;
                                lvhVar3.bitField0_ |= 8;
                                lvhVar3.responseBytes_ = bArrNativeReset.length;
                            }
                            lvhVar = (lvh) ((lxq) lyoVarC).o();
                            lvhVar.b();
                            this.d = 0;
                            dep depVar3 = this.i;
                            depVar3.b.clear();
                            depVar3.c.clear();
                            depVar3.d.clear();
                            eol eolVar5 = this.k;
                            eolVar5.b.clear();
                            eolVar5.a.clear();
                            this.j = new auzc(Collections.EMPTY_LIST);
                            synchronized (this.c) {
                                this.c.clear();
                            }
                            if (obj2 != null) {
                                ((uj) obj2).a();
                                ((uj) obj2).B = true;
                                int iT2 = t(lvhVar.b());
                                ((uj) obj2).a();
                                ((uj) obj2).C = iT2;
                                Objects.toString(lvhVar.b());
                            }
                            d(lvhVar.b());
                            f(a);
                            if (!this.o.isFile() && !this.o.delete()) {
                                throw new ts(4, "The blob file directory is a file and cannot delete it.", null);
                            }
                            if (this.o.exists() && !this.o.mkdirs()) {
                                throw new ts(4, "The blob file directory does not exist and cannot create a new one.", null);
                            }
                            fileArrListFiles = this.o.listFiles();
                            if (fileArrListFiles != null) {
                                throw new ts(4, "Cannot list the blob files.", null);
                            }
                            while (i3 < fileArrListFiles.length) {
                                if (!file3.delete()) {
                                    Log.e("AppSearchImpl", "Cannot delete the blob file: ".concat(String.valueOf(file3.getName())));
                                }
                            }
                            eolVar2 = this.l;
                            if (eolVar2 != null) {
                                file2 = new File((File) eolVar2.a, "accounts_file");
                                atomicFile = new AtomicFile(file2);
                                eolVar2.b.clear();
                                if (file2.exists()) {
                                    atomicFile.delete();
                                }
                            }
                            mapB = B(this.v, (uj) obj2);
                        }
                    } catch (ts e4) {
                        e = e4;
                        i2 = 1;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    i2 = i5;
                }
                i = i2;
            } catch (Throwable th6) {
                th = th6;
                i = 1;
                this.p = i;
                int iElapsedRealtime3 = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                this.r = iElapsedRealtime3;
                this.q = this.p;
                this.s = iElapsedRealtime3;
                this.b.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            jElapsedRealtime = 0;
        }
        this.p = i;
        int iElapsedRealtime4 = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
        this.r = iElapsedRealtime4;
        this.q = this.p;
        this.s = iElapsedRealtime4;
        this.b.writeLock().unlock();
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02bc A[LOOP:1: B:102:0x02b6->B:104:0x02bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x02a2  */
    private final void A(String str, String str2, List list, List list2, eob eobVar, boolean z, tw twVar, luv luvVar) throws Throwable {
        long j;
        long jElapsedRealtime;
        long j2;
        int iElapsedRealtime;
        int i;
        long j3;
        ArrayList arrayList;
        lye lyeVar;
        azs.f(list.size() == list2.size(), "documents and statsBuilders should have same size");
        ArrayList arrayList2 = new ArrayList();
        ReadWriteLock readWriteLock = this.b;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        String strD = ed.d(str, str2);
        readWriteLock.writeLock().lock();
        try {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                e();
                lxq lxqVarS = lvb.DEFAULT_INSTANCE.s();
                lxqVarS.s();
                lvb lvbVar = (lvb) lxqVarS.a;
                lvbVar.persistType_ = luvVar.g;
                lvbVar.bitField0_ |= 1;
                int i2 = 0;
                while (i2 < list.size()) {
                    ltt lttVar = (ltt) list.get(i2);
                    Object obj = lttVar.uri_;
                    int i3 = i2;
                    j = jElapsedRealtime2;
                    try {
                        ul ulVar = (ul) ((ul) ((ul) ((ul) ((ul) ((ul) list2.get(i2)).i()).h()).e((int) (jElapsedRealtime - j))).f(this.q)).g(this.s);
                        try {
                            lttVar.l(null);
                            g(str);
                            lxqVarS.s();
                            lvb lvbVar2 = (lvb) lxqVarS.a;
                            lttVar.getClass();
                            lye lyeVar2 = lvbVar2.documents_;
                            if (!lyeVar2.c()) {
                                lvbVar2.documents_ = lxt.A(lyeVar2);
                            }
                            lvbVar2.documents_.add(lttVar);
                            arrayList2.add(ulVar);
                        } catch (Throwable th) {
                            eobVar.e(obj, ry.a(th));
                        }
                        i2 = i3 + 1;
                        jElapsedRealtime2 = j;
                    } catch (Throwable th2) {
                        th = th2;
                        j2 = jElapsedRealtime;
                        o(j2, SystemClock.elapsedRealtime(), 3);
                        this.b.writeLock().unlock();
                        if (twVar != null) {
                            iElapsedRealtime = (int) ((SystemClock.elapsedRealtime() - j) / ((long) list2.size()));
                            for (i = 0; i < list2.size(); i++) {
                                ul ulVar2 = (ul) list2.get(i);
                                ulVar2.d = iElapsedRealtime;
                                twVar.b(new um(ulVar2));
                            }
                        }
                        throw th;
                    }
                }
                j = jElapsedRealtime2;
                lvb lvbVar3 = (lvb) lxqVarS.o();
                lvbVar3.documents_.size();
                boolean z2 = vo.a;
                IcingSearchEngineImpl icingSearchEngineImpl = this.e.a;
                byte[] bArrN = lvbVar3.n();
                icingSearchEngineImpl.a();
                byte[] bArrNativeBatchPut = IcingSearchEngineImpl.nativeBatchPut(icingSearchEngineImpl, bArrN);
                int length = bArrN.length;
                int i4 = ltk.a;
                lyo lyoVarC = ltk.c(bArrNativeBatchPut, ltl.b(), new lti(7));
                ((lxq) lyoVarC).s();
                ltl ltlVar = (ltl) ((lxq) lyoVarC).a;
                ltlVar.bitField0_ |= 16;
                ltlVar.requestBytes_ = length;
                if (bArrNativeBatchPut != null) {
                    ((lxq) lyoVarC).s();
                    ltl ltlVar2 = (ltl) ((lxq) lyoVarC).a;
                    ltlVar2.bitField0_ |= 32;
                    ltlVar2.responseBytes_ = bArrNativeBatchPut.length;
                }
                ltl ltlVar3 = (ltl) ((lxq) lyoVarC).o();
                f(a);
                lye lyeVar3 = ltlVar3.putResultProtos_;
                int i5 = 0;
                while (i5 < lyeVar3.size()) {
                    try {
                        lve lveVar = (lve) lyeVar3.get(i5);
                        String str3 = lveVar.uri_;
                        try {
                            if (i5 < arrayList2.size()) {
                                ul ulVar3 = (ul) arrayList2.get(i5);
                                arrayList = arrayList2;
                                try {
                                    ulVar3.c = t(lveVar.b());
                                    ulVar3.d(lveVar.getVmLatencyMs_);
                                    lvd lvdVar = lveVar.putDocumentStats_;
                                    if (lvdVar == null) {
                                        lvdVar = lvd.DEFAULT_INSTANCE;
                                    }
                                    azs.l(lvdVar);
                                    azs.l(ulVar3);
                                    lyeVar = lyeVar3;
                                    try {
                                        ulVar3.g = lvdVar.latencyMs_;
                                        ulVar3.h = lvdVar.documentStoreLatencyMs_;
                                        ulVar3.i = lvdVar.indexLatencyMs_;
                                        ulVar3.j = lvdVar.indexMergeLatencyMs_;
                                        ulVar3.k = lvdVar.documentSize_;
                                        lvc lvcVar = lvdVar.tokenizationStats_;
                                        if (lvcVar == null) {
                                            lvcVar = lvc.DEFAULT_INSTANCE;
                                        }
                                        ulVar3.l = lvcVar.numTokensIndexed_;
                                        ulVar3.m = lvdVar.termIndexLatencyMs_;
                                        ulVar3.n = lvdVar.integerIndexLatencyMs_;
                                        ulVar3.o = lvdVar.qualifiedIdJoinIndexLatencyMs_;
                                        ulVar3.p = lvdVar.liteIndexSortLatencyMs_;
                                        ulVar3.q = lvdVar.metadataTermIndexLatencyMs_;
                                        ulVar3.r = lvdVar.embeddingIndexLatencyMs_;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        j3 = jElapsedRealtime;
                                        eobVar.e(str3, ry.a(th));
                                        i5++;
                                        lyeVar3 = lyeVar;
                                        arrayList2 = arrayList;
                                        jElapsedRealtime = j3;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    lyeVar = lyeVar3;
                                    j3 = jElapsedRealtime;
                                    eobVar.e(str3, ry.a(th));
                                    i5++;
                                    lyeVar3 = lyeVar;
                                    arrayList2 = arrayList;
                                    jElapsedRealtime = j3;
                                }
                            } else {
                                arrayList = arrayList2;
                                lyeVar = lyeVar3;
                            }
                            d(lveVar.b());
                            j3 = jElapsedRealtime;
                            try {
                                long j4 = lveVar.documentExpirationTimestampMs_;
                                eobVar.f(str3, new rx());
                                ltt lttVar2 = (ltt) lvbVar3.documents_.get(i5);
                                if (str3.equals(lttVar2.uri_)) {
                                    this.k.x(strD, lttVar2.namespace_);
                                    if (!lveVar.wasReplacement_) {
                                        this.j.k(str);
                                    }
                                    if (z) {
                                        ujb ujbVar = this.f;
                                        ed.h(lttVar2.namespace_);
                                        ed.h(lttVar2.schema_);
                                        String str4 = lttVar2.uri_;
                                        ujbVar.i(str, str2);
                                    }
                                } else {
                                    Log.w("AppSearchImpl", "id mismatch between request and response for batchPut");
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                eobVar.e(str3, ry.a(th));
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            arrayList = arrayList2;
                        }
                        try {
                            i5++;
                            lyeVar3 = lyeVar;
                            arrayList2 = arrayList;
                            jElapsedRealtime = j3;
                        } catch (Throwable th7) {
                            th = th7;
                            j2 = j3;
                            o(j2, SystemClock.elapsedRealtime(), 3);
                            this.b.writeLock().unlock();
                            if (twVar != null && !list2.isEmpty()) {
                                iElapsedRealtime = (int) ((SystemClock.elapsedRealtime() - j) / ((long) list2.size()));
                                while (i < list2.size()) {
                                    ul ulVar4 = (ul) list2.get(i);
                                    ulVar4.d = iElapsedRealtime;
                                    twVar.b(new um(ulVar4));
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = jElapsedRealtime;
                        j2 = j3;
                        o(j2, SystemClock.elapsedRealtime(), 3);
                        this.b.writeLock().unlock();
                        if (twVar != null) {
                            iElapsedRealtime = (int) ((SystemClock.elapsedRealtime() - j) / ((long) list2.size()));
                            while (i < list2.size()) {
                                ul ulVar5 = (ul) list2.get(i);
                                ulVar5.d = iElapsedRealtime;
                                twVar.b(new um(ulVar5));
                            }
                        }
                        throw th;
                    }
                }
                j3 = jElapsedRealtime;
                luv luvVarA = luv.a(lvbVar3.persistType_);
                if (luvVarA == null) {
                    luvVarA = luv.UNKNOWN;
                }
                if (luvVarA != luv.UNKNOWN) {
                    lut lutVar = ltlVar3.persistToDiskResultProto_;
                    if (lutVar == null) {
                        lutVar = lut.DEFAULT_INSTANCE;
                    }
                    d(lutVar.b());
                }
                o(j3, SystemClock.elapsedRealtime(), 3);
                this.b.writeLock().unlock();
                if (twVar == null || list2.isEmpty()) {
                    return;
                }
                int iElapsedRealtime2 = (int) ((SystemClock.elapsedRealtime() - j) / ((long) list2.size()));
                for (int i6 = 0; i6 < list2.size(); i6++) {
                    ul ulVar6 = (ul) list2.get(i6);
                    ulVar6.d = iElapsedRealtime2;
                    twVar.b(new um(ulVar6));
                }
            } catch (Throwable th9) {
                th = th9;
                j = jElapsedRealtime2;
            }
        } catch (Throwable th10) {
            th = th10;
            j = jElapsedRealtime2;
            jElapsedRealtime = 0;
        }
    }

    private final Map B(xsc xscVar, uj ujVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        afv afvVar = new afv();
        afvVar.put("VS#Db", new dep(this, "VS#Db", "VS#AndroidVDb"));
        afvVar.put("VSBlob#Db", xscVar != null ? new dep(this, "VSBlob#Db", "VSBlob#AndroidVDb") : null);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        if (ujVar != null) {
            ujVar.a();
            ujVar.d = (int) (jElapsedRealtime2 - jElapsedRealtime);
        }
        return afvVar;
    }

    public static int a(luv luvVar) {
        int iOrdinal = luvVar.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return 2;
        }
        return iOrdinal != 5 ? 0 : 3;
    }

    public static void d(lwf lwfVar) throws ts {
        x(lwfVar, 2);
    }

    private static int t(lwf lwfVar) {
        return a.bz(lwfVar.b());
    }

    private static boolean u(lwf lwfVar) {
        return y(lwfVar, 2);
    }

    private static final void v(List list, Set set) {
        for (int i = 0; i < list.size(); i++) {
            set.add(ed.h((String) list.get(i)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object, java.util.Map] */
    private final Pair w(String str, String str2, List list, List list2, Map map, boolean z, int i, ut utVar) throws Throwable {
        eob eobVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ss ssVarD;
        SystemClock.elapsedRealtime();
        String strD = ed.d(str, str2);
        lxq lxqVarE = lvm.e();
        int i2 = 0;
        while (i2 < list.size()) {
            sl slVar = (sl) list.get(i2);
            String str3 = slVar.a;
            Set set = (Set) map.get(str3);
            azs.l(slVar);
            lvp lvpVar = (lvp) lvq.DEFAULT_INSTANCE.s();
            lvpVar.i(str3);
            String str4 = slVar.c;
            lvpVar.s();
            lvq lvqVar = (lvq) lvpVar.a;
            lvqVar.bitField0_ |= 2;
            lvqVar.description_ = str4;
            lvpVar.s();
            lvq lvqVar2 = (lvq) lvpVar.a;
            lvqVar2.bitField0_ |= 16;
            lvqVar2.version_ = i;
            List listB = slVar.b();
            int i3 = 0;
            while (i3 < listB.size()) {
                si siVar = (si) listB.get(i3);
                azs.l(siVar);
                lxq lxqVarS = luw.DEFAULT_INSTANCE.s();
                int i4 = i2;
                String strG = siVar.g();
                lxqVarS.s();
                luw luwVar = (luw) lxqVarS.a;
                List list3 = listB;
                luwVar.bitField0_ |= 1;
                luwVar.propertyName_ = strG;
                String strF = siVar.f();
                lxqVarS.s();
                luw luwVar2 = (luw) lxqVarS.a;
                luwVar2.bitField0_ |= 2;
                luwVar2.description_ = strF;
                int iE = siVar.e();
                int iBh = a.bh(iE);
                if (iBh == 0) {
                    throw new IllegalArgumentException(a.bR(iE, "Invalid dataType: "));
                }
                lxqVarS.s();
                luw luwVar3 = (luw) lxqVarS.a;
                luwVar3.dataType_ = iBh - 1;
                luwVar3.bitField0_ |= 4;
                int iAV = a.aV(siVar.d());
                if (iAV == 0) {
                    throw new IllegalArgumentException(a.bR(iE, "Invalid cardinality: "));
                }
                lxqVarS.s();
                luw luwVar4 = (luw) lxqVarS.a;
                luwVar4.cardinality_ = iAV - 1;
                luwVar4.bitField0_ |= 16;
                if (siVar instanceof sk) {
                    sk skVar = (sk) siVar;
                    if (skVar.c() != 0) {
                        lxq lxqVarS2 = lun.DEFAULT_INSTANCE.s();
                        int i5 = skVar.c() != 0 ? 2 : 1;
                        lxqVarS2.s();
                        lun lunVar = (lun) lxqVarS2.a;
                        lunVar.valueType_ = i5 - 1;
                        lunVar.bitField0_ |= 1;
                        int i6 = skVar.a() != 0 ? 2 : 1;
                        lxqVarS2.s();
                        lun lunVar2 = (lun) lxqVarS2.a;
                        lunVar2.deletePropagationType_ = i6 - 1;
                        lunVar2.bitField0_ |= 2;
                        lun lunVar3 = (lun) lxqVarS2.o();
                        lxqVarS.s();
                        luw luwVar5 = (luw) lxqVarS.a;
                        lunVar3.getClass();
                        luwVar5.joinableConfig_ = lunVar3;
                        luwVar5.bitField0_ |= SemanticState.Hidden;
                    }
                    lxq lxqVarS3 = lwi.DEFAULT_INSTANCE.s();
                    int iB = skVar.b();
                    int i7 = iB != 0 ? iB != 1 ? 3 : 2 : 1;
                    lxqVarS3.s();
                    lwi lwiVar = (lwi) lxqVarS3.a;
                    lwiVar.termMatchType_ = i7 - 1;
                    lwiVar.bitField0_ |= 1;
                    int i8 = skVar.i();
                    int iBc = a.bc(i8);
                    if (iBc == 0) {
                        throw new IllegalArgumentException(a.bR(i8, "Invalid tokenizerType: "));
                    }
                    lxqVarS3.s();
                    lwi lwiVar2 = (lwi) lxqVarS3.a;
                    lwiVar2.tokenizerType_ = iBc - 1;
                    lwiVar2.bitField0_ |= 2;
                    lwi lwiVar3 = (lwi) lxqVarS3.o();
                    lxqVarS.s();
                    luw luwVar6 = (luw) lxqVarS.a;
                    lwiVar3.getClass();
                    luwVar6.stringIndexingConfig_ = lwiVar3;
                    luwVar6.bitField0_ |= 32;
                } else if (siVar instanceof sd) {
                    sd sdVar = (sd) siVar;
                    lxqVarS.y(sdVar.a());
                    lxq lxqVarS4 = ltr.DEFAULT_INSTANCE.s();
                    boolean zC = sdVar.c();
                    lxqVarS4.s();
                    ltr ltrVar = (ltr) lxqVarS4.a;
                    ltrVar.bitField0_ |= 1;
                    ltrVar.indexNestedProperties_ = zC;
                    List listB2 = sdVar.b();
                    lxqVarS4.s();
                    ltr ltrVar2 = (ltr) lxqVarS4.a;
                    lye lyeVar = ltrVar2.indexableNestedPropertiesList_;
                    if (!lyeVar.c()) {
                        ltrVar2.indexableNestedPropertiesList_ = lxt.A(lyeVar);
                    }
                    lwm.l(listB2, ltrVar2.indexableNestedPropertiesList_);
                    lxqVarS.s();
                    luw luwVar7 = (luw) lxqVarS.a;
                    ltr ltrVar3 = (ltr) lxqVarS4.o();
                    ltrVar3.getClass();
                    luwVar7.documentIndexingConfig_ = ltrVar3;
                    luwVar7.bitField0_ |= 64;
                } else if (siVar instanceof sh) {
                    sh shVar = (sh) siVar;
                    if (shVar.a() != 0) {
                        lxq lxqVarS5 = luk.DEFAULT_INSTANCE.s();
                        int i9 = shVar.a() != 0 ? 2 : 1;
                        lxqVarS5.s();
                        luk lukVar = (luk) lxqVarS5.a;
                        lukVar.numericMatchType_ = i9 - 1;
                        lukVar.bitField0_ |= 1;
                        luk lukVar2 = (luk) lxqVarS5.o();
                        lxqVarS.s();
                        luw luwVar8 = (luw) lxqVarS.a;
                        lukVar2.getClass();
                        luwVar8.integerIndexingConfig_ = lukVar2;
                        luwVar8.bitField0_ |= SemanticState.Focused;
                    }
                    lxqVarS.z(f.f(shVar.a.k));
                } else if (siVar instanceof sf) {
                    sf sfVar = (sf) siVar;
                    if (sfVar.a() != 0) {
                        lxq lxqVarS6 = ltx.DEFAULT_INSTANCE.s();
                        int iA = sfVar.a();
                        int i10 = iA != 0 ? iA != 1 ? 3 : 2 : 1;
                        lxqVarS6.s();
                        ltx ltxVar = (ltx) lxqVarS6.a;
                        ltxVar.embeddingIndexingType_ = i10 - 1;
                        ltxVar.bitField0_ |= 1;
                        vc vcVar = sfVar.a.j;
                        int i11 = (vcVar == null || vcVar.b == 0) ? 1 : 2;
                        lxqVarS6.s();
                        ltx ltxVar2 = (ltx) lxqVarS6.a;
                        ltxVar2.quantizationType_ = i11 - 1;
                        ltxVar2.bitField0_ |= 2;
                        ltx ltxVar3 = (ltx) lxqVarS6.o();
                        lxqVarS.s();
                        luw luwVar9 = (luw) lxqVarS.a;
                        ltxVar3.getClass();
                        luwVar9.embeddingIndexingConfig_ = ltxVar3;
                        luwVar9.bitField0_ |= SemanticState.LiveRegion;
                    }
                } else if (siVar instanceof se) {
                    lxqVarS.z(f.f(((se) siVar).a.k));
                } else if (siVar instanceof sa) {
                    lxqVarS.z(f.f(((sa) siVar).a.k));
                }
                luw luwVar10 = (luw) lxqVarS.o();
                lvpVar.s();
                lvq lvqVar3 = (lvq) lvpVar.a;
                luwVar10.getClass();
                lvqVar3.h();
                lvqVar3.properties_.add(luwVar10);
                i3++;
                i2 = i4;
                listB = list3;
            }
            int i12 = i2;
            List listA = slVar.a();
            lvpVar.s();
            lvq lvqVar4 = (lvq) lvpVar.a;
            lvqVar4.f();
            lwm.l(listA, lvqVar4.parentTypes_);
            if (set != null) {
                lvpVar.s();
                lvq lvqVar5 = (lvq) lvpVar.a;
                lye lyeVar2 = lvqVar5.accountProperties_;
                if (!lyeVar2.c()) {
                    lvqVar5.accountProperties_ = lxt.A(lyeVar2);
                }
                lwm.l(set, lvqVar5.accountProperties_);
            }
            lvq lvqVar6 = (lvq) lvpVar.o();
            lxqVarE.s();
            lvm lvmVar = (lvm) lxqVarE.a;
            lvqVar6.getClass();
            lvmVar.d();
            lvmVar.types_.add(lvqVar6);
            i2 = i12 + 1;
        }
        if (this.l != null) {
            for (Map.Entry entry : map.entrySet()) {
                this.i.i(strD.concat(String.valueOf((String) entry.getKey())), (Set) entry.getValue());
            }
        }
        SystemClock.elapsedRealtime();
        lvm lvmVar2 = (lvm) lxqVarE.o();
        afv afvVar = new afv();
        for (int i13 = 0; i13 < lvmVar2.b(); i13++) {
            lvp lvpVar2 = (lvp) lvmVar2.c(i13).v();
            String strConcat = strD.concat(String.valueOf(lvpVar2.g()));
            lvpVar2.i(strConcat);
            lvpVar2.s();
            lvq lvqVar7 = (lvq) lvpVar2.a;
            lvqVar7.bitField0_ |= 4;
            lvqVar7.database_ = strD;
            for (int i14 = 0; i14 < lvpVar2.b(); i14++) {
                lxq lxqVarV = lvpVar2.e(i14).v();
                if (!lxqVarV.g().isEmpty()) {
                    lxqVarV.y(strD.concat(String.valueOf(lxqVarV.g())));
                    lvpVar2.j(i14, lxqVarV);
                }
            }
            for (int i15 = 0; i15 < lvpVar2.d(); i15++) {
                lvpVar2.h(i15, strD.concat(String.valueOf(lvpVar2.f(i15))));
            }
            afvVar.put(strConcat, (lvq) lvpVar2.o());
        }
        SystemClock.elapsedRealtime();
        lxq lxqVarE2 = lvm.e();
        Collection collectionValues = afvVar.values();
        lxqVarE2.s();
        lvm lvmVar3 = (lvm) lxqVarE2.a;
        lvmVar3.d();
        lwm.l(collectionValues, lvmVar3.types_);
        lvm lvmVar4 = (lvm) lxqVarE2.o();
        lxq lxqVarS7 = lvy.DEFAULT_INSTANCE.s();
        lxqVarS7.s();
        lvy lvyVar = (lvy) lxqVarS7.a;
        lvmVar4.getClass();
        lvyVar.schema_ = lvmVar4;
        lvyVar.bitField0_ |= 1;
        lxqVarS7.s();
        lvy lvyVar2 = (lvy) lxqVarS7.a;
        lvyVar2.bitField0_ |= 2;
        lvyVar2.database_ = strD;
        lxqVarS7.s();
        lvy lvyVar3 = (lvy) lxqVarS7.a;
        lvyVar3.bitField0_ |= 4;
        lvyVar3.ignoreErrorsAndDeleteDocuments_ = z;
        lvy lvyVar4 = (lvy) lxqVarS7.o();
        lvmVar4.b();
        boolean z2 = vo.a;
        IcingSearchEngineImpl icingSearchEngineImpl = this.e.a;
        byte[] bArrN = lvyVar4.n();
        icingSearchEngineImpl.a();
        byte[] bArrNativeSetSchemaWithRequestProto = IcingSearchEngineImpl.nativeSetSchemaWithRequestProto(icingSearchEngineImpl, bArrN);
        int length = bArrN.length;
        int i16 = ltk.a;
        lxq lxqVar = (lxq) ltk.c(bArrNativeSetSchemaWithRequestProto, lvz.h(), new lti(8));
        lxqVar.s();
        lvz lvzVar = (lvz) lxqVar.a;
        lvzVar.bitField0_ |= SemanticState.Modal;
        lvzVar.requestBytes_ = length;
        if (bArrNativeSetSchemaWithRequestProto != null) {
            lxqVar.s();
            lvz lvzVar2 = (lvz) lxqVar.a;
            lvzVar2.bitField0_ |= SemanticState.Obscured;
            lvzVar2.responseBytes_ = bArrNativeSetSchemaWithRequestProto.length;
        }
        lvz lvzVar3 = (lvz) lxqVar.o();
        afx afxVar = new afx(lvzVar3.deletedSchemaTypes_);
        lvzVar3.g();
        SystemClock.elapsedRealtime();
        if (utVar != null) {
            t(lvzVar3.g());
            azs.l(lvzVar3);
            lvzVar3.d();
            lvzVar3.b();
            lvzVar3.fullyCompatibleChangedSchemaTypes_.size();
            lvzVar3.indexIncompatibleChangedSchemaTypes_.size();
            lvzVar3.joinIncompatibleChangedSchemaTypes_.size();
            lvzVar3.e();
            lvzVar3.c();
            int i17 = lvzVar3.deletedDocumentCount_;
            boolean z3 = lvzVar3.hasTermIndexRestored_;
            boolean z4 = lvzVar3.hasIntegerIndexRestored_;
            boolean z5 = lvzVar3.hasEmbeddingIndexRestored_;
            boolean z6 = lvzVar3.hasQualifiedIdJoinIndexRestored_;
            int i18 = lvzVar3.f().schemaStoreSetSchemaLatencyMs_;
            int i19 = lvzVar3.f().documentStoreUpdateSchemaLatencyMs_;
            int i20 = lvzVar3.f().documentStoreOptimizedUpdateSchemaLatencyMs_;
            int i21 = lvzVar3.f().indexRestorationLatencyMs_;
            int i22 = lvzVar3.f().scorablePropertyCacheRegenerationLatencyMs_;
            int i23 = lvzVar3.f().schemaStoreReinitializationLatencyMs_;
            long j = lvzVar3.f().schemaProtoByteSize_;
            utVar.d(lvzVar3.getVmLatencyMs_);
        }
        int iB2 = lvzVar3.g().b();
        try {
            d(lvzVar3.g());
            if (lvzVar3.d() > 0 || lvzVar3.b() > 0 || lvzVar3.c() > 0 || lvzVar3.deletedDocumentCount_ > 0 || lvzVar3.e() > 0 || lvzVar3.hasTermIndexRestored_ || lvzVar3.hasIntegerIndexRestored_ || lvzVar3.hasQualifiedIdJoinIndexRestored_ || lvzVar3.hasEmbeddingIndexRestored_) {
                f(a);
            }
            SystemClock.elapsedRealtime();
            Iterator it = afvVar.values().iterator();
            while (it.hasNext()) {
                this.i.h(strD, (lvq) it.next());
            }
            afw afwVar = new afw(afxVar);
            while (afwVar.hasNext()) {
                String str5 = (String) afwVar.next();
                dep depVar = this.i;
                azs.l(str5);
                Map map2 = (Map) depVar.b.get(strD);
                if (map2 != null) {
                    map2.remove(str5);
                }
            }
            this.i.j(strD);
            dep depVar2 = this.g;
            if (depVar2 != null) {
                afx afxVar2 = new afx(afvVar.keySet());
                ArrayList arrayList3 = new ArrayList(list2.size());
                for (int i24 = 0; i24 < list2.size(); i24++) {
                    sx sxVar = (sx) list2.get(i24);
                    String strConcat2 = strD.concat(sxVar.a);
                    sw swVar = new sw(sxVar);
                    swVar.b();
                    swVar.a = strConcat2;
                    arrayList3.add(swVar.a());
                    afxVar2.remove(strConcat2);
                }
                afxVar2.addAll(afxVar);
                afw afwVar2 = new afw(afxVar2);
                while (afwVar2.hasNext()) {
                    String str6 = (String) afwVar2.next();
                    if (depVar2.c.remove(str6) != null) {
                        try {
                            ((tv) depVar2.a).l((String) depVar2.b, "", str6);
                        } catch (ts e) {
                            if (e.a != 6) {
                                throw e;
                            }
                            Log.e("AppSearchVisibilityStor", a.bT(str6, "Cannot find visibility document for ", " to remove."));
                        }
                        try {
                            ((tv) depVar2.a).l((String) depVar2.d, "androidVOverlay", str6);
                        } catch (ts e2) {
                            if (e2.a != 6) {
                                throw e2;
                            }
                        }
                    }
                }
                dep depVar3 = this.g;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i25 = 0;
                while (i25 < arrayList3.size()) {
                    sx sxVar2 = (sx) arrayList3.get(i25);
                    ?? r0 = depVar3.c;
                    String str7 = sxVar2.a;
                    sx sxVar3 = (sx) r0.get(str7);
                    if (sxVar2.equals(sxVar3)) {
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                    } else {
                        arrayList4.add(ux.a(sxVar2));
                        sz szVarA = sxVar2.c.a();
                        Set setA = sxVar2.a();
                        if (szVarA == null && setA.isEmpty()) {
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            ssVarD = null;
                        } else {
                            lxq lxqVarB = jrx.b();
                            if (szVarA != null) {
                                lxqVarB.v(ux.c(szVarA));
                            }
                            lxq lxqVarS8 = jrv.DEFAULT_INSTANCE.s();
                            lxqVarS8.s();
                            jrv jrvVar = (jrv) lxqVarS8.a;
                            jrx jrxVar = (jrx) lxqVarB.o();
                            jrxVar.getClass();
                            jrvVar.visibilityConfig_ = jrxVar;
                            jrvVar.bitField0_ |= 1;
                            if (!setA.isEmpty()) {
                                afw afwVar3 = new afw((afx) setA);
                                while (afwVar3.hasNext()) {
                                    te teVar = (te) afwVar3.next();
                                    lxq lxqVarB2 = jrx.b();
                                    List listB3 = teVar.b();
                                    ArrayList arrayList6 = arrayList4;
                                    ArrayList arrayList7 = arrayList3;
                                    int i26 = 0;
                                    while (i26 < listB3.size()) {
                                        jrw jrwVarC = ux.c((sz) listB3.get(i26));
                                        lxqVarB2.s();
                                        int i27 = i26;
                                        jrx jrxVar2 = (jrx) lxqVarB2.a;
                                        jrwVarC.getClass();
                                        afw afwVar4 = afwVar3;
                                        lye lyeVar3 = jrxVar2.visibleToPackages_;
                                        if (!lyeVar3.c()) {
                                            jrxVar2.visibleToPackages_ = lxt.A(lyeVar3);
                                        }
                                        jrxVar2.visibleToPackages_.add(jrwVarC);
                                        i26 = i27 + 1;
                                        afwVar3 = afwVar4;
                                    }
                                    afw afwVar5 = afwVar3;
                                    Set setC = teVar.c();
                                    if (!setC.isEmpty()) {
                                        afw afwVar6 = new afw((afx) setC);
                                        while (afwVar6.hasNext()) {
                                            Set set2 = (Set) afwVar6.next();
                                            lxq lxqVarS9 = jry.DEFAULT_INSTANCE.s();
                                            lxqVarS9.s();
                                            jry jryVar = (jry) lxqVarS9.a;
                                            afw afwVar7 = afwVar6;
                                            lya lyaVar = jryVar.permissions_;
                                            if (!lyaVar.c()) {
                                                jryVar.permissions_ = lxt.z(lyaVar);
                                            }
                                            lwm.l(set2, jryVar.permissions_);
                                            lxqVarB2.s();
                                            jrx jrxVar3 = (jrx) lxqVarB2.a;
                                            jry jryVar2 = (jry) lxqVarS9.o();
                                            jryVar2.getClass();
                                            lye lyeVar4 = jrxVar3.visibleToPermissions_;
                                            if (!lyeVar4.c()) {
                                                jrxVar3.visibleToPermissions_ = lxt.A(lyeVar4);
                                            }
                                            jrxVar3.visibleToPermissions_.add(jryVar2);
                                            afwVar6 = afwVar7;
                                        }
                                    }
                                    sz szVarA2 = teVar.a();
                                    if (szVarA2 != null) {
                                        lxqVarB2.v(ux.c(szVarA2));
                                    }
                                    jrx jrxVar4 = (jrx) lxqVarB2.o();
                                    lxqVarS8.s();
                                    jrv jrvVar2 = (jrv) lxqVarS8.a;
                                    jrxVar4.getClass();
                                    lye lyeVar5 = jrvVar2.visibleToConfigs_;
                                    if (!lyeVar5.c()) {
                                        jrvVar2.visibleToConfigs_ = lxt.A(lyeVar5);
                                    }
                                    jrvVar2.visibleToConfigs_.add(jrxVar4);
                                    arrayList4 = arrayList6;
                                    afwVar3 = afwVar5;
                                    arrayList3 = arrayList7;
                                }
                            }
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            sr srVarC = new sr("androidVOverlay", str7, "AndroidVOverlayType").c("visibilityProtoSerializeProperty", ((jrv) lxqVarS8.o()).n());
                            srVarC.a(0L);
                            ssVarD = srVarC.d();
                        }
                        if (ssVarD != null) {
                            arrayList5.add(ssVarD);
                        } else if (sxVar3 != null && (sxVar3.c.a() != null || !sxVar3.a().isEmpty())) {
                            try {
                                ((tv) depVar3.a).l((String) depVar3.d, "androidVOverlay", str7);
                            } catch (ts e3) {
                                if (e3.a != 6) {
                                    throw e3;
                                }
                            }
                        }
                        depVar3.c.put(sxVar2.a, sxVar2);
                    }
                    i25++;
                    arrayList4 = arrayList;
                    arrayList3 = arrayList2;
                }
                ArrayList arrayList8 = arrayList4;
                if (!arrayList8.isEmpty()) {
                    eob eobVar2 = new eob(null, null);
                    if (arrayList5.isEmpty()) {
                        eobVar = eobVar2;
                    } else {
                        eobVar = eobVar2;
                        ((tv) depVar3.a).r("VS#Pkg", (String) depVar3.d, arrayList5, eobVar, false, null, luv.UNKNOWN);
                    }
                    ((tv) depVar3.a).r("VS#Pkg", (String) depVar3.b, arrayList8, eobVar, false, null, luv.LITE);
                }
            }
            SystemClock.elapsedRealtime();
            SystemClock.elapsedRealtime();
            sv svVar = new sv(true, f.d(lvzVar3, strD), null);
            SystemClock.elapsedRealtime();
            return new Pair(svVar, lvzVar3);
        } catch (ts e4) {
            boolean z7 = lvzVar3.b() > 0 || lvzVar3.c() > 0;
            if (iB2 != 6 || z || !z7) {
                throw e4;
            }
            tp tpVarD = f.d(lvzVar3, strD);
            return new Pair(new sv(false, tpVarD, "Schema is incompatible.\n  Deleted types: " + tpVarD.a() + "\n  Incompatible types: " + tpVarD.b()), lvzVar3);
        }
    }

    private static void x(lwf lwfVar, int... iArr) throws ts {
        if (!y(lwfVar, iArr)) {
            throw new ts(a.bz(lwfVar.b()), lwfVar.message_, null);
        }
    }

    private static boolean y(lwf lwfVar, int... iArr) {
        for (int i : iArr) {
            if (i == lwfVar.b()) {
                return true;
            }
        }
        if (lwfVar.b() != 3) {
            return false;
        }
        Log.w("AppSearchImpl", "Encountered WARNING_DATA_LOSS: ".concat(String.valueOf(lwfVar.message_)));
        return true;
    }

    private final void z(long j, int i, lxq lxqVar, un unVar) throws ts {
        long j2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iB = i;
        int i2 = 0;
        int iB2 = 0;
        long j3 = j;
        while (true) {
            if (j3 == 0 || iB <= 0) {
                j2 = jElapsedRealtime;
                break;
            }
            lxq lxqVarS = ltz.DEFAULT_INSTANCE.s();
            lxqVarS.s();
            ltz ltzVar = (ltz) lxqVarS.a;
            ltzVar.bitField0_ |= 1;
            ltzVar.nextPageToken_ = j3;
            lxqVarS.s();
            ltz ltzVar2 = (ltz) lxqVarS.a;
            ltzVar2.bitField0_ |= 2;
            ltzVar2.maxResultsToRetrieveFromPage_ = iB;
            ltz ltzVar3 = (ltz) lxqVarS.o();
            boolean z = vo.a;
            IcingSearchEngineImpl icingSearchEngineImpl = this.e.a;
            byte[] bArrN = ltzVar3.n();
            icingSearchEngineImpl.a();
            lvw lvwVarB = ltk.b(IcingSearchEngineImpl.nativeGetNextPageWithRequestProto(icingSearchEngineImpl, bArrN, System.currentTimeMillis()), bArrN.length);
            lvwVarB.b();
            d(lvwVarB.d());
            int i3 = lvwVarB.responseBytes_;
            i2++;
            long j4 = lvwVarB.nextPageToken_;
            lvg lvgVarC = lxqVar.C();
            lvg lvgVarC2 = lvwVarB.c();
            lxq lxqVarT = lvg.DEFAULT_INSTANCE.t(lvgVarC);
            int iB3 = ((lvw) lxqVar.a).b() + lvwVarB.b();
            lxqVarT.s();
            lvg lvgVar = (lvg) lxqVarT.a;
            j2 = jElapsedRealtime;
            lvgVar.bitField0_ |= SemanticState.Focused;
            lvgVar.numResultsReturnedCurrentPage_ = iB3;
            int i4 = lvgVarC.numResultsWithSnippets_ + lvgVarC2.numResultsWithSnippets_;
            lxqVarT.s();
            lvg lvgVar2 = (lvg) lxqVarT.a;
            lvgVar2.bitField0_ |= SemanticState.LiveRegion;
            lvgVar2.numResultsWithSnippets_ = i4;
            int i5 = lvgVarC.latencyMs_ + lvgVarC2.latencyMs_;
            lxqVarT.s();
            lvg lvgVar3 = (lvg) lxqVarT.a;
            lvgVar3.bitField0_ |= SemanticState.ReadOnly;
            lvgVar3.latencyMs_ = i5;
            int i6 = lvgVarC.rankingLatencyMs_ + lvgVarC2.rankingLatencyMs_;
            lxqVarT.s();
            lvg lvgVar4 = (lvg) lxqVarT.a;
            lvgVar4.bitField0_ |= SemanticState.Multiline;
            lvgVar4.rankingLatencyMs_ = i6;
            int i7 = lvgVarC.documentRetrievalLatencyMs_ + lvgVarC2.documentRetrievalLatencyMs_;
            lxqVarT.s();
            lvg lvgVar5 = (lvg) lxqVarT.a;
            lvgVar5.bitField0_ |= 16384;
            lvgVar5.documentRetrievalLatencyMs_ = i7;
            int i8 = lvgVarC.lockAcquisitionLatencyMs_ + lvgVarC2.lockAcquisitionLatencyMs_;
            lxqVarT.s();
            lvg lvgVar6 = (lvg) lxqVarT.a;
            lvgVar6.bitField0_ |= 32768;
            lvgVar6.lockAcquisitionLatencyMs_ = i8;
            lxqVarT.A(lvgVarC.nativeToJavaJniLatencyMs_ + lvgVarC2.nativeToJavaJniLatencyMs_);
            int i9 = lvgVarC.javaToNativeJniLatencyMs_ + lvgVarC2.javaToNativeJniLatencyMs_;
            lxqVarT.s();
            lvg lvgVar7 = (lvg) lxqVarT.a;
            lvgVar7.bitField0_ |= 131072;
            lvgVar7.javaToNativeJniLatencyMs_ = i9;
            int i10 = lvgVarC.joinLatencyMs_ + lvgVarC2.joinLatencyMs_;
            lxqVarT.s();
            lvg lvgVar8 = (lvg) lxqVarT.a;
            lvgVar8.bitField0_ |= 524288;
            lvgVar8.joinLatencyMs_ = i10;
            int i11 = lvgVarC.numJoinedResultsReturnedCurrentPage_ + lvgVarC2.numJoinedResultsReturnedCurrentPage_;
            lxqVarT.s();
            lvg lvgVar9 = (lvg) lxqVarT.a;
            lvgVar9.bitField0_ |= 1048576;
            lvgVar9.numJoinedResultsReturnedCurrentPage_ = i11;
            int iB4 = lvgVarC2.b();
            lxqVarT.s();
            lvg lvgVar10 = (lvg) lxqVarT.a;
            lvgVar10.pageTokenType_ = iB4 - 1;
            lvgVar10.bitField0_ |= 67108864;
            int i12 = lvgVarC.numResultStatesEvicted_ + lvgVarC2.numResultStatesEvicted_;
            lxqVarT.s();
            lvg lvgVar11 = (lvg) lxqVarT.a;
            lvgVar11.bitField0_ |= 134217728;
            lvgVar11.numResultStatesEvicted_ = i12;
            lvg lvgVar12 = (lvg) lxqVarT.o();
            lxqVar.E(lvwVarB.d());
            lye lyeVar = lvwVarB.results_;
            lxqVar.s();
            lvw lvwVar = (lvw) lxqVar.a;
            lye lyeVar2 = lvwVar.results_;
            if (!lyeVar2.c()) {
                lvwVar.results_ = lxt.A(lyeVar2);
            }
            lwm.l(lyeVar, lvwVar.results_);
            lxqVar.D(lvwVarB.nextPageToken_);
            boolean z2 = lvwVarB.pageTokenNotFound_;
            lxqVar.s();
            lvw lvwVar2 = (lvw) lxqVar.a;
            lvwVar2.bitField0_ |= 16;
            lvwVar2.pageTokenNotFound_ = z2;
            lxqVar.s();
            ((lvw) lxqVar.a).e(lvgVar12);
            if (lvwVarB.b() == 0) {
                int iB5 = lvwVarB.d().b();
                ixt.P(iB5);
                Log.e("AppSearchImpl", "Got additional page with 0 results during search. This should never happen normally. GetNextPage status code: ".concat(ixt.P(iB5)));
                break;
            } else {
                iB2 += lvwVarB.b();
                iB -= lvwVarB.b();
                j3 = j4;
                jElapsedRealtime = j2;
            }
        }
        if (unVar != null) {
            unVar.i = i2;
            unVar.l = iB2;
            unVar.o = (int) (SystemClock.elapsedRealtime() - j2);
        }
    }

    public final File b(String str) throws IOException, ts {
        File file = this.o;
        File file2 = new File(file, str);
        String canonicalPath = file2.getCanonicalPath();
        String canonicalPath2 = file.getCanonicalPath();
        if (!canonicalPath2.endsWith(File.separator)) {
            canonicalPath2 = String.valueOf(canonicalPath2).concat(String.valueOf(File.separator));
        }
        if (canonicalPath.startsWith(canonicalPath2)) {
            return file2;
        }
        throw new ts(8, "Path traversal detected in blob file name: ".concat(String.valueOf(str)), null);
    }

    public final void c(String str, long j) {
        if (j != 0) {
            Map map = this.c;
            synchronized (map) {
                Set set = (Set) map.get(str);
                if (set == null || !set.contains(Long.valueOf(j))) {
                    throw new ts(8, "Package \"" + str + "\" cannot use nextPageToken: " + j, null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Lock lockWriteLock;
        ReadWriteLock readWriteLock = this.b;
        readWriteLock.writeLock().lock();
        try {
            try {
                if (this.t) {
                    lockWriteLock = readWriteLock.writeLock();
                } else {
                    q(luv.FULL, null);
                    boolean z = vo.a;
                    this.e.close();
                    xsc xscVar = this.v;
                    if (xscVar != null) {
                        Object obj = xscVar.a;
                        synchronized (obj) {
                            try {
                                ?? r3 = xscVar.b;
                                afx afxVar = new afx(r3.keySet());
                                ?? r0 = xscVar.c;
                                afxVar.addAll(r0.keySet());
                                afw afwVar = new afw(afxVar);
                                while (afwVar.hasNext()) {
                                    String str = (String) afwVar.next();
                                    synchronized (obj) {
                                        try {
                                            List list = (List) r3.remove(str);
                                            if (list != null) {
                                                int size = list.size();
                                                while (true) {
                                                    size--;
                                                    if (size < 0) {
                                                        break;
                                                    } else {
                                                        ((ty) list.get(size)).a();
                                                    }
                                                }
                                            }
                                            Map map = (Map) r0.remove(str);
                                            if (map != null) {
                                                Iterator it = map.values().iterator();
                                                while (it.hasNext()) {
                                                    ((ty) it.next()).a();
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    this.t = true;
                    lockWriteLock = this.b.writeLock();
                }
            } catch (Throwable th3) {
                this.b.writeLock().unlock();
                throw th3;
            }
        } catch (IOException | ts e) {
            Log.w("AppSearchImpl", "Error when closing AppSearchImpl.", e);
        }
        lockWriteLock.unlock();
    }

    public final void e() {
        if (this.t) {
            throw new IllegalStateException("Trying to use a closed AppSearchImpl instance.");
        }
    }

    final void f(luv luvVar) {
        DesugarAtomicReference.updateAndGet(this.u, new tu(luvVar, 0));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final void g(String str) {
        auzc auzcVar = this.j;
        azs.l(str);
        if (auzcVar.a >= Integer.MAX_VALUE) {
            Integer.valueOf(((Integer) ed.k(auzcVar.b, str, 0)).intValue() + 1).getClass();
        }
    }

    public final ss h(String str, Map map) throws Throwable {
        Throwable th;
        long jElapsedRealtime;
        SystemClock.elapsedRealtime();
        this.b.readLock().lock();
        try {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                e();
                String strConcat = ed.d("VS#Pkg", "VS#Db").concat("");
                String strD = ed.d("VS#Pkg", "VS#Db");
                List listC = f.c(map);
                ArrayList arrayList = new ArrayList(listC.size());
                for (int i = 0; i < listC.size(); i++) {
                    try {
                        String strG = ((lwj) listC.get(i)).g();
                        if (!strG.equals("*")) {
                            strG = strD.concat(String.valueOf(strG));
                        }
                        lwj lwjVar = (lwj) listC.get(i);
                        lwjVar.d(strG);
                        arrayList.add((lwk) lwjVar.o());
                    } catch (Throwable th2) {
                        th = th2;
                        j(jElapsedRealtime, SystemClock.elapsedRealtime(), 7);
                        this.b.readLock().unlock();
                        throw th;
                    }
                }
                lxq lxqVarC = luc.c();
                lxqVarC.s();
                luc lucVar = (luc) lxqVarC.a;
                lucVar.bitField0_ |= 1;
                lucVar.namespaceRequested_ = strConcat;
                lxqVarC.s();
                luc lucVar2 = (luc) lxqVarC.a;
                lucVar2.b();
                lwm.l(arrayList, lucVar2.typePropertyMasks_);
                luc lucVar3 = (luc) lxqVarC.o();
                boolean z = vo.a;
                lub lubVarA = this.e.a(strConcat, str, lucVar3);
                lubVarA.c();
                d(lubVarA.c());
                ss ssVarC = uh.c(lubVarA.b(), ed.d("VS#Pkg", "VS#Db"), this.i, this.h);
                j(jElapsedRealtime, SystemClock.elapsedRealtime(), 7);
                this.b.readLock().unlock();
                return ssVarC;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            jElapsedRealtime = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:56:0x015b  */
    public final tj i(String str, long j, un unVar) {
        un unVar2;
        long j2;
        lvw lvwVarB;
        long j3;
        un unVar3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.b.readLock().lock();
        try {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            try {
                e();
                if (unVar != null) {
                    ((un) ((un) ((un) ((un) unVar.e((int) (jElapsedRealtime2 - jElapsedRealtime))).i()).h()).f(this.p)).g(this.r);
                }
                boolean z = vo.a;
                c(str, j);
                if (j != 0) {
                    IcingSearchEngineImpl icingSearchEngineImpl = this.e.a;
                    icingSearchEngineImpl.a();
                    lvwVarB = ltk.b(IcingSearchEngineImpl.nativeGetNextPage(icingSearchEngineImpl, j, System.currentTimeMillis()), 0);
                    j3 = j;
                } else {
                    lxq lxqVarF = lvw.f();
                    lxq lxqVarC = lwf.c();
                    lxqVarC.G(2);
                    lxqVarF.E((lwf) lxqVarC.o());
                    lxqVarF.D(0L);
                    lvwVarB = (lvw) lxqVarF.o();
                    j3 = 0;
                }
                lvwVarB.b();
                d(lvwVarB.d());
                int iB = lvwVarB.c().requestedPageSize_ - lvwVarB.b();
                if (j3 != 0) {
                    try {
                        if (lvwVarB.b() <= 0 || iB <= 0) {
                            unVar3 = unVar;
                        } else {
                            lxq lxqVarG = lvw.g(lvwVarB);
                            int i = lvwVarB.responseBytes_;
                            z(lvwVarB.nextPageToken_, iB, lxqVarG, unVar);
                            unVar3 = unVar;
                            try {
                                lvwVarB = (lvw) lxqVarG.o();
                            } catch (Throwable th) {
                                th = th;
                                unVar2 = unVar3;
                                j2 = jElapsedRealtime2;
                                j(j2, SystemClock.elapsedRealtime(), 20);
                                this.b.readLock().unlock();
                                if (unVar2 != null) {
                                    unVar2.d = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        unVar3 = unVar;
                        unVar2 = unVar3;
                        j2 = jElapsedRealtime2;
                        j(j2, SystemClock.elapsedRealtime(), 20);
                        this.b.readLock().unlock();
                        if (unVar2 != null) {
                            unVar2.d = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                        }
                        throw th;
                    }
                } else {
                    unVar3 = unVar;
                }
                if (unVar3 != null) {
                    unVar3.c = t(lvwVarB.d());
                    if (j3 != 0) {
                        a.bB(lvwVarB.c(), unVar3);
                    }
                }
                if (j3 != 0 && lvwVarB.nextPageToken_ == 0) {
                    Map map = this.c;
                    synchronized (map) {
                        try {
                            Set set = (Set) map.get(str);
                            azs.l(set);
                            set.remove(Long.valueOf(j3));
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                afx afxVar = new afx(0);
                tj tjVarG = f.g(lvwVarB, this.i, this.h, afxVar);
                if (unVar3 != null) {
                    unVar3.f = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime3);
                    ((un) unVar3.d(lvwVarB.getVmLatencyMs_)).b(afxVar);
                }
                un unVar4 = unVar3;
                j(jElapsedRealtime2, SystemClock.elapsedRealtime(), 20);
                this.b.readLock().unlock();
                if (unVar4 != null) {
                    unVar4.d = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
                return tjVarG;
            } catch (Throwable th4) {
                th = th4;
                j2 = jElapsedRealtime2;
                unVar2 = unVar;
            }
        } catch (Throwable th5) {
            th = th5;
            unVar2 = unVar;
            j2 = 0;
        }
    }

    public final void j(long j, long j2, int i) {
        this.q = i;
        this.s = (int) (j2 - j);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x05f2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [long] */
    /* JADX WARN: Type inference failed for: r2v7, types: [ui] */
    public final tj k(String str, String str2, String str3, tl tlVar, un unVar) {
        long j;
        long jElapsedRealtime;
        un unVar2;
        un unVar3;
        tj tjVar;
        long jElapsedRealtime2;
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        ReadWriteLock readWriteLock = this.b;
        readWriteLock.readLock().lock();
        try {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            if (unVar != null) {
                try {
                    ((un) ((un) ((un) ((un) unVar.i()).h()).f(this.p)).g(this.r)).e((int) (jElapsedRealtime - jElapsedRealtime3));
                } catch (Throwable th) {
                    th = th;
                    j = jElapsedRealtime3;
                    j(jElapsedRealtime, SystemClock.elapsedRealtime(), 9);
                    this.b.readLock().unlock();
                    if (unVar != null) {
                        unVar.d = (int) (SystemClock.elapsedRealtime() - j);
                    }
                    throw th;
                }
            }
            e();
            List listA = tlVar.a();
            if (!listA.isEmpty() && !listA.contains(str)) {
                if (unVar != null) {
                    unVar.c = 8;
                }
                tjVar = new tj();
                j(jElapsedRealtime, SystemClock.elapsedRealtime(), 9);
                this.b.readLock().unlock();
                if (unVar != null) {
                    jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime3;
                    unVar.d = (int) jElapsedRealtime2;
                    return tjVar;
                }
                return tjVar;
            }
            try {
                Set setSingleton = Collections.singleton(ed.d(str, str2));
                eol eolVar = this.k;
                dep depVar = this.i;
                jElapsedRealtime = new ui(str3, tlVar, setSingleton, eolVar, depVar);
                if (jElapsedRealtime.a()) {
                    tjVar = new tj();
                    j = jElapsedRealtime3;
                } else {
                    long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                    lvx lvxVarB = jElapsedRealtime.b();
                    lxq lxqVarS = lvl.DEFAULT_INSTANCE.s();
                    tl tlVar2 = jElapsedRealtime.a;
                    int i = tlVar2.e;
                    lxqVarS.s();
                    lvl lvlVar = (lvl) lxqVarS.a;
                    lvlVar.bitField0_ |= 1;
                    lvlVar.numPerPage_ = i;
                    lxq lxqVarS2 = lvk.DEFAULT_INSTANCE.s();
                    lxqVarS2.s();
                    lvk lvkVar = (lvk) lxqVarS2.a;
                    lvkVar.bitField0_ |= 1;
                    lvkVar.numToSnippet_ = 0;
                    lxqVarS2.s();
                    lvk lvkVar2 = (lvk) lxqVarS2.a;
                    lvkVar2.bitField0_ |= 2;
                    lvkVar2.numMatchesPerProperty_ = 10000;
                    lxqVarS2.s();
                    lvk lvkVar3 = (lvk) lxqVarS2.a;
                    lvkVar3.bitField0_ |= 4;
                    lvkVar3.maxWindowUtf32Length_ = 0;
                    lxqVarS2.s();
                    lvk lvkVar4 = (lvk) lxqVarS2.a;
                    lvkVar4.bitField0_ |= 8;
                    lvkVar4.getEmbeddingMatchInfo_ = false;
                    lxqVarS.s();
                    lvl lvlVar2 = (lvl) lxqVarS.a;
                    lvk lvkVar5 = (lvk) lxqVarS2.o();
                    lvkVar5.getClass();
                    lvlVar2.snippetSpec_ = lvkVar5;
                    lvlVar2.bitField0_ |= 4;
                    lxqVarS.s();
                    lvl lvlVar3 = (lvl) lxqVarS.a;
                    lvlVar3.bitField0_ |= 8;
                    lvlVar3.numTotalBytesPerPageThreshold_ = Alert.DURATION_SHOW_INDEFINITELY;
                    lxqVarS.s();
                    lvl lvlVar4 = (lvl) lxqVarS.a;
                    lvlVar4.resultGroupType_ = 0;
                    lvlVar4.bitField0_ |= 16;
                    Bundle bundle = tlVar2.f;
                    Set<String> setKeySet = bundle.keySet();
                    afv afvVar = new afv(setKeySet.size());
                    Iterator<String> it = setKeySet.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        Iterator<String> it2 = it;
                        ArrayList<String> stringArrayList = bundle.getStringArrayList(next);
                        stringArrayList.getClass();
                        afvVar.put(next, stringArrayList);
                        it = it2;
                    }
                    List listC = f.c(afvVar);
                    int i2 = 0;
                    while (i2 < listC.size()) {
                        String strG = ((lwj) listC.get(i2)).g();
                        if (strG.equals("*")) {
                            lxqVarS.B((lwk) ((lwj) listC.get(i2)).o());
                        } else {
                            Iterator it3 = jElapsedRealtime.b.iterator();
                            while (it3.hasNext()) {
                                lvx lvxVar = lvxVarB;
                                String strValueOf = String.valueOf((String) it3.next());
                                j = jElapsedRealtime3;
                                String strValueOf2 = String.valueOf(strG);
                                Set set = jElapsedRealtime.c;
                                String strConcat = strValueOf.concat(strValueOf2);
                                if (set.contains(strConcat)) {
                                    lwj lwjVar = (lwj) listC.get(i2);
                                    lwjVar.d(strConcat);
                                    lxqVarS.B((lwk) lwjVar.o());
                                }
                                lvxVarB = lvxVar;
                                jElapsedRealtime3 = j;
                            }
                        }
                        try {
                            j = jElapsedRealtime3;
                            i2++;
                            lvxVarB = lvxVarB;
                            jElapsedRealtime3 = j;
                        } catch (Throwable th2) {
                            th = th2;
                            jElapsedRealtime = jElapsedRealtime;
                            j(jElapsedRealtime, SystemClock.elapsedRealtime(), 9);
                            this.b.readLock().unlock();
                            if (unVar != null) {
                                unVar.d = (int) (SystemClock.elapsedRealtime() - j);
                            }
                            throw th;
                        }
                    }
                    lvx lvxVar2 = lvxVarB;
                    j = jElapsedRealtime3;
                    lvl lvlVar5 = (lvl) lxqVarS.o();
                    lxq lxqVarS3 = lvt.DEFAULT_INSTANCE.s();
                    int iAU = a.aU(0);
                    try {
                        if (iAU == 0) {
                            throw new IllegalArgumentException("Invalid result ranking order: 0");
                        }
                        lxqVarS3.s();
                        lvt lvtVar = (lvt) lxqVarS3.a;
                        lvtVar.orderBy_ = iAU - 1;
                        lvtVar.bitField0_ |= 2;
                        lxqVarS3.s();
                        lvt lvtVar2 = (lvt) lxqVarS3.a;
                        lvtVar2.rankBy_ = 0;
                        lvtVar2.bitField0_ |= 1;
                        Bundle bundle2 = tlVar2.g;
                        Set<String> setKeySet2 = bundle2.keySet();
                        afv afvVar2 = new afv(setKeySet2.size());
                        Iterator<String> it4 = setKeySet2.iterator();
                        while (it4.hasNext()) {
                            String next2 = it4.next();
                            Bundle bundle3 = bundle2.getBundle(next2);
                            if (bundle3 != null) {
                                Set<String> setKeySet3 = bundle3.keySet();
                                Bundle bundle4 = bundle2;
                                Iterator<String> it5 = it4;
                                afv afvVar3 = new afv(setKeySet3.size());
                                for (Iterator<String> it6 = setKeySet3.iterator(); it6.hasNext(); it6 = it6) {
                                    String next3 = it6.next();
                                    afvVar3.put(next3, Double.valueOf(bundle3.getDouble(next3)));
                                }
                                afvVar2.put(next2, afvVar3);
                                bundle2 = bundle4;
                                it4 = it5;
                            }
                        }
                        azs.l(lxqVarS3);
                        Iterator it7 = afvVar2.entrySet().iterator();
                        while (it7.hasNext()) {
                            Map.Entry entry = (Map.Entry) it7.next();
                            Iterator it8 = jElapsedRealtime.b.iterator();
                            while (it8.hasNext()) {
                                String str4 = (String) it8.next();
                                String str5 = (String) entry.getKey();
                                String strValueOf3 = String.valueOf(str4);
                                String strValueOf4 = String.valueOf(str5);
                                Set set2 = jElapsedRealtime.c;
                                String strConcat2 = strValueOf3.concat(strValueOf4);
                                if (set2.contains(strConcat2)) {
                                    lxq lxqVarS4 = lwl.DEFAULT_INSTANCE.s();
                                    lxqVarS4.s();
                                    lwl lwlVar = (lwl) lxqVarS4.a;
                                    Iterator it9 = it7;
                                    lwlVar.bitField0_ |= 1;
                                    lwlVar.schemaType_ = strConcat2;
                                    Iterator it10 = ((Map) entry.getValue()).entrySet().iterator();
                                    while (it10.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it10.next();
                                        lxq lxqVarS5 = lva.DEFAULT_INSTANCE.s();
                                        Iterator it11 = it10;
                                        String str6 = (String) entry2.getKey();
                                        lxqVarS5.s();
                                        Map.Entry entry3 = entry;
                                        lva lvaVar = (lva) lxqVarS5.a;
                                        str6.getClass();
                                        Iterator it12 = it8;
                                        lvaVar.bitField0_ |= 1;
                                        lvaVar.path_ = str6;
                                        double dDoubleValue = ((Double) entry2.getValue()).doubleValue();
                                        lxqVarS5.s();
                                        lva lvaVar2 = (lva) lxqVarS5.a;
                                        lvaVar2.bitField0_ |= 2;
                                        lvaVar2.weight_ = dDoubleValue;
                                        lxqVarS4.s();
                                        lwl lwlVar2 = (lwl) lxqVarS4.a;
                                        lva lvaVar3 = (lva) lxqVarS5.o();
                                        lvaVar3.getClass();
                                        lye lyeVar = lwlVar2.propertyWeights_;
                                        if (!lyeVar.c()) {
                                            lwlVar2.propertyWeights_ = lxt.A(lyeVar);
                                        }
                                        lwlVar2.propertyWeights_.add(lvaVar3);
                                        entry = entry3;
                                        it10 = it11;
                                        it8 = it12;
                                    }
                                    Map.Entry entry4 = entry;
                                    Iterator it13 = it8;
                                    lxqVarS3.s();
                                    lvt lvtVar3 = (lvt) lxqVarS3.a;
                                    lwl lwlVar3 = (lwl) lxqVarS4.o();
                                    lwlVar3.getClass();
                                    lye lyeVar2 = lvtVar3.typePropertyWeights_;
                                    if (!lyeVar2.c()) {
                                        lvtVar3.typePropertyWeights_ = lxt.A(lyeVar2);
                                    }
                                    lvtVar3.typePropertyWeights_.add(lwlVar3);
                                    it7 = it9;
                                    entry = entry4;
                                    it8 = it13;
                                }
                            }
                        }
                        String str7 = tlVar2.h;
                        lxqVarS3.s();
                        lvt lvtVar4 = (lvt) lxqVarS3.a;
                        lvtVar4.bitField0_ |= 4;
                        lvtVar4.advancedScoringExpression_ = str7;
                        List list = tlVar2.k;
                        lxqVarS3.s();
                        lvt lvtVar5 = (lvt) lxqVarS3.a;
                        lye lyeVar3 = lvtVar5.additionalAdvancedScoringExpressions_;
                        if (!lyeVar3.c()) {
                            lvtVar5.additionalAdvancedScoringExpressions_ = lxt.A(lyeVar3);
                        }
                        lwm.l(list, lvtVar5.additionalAdvancedScoringExpressions_);
                        if (tlVar2.i.contains("SCHEMA_SCORABLE_PROPERTY_CONFIG")) {
                            lvs lvsVar = lvs.SCORABLE_PROPERTY_RANKING;
                            lxqVarS3.s();
                            lvt lvtVar6 = (lvt) lxqVarS3.a;
                            lya lyaVar = lvtVar6.scoringFeatureTypesEnabled_;
                            if (!lyaVar.c()) {
                                lvtVar6.scoringFeatureTypesEnabled_ = lxt.z(lyaVar);
                            }
                            lvtVar6.scoringFeatureTypesEnabled_.g(lvsVar.c);
                            Set set3 = jElapsedRealtime.c;
                            afv afvVar4 = new afv();
                            afw afwVar = new afw((afx) set3);
                            while (afwVar.hasNext()) {
                                String str8 = (String) afwVar.next();
                                try {
                                    String strH = ed.h(str8);
                                    Set afxVar = (Set) afvVar4.get(strH);
                                    if (afxVar == null) {
                                        afxVar = new afx(0);
                                        afvVar4.put(strH, afxVar);
                                    }
                                    afxVar.add(str8);
                                } catch (ts unused) {
                                    Log.e("AppSearchSearchSpecConv", a.bT(str8, "Prefixed schema ", " is malformed."));
                                }
                            }
                            for (Map.Entry entry5 : afvVar4.entrySet()) {
                                lxq lxqVarS6 = lvo.DEFAULT_INSTANCE.s();
                                String str9 = (String) entry5.getKey();
                                lxqVarS6.s();
                                lvo lvoVar = (lvo) lxqVarS6.a;
                                str9.getClass();
                                lvoVar.bitField0_ |= 1;
                                lvoVar.aliasSchemaType_ = str9;
                                Iterable iterable = (Iterable) entry5.getValue();
                                lxqVarS6.s();
                                lvo lvoVar2 = (lvo) lxqVarS6.a;
                                lye lyeVar4 = lvoVar2.schemaTypes_;
                                if (!lyeVar4.c()) {
                                    lvoVar2.schemaTypes_ = lxt.A(lyeVar4);
                                }
                                lwm.l(iterable, lvoVar2.schemaTypes_);
                                lxqVarS3.s();
                                lvt lvtVar7 = (lvt) lxqVarS3.a;
                                lvo lvoVar3 = (lvo) lxqVarS6.o();
                                lvoVar3.getClass();
                                lye lyeVar5 = lvtVar7.schemaTypeAliasMapProtos_;
                                if (!lyeVar5.c()) {
                                    lvtVar7.schemaTypeAliasMapProtos_ = lxt.A(lyeVar5);
                                }
                                lvtVar7.schemaTypeAliasMapProtos_.add(lvoVar3);
                            }
                        }
                        lvt lvtVar8 = (lvt) lxqVarS3.o();
                        if (unVar != null) {
                            unVar.e = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime4);
                            unVar2 = unVar;
                        } else {
                            unVar2 = null;
                        }
                        boolean z = vo.a;
                        IcingSearchEngineImpl icingSearchEngineImpl = this.e.a;
                        byte[] bArrN = lvxVar2.n();
                        byte[] bArrN2 = lvtVar8.n();
                        byte[] bArrN3 = lvlVar5.n();
                        icingSearchEngineImpl.a();
                        lvw lvwVarB = ltk.b(IcingSearchEngineImpl.nativeSearch(icingSearchEngineImpl, bArrN, bArrN2, bArrN3, System.currentTimeMillis()), bArrN.length + bArrN2.length + bArrN3.length);
                        lvwVarB.b();
                        d(lvwVarB.d());
                        if (unVar2 != null) {
                            unVar2.n = lvwVarB.c().latencyMs_;
                            unVar3 = unVar2;
                        } else {
                            unVar3 = null;
                        }
                        long j2 = lvwVarB.nextPageToken_;
                        if (j2 != 0 && lvwVarB.b() > 0 && lvwVarB.b() < lvlVar5.numPerPage_) {
                            lxq lxqVarG = lvw.g(lvwVarB);
                            int i3 = lvwVarB.responseBytes_;
                            z(j2, lvlVar5.numPerPage_ - lvwVarB.b(), lxqVarG, unVar3);
                            lvwVarB = (lvw) lxqVarG.o();
                        }
                        if (unVar3 != null) {
                            unVar3.c = t(lvwVarB.d());
                            if ((lvxVar2.bitField0_ & 8) != 0) {
                                unVar3.x = 1;
                            }
                            a.bB(lvwVarB.c(), unVar3);
                        }
                        d(lvwVarB.d());
                        long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                        afx afxVar2 = new afx(0);
                        tj tjVarG = f.g(lvwVarB, depVar, this.h, afxVar2);
                        if (unVar2 != null) {
                            unVar2.f = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime5);
                            ((un) unVar2.d(lvwVarB.getVmLatencyMs_)).b(afxVar2);
                        }
                        jElapsedRealtime = tjVarG.a;
                        if (jElapsedRealtime != 0) {
                            Map map = this.c;
                            synchronized (map) {
                                try {
                                    Set afxVar3 = (Set) map.get(str);
                                    if (afxVar3 == null) {
                                        afxVar3 = new afx(0);
                                        map.put(str, afxVar3);
                                    }
                                    afxVar3.add(Long.valueOf((long) jElapsedRealtime));
                                } catch (Throwable th3) {
                                    th = th3;
                                    while (true) {
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    }
                                }
                            }
                        }
                        tjVar = tjVarG;
                    } catch (Throwable th5) {
                        th = th5;
                        j(jElapsedRealtime, SystemClock.elapsedRealtime(), 9);
                        this.b.readLock().unlock();
                        if (unVar != null) {
                            unVar.d = (int) (SystemClock.elapsedRealtime() - j);
                        }
                        throw th;
                    }
                }
                j(jElapsedRealtime, SystemClock.elapsedRealtime(), 9);
                readWriteLock.readLock().unlock();
                if (unVar != null) {
                    jElapsedRealtime2 = SystemClock.elapsedRealtime() - j;
                    unVar.d = (int) jElapsedRealtime2;
                    return tjVar;
                }
                return tjVar;
            } catch (Throwable th6) {
                th = th6;
                j = jElapsedRealtime3;
            }
        } catch (Throwable th7) {
            th = th7;
            j = jElapsedRealtime3;
            jElapsedRealtime = 0;
        }
    }

    public final void l(String str, String str2, String str3) throws Throwable {
        Throwable th;
        long jElapsedRealtime;
        String strH;
        SystemClock.elapsedRealtime();
        this.b.writeLock().lock();
        try {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                e();
                String str4 = ed.d("VS#Pkg", str) + str2;
                ujb ujbVar = this.f;
                if (ujbVar.f("VS#Pkg")) {
                    try {
                        boolean z = vo.a;
                        lub lubVarA = this.e.a(str4, str3, n);
                        lubVarA.c();
                        d(lubVarA.c());
                        strH = ed.h(lubVarA.b().schema_);
                    } catch (Throwable th2) {
                        th = th2;
                        o(jElapsedRealtime, SystemClock.elapsedRealtime(), 8);
                        this.b.writeLock().unlock();
                        throw th;
                    }
                } else {
                    strH = null;
                }
                boolean z2 = vo.a;
                IcingSearchEngineImpl icingSearchEngineImpl = this.e.a;
                icingSearchEngineImpl.a();
                byte[] bArrNativeDelete = IcingSearchEngineImpl.nativeDelete(icingSearchEngineImpl, str4, str3);
                int i = ltk.a;
                lyo lyoVarC = ltk.c(bArrNativeDelete, ltp.c(), new lti(11));
                if (bArrNativeDelete != null) {
                    ((lxq) lyoVarC).s();
                    ltp ltpVar = (ltp) ((lxq) lyoVarC).a;
                    ltpVar.bitField0_ |= 16;
                    ltpVar.responseBytes_ = bArrNativeDelete.length;
                }
                ltp ltpVar2 = (ltp) ((lxq) lyoVarC).o();
                ltpVar2.b();
                d(ltpVar2.b());
                f(a);
                this.j.j("VS#Pkg", 1);
                if (strH != null) {
                    ujbVar.i("VS#Pkg", str);
                }
                o(jElapsedRealtime, SystemClock.elapsedRealtime(), 8);
                this.b.writeLock().unlock();
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            jElapsedRealtime = 0;
        }
    }

    public final sv m(String str, String str2, List list, List list2, Map map, boolean z, int i, ut utVar) {
        long jElapsedRealtime;
        sv svVar;
        Lock lockWriteLock;
        tv tvVar = this;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        ReadWriteLock readWriteLock = tvVar.b;
        readWriteLock.writeLock().lock();
        try {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                tvVar.e();
                if (utVar != null) {
                }
                ujb ujbVar = tvVar.f;
                try {
                    if (ujbVar.f(str)) {
                        SystemClock.elapsedRealtime();
                        Set setKeySet = tvVar.i.g(ed.d(str, str2)).keySet();
                        afv afvVar = new afv(setKeySet.size());
                        Iterator it = setKeySet.iterator();
                        while (it.hasNext()) {
                            afvVar.put(ed.h((String) it.next()), ujbVar.h(str, str2));
                        }
                        SystemClock.elapsedRealtime();
                        Pair pairW = w(str, str2, list, list2, map, z, i, utVar);
                        if (((sv) pairW.first).a) {
                            SystemClock.elapsedRealtime();
                            afv afvVar2 = new afv(list.size());
                            afx afxVar = new afx(0);
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                String str3 = ((sl) it2.next()).a;
                                afxVar.add(str3);
                                afvVar2.put(str3, ujbVar.h(str, str2));
                            }
                            SystemClock.elapsedRealtime();
                            SystemClock.elapsedRealtime();
                            lvz lvzVar = (lvz) pairW.second;
                            lye lyeVar = lvzVar.deletedSchemaTypes_;
                            for (int i2 = 0; i2 < lyeVar.size(); i2++) {
                                Set<String> set = (Set) afvVar.get(ed.h((String) lyeVar.get(i2)));
                                if (set != null) {
                                    for (String str4 : set) {
                                        ujbVar.g(str);
                                    }
                                }
                            }
                            afx afxVar2 = new afx(0);
                            v(lvzVar.newSchemaTypes_, afxVar2);
                            v(lvzVar.incompatibleSchemaTypes_, afxVar2);
                            v(lvzVar.fullyCompatibleChangedSchemaTypes_, afxVar2);
                            v(lvzVar.indexIncompatibleChangedSchemaTypes_, afxVar2);
                            v(lvzVar.joinIncompatibleChangedSchemaTypes_, afxVar2);
                            afw afwVar = new afw(afxVar);
                            while (afwVar.hasNext()) {
                                String str5 = (String) afwVar.next();
                                Set<String> set2 = (Set) afvVar.get(str5);
                                Set<String> set3 = (Set) afvVar2.get(str5);
                                if (set2 != null) {
                                    for (String str6 : set2) {
                                        if (set3 == null || !set3.contains(str6) || afxVar2.contains(str5)) {
                                            ujbVar.g(str);
                                        }
                                    }
                                }
                                if (set3 != null) {
                                    for (String str7 : set3) {
                                        if (set2 == null || !set2.contains(str7)) {
                                            ujbVar.g(str);
                                        }
                                    }
                                }
                            }
                            if (utVar != null) {
                                SystemClock.elapsedRealtime();
                            }
                            svVar = (sv) pairW.first;
                        } else {
                            svVar = (sv) pairW.first;
                        }
                        o(jElapsedRealtime, SystemClock.elapsedRealtime(), 2);
                        lockWriteLock = readWriteLock.writeLock();
                    } else {
                        svVar = (sv) w(str, str2, list, list2, map, z, i, utVar).first;
                        o(jElapsedRealtime, SystemClock.elapsedRealtime(), 2);
                        lockWriteLock = this.b.writeLock();
                    }
                    lockWriteLock.unlock();
                    return svVar;
                } catch (Throwable th) {
                    th = th;
                    tvVar = this;
                    tvVar.o(jElapsedRealtime, SystemClock.elapsedRealtime(), 2);
                    tvVar.b.writeLock().unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            jElapsedRealtime = 0;
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Map] */
    public final su n(String str, uu uuVar) throws Throwable {
        long jElapsedRealtime;
        String str2 = str;
        SystemClock.elapsedRealtime();
        this.b.readLock().lock();
        try {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                e();
                String strD = ed.d(str2, "ytoffline_appsearch");
                boolean z = vo.a;
                IcingSearchEngineImpl icingSearchEngineImpl = this.e.a;
                icingSearchEngineImpl.a();
                lud ludVarA = ltk.a(IcingSearchEngineImpl.nativeGetSchemaForDatabase(icingSearchEngineImpl, strD));
                ludVarA.c();
                x(ludVarA.c(), 2, 5);
                lvm lvmVarB = ludVarA.b();
                st stVar = new st();
                int i = 0;
                while (i < lvmVarB.b()) {
                    lvq lvqVarC = lvmVarB.c(i);
                    String str3 = lvqVarC.schemaType_;
                    String strG = ed.g(str3);
                    if (strD.equals(strG)) {
                        dep depVar = this.g;
                        azs.l(str2);
                        azs.l(str3);
                        if (uuVar.a.equals(str2)) {
                            lvp lvpVar = (lvp) lvqVarC.v();
                            ed.i(lvpVar);
                            sl slVarE = f.e(lvpVar);
                            stVar.e(lvqVarC.version_);
                            stVar.d(slVarE);
                            if (lvpVar.a() > 0) {
                                afx afxVar = new afx(lvpVar.a());
                                Iterator it = DesugarCollections.unmodifiableList(((lvq) lvpVar.a).accountProperties_).iterator();
                                while (it.hasNext()) {
                                    afxVar.add(new tb((String) it.next()));
                                }
                                String strSubstring = lvqVarC.schemaType_.substring(strG.length());
                                azs.l(strSubstring);
                                stVar.c();
                                if (stVar.a == null) {
                                    stVar.a = new afv();
                                }
                                ArrayList arrayList = new ArrayList(afxVar.c);
                                afw afwVar = new afw(afxVar);
                                while (afwVar.hasNext()) {
                                    arrayList.add(((tb) afwVar.next()).toString());
                                }
                                Set afxVar2 = (Set) stVar.a.get(strSubstring);
                                if (afxVar2 == null) {
                                    afxVar2 = new afx(0);
                                    stVar.a.put(strSubstring, afxVar2);
                                }
                                afxVar2.addAll(arrayList);
                            }
                            if (depVar != null) {
                                String strSubstring2 = lvqVarC.schemaType_.substring(strG.length());
                                sx sxVar = (sx) depVar.c.get(str3);
                                if (sxVar != null) {
                                    if (sxVar.b) {
                                        azs.l(strSubstring2);
                                        stVar.c();
                                        stVar.b(strSubstring2).f(true);
                                    }
                                    te teVar = sxVar.c;
                                    List listB = teVar.b();
                                    if (!listB.isEmpty()) {
                                        afx afxVar3 = new afx(listB);
                                        azs.l(strSubstring2);
                                        stVar.c();
                                        sw swVarB = stVar.b(strSubstring2);
                                        afw afwVar2 = new afw(afxVar3);
                                        while (afwVar2.hasNext()) {
                                            swVarB.d((sz) afwVar2.next());
                                        }
                                    }
                                    Set setC = teVar.c();
                                    if (!setC.isEmpty()) {
                                        afx afxVar4 = new afx(((afx) setC).c);
                                        afw afwVar3 = new afw((afx) setC);
                                        while (afwVar3.hasNext()) {
                                            afxVar4.add(new afx((Set) afwVar3.next()));
                                        }
                                        azs.l(strSubstring2);
                                        stVar.c();
                                        sw swVarB2 = stVar.b(strSubstring2);
                                        afw afwVar4 = new afw(afxVar4);
                                        while (afwVar4.hasNext()) {
                                            swVarB2.e((Set) afwVar4.next());
                                        }
                                    }
                                    sz szVarA = teVar.a();
                                    if (szVarA != null) {
                                        azs.l(strSubstring2);
                                        stVar.c();
                                        stVar.b(strSubstring2).g(szVarA);
                                    }
                                    Set setA = sxVar.a();
                                    if (!setA.isEmpty()) {
                                        azs.l(strSubstring2);
                                        stVar.c();
                                        sw swVarB3 = stVar.b(strSubstring2);
                                        afw afwVar5 = new afw((afx) setA);
                                        while (afwVar5.hasNext()) {
                                            swVarB3.c((te) afwVar5.next());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i++;
                    str2 = str;
                }
                su suVarA = stVar.a();
                j(jElapsedRealtime, SystemClock.elapsedRealtime(), 18);
                this.b.readLock().unlock();
                return suVarA;
            } catch (Throwable th) {
                th = th;
                j(jElapsedRealtime, SystemClock.elapsedRealtime(), 18);
                this.b.readLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jElapsedRealtime = 0;
        }
    }

    public final void o(long j, long j2, int i) {
        this.p = i;
        this.r = (int) (j2 - j);
        j(j, j2, i);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01f9  */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Map] */
    public final void p(String str, tl tlVar, Map map, up upVar) {
        long jElapsedRealtime;
        long j;
        Lock lockWriteLock;
        String str2;
        afx afxVar;
        String strH;
        tv tvVar = this;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        ReadWriteLock readWriteLock = tvVar.b;
        readWriteLock.writeLock().lock();
        try {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                tvVar.e();
                ((up) ((up) upVar.e((int) (jElapsedRealtime - jElapsedRealtime2))).f(tvVar.q)).g(tvVar.s);
                List listA = tlVar.a();
                if (listA.isEmpty() || listA.contains(str)) {
                    String strD = ed.d(str, "ytoffline_appsearch");
                    eol eolVar = tvVar.k;
                    if (eolVar.b.keySet().contains(strD)) {
                        try {
                            ui uiVar = new ui("", tlVar, Collections.singleton(strD), eolVar, tvVar.i);
                            if (uiVar.a()) {
                                tvVar.o(jElapsedRealtime, SystemClock.elapsedRealtime(), 13);
                                lockWriteLock = readWriteLock.writeLock();
                            } else {
                                lvx lvxVarB = uiVar.b();
                                ujb ujbVar = tvVar.f;
                                if (ujbVar.f(str)) {
                                    afxVar = new afx(0);
                                    lye lyeVar = lvxVarB.schemaTypeFilters_;
                                    for (int i = 0; i < lyeVar.size(); i++) {
                                        ed.h((String) lyeVar.get(i));
                                        synchronized (ujbVar.b) {
                                            try {
                                                List list = (List) ujbVar.c.get(str);
                                                if (list != null) {
                                                    if (list.size() > 0) {
                                                        vm vmVar = ((ua) list.get(0)).e;
                                                        throw null;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    str2 = null;
                                } else {
                                    str2 = null;
                                    afxVar = null;
                                }
                                boolean z = vo.a;
                                boolean z2 = true;
                                if ((afxVar == null || afxVar.isEmpty()) && map == null) {
                                    z2 = false;
                                }
                                IcingSearchEngineImpl icingSearchEngineImpl = tvVar.e.a;
                                byte[] bArrN = lvxVarB.n();
                                icingSearchEngineImpl.a();
                                byte[] bArrNativeDeleteByQuery = IcingSearchEngineImpl.nativeDeleteByQuery(icingSearchEngineImpl, bArrN, z2);
                                int length = bArrN.length;
                                int i2 = ltk.a;
                                lyo lyoVarC = ltk.c(bArrNativeDeleteByQuery, ltn.d(), new lti(12));
                                ((lxq) lyoVarC).s();
                                ltn ltnVar = (ltn) ((lxq) lyoVarC).a;
                                ltnVar.bitField0_ |= 16;
                                ltnVar.requestBytes_ = length;
                                if (bArrNativeDeleteByQuery != null) {
                                    ((lxq) lyoVarC).s();
                                    ltn ltnVar2 = (ltn) ((lxq) lyoVarC).a;
                                    ltnVar2.bitField0_ |= 32;
                                    ltnVar2.responseBytes_ = bArrNativeDeleteByQuery.length;
                                }
                                ltn ltnVar3 = (ltn) ((lxq) lyoVarC).o();
                                ltnVar3.c();
                                upVar.c = t(ltnVar3.c());
                                lto ltoVarB = ltnVar3.b();
                                azs.l(ltoVarB);
                                upVar.e = ltoVarB.latencyMs_;
                                upVar.f = 2;
                                upVar.g = ltoVarB.numDocumentsDeleted_;
                                upVar.h = ltoVarB.queryLength_;
                                upVar.i = ltoVarB.numTerms_;
                                upVar.j = ltoVarB.numNamespacesFiltered_;
                                upVar.k = ltoVarB.numSchemaTypesFiltered_;
                                upVar.l = ltoVarB.parseQueryLatencyMs_;
                                upVar.m = ltoVarB.documentRemovalLatencyMs_;
                                x(ltnVar3.c(), 2, 5);
                                tvVar.f(a);
                                tvVar.j.j(str, ltnVar3.b().numDocumentsDeleted_);
                                if (z2) {
                                    for (int i3 = 0; i3 < ltnVar3.deletedDocuments_.size(); i3++) {
                                        ltm ltmVar = (ltm) ltnVar3.deletedDocuments_.get(i3);
                                        if (map != null) {
                                            strH = ed.h(ltmVar.namespace_);
                                            Set set = (Set) map.get(strH);
                                            if (set == null) {
                                                map.put(strH, new afx(ltmVar.uris_));
                                            } else {
                                                set.addAll(ltmVar.uris_);
                                            }
                                        } else {
                                            strH = str2;
                                        }
                                        if (afxVar != null && afxVar.contains(ltmVar.schema_)) {
                                            if (strH == null) {
                                                ed.h(ltmVar.namespace_);
                                            }
                                            String strE = ed.e(ltmVar.namespace_);
                                            ed.h(ltmVar.schema_);
                                            for (int i4 = 0; i4 < ltmVar.uris_.size(); i4++) {
                                                tvVar.f.i(str, strE);
                                            }
                                        }
                                    }
                                }
                                o(jElapsedRealtime, SystemClock.elapsedRealtime(), 13);
                                lockWriteLock = this.b.writeLock();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j = jElapsedRealtime;
                            tvVar = this;
                            tvVar.o(j, SystemClock.elapsedRealtime(), 13);
                            tvVar.b.writeLock().unlock();
                            upVar.d = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime2);
                            throw th;
                        }
                    } else {
                        o(jElapsedRealtime, SystemClock.elapsedRealtime(), 13);
                        lockWriteLock = this.b.writeLock();
                    }
                } else {
                    o(jElapsedRealtime, SystemClock.elapsedRealtime(), 13);
                    lockWriteLock = this.b.writeLock();
                }
                lockWriteLock.unlock();
                upVar.d = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime2);
            } catch (Throwable th3) {
                th = th3;
                j = jElapsedRealtime;
                tvVar.o(j, SystemClock.elapsedRealtime(), 13);
                tvVar.b.writeLock().unlock();
                upVar.d = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            jElapsedRealtime = 0;
        }
    }

    public final void q(luv luvVar, tw twVar) {
        Throwable th;
        long jElapsedRealtime;
        ut utVar;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        this.b.writeLock().lock();
        try {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                e();
                if (twVar != null) {
                    try {
                        utVar = (ut) ((ut) ((ut) ((ut) ((ut) new ut().e((int) (jElapsedRealtime - jElapsedRealtime2))).f(this.q)).g(this.s)).i()).h();
                    } catch (Throwable th2) {
                        th = th2;
                        o(jElapsedRealtime, SystemClock.elapsedRealtime(), 11);
                        this.b.writeLock().unlock();
                        throw th;
                    }
                } else {
                    utVar = null;
                }
                boolean z = vo.a;
                IcingSearchEngineImpl icingSearchEngineImpl = this.e.a;
                icingSearchEngineImpl.a();
                byte[] bArrNativePersistToDisk = IcingSearchEngineImpl.nativePersistToDisk(icingSearchEngineImpl, luvVar.g);
                int i = ltk.a;
                lyo lyoVarC = ltk.c(bArrNativePersistToDisk, lut.c(), new lti(9));
                if (bArrNativePersistToDisk != null) {
                    ((lxq) lyoVarC).s();
                    lut lutVar = (lut) ((lxq) lyoVarC).a;
                    lutVar.bitField0_ |= 16;
                    lutVar.responseBytes_ = bArrNativePersistToDisk.length;
                }
                lut lutVar2 = (lut) ((lxq) lyoVarC).o();
                lutVar2.b();
                if (utVar != null) {
                    luu luuVar = lutVar2.persistStats_;
                    if (luuVar == null) {
                        luuVar = luu.DEFAULT_INSTANCE;
                    }
                    azs.l(luuVar);
                    int i2 = luuVar.persistType_;
                    int i3 = luuVar.latencyMs_;
                    int i4 = luuVar.blobStorePersistLatencyMs_;
                    int i5 = luuVar.documentStoreTotalPersistLatencyMs_;
                    int i6 = luuVar.documentStoreComponentsPersistLatencyMs_;
                    int i7 = luuVar.documentStoreChecksumUpdateLatencyMs_;
                    int i8 = luuVar.documentLogChecksumUpdateLatencyMs_;
                    int i9 = luuVar.documentLogDataSyncLatencyMs_;
                    int i10 = luuVar.schemaStorePersistLatencyMs_;
                    int i11 = luuVar.indexPersistLatencyMs_;
                    int i12 = luuVar.integerIndexPersistLatencyMs_;
                    int i13 = luuVar.qualifiedIdJoinIndexPersistLatencyMs_;
                    int i14 = luuVar.embeddingIndexPersistLatencyMs_;
                    t(lutVar2.b());
                    SystemClock.elapsedRealtime();
                }
                d(lutVar2.b());
                DesugarAtomicReference.updateAndGet(this.u, new tu(luvVar, 1));
                o(jElapsedRealtime, SystemClock.elapsedRealtime(), 11);
                this.b.writeLock().unlock();
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            jElapsedRealtime = 0;
        }
    }

    public final void r(String str, String str2, List list, eob eobVar, boolean z, tw twVar, luv luvVar) {
        ltt lttVar;
        tv tvVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ed.d(str, str2);
        if (tvVar.l != null) {
            ReadWriteLock readWriteLock = tvVar.b;
            readWriteLock.readLock().lock();
            readWriteLock.readLock().unlock();
        }
        int i = 0;
        int i2 = 0;
        while (i2 < list.size()) {
            ul ulVar = new ul(str, str2);
            ss ssVar = (ss) list.get(i2);
            String strD = ed.d(str, str2);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            lxq lxqVarV = uh.a(ssVar).v();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            ed.j(lxqVarV, strD);
            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
            ltt lttVar2 = (ltt) lxqVarV.o();
            ulVar.e = (int) (jElapsedRealtime2 - jElapsedRealtime);
            ulVar.f = (int) (jElapsedRealtime4 - jElapsedRealtime3);
            int iL = lttVar2.l(null);
            if (iL <= Alert.DURATION_SHOW_INDEFINITELY - i || arrayList.isEmpty()) {
                lttVar = lttVar2;
            } else {
                try {
                    lttVar = lttVar2;
                    try {
                        tvVar.A(str, str2, arrayList, arrayList2, eobVar, true, twVar, luv.UNKNOWN);
                    } catch (ts e) {
                        e = e;
                        Log.e("AppSearchImpl", "BatchPut failed.", e);
                    }
                } catch (ts e2) {
                    e = e2;
                    lttVar = lttVar2;
                }
                arrayList.clear();
                arrayList2.clear();
                i = 0;
            }
            arrayList.add(lttVar);
            arrayList2.add(ulVar);
            i += iL;
            i2++;
            tvVar = this;
        }
        tvVar.A(str, str2, arrayList, arrayList2, eobVar, z, twVar, luvVar);
    }

    public final void s(ut utVar) throws Throwable {
        long j;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ReadWriteLock readWriteLock = this.b;
        readWriteLock.writeLock().lock();
        long jElapsedRealtime2 = 0;
        try {
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            try {
                utVar.e((int) (jElapsedRealtime3 - jElapsedRealtime));
                boolean z = vo.a;
                IcingSearchEngineImpl icingSearchEngineImpl = this.e.a;
                icingSearchEngineImpl.a();
                byte[] bArrNativeGetOptimizeInfo = IcingSearchEngineImpl.nativeGetOptimizeInfo(icingSearchEngineImpl);
                int i = ltk.a;
                lyo lyoVarC = ltk.c(bArrNativeGetOptimizeInfo, lua.c(), new lti(10));
                if (bArrNativeGetOptimizeInfo != null) {
                    ((lxq) lyoVarC).s();
                    lua luaVar = (lua) ((lxq) lyoVarC).a;
                    luaVar.bitField0_ |= SemanticState.Hidden;
                    luaVar.responseBytes_ = bArrNativeGetOptimizeInfo.length;
                }
                lua luaVar2 = (lua) ((lxq) lyoVarC).o();
                luaVar2.b();
                d(luaVar2.b());
                int i2 = 0;
                this.d = 0;
                if (luaVar2.optimizableDocs_ >= 1000 || luaVar2.estimatedOptimizableBytes_ >= 1048576) {
                    long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                    readWriteLock.writeLock().lock();
                    try {
                        jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        long j2 = jElapsedRealtime2 - jElapsedRealtime4;
                        IcingSearchEngineImpl icingSearchEngineImpl2 = this.e.a;
                        icingSearchEngineImpl2.a();
                        byte[] bArrNativeOptimize = IcingSearchEngineImpl.nativeOptimize(icingSearchEngineImpl2);
                        lyo lyoVarC2 = ltk.c(bArrNativeOptimize, lur.c(), new lti(i2));
                        if (bArrNativeOptimize != null) {
                            ((lxq) lyoVarC2).s();
                            lur lurVar = (lur) ((lxq) lyoVarC2).a;
                            lurVar.bitField0_ |= 16;
                            lurVar.responseBytes_ = bArrNativeOptimize.length;
                        }
                        lur lurVar2 = (lur) ((lxq) lyoVarC2).o();
                        lurVar2.b();
                        t(lurVar2.b());
                        ((ut) ((ut) ((ut) ((ut) ((ut) utVar.e((int) j2)).f(this.q)).g(this.s)).i()).h()).d(lurVar2.getVmLatencyMs_);
                        lus lusVar = lurVar2.optimizeStats_;
                        if (lusVar == null) {
                            lusVar = lus.DEFAULT_INSTANCE;
                        }
                        azs.l(lusVar);
                        int i3 = lusVar.latencyMs_;
                        int i4 = lusVar.documentStoreOptimizeLatencyMs_;
                        int i5 = lusVar.indexRestorationLatencyMs_;
                        int i6 = lusVar.numOriginalDocuments_;
                        int i7 = lusVar.numDeletedDocuments_;
                        int i8 = lusVar.numExpiredDocuments_;
                        long j3 = lusVar.storageSizeBefore_;
                        long j4 = lusVar.storageSizeAfter_;
                        long j5 = lusVar.timeSinceLastOptimizeMs_;
                        int i9 = lusVar.indexRestorationMode_;
                        int i10 = lusVar.numOriginalNamespaces_;
                        int i11 = lusVar.numDeletedNamespaces_;
                        d(lurVar2.b());
                        lye lyeVar = lurVar2.blobFileNamesToRemove_;
                        while (i2 < lyeVar.size()) {
                            String str = (String) lyeVar.get(i2);
                            try {
                                File fileB = b(str);
                                if (!fileB.delete()) {
                                    Log.e("AppSearchImpl", "Cannot delete the optimized blob file: " + fileB.getName());
                                }
                            } catch (IOException | ts e) {
                                Log.e("AppSearchImpl", a.ce(str, "Path traversal/resolution error for optimized blob file to remove: "), e);
                            }
                            i2++;
                        }
                        o(jElapsedRealtime2, SystemClock.elapsedRealtime(), 10);
                        this.b.writeLock().unlock();
                    } finally {
                        o(jElapsedRealtime2, SystemClock.elapsedRealtime(), 10);
                        this.b.writeLock().unlock();
                    }
                }
                o(jElapsedRealtime3, SystemClock.elapsedRealtime(), 10);
            } catch (Throwable th) {
                th = th;
                j = jElapsedRealtime3;
                o(j, SystemClock.elapsedRealtime(), 10);
                this.b.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j = 0;
        }
    }
}
