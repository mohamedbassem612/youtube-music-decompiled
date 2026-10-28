package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.StatFs;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.media.player.exo2.platypus.EnvoyNetFetchProvider;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abxv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public abxv(Executor executor, abmt abmtVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.b = copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2 = new CopyOnWriteArraySet();
        this.c = copyOnWriteArraySet2;
        int iD = abmtVar.d() > 0 ? abmtVar.d() : 480;
        int iG = abmtVar.g() > 0 ? abmtVar.g() : 352;
        int iE = abmtVar.e() > 0 ? abmtVar.e() : 0;
        int iF = abmtVar.f() > 0 ? abmtVar.f() : 0;
        int iH = abmtVar.h() > 0 ? abmtVar.h() : 750;
        acdv acdvVar = new acdv(copyOnWriteArraySet2, copyOnWriteArraySet, new acdu(iG, iF, abmtVar.i() > 0 ? abmtVar.i() : 750), new awli(""), executor, null);
        this.a = acdvVar;
        this.d = new acdv(copyOnWriteArraySet2, copyOnWriteArraySet, new acdu(iD, iE, iH), new awli(""), executor, new tbq(acdvVar, 6));
    }

    public static void G(String str, Throwable th) {
        if (th == null) {
            zvp.a(zvn.a, zvm.B, str);
        } else {
            zvp.b(zvn.a, zvm.B, str, th);
        }
    }

    public static String I(View view) {
        if (view == null) {
            return null;
        }
        return (String) view.getTag(R.id.tooltip_registry_id);
    }

    public static Class M(oh ohVar) {
        adma admaVarD;
        if (ohVar == null) {
            admaVarD = null;
        } else {
            admaVarD = ohVar instanceof admf ? ((admf) ohVar).s : adul.d(ohVar.a);
        }
        if (admaVarD != null) {
            return admaVarD.getClass();
        }
        return null;
    }

    public static adnc U(ahto ahtoVar, oh ohVar) {
        return ahtoVar.f(M(ohVar));
    }

    private final void V(aqof aqofVar, View view) {
        if (aqofVar == null || view == null) {
            return;
        }
        aefv aefvVar = (aefv) this.b;
        aefk aefkVarM = aefvVar.m(aqofVar);
        aefkVarM.a = view;
        aefkVarM.m();
        aefvVar.c(aefkVarM.c());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    private final void W() {
        ReferenceQueue referenceQueue = (ReferenceQueue) this.d;
        for (aefp aefpVar = (aefp) referenceQueue.poll(); aefpVar != null; aefpVar = (aefp) referenceQueue.poll()) {
            ?? r2 = this.a;
            String str = aefpVar.a;
            aefp aefpVar2 = (aefp) r2.get(str);
            if (aefpVar2 != null && aefpVar2.get() == null) {
                r2.remove(str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [adcf, java.lang.Object] */
    private final void X(Object obj, Object obj2) {
        this.b.a(obj, obj2);
    }

    public static aoop e(wcn wcnVar, String str) {
        agqr it = ((agkz) wcnVar.a(str).E()).iterator();
        while (it.hasNext()) {
            try {
                return (aoop) wcnVar.g((String) it.next()).g(aoop.class).E();
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public static void f(aoop aoopVar, aamb aambVar) {
        aohk aohkVarE = aoopVar.e();
        if (aohkVarE == null || (aohkVarE.c.b & 8) == 0) {
            return;
        }
        try {
            aogq aogqVar = (aogq) aihn.parseFrom(aogq.a, aohkVarE.getOfflineStateBytes(), ExtensionRegistryLite.getGeneratedRegistry());
            if ((aogqVar.b & SemanticState.Hidden) != 0) {
                aigj aigjVar = aogqVar.k;
                if (aigjVar.E()) {
                    return;
                }
                byte[] bArrG = aigjVar.G();
                long j = aarq.a;
                aambVar.i("logging_params", bArrG);
            }
        } catch (aiik unused) {
        }
    }

    public static boolean t(vsv vsvVar) {
        HashSet hashSet = new HashSet();
        vss vssVar = vsvVar.d;
        if (vssVar == null) {
            vssVar = vss.a;
        }
        Iterator it = vssVar.b.iterator();
        while (it.hasNext()) {
            akuj akujVar = ((vst) it.next()).c;
            if (akujVar == null) {
                akujVar = akuj.b;
            }
            String strAa = tzk.aa(akujVar);
            if (ahno.aa(strAa) || !hashSet.add(strAa)) {
                return false;
            }
        }
        vsu vsuVar = vsvVar.e;
        if (vsuVar == null) {
            vsuVar = vsu.a;
        }
        Iterator it2 = vsuVar.b.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((vsx) it2.next()).b.iterator();
            while (it3.hasNext()) {
                if (!hashSet.contains((String) it3.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x012a: INVOKE (r12 I:cpf) VIRTUAL call: cpf.c():void A[MD:():void (m)] (LINE:299), block:B:52:0x012a */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0135: INVOKE (r12 I:cpf) VIRTUAL call: cpf.c():void A[MD:():void (m)] (LINE:310), block:B:56:0x0135 */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    public final elr A(Set set, String str, boolean z) {
        cvi daaVar;
        cpf cpfVarC;
        cpf cpfVarC2;
        elr elrVarJ;
        if (str == null) {
            return null;
        }
        if (z) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((jsk) it.next()).o(str, 0L, 1L)) {
                    return A(set, str, false);
                }
            }
            return null;
        }
        Object obj = this.d;
        Object obj2 = this.a;
        ?? r5 = this.c;
        elr elrVarB = B(str);
        if (elrVarB != null) {
            return elrVarB;
        }
        bye byeVarA = ((adgf) obj2).a(new yfc(set, ((zhl) obj).S().c, "CacheUtil"));
        if (B(str) == null) {
            byh byhVar = new byh();
            byhVar.a = Uri.EMPTY;
            byhVar.g = 0L;
            byhVar.h = -1L;
            byhVar.i = str;
            byi byiVarA = byhVar.a();
            try {
                byeVarA.b(byiVarA);
                bwb bwbVar = new bwb(8);
                if (byeVarA.a(bwbVar.b, 0, 8) != 8) {
                    ygf.a(byeVarA);
                    daaVar = null;
                } else {
                    if (bwbVar.i() == 440786851) {
                        daaVar = new czc();
                    } else if (bwbVar.i() == 1718909296) {
                        daaVar = new daa();
                    } else {
                        ygf.a(byeVarA);
                        daaVar = null;
                    }
                    ygf.a(byeVarA);
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                ygf.a(byeVarA);
                throw th;
            }
            if (daaVar == null) {
                ((agsj) ((agsj) ((agsj) ((agsn) zhr.a.get(zhq.CACHE)).c()).g(5000, TimeUnit.MILLISECONDS)).k("com/google/android/libraries/youtube/media/utils/MediaLog", "w", 150, "MediaLog.java")).I("Unable to sniff SegmentMap extractor", new Object[0]);
            } else {
                cpf cpfVar = new cpf(daaVar, -1, null);
                try {
                    try {
                        try {
                            cvb cvbVar = new cvb(byeVarA, byiVarA.g, byeVarA.b(byiVarA));
                            try {
                                cpfVar.b(null, -9223372036854775807L, -9223372036854775807L);
                                while (cpfVar.a() == null && cpfVar.d(cvbVar)) {
                                }
                                ygf.a(byeVarA);
                                cuz cuzVarA = cpfVar.a();
                                cpfVar.c();
                                elrVarJ = elr.J(cuzVarA);
                                if (elrVarJ != null) {
                                    return null;
                                }
                                C(str, elrVarJ);
                            } catch (Throwable th2) {
                                th = th2;
                                ygf.a(byeVarA);
                                throw th;
                            }
                        } catch (Exception e) {
                            zhr.c(zhq.CACHE, e, "Unable to sniff ChunkIndex extractor", new Object[0]);
                            cpfVarC2.c();
                            elrVarJ = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    cpfVarC.c();
                    throw th4;
                }
            }
            elrVarJ = null;
            if (elrVarJ != null) {
                return null;
            }
            C(str, elrVarJ);
        }
        return B(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final elr B(String str) {
        return (elr) this.b.get(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void C(String str, elr elrVar) {
        this.b.put(str, elrVar);
    }

    public final abxv D() {
        return new abxv((String) this.a, (Class) this.d, ((agjz) this.b).g(), ((agjz) this.c).g());
    }

    public final File E() {
        return new File(((Context) this.b).getFilesDir(), "systemhealth" + File.separator + "backgroundtask");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, mbc] */
    public final void F(String str, syk sykVar, int i, long j, boolean z, long j2, long j3, int i2) {
        if (!H() || ThreadLocalRandom.current().nextFloat() > ((vxz) this.a.io()).a(1, 45384995L, 0.0d)) {
            return;
        }
        aihf aihfVarCreateBuilder = aqhz.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aqhz aqhzVar = (aqhz) aihfVarCreateBuilder.instance;
        str.getClass();
        aqhzVar.b |= 1;
        aqhzVar.c = str;
        boolean z2 = sykVar != null;
        aihfVarCreateBuilder.copyOnWrite();
        aqhz aqhzVar2 = (aqhz) aihfVarCreateBuilder.instance;
        aqhzVar2.b |= 2;
        aqhzVar2.d = z2;
        if (i == 0) {
            aihfVarCreateBuilder.copyOnWrite();
            aqhz aqhzVar3 = (aqhz) aihfVarCreateBuilder.instance;
            aqhzVar3.e = 1;
            aqhzVar3.b |= 4;
        } else if (i == 1) {
            aihfVarCreateBuilder.copyOnWrite();
            aqhz aqhzVar4 = (aqhz) aihfVarCreateBuilder.instance;
            aqhzVar4.e = 2;
            aqhzVar4.b |= 4;
        } else if (i == 2) {
            aihfVarCreateBuilder.copyOnWrite();
            aqhz aqhzVar5 = (aqhz) aihfVarCreateBuilder.instance;
            aqhzVar5.e = 3;
            aqhzVar5.b |= 4;
        } else if (i != 3) {
            aihfVarCreateBuilder.copyOnWrite();
            aqhz aqhzVar6 = (aqhz) aihfVarCreateBuilder.instance;
            aqhzVar6.e = 0;
            aqhzVar6.b |= 4;
        } else {
            aihfVarCreateBuilder.copyOnWrite();
            aqhz aqhzVar7 = (aqhz) aihfVarCreateBuilder.instance;
            aqhzVar7.e = 4;
            aqhzVar7.b |= 4;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aqhz aqhzVar8 = (aqhz) aihfVarCreateBuilder.instance;
        aqhzVar8.b |= 8;
        aqhzVar8.f = j;
        if (z) {
            aihfVarCreateBuilder.copyOnWrite();
            aqhz aqhzVar9 = (aqhz) aihfVarCreateBuilder.instance;
            aqhzVar9.b |= 16;
            aqhzVar9.g = j2 / 1000;
            aihfVarCreateBuilder.copyOnWrite();
            aqhz aqhzVar10 = (aqhz) aihfVarCreateBuilder.instance;
            aqhzVar10.b |= 32;
            aqhzVar10.h = j3 / 1000;
            aihfVarCreateBuilder.copyOnWrite();
            aqhz aqhzVar11 = (aqhz) aihfVarCreateBuilder.instance;
            aqhzVar11.b |= 64;
            aqhzVar11.i = i2;
        }
        aihf aihfVarCreateBuilder2 = aqig.a.createBuilder();
        aihf aihfVarCreateBuilder3 = aqih.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        aqih aqihVar = (aqih) aihfVarCreateBuilder3.instance;
        aqhz aqhzVar12 = (aqhz) aihfVarCreateBuilder.build();
        aqhzVar12.getClass();
        aqihVar.i = aqhzVar12;
        aqihVar.b |= 32768;
        aihfVarCreateBuilder2.copyOnWrite();
        aqig aqigVar = (aqig) aihfVarCreateBuilder2.instance;
        aqih aqihVar2 = (aqih) aihfVarCreateBuilder3.build();
        aqihVar2.getClass();
        aqigVar.c = aqihVar2;
        aqigVar.b |= 1;
        aqig aqigVar2 = (aqig) aihfVarCreateBuilder2.build();
        try {
            OutputStream outputStreamS = tym.s(new File(E(), String.valueOf(this.d.f().toEpochMilli())));
            try {
                aqigVar2.writeTo(outputStreamS);
                outputStreamS.close();
            } catch (Throwable th) {
                try {
                    outputStreamS.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            G("Unable to save background task dump.", e);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    public final boolean H() {
        return ((vxz) this.a.io()).l(2, 45370388L, false);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    public final void J(String str, View view) {
        aqof aqofVar = null;
        String str2 = view == null ? null : (String) view.getTag(R.id.tooltip_registry_id);
        if (str2 != null && !str2.equals(str)) {
            ?? r3 = this.a;
            aefp aefpVar = (aefp) r3.get(str2);
            if (aefpVar != null && view.equals(aefpVar.get())) {
                r3.remove(str2);
            }
        }
        view.setTag(R.id.tooltip_registry_id, str);
        if (str != null && !str.isEmpty()) {
            this.a.put(str, new aefp(view, (ReferenceQueue) this.d, str));
            ?? r1 = this.c;
            Pair pair = (Pair) r1.get(str);
            if (pair == null || !((agex) pair.second).a((aqof) pair.first)) {
                r1.remove(str);
            } else {
                aqofVar = (aqof) pair.first;
            }
            V(aqofVar, view);
        }
        W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Map] */
    public final void K(aqof aqofVar, agex agexVar, boolean z) {
        ?? r0 = this.a;
        String str = aqofVar.l;
        WeakReference weakReference = (WeakReference) r0.get(str);
        View view = null;
        if (weakReference != null) {
            View view2 = (View) weakReference.get();
            if (view2 == null || !str.equals(I(view2))) {
                r0.remove(str);
            } else {
                int i = bac.a;
                if (view2.isAttachedToWindow()) {
                    view = view2;
                }
            }
        }
        if (!z || view == null || view.isDirty() || !agexVar.a(aqofVar)) {
            this.c.put(aqofVar.l, new Pair(aqofVar, agexVar));
        } else {
            V(aqofVar, view);
        }
        W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void L(String str) {
        this.c.remove(str);
        W();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [adcf, java.lang.Object] */
    public final void N(Object obj) {
        this.b.a(obj, this.a);
    }

    public final void O(JSONObject jSONObject, Object obj, String str) throws adcg {
        String strConcat = String.valueOf(str).concat((String) this.d);
        if (jSONObject.has(strConcat)) {
            Object obj2 = this.c;
            if (obj2 != null) {
                Object obj3 = ((agkj) obj2).get(jSONObject.getString(strConcat));
                if (obj3 == null) {
                    throw new adcg();
                }
                X(obj, obj3);
                return;
            }
            Object obj4 = this.a;
            if (obj4 instanceof String) {
                X(obj, jSONObject.getString(strConcat));
                return;
            }
            if (obj4 instanceof Integer) {
                X(obj, Integer.valueOf(jSONObject.getInt(strConcat)));
                return;
            }
            if (obj4 instanceof Long) {
                X(obj, Long.valueOf(jSONObject.getLong(strConcat)));
                return;
            }
            if (obj4 instanceof Float) {
                X(obj, Float.valueOf((float) jSONObject.getDouble(strConcat)));
            } else if (obj4 instanceof Double) {
                X(obj, Double.valueOf(jSONObject.getDouble(strConcat)));
            } else if (obj4 instanceof Boolean) {
                X(obj, Boolean.valueOf(jSONObject.getBoolean(strConcat)));
            }
        }
    }

    public final void P() {
        ((avmm) this.d).c(((avlh) ((abwg) this.c).r).H(new vvb(this, 13)).ak(new acae(this, 6)));
    }

    public final void Q(int i) {
        acdv acdvVar = (acdv) this.a;
        acdvVar.h(acdvVar.g(i));
    }

    public final void R(acdp acdpVar) {
        ((CopyOnWriteArraySet) this.b).add(acdpVar);
    }

    public final void S(acdp acdpVar) {
        agqr it = agkz.q(this.c, this.b).iterator();
        while (it.hasNext()) {
            ((Set) it.next()).remove(acdpVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [awmd, java.lang.Object] */
    public final abzt T(Uri uri, int i, String str) {
        Executor executor = (Executor) this.a.io();
        executor.getClass();
        zgy zgyVar = (zgy) this.d.io();
        zgyVar.getClass();
        tgr tgrVar = (tgr) this.c.io();
        tgrVar.getClass();
        vxz vxzVar = (vxz) this.b.io();
        vxzVar.getClass();
        return new abzt(executor, zgyVar, tgrVar, vxzVar, uri, i, str);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    public final long a() {
        aamc aamcVarC;
        aadc aadcVarC = ((aanb) this.c.io()).b().c();
        if (aadcVarC == null || (aamcVarC = aadcVarC.c()) == null) {
            return 0L;
        }
        return Math.max(0L, aamcVarC.a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final long b() {
        aadc aadcVarC = ((aanb) this.c.io()).b().c();
        if (aadcVarC == null) {
            return 0L;
        }
        File fileF = aadcVarC.f();
        if (fileF != null) {
            return c(fileF);
        }
        if (this.a.getBoolean("offline_use_sd_card", true)) {
            Optional optionalOfNullable = Optional.ofNullable(((aada) aadcVarC).a);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(((tqa) optionalOfNullable.get()).b());
            }
            File file = (File) optionalOfNullable.orElse(null);
            if (file != null) {
                return c(file);
            }
        }
        return nsj.d(tym.E(), ((vxu) this.d).c());
    }

    public final long c(File file) {
        return nsj.e(((vxu) this.d).c(), file);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    @Deprecated
    public final long d() {
        File fileF;
        aadc aadcVarC = ((aanb) this.c.io()).b().c();
        long blockCountLong = 0;
        if (aadcVarC == null || (fileF = aadcVarC.f()) == null) {
            return 0L;
        }
        ajvu ajvuVarC = ((vxu) this.d).c();
        if (fileF.exists()) {
            try {
                StatFs statFs = new StatFs(fileF.getAbsolutePath());
                blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            } catch (IllegalArgumentException unused) {
            }
        }
        return nsj.d(blockCountLong, ajvuVarC);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    public final zjj g(xir xirVar) {
        mbc mbcVar = (mbc) this.b.io();
        mbcVar.getClass();
        zjr zjrVar = (zjr) this.c.io();
        zjrVar.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.io();
        scheduledExecutorService.getClass();
        return new zjj(xirVar, mbcVar, zjrVar, scheduledExecutorService, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.security.Key] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.security.spec.AlgorithmParameterSpec] */
    public final synchronized String h(String str) {
        byte[] bArrDecode;
        Object obj;
        try {
            bArrDecode = Base64.decode(str, 11);
            obj = this.d;
            ((Cipher) obj).init(2, (Key) this.c, (AlgorithmParameterSpec) this.b);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
            throw new IllegalStateException(e);
        }
        return new String(((Cipher) obj).doFinal(bArrDecode), StandardCharsets.UTF_8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.security.Key] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.security.spec.AlgorithmParameterSpec] */
    public final synchronized String i(String str) {
        Object obj;
        try {
            obj = this.d;
            ((Cipher) obj).init(1, (Key) this.c, (AlgorithmParameterSpec) this.b);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
            throw new IllegalStateException(e);
        }
        return Base64.encodeToString(((Cipher) obj).doFinal(str.getBytes(StandardCharsets.UTF_8)), 11);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized String j(String str) {
        return (String) Map.EL.computeIfAbsent(this.a, str, new hpc(this, 8));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, mbc] */
    public final ypk k(byw bywVar, ypm ypmVar) {
        zjr zjrVar = (zjr) this.c;
        return new ypk(bywVar, ypmVar, this.b, (yup) this.d, (hed) this.a, zjrVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    public final List l(boolean z) {
        dij.c();
        ArrayList arrayList = new ArrayList(dij.a().j);
        ((xqw) this.b).g(arrayList, z, false);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    public final List m(boolean z, boolean z2) {
        dij.c();
        ArrayList arrayList = new ArrayList(dij.a().j);
        ((xqw) this.b).g(arrayList, z, z2);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [awmd, java.lang.Object] */
    public final synchronized ListenableFuture n(zwa zwaVar, String str) {
        ArrayList arrayList;
        Object obj;
        aihf aihfVarCreateBuilder;
        try {
            boolean zCompareAndSet = ((AtomicBoolean) this.b).compareAndSet(true, false);
            wmc wmcVar = new wmc(zwaVar, str);
            Iterable iterable = (Iterable) this.c.io();
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = iterable.iterator();
            while (true) {
                obj = this.d;
                if (!it.hasNext()) {
                    break;
                }
                wmd wmdVar = (wmd) it.next();
                if (zCompareAndSet && wmdVar.f()) {
                    if (((wkv) obj).d(wmdVar.b())) {
                        continue;
                    }
                }
                if (((wkv) obj).c(wmdVar.a())) {
                    afvx afvxVarF = ((wkv) obj).a ? afwt.f(57, wmdVar.a().name()) : trr.a;
                    try {
                        ListenableFuture listenableFutureC = wmdVar.c(wmcVar, ((wkv) obj).b(wmdVar.e()));
                        afvxVarF.a(listenableFutureC);
                        arrayList.add(listenableFutureC);
                        afvxVarF.close();
                    } catch (Throwable th) {
                        try {
                            afvxVarF.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    arrayList2.add(wmdVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(ahno.ap(new wci(wmcVar, arrayList2, 7), ((wkv) obj).b));
            }
            aihfVarCreateBuilder = InnertubeContext$InnerTubeContext.a.createBuilder();
        } catch (Throwable th3) {
            throw th3;
        }
        return arrayList.isEmpty() ? ahng.n(aihfVarCreateBuilder) : ahno.au(arrayList).k(new wci(aihfVarCreateBuilder, arrayList, 8), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    public final aihf o(zwa zwaVar, String str) {
        wkv wkvVar = (wkv) this.d;
        if (wkvVar.e(3)) {
            return (aihf) ahng.w(n(zwaVar, str));
        }
        taq.c();
        boolean zCompareAndSet = ((AtomicBoolean) this.b).compareAndSet(true, false);
        aihf aihfVarCreateBuilder = InnertubeContext$InnerTubeContext.a.createBuilder();
        for (wmd wmdVar : (Set) this.c.io()) {
            if (zCompareAndSet && wmdVar.f() && wkvVar.d(wmdVar.b())) {
                wmdVar.getClass().getName();
            } else {
                wmdVar.h(aihfVarCreateBuilder, str);
            }
        }
        return aihfVarCreateBuilder;
    }

    public final void p(wcu wcuVar) {
        if (!((agke) this.b).contains(wcuVar)) {
            throw new IllegalArgumentException();
        }
    }

    public final void q(wcu wcuVar, wcu... wcuVarArr) {
        agjz agjzVar = (agjz) this.b;
        agjzVar.h(wcuVar);
        agjzVar.i(wcuVarArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final ListenableFuture r(String str) {
        ((zs) this.a.io()).B(8, str);
        return ahng.n(ohx.b);
    }

    public final void s(omr omrVar) {
        omrVar.i((String) this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture u() {
        return ahno.ar(((syn) this.b).n(this.a.e()), new vdm(this, 7), this.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final vtk v(vun vunVar) {
        ?? r0 = this.c;
        if (r0.containsKey(vunVar)) {
            return (vtk) r0.get(vunVar);
        }
        vtk vtkVar = new vtk((vuu) this.b, vunVar);
        r0.put(vunVar, vtkVar);
        return vtkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v1, types: [bog, java.lang.Object] */
    public final void w(aoli aoliVar, vri vriVar, byte[] bArr, java.util.Map map) {
        vriVar.b(aoliVar.c == 1 ? (aoln) aoliVar.d : aoln.a);
        if ((aoliVar.b & 2) != 0) {
            wrv wrvVar = (wrv) this.c.io();
            aolk aolkVar = aoliVar.f;
            if (aolkVar == null) {
                aolkVar = aolk.a;
            }
            wrw wrwVarA = wrvVar.a();
            wrwVarA.F(aolkVar.c);
            if ((aolkVar.b & 2) != 0) {
                wrwVarA.G(aolkVar.d);
            }
            wrwVarA.a = aolkVar.e;
            wrwVarA.o(bArr);
            ajgq ajgqVarA = ajgq.a(aoliVar.h);
            if (ajgqVarA == null) {
                ajgqVarA = ajgq.ENGAGEMENT_TYPE_UNKNOWN;
            }
            wrwVarA.b = ajgqVarA;
            if (map != null && !map.isEmpty()) {
                wrwVarA.c = agkj.h(map);
            }
            taf.k(this.d, wrvVar.c(wrwVarA, this.a), new gyr((Object) this, (Object) vriVar, (aihn) aoliVar, 16), new svm(this, vriVar, 20));
        }
    }

    public final void x(Optional optional) {
        ((awli) this.c).kk(optional);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final vpq y(xgn xgnVar) {
        vxz vxzVar = (vxz) this.b.io();
        vxzVar.getClass();
        vxz vxzVar2 = (vxz) this.a.io();
        vxzVar2.getClass();
        tqj tqjVar = (tqj) this.d.io();
        tqjVar.getClass();
        xgnVar.getClass();
        return new vpq(vxzVar, vxzVar2, tqjVar, xgnVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [awmd, java.lang.Object] */
    public final tps z(agek agekVar, sya syaVar, MessageLite messageLite) {
        ((Context) this.c.io()).getClass();
        tao taoVar = (tao) this.b.io();
        taoVar.getClass();
        Executor executor = (Executor) this.d.io();
        executor.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) this.a.io();
        sharedPreferences.getClass();
        messageLite.getClass();
        return new tps(taoVar, executor, sharedPreferences, agekVar, syaVar, messageLite);
    }

    public abxv(ahex ahexVar, hed hedVar, hed hedVar2, awmd awmdVar) {
        this.c = ahexVar;
        this.b = hedVar;
        this.d = hedVar2;
        this.a = awmdVar;
    }

    public abxv(Context context, syn synVar, zwb zwbVar, Executor executor) {
        this.d = context;
        this.b = synVar;
        this.a = zwbVar;
        this.c = executor;
    }

    public abxv(SharedPreferences sharedPreferences, vxu vxuVar, zwb zwbVar, awmd awmdVar) {
        this.a = sharedPreferences;
        this.d = vxuVar;
        this.b = zwbVar;
        this.c = awmdVar;
    }

    public abxv(awmd awmdVar, Executor executor, vxe vxeVar, bog bogVar) {
        this.c = awmdVar;
        this.a = executor;
        this.b = vxeVar;
        this.d = bogVar;
    }

    public abxv(Object obj, Object obj2, Object obj3, Object obj4) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
        this.d = obj4;
    }

    public abxv(String str, Object obj, adcf adcfVar, agkj agkjVar) {
        this.d = str;
        this.a = obj;
        this.b = adcfVar;
        this.c = agkjVar;
    }

    public abxv(mbc mbcVar, aaqg aaqgVar, aaek aaekVar, vyo vyoVar) {
        this.a = mbcVar;
        this.c = aaqgVar;
        this.b = aaekVar;
        this.d = vyoVar;
    }

    public abxv(mbc mbcVar, yup yupVar, hed hedVar, zjr zjrVar) {
        this.b = mbcVar;
        this.d = yupVar;
        this.a = hedVar;
        this.c = zjrVar;
    }

    public abxv() {
        this.d = new ahto((byte[]) null);
        this.c = new ahto((byte[]) null);
        this.b = new ahto((byte[]) null);
        this.a = new ahto((byte[]) null);
    }

    public abxv(abxv abxvVar, vxz vxzVar) {
        this.d = new ArrayDeque();
        this.b = DesugarCollections.synchronizedMap(new vvh());
        this.a = abxvVar;
        this.c = vxzVar;
    }

    public abxv(Context context, vuu vuuVar, axfd axfdVar) {
        this.d = context;
        this.b = vuuVar;
        this.a = axfdVar;
        this.c = new HashMap();
    }

    public abxv(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        awmdVar.getClass();
        this.d = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
    }

    public abxv(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, byte[] bArr, byte[] bArr2, char[] cArr) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
    }

    public abxv(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, byte[] bArr, char[] cArr) {
        awmdVar.getClass();
        this.d = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
    }

    public abxv(zjr zjrVar, adgf adgfVar, awmd awmdVar) {
        int iE = zjrVar.E() > 0 ? (int) zjrVar.E() : 10;
        this.b = DesugarCollections.synchronizedMap(new yft(iE, iE));
        this.d = zjrVar;
        this.a = adgfVar;
        this.c = awmdVar;
    }

    public abxv(avlh avlhVar, isi isiVar, abfv abfvVar) {
        avlhVar.getClass();
        this.a = avlhVar;
        this.b = isiVar;
        this.c = abfvVar;
        avmm avmmVar = new avmm();
        this.d = avmmVar;
        int i = 10;
        avmmVar.c(avlhVar.M(abxf.class).al(new abwz(new dmf((Object) this, 9, (short[][]) null), 7), new abwz(new xzn(i), 8)));
        avmmVar.c(avlhVar.M(abxe.class).al(new abwz(new dmf(this, 10, (int[][]) null), 9), new abwz(new xzn(11), i)));
    }

    public abxv(awmd awmdVar, afvq afvqVar, awut awutVar) {
        awmdVar.getClass();
        afvqVar.getClass();
        awutVar.getClass();
        this.d = awmdVar;
        this.a = afvqVar;
        this.b = awutVar;
        this.c = new ConcurrentHashMap();
    }

    public abxv(Cipher cipher, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, zjr zjrVar) {
        this.d = cipher;
        this.c = secretKeySpec;
        this.b = ivParameterSpec;
        int iE = zjrVar.E() > 0 ? (int) zjrVar.E() : 10;
        this.a = new yfy(iE, iE);
    }

    public abxv(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, char[] cArr, byte[] bArr) {
        this.c = awmdVar;
        this.b = awmdVar2;
        this.a = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
    }

    public abxv(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, int[] iArr) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        this.b = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
    }

    public abxv(Class cls, String str) {
        this.b = new agjz(4);
        this.c = new agjz(4);
        this.d = cls;
        this.a = str;
    }

    public abxv(wbz wbzVar, zwb zwbVar) {
        this.d = wbzVar;
        this.b = zwbVar;
        awli awliVar = new awli(Optional.empty());
        this.c = awliVar;
        this.a = awliVar.r().X(new hby(this, 17)).K(new tfk(7)).r().S();
    }

    public abxv(String str, Class cls, agke agkeVar, agke agkeVar2) {
        if (!str.startsWith("QT_") || !str.matches("\\w+")) {
            throw new IllegalArgumentException();
        }
        if (((agpi) agkeVar2).d <= 0) {
            this.a = str;
            this.d = cls;
            this.b = agkeVar;
            this.c = agkeVar2;
            return;
        }
        throw null;
    }

    public abxv(zjr zjrVar, xeu xeuVar, hhb hhbVar, EnvoyNetFetchProvider envoyNetFetchProvider) {
        zjrVar.getClass();
        xeuVar.getClass();
        hhbVar.getClass();
        envoyNetFetchProvider.getClass();
        this.a = zjrVar;
        this.b = xeuVar;
        this.d = hhbVar;
        this.c = envoyNetFetchProvider;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Set] */
    public abxv(aefv aefvVar, ci ciVar, ci ciVar2) {
        this.b = aefvVar;
        this.c = new HashMap();
        this.a = new HashMap();
        this.d = new ReferenceQueue();
        ciVar.a.add(this);
        ciVar2.a.add(this);
        aefvVar.d(new aefo(this));
    }

    public abxv(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, char[] cArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
    }

    public abxv(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, byte[] bArr, short[] sArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
    }

    @Deprecated
    public abxv(awmd awmdVar) {
        this.b = new AtomicBoolean(true);
        this.c = awmdVar;
        this.d = new wkv(false, 0, 0L, 0L, MoreExecutors.directExecutor());
        this.a = null;
    }

    public abxv(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.c = awmdVar4;
    }

    public abxv(awmd awmdVar, wkv wkvVar, awmd awmdVar2) {
        this.b = new AtomicBoolean(true);
        awmdVar.getClass();
        this.c = awmdVar;
        this.d = wkvVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
    }

    public abxv(agfr agfrVar, abnc abncVar, abwg abwgVar) {
        this.a = agfrVar;
        this.b = abncVar;
        this.c = abwgVar;
        this.d = new avmm();
    }

    public abxv(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.c = awmdVar4;
    }

    public abxv(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, short[] sArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.c = awmdVar4;
    }

    public abxv(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, byte[] bArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
        this.d = awmdVar4;
    }

    public abxv(awmd awmdVar, xqw xqwVar, ahex ahexVar, Executor executor) {
        awmdVar.getClass();
        this.c = awmdVar;
        this.b = xqwVar;
        this.d = ahexVar;
        this.a = executor;
    }
}
