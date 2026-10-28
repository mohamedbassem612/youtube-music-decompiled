package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import j$.time.Instant;
import j$.util.stream.IntStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uwz implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public uwz(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [wje] */
    /* JADX WARN: Type inference failed for: r1v20, types: [wjh] */
    /* JADX WARN: Type inference failed for: r1v8, types: [wgj] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object wjeVar;
        ?? wjeVar2;
        Object unbVar;
        agkz agkzVar;
        StreamingDataOuterClass$StreamingData defaultInstance;
        uxb uxbVar = null;
        uxbVar = null;
        alvw alvwVar = null;
        try {
            switch (this.$cid) {
                case 0:
                    uxbVar = new uxb();
                    int i = parcel.readInt();
                    while (i != -1) {
                        uxbVar.c(parcel.readFloat(), arfu.values()[i]);
                        i = parcel.readInt();
                    }
                    return uxbVar;
                case 1:
                    int i2 = parcel.readInt();
                    float f = parcel.readFloat();
                    int i3 = parcel.readInt();
                    int i4 = parcel.readInt();
                    int i5 = parcel.readInt();
                    int i6 = parcel.readInt();
                    int i7 = parcel.readInt();
                    ufs ufsVar = (ufs) Enum.valueOf(ufs.class, parcel.readString());
                    audb audbVar = parcel.readInt() == 0 ? (audb) Enum.valueOf(audb.class, parcel.readString()) : null;
                    boolean z = parcel.readInt() == 1;
                    uqc uqcVar = parcel.readInt() == 0 ? (uqc) ahng.aB(parcel, uqc.a, ExtensionRegistryLite.getGeneratedRegistry()) : null;
                    boolean z2 = i7 == 1;
                    boolean z3 = i6 == 1;
                    boolean z4 = i5 == 1;
                    unbVar = new unb(i2 == 1, f, i3 == 1, i4 == 1, z4, z3, z2, ufsVar, audbVar, z, uqcVar);
                    return unbVar;
                case 2:
                    return new uxp(parcel);
                case 3:
                    return new vci(parcel);
                case 4:
                    wjeVar = new wgc((alxi) wjr.E(parcel, alxi.a));
                    return wjeVar;
                case 5:
                    wjeVar = new wgi((amae) wjr.E(parcel, amae.a));
                    return wjeVar;
                case 6:
                    wjeVar2 = new wgj((aisu) tym.t(parcel, aisu.a));
                    return wjeVar2;
                case 7:
                    return new wgk((allc) ahng.aB(parcel, allc.a, ExtensionRegistryLite.getGeneratedRegistry()), parcel.readLong());
                case 8:
                    return new wiv(parcel.readInt());
                case 9:
                    int i8 = parcel.readInt();
                    int i9 = parcel.readInt();
                    String string = parcel.readString();
                    int i10 = parcel.readInt();
                    int i11 = parcel.readInt();
                    if (i11 != 0) {
                        int[] iArr = new int[i11];
                        parcel.readIntArray(iArr);
                        agkzVar = (agkz) IntStream.CC.of(iArr).boxed().collect(aghu.b);
                    } else {
                        agkzVar = agpr.a;
                    }
                    agkz agkzVar2 = agkzVar;
                    aipc aipcVarA = aipc.a(i9);
                    if (aipcVarA == null) {
                        aipcVarA = aipc.QUALITY_ORDINAL_UNKNOWN;
                    }
                    unbVar = new wiw(i8, aipcVarA, string, i10 == 1, agkzVar2);
                    return unbVar;
                case 10:
                    try {
                        defaultInstance = (StreamingDataOuterClass$StreamingData) tym.t(parcel, StreamingDataOuterClass$StreamingData.getDefaultInstance());
                        break;
                    } catch (IllegalArgumentException e) {
                        ((agrc) ((agrc) ((agrc) wja.a.b()).j(e)).k("com/google/android/libraries/youtube/innertube/model/media/VideoStreamingData$1", "createFromParcel", (char) 1184, "VideoStreamingData.java")).t("Error reading streaming data");
                        defaultInstance = null;
                    }
                    if (defaultInstance == null) {
                        defaultInstance = StreamingDataOuterClass$StreamingData.getDefaultInstance();
                    }
                    StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = defaultInstance;
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    if (bArrCreateByteArray == null) {
                        bArrCreateByteArray = aigj.d.G();
                    }
                    byte[] bArr = bArrCreateByteArray;
                    wiv wivVar = (wiv) wiv.CREATOR.createFromParcel(parcel);
                    String string2 = parcel.readString();
                    long j = parcel.readLong();
                    long j2 = parcel.readLong();
                    long j3 = parcel.readLong();
                    int i12 = parcel.readInt();
                    amwn amwnVarA = amwn.a(parcel.readInt());
                    if (amwnVarA == null) {
                        amwnVarA = amwn.MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN;
                    }
                    amwn amwnVar = amwnVarA;
                    String strZ = ahno.Z(parcel.readString());
                    agrf agrfVar = wja.a;
                    int i13 = parcel.readInt();
                    boolean zV = tym.v(parcel);
                    try {
                        alvwVar = (alvw) tym.t(parcel, alvw.a);
                    } catch (IllegalArgumentException e2) {
                        ((agrc) ((agrc) ((agrc) wja.a.b()).j(e2)).k("com/google/android/libraries/youtube/innertube/model/media/VideoStreamingData$1", "createFromParcel", (char) 1215, "VideoStreamingData.java")).t("Error reading video details");
                    }
                    if (alvwVar == null || alvwVar.c.isEmpty()) {
                        aihf aihfVarCreateBuilder = alvw.a.createBuilder();
                        String strZ2 = ahno.Z(string2);
                        aihfVarCreateBuilder.copyOnWrite();
                        alvw alvwVar2 = (alvw) aihfVarCreateBuilder.instance;
                        alvwVar2.b |= 1;
                        alvwVar2.c = strZ2;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        aihfVarCreateBuilder.copyOnWrite();
                        alvw alvwVar3 = (alvw) aihfVarCreateBuilder.instance;
                        alvwVar3.b |= 4;
                        alvwVar3.e = j / 1000;
                        aihfVarCreateBuilder.copyOnWrite();
                        alvw alvwVar4 = (alvw) aihfVarCreateBuilder.instance;
                        alvwVar4.b |= SemanticState.Multiline;
                        alvwVar4.l = i12;
                        aihfVarCreateBuilder.copyOnWrite();
                        alvw alvwVar5 = (alvw) aihfVarCreateBuilder.instance;
                        alvwVar5.k = amwnVar.e;
                        alvwVar5.b |= SemanticState.Obscured;
                        alvwVar = (alvw) aihfVarCreateBuilder.build();
                    }
                    return new wja(streamingDataOuterClass$StreamingData, alvwVar, bArr, null, j2, j3, wivVar, strZ, i13, zV, tym.v(parcel), null, tym.v(parcel), tym.v(parcel));
                case 11:
                    return new wjc((jrg) tym.t(parcel, jrg.a));
                case 12:
                    aigj aigjVar = (aigj) parcel.readSerializable();
                    int i14 = parcel.readInt();
                    aihf aihfVarCreateBuilder2 = aora.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    aora aoraVar = (aora) aihfVarCreateBuilder2.instance;
                    aigjVar.getClass();
                    aoraVar.b |= 1;
                    aoraVar.c = aigjVar;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aora aoraVar2 = (aora) aihfVarCreateBuilder2.instance;
                    aoraVar2.b |= 2;
                    aoraVar2.d = i14;
                    return new wjd((aora) aihfVarCreateBuilder2.build());
                case 13:
                    try {
                        byte[] bArr2 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr2);
                        wjeVar2 = new wje((alvm) aihn.parseFrom(alvm.a, bArr2));
                        return wjeVar2;
                    } catch (aiik unused) {
                        wjeVar = new wje(null);
                    }
                    break;
                case 14:
                    alvt alvtVar = (alvt) wjr.E(parcel, alvt.a);
                    if (alvtVar != null) {
                        long j4 = parcel.readLong();
                        wjg wjgVar = new wjg();
                        wjgVar.b = alvtVar;
                        wjgVar.b(j4);
                        wjgVar.g = (wja) parcel.readParcelable(wja.class.getClassLoader());
                        wjgVar.d = (wjh) parcel.readParcelable(wjh.class.getClassLoader());
                        long j5 = parcel.readLong();
                        if (j5 != -1) {
                            wjgVar.c = Instant.ofEpochMilli(j5);
                        }
                        return wjgVar.a();
                    }
                    return uxbVar;
                case 15:
                    HashMap hashMap = parcel.readHashMap(Boolean.class.getClassLoader());
                    HashMap hashMap2 = parcel.readHashMap(Long.class.getClassLoader());
                    HashMap hashMap3 = parcel.readHashMap(String.class.getClassLoader());
                    wjeVar2 = new wjh(new tnb((ainp) wjr.E(parcel, ainp.a)));
                    if (hashMap != null) {
                        for (Map.Entry entry : hashMap.entrySet()) {
                            wjeVar2.b((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                        }
                    }
                    if (hashMap2 != null) {
                        for (Map.Entry entry2 : hashMap2.entrySet()) {
                            wjeVar2.c((String) entry2.getKey(), ((Long) entry2.getValue()).longValue());
                        }
                    }
                    if (hashMap3 != null) {
                        for (Map.Entry entry3 : hashMap3.entrySet()) {
                            wjeVar2.d((String) entry3.getKey(), (String) entry3.getValue());
                        }
                    }
                    return wjeVar2;
                case 16:
                    return new wjm((jrl) tym.t(parcel, jrl.a));
                case 17:
                    return new wjn((arhk) tym.t(parcel, arhk.a));
                case 18:
                    return new wxz(parcel);
                case 19:
                    return new wya(parcel);
                default:
                    xgr xgrVar = new xgr();
                    xgrVar.d((argn) tym.t(parcel, argn.a));
                    xgrVar.c((atqd) tym.t(parcel, atqd.a));
                    xgrVar.b();
                    return xgrVar.a();
            }
        } catch (aiik | IllegalArgumentException | RuntimeException unused2) {
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new uxb[i];
            case 1:
                return new unb[i];
            case 2:
                return new uxp[i];
            case 3:
                return new vci[i];
            case 4:
                return new wgc[i];
            case 5:
                return new wgi[i];
            case 6:
                return new wgj[i];
            case 7:
                return new wgk[i];
            case 8:
                return new wiv[i];
            case 9:
                return new wiw[i];
            case 10:
                return new wja[i];
            case 11:
                return new wjc[i];
            case 12:
                return new wjd[i];
            case 13:
                return new wje[i];
            case 14:
                return new wjf[i];
            case 15:
                return new wjh[i];
            case 16:
                return new wjm[i];
            case 17:
                return new wjn[i];
            case 18:
                return new wxz[i];
            case 19:
                return new wya[i];
            default:
                return new xgs[i];
        }
    }
}
