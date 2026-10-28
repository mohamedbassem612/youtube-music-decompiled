package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.bluetooth.BluetoothA2dpService;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kyr {
    public final Object a;
    public final Object b;

    public kyr(byte[] bArr) {
        this.b = new HashMap();
        this.a = new fzn();
        F(new fzd());
        F(new fzf());
        F(new fzg());
        F(new fzi());
        F(new fzl());
        F(new fzm());
        F(new fzo());
    }

    public static /* synthetic */ Object B(Object obj) {
        return aoeb.a.createBuilder();
    }

    public static final int L(kwq kwqVar, fyx fyxVar, fyy fyyVar) {
        fyy fyyVarA = fyxVar.a(kwqVar, Collections.singletonList(fyyVar));
        if (fyyVarA instanceof fyr) {
            return fxw.b(fyyVarA.h().doubleValue());
        }
        return -1;
    }

    private static boolean M(File file) {
        File[] fileArrListFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                M(file2);
            }
        }
        return file.delete();
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, jyd] */
    private final Set N(List list) {
        Set afxVar;
        String str;
        int size = list.size();
        int i = SemanticState.Focused;
        if (size == 0) {
            afxVar = new afx(0);
        } else {
            afxVar = size <= 128 ? new afx(size) : new HashSet(size, 0.75f);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jzm jzmVar = (jzm) it.next();
            String str2 = !jzmVar.f.isEmpty() ? jzmVar.f : jzmVar.e;
            if (TextUtils.isEmpty(str2) || jzmVar.c.isEmpty() || jzmVar.d.isEmpty()) {
                Log.w("WebLoginHelper", "Invalid cookie.");
            } else {
                Boolean boolValueOf = (jzmVar.b & 32) != 0 ? Boolean.valueOf(jzmVar.h) : null;
                kro.i(str2);
                String str3 = (true != hna.T(boolValueOf) ? "http" : "https") + "://" + str2;
                String str4 = jzmVar.c;
                String str5 = jzmVar.d;
                String str6 = jzmVar.e;
                String str7 = jzmVar.g;
                Boolean boolValueOf2 = (jzmVar.b & 64) != 0 ? Boolean.valueOf(jzmVar.i) : null;
                Boolean boolValueOf3 = (jzmVar.b & 32) != 0 ? Boolean.valueOf(jzmVar.h) : null;
                Long lValueOf = (jzmVar.b & i) != 0 ? Long.valueOf(jzmVar.j) : null;
                int i2 = jzmVar.b;
                if ((i2 & SemanticState.Hidden) != 0) {
                    int iAV = a.aV(jzmVar.k);
                    if (iAV == 0 || iAV == 1) {
                        str = "UNKNOWN_PRIORITY";
                    } else if (iAV != 2) {
                        str = iAV != 3 ? "HIGH" : "MEDIUM";
                    } else {
                        str = "LOW";
                    }
                } else {
                    str = null;
                }
                String str8 = (i2 & SemanticState.LiveRegion) != 0 ? jzmVar.l : null;
                boolean z = ((i2 & SemanticState.ReadOnly) == 0 || jzmVar.m.isEmpty()) ? false : true;
                if (str4 == null) {
                    str4 = "";
                }
                Boolean boolValueOf4 = Boolean.valueOf(z);
                StringBuilder sb = new StringBuilder(str4);
                sb.append('=');
                if (!TextUtils.isEmpty(str5)) {
                    sb.append(str5);
                }
                if (hna.T(boolValueOf2)) {
                    sb.append(";HttpOnly");
                }
                if (hna.T(boolValueOf3)) {
                    sb.append(";Secure");
                }
                if (!TextUtils.isEmpty(str6)) {
                    sb.append(";Domain=");
                    sb.append(str6);
                }
                if (!TextUtils.isEmpty(str7)) {
                    sb.append(";Path=");
                    sb.append(str7);
                }
                if (lValueOf != null && lValueOf.longValue() > 0) {
                    sb.append(";Max-Age=");
                    sb.append(lValueOf);
                }
                if (!TextUtils.isEmpty(str)) {
                    sb.append(";Priority=");
                    sb.append(str);
                }
                if (!TextUtils.isEmpty(str8)) {
                    sb.append(";SameSite=");
                    sb.append(str8);
                }
                if (hna.T(boolValueOf4)) {
                    sb.append(";SameParty");
                }
                this.a.a(str3, sb.toString());
                afxVar.add(str3);
            }
            i = SemanticState.Focused;
        }
        return afxVar;
    }

    public static kyr a(long j) {
        return new kyr(Long.TYPE, Long.valueOf(j));
    }

    public static ktv c(kth kthVar) {
        Object obj;
        pgw pgwVar = new pgw();
        pgwVar.e(true);
        pgwVar.c = new Bundle();
        pgwVar.e(false);
        if (kthVar != null) {
            Bundle bundle = new Bundle(kthVar.b);
            bundle.remove("clientVersion");
            bundle.remove("appArchitecture");
            bundle.remove("timeoutMs");
            if (!bundle.isEmpty()) {
                pgwVar.c = bundle;
            }
        }
        if (pgwVar.b == 1 && (obj = pgwVar.c) != null) {
            return new ktv(pgwVar.a, (Bundle) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (pgwVar.b == 0) {
            sb.append(" reinitializeHandleOnGetSnapshot");
        }
        if (pgwVar.c == null) {
            sb.append(" extras");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static String d(Context context, lpa lpaVar) {
        Exception excE = lpaVar.e();
        if (excE == null) {
            return ((lpf) lpaVar).c ? e(context, new CancellationException("Task is canceled")) : Base64.encodeToString((byte[]) ((elq) lpaVar.f()).a, 11);
        }
        return e(context, excE);
    }

    public static String e(Context context, Throwable th) {
        boolean z = th instanceof kmu;
        String string = th.toString();
        if (z) {
            Status status = ((kmu) th).a;
            String name = th.getClass().getName();
            String strR = kro.r(status.f);
            String str = status.g;
            klo kloVar = status.i;
            string = String.format("%s: %s: %s%s", name, strR, str, kloVar == null ? "" : ", ".concat(kloVar.toString()));
        }
        agcy agcyVar = agcy.a;
        String strConcat = String.format(Locale.US, "ERROR : %s\nAPI_LEVEL: %d\nGMSCORE_VERSION: %s", string, Integer.valueOf(Build.VERSION.SDK_INT), "26.42.05-000");
        if (th != null) {
            strConcat = String.valueOf(strConcat).concat(String.valueOf(String.format(Locale.US, "\nEXCEPTION: %s\nSTACK_TRACE: %s", th, Log.getStackTraceString(th))));
        }
        return Base64.encodeToString(lqd.k(lqd.j(context, String.valueOf(strConcat).concat(String.valueOf(String.format(Locale.US, "\nBuild.FINGERPRINT: %s", Build.FINGERPRINT))).getBytes(StandardCharsets.UTF_8), agcyVar)), 11);
    }

    public static void k(File file, File file2) throws ktl {
        if (file.renameTo(file2)) {
            return;
        }
        throw new ktl("Failed to rename " + file.toString() + " -> " + file2.toString() + '.');
    }

    public static final void l(ktm ktmVar) {
        M(ktmVar.a());
    }

    public static final void m(ktm ktmVar) throws ktl {
        File file = ktmVar.c;
        try {
            if (file.exists() || file.createNewFile()) {
                if (!file.setLastModified(System.currentTimeMillis())) {
                    throw new ktl(a.cn((byte) 46, ktmVar, "Failed to update last-used timestamp for "));
                }
            } else {
                throw new ktl("Failed to touch last-used file for " + ktmVar.toString() + '.');
            }
        } catch (IOException e) {
            throw new ktl(a.cc(e, ktmVar, "Failed to touch last-used file for ", ": "), e);
        }
    }

    static String n(String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        for (String str : strArr) {
            try {
                URL url = new URL(str);
                builder.appendQueryParameter("url", url.getProtocol() + "://" + url.getHost());
            } catch (MalformedURLException unused) {
                throw new IllegalArgumentException("Invalid URL: ".concat(String.valueOf(str)));
            }
        }
        return "weblogin:".concat(String.valueOf(builder.build().getQuery()));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture A(List list) {
        return ahno.ar(((hpy) this.b.io()).b((agke) Collection.EL.stream(list).map(new hrn(16)).collect(aghu.a)), new hqt(7), this.a);
    }

    public final void C() {
        if (((jkx) this.a).d(Build.VERSION.SDK_INT >= 31 ? "android.permission.BLUETOOTH_CONNECT" : "android.permission.ACCESS_FINE_LOCATION", 106, Optional.empty())) {
            return;
        }
        Object obj = this.b;
        tuk.n((Context) obj, R.string.bluetooth_permissions_granted_toast, 0);
        D();
        ((Activity) obj).finish();
    }

    public final void D() {
        int i = Build.VERSION.SDK_INT;
        Object obj = this.b;
        if (i >= 31) {
            if (avg.c(((Activity) obj).getApplicationContext(), "android.permission.BLUETOOTH_CONNECT") != 0) {
                return;
            }
        } else if (avg.c(((Activity) obj).getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        Activity activity = (Activity) this.b;
        BluetoothAdapter adapter = ((BluetoothManager) activity.getSystemService(BluetoothManager.class)).getAdapter();
        if (adapter == null || !adapter.isEnabled()) {
            return;
        }
        Set<BluetoothDevice> bondedDevices = adapter.getBondedDevices();
        BluetoothDevice bluetoothDevice = null;
        Object obj2 = null;
        if (bondedDevices != null) {
            loop0: for (Object obj3 : bondedDevices) {
                ParcelUuid[] uuids = ((BluetoothDevice) obj3).getUuids();
                if (uuids != null) {
                    for (ParcelUuid parcelUuid : uuids) {
                        if (awrc.c(parcelUuid.getUuid(), gmm.a)) {
                            obj2 = obj3;
                            break loop0;
                        }
                    }
                }
            }
            bluetoothDevice = (BluetoothDevice) obj2;
        }
        if (bluetoothDevice != null) {
            Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) BluetoothA2dpService.class);
            intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice);
            activity.getApplicationContext().startForegroundService(intent);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture E(int i) {
        return ahno.ar(((afkb) this.a).a(), new iow(i, 1), this.b);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    final void F(fze fzeVar) {
        Iterator it = fzeVar.a.iterator();
        while (it.hasNext()) {
            this.b.put(((fzp) it.next()).toString(), fzeVar);
        }
    }

    public final fip G() {
        fkl fklVar = ((fjq) this.b).f;
        if (fklVar != null) {
            return fklVar.r;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final ety H(ByteBuffer byteBuffer, ety etyVar) {
        Object obj;
        ?? r0 = this.a;
        if (r0.isEmpty() || (obj = this.b) == null || !fbk.c(ept.f(r0, byteBuffer, (ewv) obj))) {
            return etyVar;
        }
        ety etyVar2 = new ety();
        etyVar2.c(etyVar);
        etyVar2.d(fap.f, Boolean.TRUE);
        return etyVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [axr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [axr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [axr, java.lang.Object] */
    public final String I(ett ettVar) {
        String str;
        Object obj = this.a;
        synchronized (obj) {
            str = (String) ((ffo) obj).g(ettVar);
        }
        if (str == null) {
            exn exnVar = (exn) this.b.a();
            try {
                MessageDigest messageDigest = exnVar.a;
                ettVar.a(messageDigest);
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = ffs.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i << 1;
                        char[] cArr2 = ffs.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
                this.b.b(exnVar);
            } catch (Throwable th) {
                this.b.b(exnVar);
                throw th;
            }
        }
        Object obj2 = this.a;
        synchronized (obj2) {
            ((ffo) obj2).h(ettVar, str);
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Queue] */
    public final void J(String str) {
        rik rikVar;
        synchronized (this) {
            ?? r1 = this.b;
            rikVar = (rik) r1.get(str);
            gzj.bM(rikVar);
            int i = rikVar.b;
            if (i <= 0) {
                throw new IllegalStateException(a.cg(i, str, "Cannot release a lock that is not held, safeKey: ", ", interestedThreads: "));
            }
            int i2 = i - 1;
            rikVar.b = i2;
            if (i2 == 0) {
                rik rikVar2 = (rik) r1.remove(str);
                if (!rikVar2.equals(rikVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + rikVar.toString() + ", but actually removed: " + String.valueOf(rikVar2) + ", safeKey: " + str);
                }
                ?? r6 = ((elq) this.a).a;
                synchronized (r6) {
                    try {
                        if (r6.size() < 10) {
                            r6.offer(rikVar2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        rikVar.a.unlock();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final fyy K(kwq kwqVar, fyy fyyVar) {
        fxw.o(kwqVar);
        if (!(fyyVar instanceof fyz)) {
            return fyyVar;
        }
        fyz fyzVar = (fyz) fyyVar;
        ArrayList arrayList = fyzVar.b;
        String str = fyzVar.a;
        ?? r1 = this.b;
        return ((fze) (r1.containsKey(str) ? (fze) r1.get(str) : this.a)).a(str, kwqVar, arrayList);
    }

    public final ktf b(String str, kth kthVar) {
        Bundle bundle = kthVar.b;
        ktv ktvVarC = c(kthVar);
        int i = bundle.getInt("timeoutMs", kth.a);
        try {
            return new kub((Context) this.b, (kul) mda.o(((kwq) this.a).f(str, ktvVarC), i, TimeUnit.MILLISECONDS), i);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return new kua(e((Context) this.b, e));
        } catch (ExecutionException e2) {
            Object obj = this.b;
            Throwable cause = e2.getCause();
            ExecutionException cause2 = e2;
            if (cause != null) {
                cause2 = e2.getCause();
            }
            return new kua(e((Context) obj, cause2));
        } catch (TimeoutException e3) {
            return new kua(e((Context) this.b, e3));
        }
    }

    public final ktm f() {
        return g("tmp_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public final ktm g(String str) {
        ksy ksyVar = kya.a;
        File fileI = i();
        int i = kye.a;
        File file = new File(ksy.ao(fileI, str));
        ksy ksyVar2 = kya.a;
        File file2 = new File(ksy.ao(file, "the.apk"));
        ksy ksyVar3 = kya.a;
        File file3 = new File(ksy.ao(file, "opt"));
        ksy ksyVar4 = kya.a;
        return new ktm(file2, file3, new File(ksy.ao(file, "t")));
    }

    public final ktm h(ktq ktqVar) throws ktl {
        ktm ktmVarG = g(ktqVar.a);
        if (!ktmVarG.b()) {
            return null;
        }
        m(ktmVarG);
        return ktmVarG;
    }

    public final File i() {
        return ((Context) this.b).getDir("dg_cache", 0);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final void j() {
        ?? r4 = this.a;
        for (File file : r4) {
            if (!M(file)) {
                Log.e("DG", "Failed to clean up temporary file " + String.valueOf(file) + '.');
            }
        }
        r4.clear();
    }

    public final Set o(Account account, String... strArr) throws jxr, jye, IOException {
        kro.l(account);
        kro.d(strArr != null && strArr.length > 0, "Must have at least one URL.");
        Object obj = this.b;
        String strN = n(strArr);
        String[] strArr2 = jxz.b;
        String strB = jxz.b((Context) obj, account, strN, new Bundle());
        try {
            jzn jznVar = (jzn) aihn.parseFrom(jzn.a, Base64.decode(strB, 9), ExtensionRegistryLite.getGeneratedRegistry());
            if (jznVar == null || (jznVar.b & 1) == 0) {
                throw new jxr("Invalid response.");
            }
            jzp jzpVar = jznVar.c;
            if (jzpVar == null) {
                jzpVar = jzp.a;
            }
            int iBt = a.bt(jzpVar.b);
            if (iBt == 0) {
                iBt = 1;
            }
            int i = iBt - 1;
            if (i == 1) {
                return N(jzpVar.c);
            }
            if (i == 2) {
                throw new IOException("Request failed, but server said RETRY.");
            }
            if (i != 5) {
                Log.w("WebLoginHelper", "Unexpected response: ".concat(String.valueOf(String.valueOf(jzpVar))));
                int iBt2 = a.bt(jzpVar.b);
                int i2 = iBt2 != 0 ? iBt2 : 1;
                StringBuilder sb = new StringBuilder("Unknown response status: ");
                sb.append(i2 - 1);
                throw new jxr(sb.toString());
            }
            N(jzpVar.c);
            for (jzo jzoVar : jzpVar.d) {
                int i3 = jzoVar.b;
                int iAV = a.aV(i3);
                if (iAV == 0) {
                    iAV = 1;
                }
                int i4 = iAV - 1;
                if (i4 != 1) {
                    if (i4 == 2) {
                        String str = jzoVar.c;
                        throw new jye();
                    }
                    if (i4 != 3) {
                        int iAV2 = a.aV(i3);
                        if (iAV2 == 0) {
                            iAV2 = 1;
                        }
                        StringBuilder sb2 = new StringBuilder("Unrecognized failed account status: ");
                        sb2.append(iAV2 - 1);
                        Log.w("WebLoginHelper", sb2.toString());
                    }
                }
            }
            throw new jxr("Authorization failed, but no recoverable accounts.");
        } catch (aiik e) {
            throw new jxr("Couldn't read data from server.", e);
        } catch (IllegalArgumentException e2) {
            Log.w("WebLoginHelper", "Incorrect base64 encoding: ".concat(String.valueOf(strB != null ? strB.substring(0, Math.min(6, strB.length())) : "null")));
            throw new jxr("Couldn't read data from server.", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void p(String str, Object obj) {
        obj.getClass();
        this.a.put(str, obj);
        this.b.remove(str);
    }

    public final void q(long j) {
        p("exo_len", Long.valueOf(j));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jsd] */
    public final void r(jsb jsbVar) {
        aigj aigjVarV = aigj.v((byte[]) this.a.a(jsbVar.b));
        kro.l(aigjVarV);
        kjd kjdVar = new kjd((kib) this.b, aigjVarV);
        kjdVar.l = a.bc(jsbVar.c + (-1) != 1 ? 0 : 1);
        Integer num = jsbVar.a;
        if (num != null) {
            kjdVar.k(num.intValue());
        }
        if (kjdVar.b) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        kjdVar.b = true;
        kjdVar.a.f.b(kjdVar).o(new jsf());
    }

    public final void s(jli jliVar) {
        Integer num = (Integer) ((EnumMap) this.b).get(jliVar);
        if (num != null) {
            ((SoundPool) this.a).play(num.intValue(), 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }

    public final void t() {
        ((avmm) this.b).b();
        u();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void u() {
        for (jbb jbbVar : this.a) {
            if (jbbVar.d() != null) {
                jbbVar.d().setVisibility(8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, lns] */
    public final ListenableFuture v(String str, String[] strArr) {
        ArrayList arrayList;
        boolean z;
        int[] iArr;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        jxi jxiVar = new jxi("thing_proto", false, 0);
        if (jxiVar.a.startsWith("semantic#")) {
            arrayList = new ArrayList();
            arrayList.add(jxiVar);
            z = true;
        } else {
            arrayList = new ArrayList();
            arrayList.add(jxiVar);
            z = false;
        }
        ArrayList arrayList3 = arrayList;
        if (arrayList2.isEmpty()) {
            iArr = new int[0];
        } else {
            int[] iArr2 = new int[arrayList2.size()];
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                iArr2[i] = ((Integer) it.next()).intValue();
                i++;
            }
            iArr = iArr2;
        }
        return ahno.ar(qnl.bp(this.a.a(str, strArr, new jxb(false, null, arrayList3, true, 0, 1, z, 0, true, iArr, null, null, null, null))), new ist(3), this.b);
    }

    public final angn w(String str) {
        Iterator it = agfm.c("%1$s").f(((Context) this.a).getString(R.string.no_search_results)).iterator();
        String str2 = (String) it.next();
        aihh aihhVar = (aihh) alay.a.createBuilder();
        if (!TextUtils.isEmpty(str2)) {
            aihh aihhVar2 = (aihh) alba.a.createBuilder();
            aihhVar2.copyOnWrite();
            alba albaVar = (alba) aihhVar2.instance;
            str2.getClass();
            albaVar.b |= 1;
            albaVar.c = str2;
            aihhVar.v(aihhVar2);
        }
        alba albaVar2 = alba.a;
        aihh aihhVar3 = (aihh) albaVar2.createBuilder();
        aihhVar3.copyOnWrite();
        alba albaVar3 = (alba) aihhVar3.instance;
        str.getClass();
        albaVar3.b |= 1;
        albaVar3.c = str;
        aihhVar3.copyOnWrite();
        alba albaVar4 = (alba) aihhVar3.instance;
        albaVar4.b |= 2;
        albaVar4.d = true;
        aihhVar.v(aihhVar3);
        if (it.hasNext()) {
            String str3 = (String) it.next();
            if (!TextUtils.isEmpty(str3)) {
                aihh aihhVar4 = (aihh) albaVar2.createBuilder();
                aihhVar4.copyOnWrite();
                alba albaVar5 = (alba) aihhVar4.instance;
                str3.getClass();
                albaVar5.b |= 1;
                albaVar5.c = str3;
                aihhVar.v(aihhVar4);
            }
        }
        aihf aihfVarCreateBuilder = angn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        angn angnVar = (angn) aihfVarCreateBuilder.instance;
        alay alayVar = (alay) aihhVar.build();
        alayVar.getClass();
        angnVar.e = alayVar;
        angnVar.b |= 1;
        aihf aihfVarCreateBuilder2 = angt.a.createBuilder();
        aliz alizVar = aliz.SEARCH;
        aihfVarCreateBuilder2.copyOnWrite();
        angt angtVar = (angt) aihfVarCreateBuilder2.instance;
        angtVar.c = alizVar.yN;
        angtVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        angn angnVar2 = (angn) aihfVarCreateBuilder.instance;
        angt angtVar2 = (angt) aihfVarCreateBuilder2.build();
        angtVar2.getClass();
        angnVar2.d = angtVar2;
        angnVar2.c = 2;
        return (angn) aihfVarCreateBuilder.build();
    }

    public final Optional x(int i, List list) {
        if (list.isEmpty()) {
            return Optional.empty();
        }
        aihf aihfVarCreateBuilder = anwt.a.createBuilder();
        alay alayVarD = ackj.d(((Context) this.a).getString(i));
        aihfVarCreateBuilder.copyOnWrite();
        anwt anwtVar = (anwt) aihfVarCreateBuilder.instance;
        alayVarD.getClass();
        anwtVar.d = alayVarD;
        anwtVar.c |= 1;
        aihfVarCreateBuilder.bO((Iterable) Collection.EL.stream(list).map(new iaa(19)).collect(Collectors.toList()));
        return Optional.of((anwt) aihfVarCreateBuilder.build());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aunn, java.lang.Object] */
    public final void y(int i) {
        ((xgn) this.b.io()).o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(i)), null);
    }

    public final htf z(hth hthVar) {
        aamp aampVarC = ((hpd) this.b).c(hthVar);
        aamp aampVar = aamp.PLAYABLE;
        anyx anyxVar = (anyx) hthVar.a().get();
        Optional optionalE = ((vxz) this.a).l(44, 45682398L, false) ? hthVar.e() : Optional.empty();
        boolean z = aampVarC == aampVar;
        Optional.empty();
        String videoId = anyxVar.getVideoId();
        if (videoId == null) {
            throw new NullPointerException("Null videoId");
        }
        String title = anyxVar.getTitle();
        if (title != null) {
            return new htf(videoId, title, z, anyxVar, optionalE);
        }
        throw new NullPointerException("Null title");
    }

    public kyr(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public kyr(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public kyr(Object obj, Object obj2, char[] cArr) {
        this.a = obj;
        this.b = obj2;
    }

    public kyr(Object obj, Object obj2, short[] sArr) {
        this.a = obj;
        this.b = obj2;
    }

    public kyr(a aVar) {
        eqy eqyVar = new eqy();
        this.a = aVar;
        this.b = eqyVar;
    }

    public kyr(did didVar) {
        this.b = didVar;
        this.a = new LinkedHashSet();
    }

    public kyr(jbb... jbbVarArr) {
        this.a = Arrays.asList(jbbVarArr);
        this.b = new avmm();
        u();
        for (jbb jbbVar : jbbVarArr) {
            ((avmm) this.b).c(jbbVar.e().i(new abwr(1)).al(new iwb(this, 9), new ido(17)));
        }
    }

    public kyr(Context context) {
        this.a = new ArrayList();
        this.b = context;
    }

    public kyr(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new HashMap();
        this.a = new elq();
    }

    public kyr(char[] cArr) {
        this.a = new ffo(1000L);
        this.b = fga.a(10, new exm(0));
    }

    public kyr(fji fjiVar) {
        this.a = fjiVar;
        this.b = fjiVar.l();
    }

    public kyr(byte[] bArr, byte[] bArr2) {
        this.b = new TreeMap();
        this.a = new TreeMap();
    }

    public kyr(awmd awmdVar, awmd awmdVar2, byte[] bArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
    }

    public kyr(Activity activity) {
        this.b = activity;
        this.a = new cbq(activity, 18);
    }

    public kyr(Context context, char[] cArr) {
        this.b = new EnumMap(jli.class);
        this.a = new SoundPool(5, 3, 0);
        for (jli jliVar : jli.values()) {
            ((EnumMap) this.b).put(jliVar, Integer.valueOf(((SoundPool) this.a).load(context, jliVar.e, 1)));
        }
    }

    public kyr(awmd awmdVar, awmd awmdVar2) {
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
    }

    public kyr(Context context, String str, jsd jsdVar) {
        khn khnVar = kib.l;
        kia kiaVar = new kia(context, str);
        kiaVar.a(kja.b);
        kib kibVar = new kib(kiaVar.a, kiaVar.b, kiaVar.e, kiaVar.d, 0, kiaVar.c, null, kiaVar.f);
        try {
            throw new IllegalArgumentException(String.format("Clearcut does not support setting log source int values (%s, %d). Use log source name instead.", str, Integer.valueOf(Integer.parseInt(str))));
        } catch (NumberFormatException unused) {
            this.b = kibVar;
            this.a = jsdVar;
        }
    }

    public kyr(Executor executor, fhz fhzVar) {
        this.b = executor;
        this.a = new afkb(new gwj(fhzVar, executor, 1), executor);
    }

    public kyr(Activity activity, jkx jkxVar) {
        activity.getClass();
        jkxVar.getClass();
        this.b = activity;
        this.a = jkxVar;
    }

    public kyr(awmd awmdVar, awmd awmdVar2, char[] cArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
    }

    public kyr() {
        this.a = new HashMap();
        this.b = new ArrayList();
    }

    public kyr(Context context, byte[] bArr) {
        this((Object) context, (Object) new aegg(1, null), (byte[]) null);
    }
}
