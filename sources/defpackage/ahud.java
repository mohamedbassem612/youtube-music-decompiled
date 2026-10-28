package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahud {
    public static volatile ahud a;
    public static ahud c;
    public final Object b;

    public ahud(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || e()) {
                return;
            }
            c();
        } catch (IOException unused) {
        }
    }

    public static int R(axqr axqrVar, Object obj, Object obj2) {
        return aiha.a((aika) axqrVar.a, 1, obj) + aiha.a((aika) axqrVar.b, 2, obj2);
    }

    public static void S(aigs aigsVar, axqr axqrVar, Object obj, Object obj2) {
        aiha.g(aigsVar, (aika) axqrVar.a, 1, obj);
        aiha.g(aigsVar, (aika) axqrVar.b, 2, obj2);
    }

    private static final String af(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    private final synchronized void ag() {
        ?? r0 = this.b;
        if (r0.peek() == null || ((Animator) r0.peek()).isStarted()) {
            return;
        }
        ((Animator) r0.peek()).start();
    }

    public final void A(int i, long j) {
        ((aigs) this.b).m(i, j);
    }

    public final void B(int i, float f) {
        ((aigs) this.b).S(i, f);
    }

    public final void C(int i, Object obj, aijg aijgVar) {
        aigs aigsVar = (aigs) this.b;
        aigsVar.w(i, 3);
        aijgVar.m((aifs) obj, this);
        aigsVar.w(i, 4);
    }

    public final void D(int i, int i2) {
        ((aigs) this.b).o(i, i2);
    }

    public final void E(int i, long j) {
        ((aigs) this.b).z(i, j);
    }

    public final void F(int i, Object obj, aijg aijgVar) {
        aifs aifsVar = (aifs) obj;
        aigs aigsVar = (aigs) this.b;
        aigsVar.w(i, 2);
        aigsVar.y(aifsVar.getSerializedSize(aijgVar));
        aijgVar.m(aifsVar, this);
    }

    public final void G(int i, Object obj) {
        boolean z = obj instanceof aigj;
        Object obj2 = this.b;
        if (z) {
            ((aigs) obj2).t(i, (aigj) obj);
        } else {
            ((aigs) obj2).s(i, (MessageLite) obj);
        }
    }

    public final void H(int i, int i2) {
        ((aigs) this.b).k(i, i2);
    }

    public final void I(int i, long j) {
        ((aigs) this.b).m(i, j);
    }

    public final void J(int i, int i2) {
        ((aigs) this.b).x(i, (i2 << 1) ^ (i2 >> 31));
    }

    public final void K(int i, long j) {
        ((aigs) this.b).z(i, (j << 1) ^ (j >> 63));
    }

    public final void L(int i, String str) {
        ((aigs) this.b).u(i, str);
    }

    public final void M(int i, int i2) {
        ((aigs) this.b).x(i, i2);
    }

    public final void N(int i, long j) {
        ((aigs) this.b).z(i, j);
    }

    public final /* synthetic */ aiay O() {
        aihn aihnVarBuild = ((aihf) this.b).build();
        aihnVarBuild.getClass();
        return (aiay) aihnVarBuild;
    }

    public final aica P() {
        aica aicaVar = ((aiay) ((aihf) this.b).instance).d;
        if (aicaVar == null) {
            aicaVar = aica.a;
        }
        aicaVar.getClass();
        return aicaVar;
    }

    public final void Q(aica aicaVar) {
        aihf aihfVar = (aihf) this.b;
        aihfVar.copyOnWrite();
        aiay aiayVar = (aiay) aihfVar.instance;
        aiay aiayVar2 = aiay.a;
        aiayVar.d = aicaVar;
        aiayVar.b |= 2;
    }

    public final ListenableFuture T(ahcx ahcxVar, Executor executor) {
        long j = afwl.a;
        return ((auor) this.b).d(new afwh(afty.c(false), ahcxVar, 0), executor);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bpp, java.lang.Object] */
    public final bpn U(affd affdVar) {
        return new bpn((bpp) this.b, new afpv(this, affdVar));
    }

    public final Object V(affd affdVar) {
        return aguu.ax(affdVar, (cc) this.b).a.generatedComponent();
    }

    public final awou W(ScheduledExecutorService scheduledExecutorService) {
        awou awouVarPlus;
        Boolean.TRUE.booleanValue();
        if (((Boolean) ((agev) this.b).e(Boolean.FALSE)).booleanValue()) {
            awouVarPlus = new awvw(new afmj(scheduledExecutorService)).plus(afme.a);
        } else {
            afmc afmcVar = new afmc(scheduledExecutorService);
            awouVarPlus = new awvw(afmcVar).plus(afmcVar);
        }
        return awouVarPlus.plus(new afwr(new ahno(), false, false));
    }

    public final affd X() {
        return (affd) ((ahud) this.b).b;
    }

    public final void Y(aepw aepwVar) {
        ((awli) this.b).kk(aepwVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void Z(Animator animator) {
        Animator animatorClone = animator.clone();
        while (true) {
            ?? r0 = this.b;
            if (r0.isEmpty()) {
                animatorClone.addListener(new vgm(this, 4));
                r0.add(animatorClone);
                ag();
            } else {
                ((Animator) r0.peek()).cancel();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    final Set a() {
        Set setUnmodifiableSet;
        ?? r1 = this.b;
        synchronized (r1) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(r1);
        }
        return setUnmodifiableSet;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void aa(Animator animator) {
        Animator animatorClone = animator.clone();
        animatorClone.addListener(new vgm(this, 4));
        this.b.add(animatorClone);
        ag();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void ab(Animator animator) {
        ?? r0 = this.b;
        if (r0.peek() != animator) {
            return;
        }
        r0.remove();
        ag();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final adlw ac(View view, adlu adluVar) {
        vxe vxeVar = (vxe) this.b.io();
        vxeVar.getClass();
        view.getClass();
        return new adlw(vxeVar, view, adluVar);
    }

    public final void ad(RecyclerView recyclerView, xgn xgnVar) {
        aeqf aeqfVar = new aeqf();
        aeqfVar.b(xgnVar);
        ((aepz) this.b).m(recyclerView, aeqfVar.a());
    }

    public final void ae(RecyclerView recyclerView) {
        ((aepz) this.b).o(recyclerView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized ahtk b(String str, String str2) {
        ahtk ahtkVar;
        try {
            ?? r0 = this.b;
            String strAf = af(str, str2);
            ahtkVar = null;
            String string = r0.getString(strAf, null);
            long j = ahtk.a;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        ahtkVar = new ahtk(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                    } catch (JSONException e) {
                        Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e.toString()));
                    }
                } else {
                    ahtkVar = new ahtk(string, null, 0L);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return ahtkVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void c() {
        this.b.edit().clear().commit();
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void d(String str, String str2, String str3, String str4) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = ahtk.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str3);
            jSONObject.put("appVersion", str4);
            jSONObject.put("timestamp", jCurrentTimeMillis);
            string = jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e.toString()));
            string = null;
        }
        if (string == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putString(af(str, str2), string);
        editorEdit.commit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized boolean e() {
        return this.b.getAll().isEmpty();
    }

    public final /* synthetic */ aiaz f() {
        aihn aihnVarBuild = ((aihf) this.b).build();
        aihnVarBuild.getClass();
        return (aiaz) aihnVarBuild;
    }

    public final /* synthetic */ aikl g() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((aiaz) ((aihf) this.b).instance).f);
        listUnmodifiableList.getClass();
        return new aikl(listUnmodifiableList);
    }

    public final /* synthetic */ void h(Iterable iterable) {
        iterable.getClass();
        aihf aihfVar = (aihf) this.b;
        aihfVar.copyOnWrite();
        aiaz aiazVar = (aiaz) aihfVar.instance;
        aiaz aiazVar2 = aiaz.a;
        aiazVar.a();
        aifs.addAll(iterable, aiazVar.f);
    }

    public final /* synthetic */ void i() {
        aihf aihfVar = (aihf) this.b;
        aihfVar.copyOnWrite();
        aiaz aiazVar = (aiaz) aihfVar.instance;
        aiaz aiazVar2 = aiaz.a;
        aiazVar.f = aiaz.emptyProtobufList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Object obj, Executor executor) {
        if (obj != 0) {
            ((ahde) this.b).b(obj, executor);
        }
    }

    public final ListenableFuture k(Callable callable, Executor executor) {
        long j = afwl.a;
        callable.getClass();
        return ((ahek) this.b).a(new ahcz(afty.c(false), callable, 1), executor);
    }

    public final ListenableFuture l(ahcx ahcxVar, Executor executor) {
        long j = afwl.a;
        return ((ahek) this.b).b(new afwh(afty.c(false), ahcxVar, 0), executor);
    }

    public final ListenableFuture m(Runnable runnable, Executor executor) {
        return ((ahek) this.b).c(afwl.i(runnable), executor);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized boolean n(int i) {
        ?? r0 = this.b;
        if (r0.size() >= 256) {
            return false;
        }
        r0.add(Integer.valueOf(i));
        return true;
    }

    public final int o() {
        long j = ((axdr) ((awtr) this.b).a).b.b;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object p() {
        while (true) {
            awtr awtrVar = (awtr) this.b;
            axdr axdrVar = (axdr) awtrVar.a;
            Object objB = axdrVar.b();
            if (objB != axdr.a) {
                return objB;
            }
            awtrVar.d(axdrVar, axdrVar.c());
        }
    }

    public final void q() {
        while (true) {
            awtr awtrVar = (awtr) this.b;
            axdr axdrVar = (axdr) awtrVar.a;
            if (axdrVar.d()) {
                return;
            } else {
                awtrVar.d(axdrVar, axdrVar.c());
            }
        }
    }

    public final boolean r(Object obj) {
        while (true) {
            awtr awtrVar = (awtr) this.b;
            axdr axdrVar = (axdr) awtrVar.a;
            int iA = axdrVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return false;
            }
            awtrVar.d(axdrVar, axdrVar.c());
        }
    }

    public final awtr s(int i) {
        return ((awtr[]) this.b)[i];
    }

    public final synchronized void t(float[] fArr) {
        System.arraycopy(this.b, 0, fArr, 0, 4);
    }

    public final synchronized void u(float[] fArr) {
        double d = fArr[0];
        double d2 = fArr[5];
        double d3 = fArr[10];
        double d4 = d + 1.0d;
        float fSqrt = (float) Math.sqrt(Math.max(0.0d, d4 + d2 + d3));
        float fSqrt2 = (float) Math.sqrt(Math.max(0.0d, (d4 - d2) - d3));
        double d5 = 1.0d - d;
        float fSqrt3 = (float) Math.sqrt(Math.max(0.0d, (d5 + d2) - d3));
        float fSqrt4 = (float) Math.sqrt(Math.max(0.0d, (d5 - d2) + d3));
        float f = fSqrt2 * 0.5f;
        if ((((fArr[6] - fArr[9]) > 0.0f ? 1 : ((fArr[6] - fArr[9]) == 0.0f ? 0 : -1)) >>> 31) != ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) >>> 31)) {
            f = -f;
        }
        Object obj = this.b;
        float f2 = fSqrt3 * 0.5f;
        ((float[]) obj)[0] = f;
        if ((((fArr[8] - fArr[2]) > 0.0f ? 1 : ((fArr[8] - fArr[2]) == 0.0f ? 0 : -1)) >>> 31) != ((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) >>> 31)) {
            f2 = -f2;
        }
        float f3 = fSqrt4 * 0.5f;
        ((float[]) obj)[1] = f2;
        if ((((fArr[1] - fArr[4]) > 0.0f ? 1 : ((fArr[1] - fArr[4]) == 0.0f ? 0 : -1)) >>> 31) != ((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)) >>> 31)) {
            f3 = -f3;
        }
        ((float[]) obj)[2] = f3;
        ((float[]) obj)[3] = fSqrt * 0.5f;
    }

    public final void v(int i, boolean z) {
        ((aigs) this.b).h(i, z);
    }

    public final void w(int i, aigj aigjVar) {
        ((aigs) this.b).i(i, aigjVar);
    }

    public final void x(int i, double d) {
        ((aigs) this.b).Q(i, d);
    }

    public final void y(int i, int i2) {
        ((aigs) this.b).o(i, i2);
    }

    public final void z(int i, int i2) {
        ((aigs) this.b).k(i, i2);
    }

    public ahud(Object obj) {
        this.b = obj;
    }

    public ahud(Object obj, byte[] bArr) {
        this.b = obj;
    }

    public ahud(char[] cArr) {
        this.b = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
    }

    public ahud(int i) {
        awtr[] awtrVarArr = new awtr[i];
        for (int i2 = 0; i2 < i; i2++) {
            awtrVarArr[i2] = new awtr(null, awts.a);
        }
        this.b = awtrVarArr;
    }

    public ahud(aika aikaVar, Object obj, aika aikaVar2, Object obj2) {
        this.b = new axqr(aikaVar, obj, aikaVar2, obj2);
    }

    public ahud(awmd awmdVar, byte[] bArr) {
        awmdVar.getClass();
        this.b = awmdVar;
    }

    public ahud(short[] sArr) {
        this.b = new auor();
    }

    public ahud(wnf wnfVar, tbt tbtVar, Object obj, ttm ttmVar, xgn xgnVar, awmd awmdVar) {
        this.b = new adua(wnfVar, tbtVar, obj, ttmVar, xgnVar, awmdVar);
    }

    public ahud(byte[] bArr, byte[] bArr2) {
        this.b = new awtr(new axdr(8, false), awts.a);
    }

    public ahud(char[] cArr, byte[] bArr) {
        this.b = new WeakHashMap();
    }

    public ahud(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = new ArrayDeque();
    }

    public ahud(byte[] bArr) {
        this.b = new ArrayList(1);
    }

    public ahud(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new awlo();
    }

    public ahud(byte[] bArr, char[] cArr) {
        this.b = new awli();
    }

    public ahud(Context context, char[] cArr) {
        context.getClass();
        this.b = context;
    }

    public ahud() {
        this.b = new HashSet();
    }

    public ahud(agev agevVar) {
        agevVar.getClass();
        this.b = agevVar;
    }

    public ahud(aigs aigsVar) {
        aigsVar.getClass();
        this.b = aigsVar;
        aigsVar.a = this;
    }
}
