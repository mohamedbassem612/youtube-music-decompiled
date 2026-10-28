package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import app.rive.Artboard;
import app.rive.RiveCanvasSession;
import app.rive.RiveFile;
import app.rive.StateMachine;
import app.rive.ViewModelInstance;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.cardboard.sdk.CardboardView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import dalvik.system.DexClassLoader;
import internal.org.jni_zero.JniZero;
import j$.nio.channels.DesugarChannels;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentMap;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.ref.SoftReference;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahgb {
    private static SoftReference f;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ahgb(View view, View.OnClickListener onClickListener) {
        this.d = view;
        this.b = (TextView) view.findViewById(R.id.title);
        this.a = view.findViewById(R.id.subtitle);
        TextView textView = (TextView) view.findViewById(R.id.action);
        this.e = textView;
        textView.setOnClickListener(onClickListener);
        this.c = view.findViewById(R.id.progress);
    }

    public static final boolean B(uxi uxiVar) {
        agrf agrfVar = usj.a;
        augy augyVar = ((uxk) uxiVar).a;
        int i = augyVar.c;
        if (i == 110) {
            auhb auhbVar = (auhb) augyVar.d;
            if ((auhbVar.b & 1) == 0 || auhbVar.c.isEmpty()) {
                return false;
            }
        } else {
            if (i != 101) {
                return false;
            }
            augu auguVar = (augu) augyVar.d;
            if ((auguVar.b & 1) == 0 || auguVar.c.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static final void E(final Executor executor, final AtomicBoolean atomicBoolean, final Application application, final tqq tqqVar, final int i, final aqi aqiVar, final int i2) {
        executor.execute(afwl.i(new Runnable() { // from class: tqp
            @Override // java.lang.Runnable
            public final void run() {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                Application application2 = application;
                tqq tqqVar2 = tqqVar;
                if (atomicBoolean2.get()) {
                    application2.unregisterActivityLifecycleCallbacks(tqqVar2);
                    return;
                }
                aqi aqiVar2 = aqiVar;
                int i3 = i;
                int i4 = i2;
                if (i4 < i3 - 1) {
                    ahgb.E(executor, atomicBoolean2, application2, tqqVar2, i3, aqiVar2, i4 + 1);
                } else {
                    aqiVar2.b(Boolean.TRUE);
                    application2.unregisterActivityLifecycleCallbacks(tqqVar2);
                }
            }
        }));
    }

    public static final boolean G() {
        return Process.getThreadPriority(Process.myPid()) >= 0;
    }

    static String J(obp obpVar) {
        return ksv.a(obpVar.toByteArray());
    }

    public static ahgb a(String str, aigj aigjVar, ahfz ahfzVar, ahga ahgaVar, Integer num) {
        if (num != null) {
            if (ahgaVar.equals(ahga.d)) {
                throw new GeneralSecurityException("Cannot set idRequirement for OutputPrefixType RAW");
            }
        } else if (!ahgaVar.equals(ahga.d)) {
            throw new GeneralSecurityException("Cannot have null idRequirement unless OutputPrefixType is RAW");
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException(a.cg(i, str, "typeURL ", " contains non-ascii character at position "));
            }
        }
        return new ahgb(str, aigjVar, ahfzVar, ahgaVar, num);
    }

    public static alay aa(String str) {
        return TextUtils.isEmpty(str) ? ackj.c(new String[0]) : ackj.c(str);
    }

    public static final agkj af(Map map) {
        agkh agkhVar = new agkh(4);
        j$.util.Map.EL.forEach(map, new gpd(agkhVar, 3));
        return agkhVar.d(false);
    }

    public static final void ag(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Optional optionalOfNullable = (Optional) it.next();
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable((anyx) ((weh) optionalOfNullable.get()));
            }
            if (optionalOfNullable.isPresent() && igs.c(((anyx) optionalOfNullable.get()).getMusicVideoType()) && ((anyx) optionalOfNullable.get()).getPublishedTimestampMs().longValue() > 0) {
                aihf aihfVar = (aihf) j$.util.Map.EL.computeIfAbsent(map, ((anyx) optionalOfNullable.get()).getVideoId(), new hrn(17));
                long jLongValue = ((anyx) optionalOfNullable.get()).getPublishedTimestampMs().longValue();
                aihfVar.copyOnWrite();
                aoeb aoebVar = (aoeb) aihfVar.instance;
                aoeb aoebVar2 = aoeb.a;
                aoebVar.b |= 1;
                aoebVar.c = jLongValue;
            }
        }
    }

    public static void an(kty ktyVar, kqs kqsVar, kjc kjcVar) {
        try {
            kjcVar.x(ktyVar.a(kqsVar));
        } catch (kmu e) {
            kjcVar.w(e);
        }
    }

    public static synchronized ahgb ap(Context context, ktu ktuVar) {
        ahgb ahgbVar;
        SoftReference softReference = f;
        if (softReference != null && (ahgbVar = (ahgb) softReference.get()) != null) {
            return ahgbVar;
        }
        kyr kyrVar = new kyr(context);
        if (elq.c == null) {
            elq.c = new elq((char[]) null);
        }
        ahgb ahgbVar2 = new ahgb(context, kyrVar, elq.c, new kto(), ktuVar);
        f = new SoftReference(ahgbVar2);
        return ahgbVar2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, xgn] */
    private final void aq(aigj aigjVar) {
        xgj xgjVar = new xgj(aigjVar, (amud) null);
        xgj xgjVar2 = new xgj(xhb.b(82046));
        ?? r3 = this.b;
        r3.m(xgjVar2, xgjVar);
        r3.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar2, null);
    }

    private final void ar(aqi aqiVar) {
        Application application;
        Object obj = this.a;
        Application application2 = obj instanceof Application ? (Application) obj : null;
        if (application2 == null) {
            Context applicationContext = ((Context) obj).getApplicationContext();
            Application application3 = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application3 == null) {
                aqiVar.b(Boolean.FALSE);
                return;
            }
            application = application3;
        } else {
            application = application2;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        tqq tqqVar = new tqq(atomicBoolean, aqiVar, application);
        application.registerActivityLifecycleCallbacks(tqqVar);
        int i = Build.VERSION.SDK_INT >= 34 ? 5 : 1;
        Executor executorE = avg.e((Context) obj);
        executorE.getClass();
        E(executorE, atomicBoolean, application, tqqVar, i, aqiVar, 0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aunn, java.lang.Object] */
    private final String as() {
        return "FBAMTD" + ((gcw) this.e.io()).h;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aunn, java.lang.Object] */
    private final String at() {
        return "LATMTD" + ((gcw) this.e.io()).h;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ktn] */
    private final boolean au(File file) {
        try {
            return this.a.a(file);
        } catch (GeneralSecurityException e) {
            Log.e("DG", "APK at " + file.getAbsolutePath() + " failed signature verification", e);
            return false;
        }
    }

    public static final yco j(ycp ycpVar, ycp ycpVar2, amyv amyvVar, String str, int i, String str2, xvr xvrVar, awqp awqpVar) {
        return (yco) awqpVar.invoke(xvrVar, ycpVar, ycpVar2, amyvVar, str, Integer.valueOf(i), str2);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, vxe] */
    public final void A(uxi uxiVar) {
        int iAV;
        uko ukoVar = (uko) this.e;
        ArrayDeque arrayDeque = ukoVar.a;
        if (!arrayDeque.isEmpty()) {
            ((ukn) arrayDeque.peek()).a.b(new ukk());
        }
        ukoVar.b();
        Optional optional = ((uxk) uxiVar).c;
        if (!optional.isPresent() || (iAV = a.aV(((augi) optional.get()).i)) == 0 || iAV != 3) {
            ((vkl) this.c.io()).i(uxiVar);
            return;
        }
        ?? r3 = this.d;
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(apwz.b, apwz.a);
        r3.a((ajwo) aihhVar.build());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmi, java.lang.Object] */
    public final ListenableFuture C() {
        Object objA = this.c.a();
        objA.getClass();
        return (ListenableFuture) objA;
    }

    public final void D(aqi aqiVar) {
        try {
            File file = new File((String) this.d);
            if (!file.exists()) {
                ar(aqiVar);
                return;
            }
            Charset charset = awtd.a;
            charset.getClass();
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
            try {
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[SemanticState.Multiline];
                for (int i = inputStreamReader.read(cArr); i >= 0; i = inputStreamReader.read(cArr)) {
                    stringWriter.write(cArr, 0, i);
                }
                String string = stringWriter.toString();
                string.getClass();
                JniZero.l(inputStreamReader, null);
                String string2 = awrc.q(string).toString();
                if (awrc.u(string2, "background", false) || awrc.u(string2, "restricted", false)) {
                    aqiVar.b(Boolean.TRUE);
                } else if (awrc.u(string2, "top-app", false) || awrc.u(string2, "foreground_window", false)) {
                    aqiVar.b(Boolean.FALSE);
                } else {
                    ar(aqiVar);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    JniZero.l(inputStreamReader, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            ar(aqiVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tqj] */
    public final boolean F() {
        int i = tqr.a;
        return this.e.k(1073830451);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (((java.lang.Integer) defpackage.mci.a(((defpackage.dlr) r1).a())).intValue() == 1) goto L22;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri H(android.net.Uri r9) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahgb.H(android.net.Uri):android.net.Uri");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aunn, java.lang.Object] */
    public final File I() {
        File file = new File((File) this.c, Integer.toString(((gcw) this.e.io()).h));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final obp K(int i) {
        ?? r0 = this.d;
        String string = i == 1 ? r0.getString(at(), null) : r0.getString(as(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            obp obpVar = (obp) aihn.parseFrom(obp.a, aigj.v(ksv.b(string)));
            String str = (obpVar.c == 1 ? (gcz) obpVar.d : gcz.a).c;
            File fileV = ixt.V(str, "pcam.jar", I());
            fileV.getClass();
            if (!fileV.exists()) {
                fileV = ixt.V(str, "pcam", I());
                fileV.getClass();
            }
            File fileV2 = ixt.V(str, "pcbc", I());
            fileV2.getClass();
            if (fileV.exists() && fileV2.exists()) {
                return obpVar;
            }
            return null;
        } catch (aiik unused) {
            ((omj) this.b).j(15317);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r9v13, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void L(obp obpVar, byte[] bArr, byte[] bArr2) {
        String str = (obpVar.c == 1 ? (gcz) obpVar.d : gcz.a).c;
        if (!TextUtils.isEmpty(str) && bArr2.length != 0) {
            File file = (File) this.a;
            ixt.X(file);
            file.mkdirs();
            File fileW = ixt.W(str, file);
            fileW.getClass();
            fileW.mkdirs();
            File fileV = ixt.V(str, "pcam.jar", file);
            fileV.getClass();
            if (bArr == null || bArr.length <= 0 || ixt.Y(fileV, bArr)) {
                File fileV2 = ixt.V(str, "pcbc", file);
                fileV2.getClass();
                if (ixt.Y(fileV2, bArr2)) {
                    String str2 = (obpVar.c == 1 ? (gcz) obpVar.d : gcz.a).c;
                    if (!TextUtils.isEmpty(str2)) {
                        File fileV3 = ixt.V(str2, "pcam.jar", file);
                        fileV3.getClass();
                        File fileV4 = ixt.V(str2, "pcbc", file);
                        fileV4.getClass();
                        File fileV5 = ixt.V(str2, "pcam.jar", I());
                        fileV5.getClass();
                        File fileV6 = ixt.V(str2, "pcbc", I());
                        fileV6.getClass();
                        if (fileV3.exists() && !fileV3.renameTo(fileV5)) {
                            ((omj) this.b).j(15318);
                        } else if (fileV4.exists() && fileV4.renameTo(fileV6)) {
                            obp obpVarK = K(1);
                            SharedPreferences.Editor editorEdit = this.d.edit();
                            if (obpVarK != null) {
                                if (!(obpVar.c == 1 ? (gcz) obpVar.d : gcz.a).c.equals((obpVarK.c == 1 ? (gcz) obpVarK.d : gcz.a).c)) {
                                    editorEdit.putString(as(), J(obpVarK));
                                }
                            }
                            editorEdit.putString(at(), J(obpVar));
                            if (!editorEdit.commit()) {
                                ((omj) this.b).j(15320);
                            }
                        } else {
                            ((omj) this.b).j(15319);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    obp obpVarK2 = K(1);
                    if (obpVarK2 != null) {
                        hashSet.add((obpVarK2.c == 1 ? (gcz) obpVarK2.d : gcz.a).c);
                    }
                    obp obpVarK3 = K(2);
                    if (obpVarK3 != null) {
                        hashSet.add((obpVarK3.c == 1 ? (gcz) obpVarK3.d : gcz.a).c);
                    }
                    File[] fileArrListFiles = I().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileW2 = ixt.W(name, I());
                                fileW2.getClass();
                                ixt.X(fileW2);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        ((omj) this.b).j(15316);
    }

    public final void M() {
        avmn avmnVar = (avmn) ((AtomicReference) this.a).getAndSet(null);
        if (avmnVar != null) {
            avmnVar.dispose();
        }
    }

    public final int N() {
        return ((AtomicInteger) this.b).get();
    }

    public final lpa O(int i, int i2, kty ktyVar) {
        ((AtomicInteger) this.a).incrementAndGet();
        kjc kjcVar = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        ikm ikmVar = new ikm(this, i, ktyVar, kjcVar, 2);
        Object obj = this.d;
        Handler handler = (Handler) obj;
        if (Looper.myLooper() == handler.getLooper()) {
            ikmVar.run();
        } else {
            handler.post(ikmVar);
        }
        lpa lpaVar = (lpa) kjcVar.a;
        lpaVar.l(new cck(obj, 9), new aace(this, i2, 1));
        return lpaVar;
    }

    public final synchronized boolean P(ktq ktqVar) {
        try {
            if (((elq) this.c).j(ktqVar) != null || ((kyr) this.e).h(ktqVar) != null) {
                return true;
            }
        } catch (ktl unused) {
        }
        return false;
    }

    public final List Q(List list) {
        return (List) Collection.EL.stream(list).filter(new ibz(this, 18)).collect(Collectors.toCollection(new ieu(6)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public final List R() {
        return new ArrayList((java.util.Collection) this.b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    public final void S(jjv jjvVar) {
        aqjv aqjvVar = jjvVar.a;
        if ((aqjvVar.b & 1) != 0) {
            this.d.add(aqjvVar.c);
        } else {
            this.a.add(jjvVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void T(jjv jjvVar) {
        this.b.add(jjvVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void U(jjv jjvVar) {
        this.b.remove(jjvVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
    public final boolean V(jjv jjvVar) {
        aqjv aqjvVar = jjvVar.a;
        return (aqjvVar.b & 1) != 0 ? this.d.contains(aqjvVar.c) : this.a.contains(jjvVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    public final jfg W() {
        Context context = (Context) this.c.io();
        context.getClass();
        vxe vxeVar = (vxe) this.e.io();
        vxeVar.getClass();
        hcb hcbVar = (hcb) this.d.io();
        hcbVar.getClass();
        ico icoVar = (ico) this.b.io();
        icoVar.getClass();
        vxz vxzVar = (vxz) this.a.io();
        vxzVar.getClass();
        return new jfg(context, vxeVar, hcbVar, icoVar, vxzVar);
    }

    public final void X(final List list, xgn xgnVar) {
        final ijy ijyVar = new ijy(this, xgnVar);
        final itu ituVar = (itu) this.e;
        ituVar.f.ae(5);
        taf.i(ituVar.c.p(true), ituVar.d, new ijj(ijyVar, 11), new tae() { // from class: its
            @Override // defpackage.tae, defpackage.twi
            public final void a(Object obj) {
                List list2 = (List) obj;
                aihf aihfVarCreateBuilder = aiwx.a.createBuilder();
                int i = 0;
                while (true) {
                    List list3 = list;
                    itu ituVar2 = ituVar;
                    if (i >= list2.size()) {
                        aihh aihhVar = (aihh) ajnf.a.createBuilder();
                        alay alayVarC = ackj.c(ituVar2.b.getString(R.string.create_new_playlist));
                        aihhVar.copyOnWrite();
                        ajnf ajnfVar = (ajnf) aihhVar.instance;
                        alayVarC.getClass();
                        ajnfVar.m = alayVarC;
                        ajnfVar.b |= 64;
                        aihh aihhVar2 = (aihh) alja.a.createBuilder();
                        aliz alizVar = aliz.ADD;
                        aihhVar2.copyOnWrite();
                        alja aljaVar = (alja) aihhVar2.instance;
                        aljaVar.c = alizVar.yN;
                        aljaVar.b |= 1;
                        aihhVar.copyOnWrite();
                        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
                        alja aljaVar2 = (alja) aihhVar2.build();
                        aljaVar2.getClass();
                        ajnfVar2.f = aljaVar2;
                        ajnfVar2.e = 8;
                        aihf aihfVarCreateBuilder2 = apyq.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        apyq apyqVar = (apyq) aihfVarCreateBuilder2.instance;
                        aiie aiieVar = apyqVar.c;
                        if (!aiieVar.c()) {
                            apyqVar.c = aihn.mutableCopy(aiieVar);
                        }
                        aifs.addAll(list3, apyqVar.c);
                        apyq apyqVar2 = (apyq) aihfVarCreateBuilder2.build();
                        aihh aihhVar3 = (aihh) ajwo.a.createBuilder();
                        aihhVar3.e(apyq.b, apyqVar2);
                        aihhVar.copyOnWrite();
                        ajnf ajnfVar3 = (ajnf) aihhVar.instance;
                        ajwo ajwoVar = (ajwo) aihhVar3.build();
                        ajwoVar.getClass();
                        ajnfVar3.r = ajwoVar;
                        ajnfVar3.b |= SemanticState.Obscured;
                        aihf aihfVarCreateBuilder3 = alwn.a.createBuilder();
                        aihf aihfVarCreateBuilder4 = aiwv.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        aiwv aiwvVar = (aiwv) aihfVarCreateBuilder4.instance;
                        ajnf ajnfVar4 = (ajnf) aihhVar.build();
                        ajnfVar4.getClass();
                        aiwvVar.c = ajnfVar4;
                        aiwvVar.b |= 1;
                        aihfVarCreateBuilder.copyOnWrite();
                        aiwx aiwxVar = (aiwx) aihfVarCreateBuilder.instance;
                        aiwv aiwvVar2 = (aiwv) aihfVarCreateBuilder4.build();
                        aiwvVar2.getClass();
                        aiie aiieVar2 = aiwxVar.h;
                        if (!aiieVar2.c()) {
                            aiwxVar.h = aihn.mutableCopy(aiieVar2);
                        }
                        sxu sxuVar = ijyVar;
                        aiwxVar.h.add(aiwvVar2);
                        aihfVarCreateBuilder3.copyOnWrite();
                        alwn alwnVar = (alwn) aihfVarCreateBuilder3.instance;
                        aiwx aiwxVar2 = (aiwx) aihfVarCreateBuilder.build();
                        aiwxVar2.getClass();
                        alwnVar.c = aiwxVar2;
                        alwnVar.b = 88978004;
                        sxuVar.b(null, (alwn) aihfVarCreateBuilder3.build());
                        return;
                    }
                    anuk anukVar = (anuk) list2.get(i);
                    aihf aihfVarCreateBuilder5 = aiww.a.createBuilder();
                    hfn hfnVar = ituVar2.g;
                    if (anukVar == null) {
                        throw new NullPointerException("Null playlistEntity");
                    }
                    if (list3 == null) {
                        throw new NullPointerException("Null contentUrisToAdd");
                    }
                    hcj hcjVar = new hcj(anukVar, list3);
                    zh zhVar = new zh();
                    zhVar.a = 1;
                    aosu aosuVar = (aosu) hfnVar.ap(hcj.class, aosu.class, hcjVar, agkj.j("display_context", zhVar.d()));
                    aihfVarCreateBuilder5.copyOnWrite();
                    aiww aiwwVar = (aiww) aihfVarCreateBuilder5.instance;
                    aosuVar.getClass();
                    aiwwVar.c = aosuVar;
                    aiwwVar.b = 74079946;
                    aiww aiwwVar2 = (aiww) aihfVarCreateBuilder5.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    aiwx aiwxVar3 = (aiwx) aihfVarCreateBuilder.instance;
                    aiwwVar2.getClass();
                    aiie aiieVar3 = aiwxVar3.g;
                    if (!aiieVar3.c()) {
                        aiwxVar3.g = aihn.mutableCopy(aiieVar3);
                    }
                    aiwxVar3.g.add(aiwwVar2);
                    i++;
                }
            }
        }, null);
    }

    public final ListenableFuture Y(abnl abnlVar, htf htfVar) {
        return Z(abnlVar, iar.a(ac(htfVar)), agke.q(htfVar), null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, wco] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, zwb] */
    public final ListenableFuture Z(final abnl abnlVar, final iar iarVar, final List list, wgi wgiVar) {
        aihh aihhVar;
        Optional optionalEmpty;
        ajwo ajwoVar;
        Optional optionalJ;
        ListenableFuture listenableFutureN;
        final Optional optionalEmpty2;
        final int iA = tym.C(abnlVar.a(), list.size()) ? abnlVar.a() : IntStream.CC.range(0, list.size()).filter(new abft(abnlVar, list, 1)).findFirst().orElse(0);
        htf htfVar = (htf) list.get(iA);
        final boolean z = wgiVar != null;
        if (z) {
            wgiVar.getClass();
            aihhVar = (aihh) wgiVar.a.toBuilder();
        } else {
            aihhVar = (aihh) amae.a.createBuilder();
        }
        final aihh aihhVar2 = aihhVar;
        if (z) {
            wgiVar.getClass();
            ajwo ajwoVar2 = wgiVar.d;
            if (ajwoVar2 != null) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
                ajwoVar2.c(aihlVarCheckIsLite);
                if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                    ajwo ajwoVar3 = ((amae) aihhVar2.instance).p;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
                    ajwoVar3.c(aihlVarCheckIsLite2);
                    if (ajwoVar3.j.n(aihlVarCheckIsLite2.d)) {
                        ajwo ajwoVar4 = ((amae) aihhVar2.instance).p;
                        if (ajwoVar4 == null) {
                            ajwoVar4 = ajwo.a;
                        }
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arik.a);
                        ajwoVar4.c(aihlVarCheckIsLite3);
                        Object objK = ajwoVar4.j.k(aihlVarCheckIsLite3.d);
                        arij arijVar = (arij) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK));
                        ias iasVarG = hna.g();
                        iasVarG.a = arijVar.d;
                        iasVarG.b = arijVar.e;
                        iasVarG.h(arijVar.f);
                        ajwo ajwoVar5 = ((amae) aihhVar2.instance).p;
                        if (ajwoVar5 == null) {
                            ajwoVar5 = ajwo.a;
                        }
                        iasVarG.i(gzj.P(ajwoVar5));
                        ajwo ajwoVarA = iasVarG.a();
                        aihhVar2.copyOnWrite();
                        amae amaeVar = (amae) aihhVar2.instance;
                        ajwoVarA.getClass();
                        amaeVar.p = ajwoVarA;
                        amaeVar.b |= SemanticState.Obscured;
                    }
                } else {
                    optionalEmpty = Optional.empty();
                    ajwoVar = abnlVar.b;
                    if (ajwoVar == null) {
                        optionalJ = Optional.empty();
                    } else {
                        optionalJ = hna.j(ajwoVar);
                    }
                    if (optionalJ.isPresent()) {
                        aihf builder = ((aihn) optionalJ.get()).toBuilder();
                        builder.copyOnWrite();
                        aohs aohsVar = (aohs) builder.instance;
                        aohsVar.b |= 8;
                        aohsVar.e = true;
                        optionalEmpty = Optional.of((aohs) builder.build());
                    }
                    ajwo ajwoVarA2 = iaq.a(null, htfVar.a, -1, (aohs) optionalEmpty.orElse(null), aigj.v(abnlVar.Q()));
                    aihhVar2.copyOnWrite();
                    amae amaeVar2 = (amae) aihhVar2.instance;
                    ajwoVarA2.getClass();
                    amaeVar2.p = ajwoVarA2;
                    amaeVar2.b |= SemanticState.Obscured;
                }
            } else {
                optionalEmpty = Optional.empty();
                ajwoVar = abnlVar.b;
                if (ajwoVar == null) {
                    optionalJ = Optional.empty();
                } else {
                    optionalJ = hna.j(ajwoVar);
                }
                if (optionalJ.isPresent()) {
                    aihf builder2 = ((aihn) optionalJ.get()).toBuilder();
                    builder2.copyOnWrite();
                    aohs aohsVar2 = (aohs) builder2.instance;
                    aohsVar2.b |= 8;
                    aohsVar2.e = true;
                    optionalEmpty = Optional.of((aohs) builder2.build());
                }
                ajwo ajwoVarA3 = iaq.a(null, htfVar.a, -1, (aohs) optionalEmpty.orElse(null), aigj.v(abnlVar.Q()));
                aihhVar2.copyOnWrite();
                amae amaeVar3 = (amae) aihhVar2.instance;
                ajwoVarA3.getClass();
                amaeVar3.p = ajwoVarA3;
                amaeVar3.b |= SemanticState.Obscured;
            }
        } else {
            optionalEmpty = Optional.empty();
            ajwoVar = abnlVar.b;
            if (ajwoVar == null) {
                optionalJ = Optional.empty();
            } else {
                optionalJ = hna.j(ajwoVar);
            }
            if (optionalJ.isPresent()) {
                aihf builder3 = ((aihn) optionalJ.get()).toBuilder();
                builder3.copyOnWrite();
                aohs aohsVar3 = (aohs) builder3.instance;
                aohsVar3.b |= 8;
                aohsVar3.e = true;
                optionalEmpty = Optional.of((aohs) builder3.build());
            }
            ajwo ajwoVarA4 = iaq.a(null, htfVar.a, -1, (aohs) optionalEmpty.orElse(null), aigj.v(abnlVar.Q()));
            aihhVar2.copyOnWrite();
            amae amaeVar4 = (amae) aihhVar2.instance;
            ajwoVarA4.getClass();
            amaeVar4.p = ajwoVarA4;
            amaeVar4.b |= SemanticState.Obscured;
        }
        anyx anyxVar = htfVar.b;
        aihf aihfVarCreateBuilder = amto.a.createBuilder();
        alay alayVarAa = aa(anyxVar.getTitle());
        aihfVarCreateBuilder.copyOnWrite();
        amto amtoVar = (amto) aihfVarCreateBuilder.instance;
        alayVarAa.getClass();
        amtoVar.d = alayVarAa;
        amtoVar.b |= 4;
        alay alayVarAa2 = aa(anyxVar.getArtistNames());
        aihfVarCreateBuilder.copyOnWrite();
        amto amtoVar2 = (amto) aihfVarCreateBuilder.instance;
        alayVarAa2.getClass();
        amtoVar2.f = alayVarAa2;
        amtoVar2.b |= 16;
        alay alayVarAa3 = aa(anyxVar.getAlbumTitle());
        aihfVarCreateBuilder.copyOnWrite();
        amto amtoVar3 = (amto) aihfVarCreateBuilder.instance;
        alayVarAa3.getClass();
        amtoVar3.g = alayVarAa3;
        amtoVar3.b |= 32;
        amto amtoVar4 = (amto) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = amaa.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amaa amaaVar = (amaa) aihfVarCreateBuilder2.instance;
        amtoVar4.getClass();
        amaaVar.c = amtoVar4;
        amaaVar.b = 61479009;
        aihhVar2.copyOnWrite();
        amae amaeVar5 = (amae) aihhVar2.instance;
        amaa amaaVar2 = (amaa) aihfVarCreateBuilder2.build();
        amaaVar2.getClass();
        amaeVar5.q = amaaVar2;
        amaeVar5.b |= 16384;
        if (z) {
            listenableFutureN = ahng.n(Optional.empty());
        } else {
            Optional optional = (Optional) this.d;
            optional.isPresent();
            final gmj gmjVar = (gmj) optional.get();
            if (((vxz) gmjVar.e).l(44, 45682398L, false) && igs.c(anyxVar.getMusicVideoType())) {
                optionalEmpty2 = htfVar.c;
                if (true == optionalEmpty2.isPresent()) {
                    optionalEmpty2 = Optional.ofNullable((alvt) wjr.F(((aoop) optionalEmpty2.get()).getPlayerResponseBytes().G(), alvt.a));
                }
            } else {
                optionalEmpty2 = Optional.empty();
            }
            String str = htfVar.a;
            aihh aihhVar3 = (aihh) amks.a.createBuilder();
            agke agkeVarS = agke.s(gmj.c(amlg.LIKE, str), gmj.c(amlg.DISLIKE, str), gmj.c(amlg.INDIFFERENT, str));
            aihhVar3.copyOnWrite();
            amks amksVar = (amks) aihhVar3.instance;
            aiie aiieVar = amksVar.g;
            if (!aiieVar.c()) {
                amksVar.g = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(agkeVarS, amksVar.g);
            ListenableFuture listenableFutureE = tzk.e(gmjVar.b.b(gmjVar.d.e()).g(wfs.g(62, str)));
            iat iatVar = new iat(aihhVar3, 6);
            ?? r1 = gmjVar.c;
            listenableFutureN = ahno.ar(ahno.ar(listenableFutureE, iatVar, r1), new agek() { // from class: iax
                /* JADX WARN: Type inference failed for: r6v14, types: [agfr, java.lang.Object] */
                @Override // defpackage.agek
                public final Object apply(Object obj) {
                    ales alesVar;
                    int i;
                    Optional optional2 = (Optional) obj;
                    boolean zIsEmpty = optional2.isEmpty();
                    Optional optional3 = optionalEmpty2;
                    if (zIsEmpty && optional3.isEmpty()) {
                        return Optional.empty();
                    }
                    gmj gmjVar2 = gmjVar;
                    aihf aihfVarCreateBuilder3 = aorw.a.createBuilder();
                    iay iayVar = new iay(gmjVar2, aihfVarCreateBuilder3);
                    int i2 = 1;
                    if (true != optional3.isPresent()) {
                        i = 1;
                    } else {
                        Object obj2 = optional3.get();
                        gmj gmjVar3 = iayVar.b;
                        aihf aihfVar = iayVar.a;
                        alvt alvtVar = (alvt) obj2;
                        aoqd aoqdVar = alvtVar.e;
                        if (aoqdVar == null) {
                            aoqdVar = aoqd.a;
                        }
                        if ((aoqdVar.c & 1073741824) != 0) {
                            aoqd aoqdVar2 = alvtVar.e;
                            if (aoqdVar2 == null) {
                                aoqdVar2 = aoqd.a;
                            }
                            alesVar = aoqdVar2.J;
                            if (alesVar == null) {
                                alesVar = ales.a;
                            }
                        } else {
                            aihf aihfVarCreateBuilder4 = ales.a.createBuilder();
                            aihfVarCreateBuilder4.copyOnWrite();
                            ales alesVar2 = (ales) aihfVarCreateBuilder4.instance;
                            alesVar2.b |= 1;
                            alesVar2.c = 50;
                            aihfVarCreateBuilder4.copyOnWrite();
                            ales alesVar3 = (ales) aihfVarCreateBuilder4.instance;
                            alesVar3.b |= 2;
                            alesVar3.d = 200;
                            aihfVarCreateBuilder4.copyOnWrite();
                            ales alesVar4 = (ales) aihfVarCreateBuilder4.instance;
                            alesVar4.b |= 4;
                            alesVar4.e = 5;
                            aler alerVar = aler.a;
                            aihf aihfVarCreateBuilder5 = alerVar.createBuilder();
                            aihfVarCreateBuilder5.copyOnWrite();
                            aler alerVar2 = (aler) aihfVarCreateBuilder5.instance;
                            alerVar2.b |= 2;
                            alerVar2.d = 80;
                            aihfVarCreateBuilder5.copyOnWrite();
                            aler alerVar3 = (aler) aihfVarCreateBuilder5.instance;
                            alerVar3.b |= 1;
                            alerVar3.c = "0.8";
                            aihfVarCreateBuilder4.aX((aler) aihfVarCreateBuilder5.build());
                            aihf aihfVarCreateBuilder6 = alerVar.createBuilder();
                            aihfVarCreateBuilder6.copyOnWrite();
                            aler alerVar4 = (aler) aihfVarCreateBuilder6.instance;
                            alerVar4.b |= 2;
                            alerVar4.d = 100;
                            aihfVarCreateBuilder6.copyOnWrite();
                            aler alerVar5 = (aler) aihfVarCreateBuilder6.instance;
                            alerVar5.b |= 1;
                            alerVar5.c = "1";
                            aihfVarCreateBuilder4.aX((aler) aihfVarCreateBuilder6.build());
                            aihf aihfVarCreateBuilder7 = alerVar.createBuilder();
                            aihfVarCreateBuilder7.copyOnWrite();
                            aler alerVar6 = (aler) aihfVarCreateBuilder7.instance;
                            alerVar6.b |= 2;
                            alerVar6.d = 120;
                            aihfVarCreateBuilder7.copyOnWrite();
                            aler alerVar7 = (aler) aihfVarCreateBuilder7.instance;
                            alerVar7.b |= 1;
                            alerVar7.c = "1.2";
                            aihfVarCreateBuilder4.aX((aler) aihfVarCreateBuilder7.build());
                            aihf aihfVarCreateBuilder8 = alerVar.createBuilder();
                            aihfVarCreateBuilder8.copyOnWrite();
                            aler alerVar8 = (aler) aihfVarCreateBuilder8.instance;
                            alerVar8.b |= 2;
                            alerVar8.d = 150;
                            aihfVarCreateBuilder8.copyOnWrite();
                            aler alerVar9 = (aler) aihfVarCreateBuilder8.instance;
                            alerVar9.b |= 1;
                            alerVar9.c = "1.5";
                            aihfVarCreateBuilder4.aX((aler) aihfVarCreateBuilder8.build());
                            aihf aihfVarCreateBuilder9 = alerVar.createBuilder();
                            aihfVarCreateBuilder9.copyOnWrite();
                            aler alerVar10 = (aler) aihfVarCreateBuilder9.instance;
                            alerVar10.b |= 2;
                            alerVar10.d = 180;
                            aihfVarCreateBuilder9.copyOnWrite();
                            aler alerVar11 = (aler) aihfVarCreateBuilder9.instance;
                            alerVar11.b |= 1;
                            alerVar11.c = "1.8";
                            aihfVarCreateBuilder4.aX((aler) aihfVarCreateBuilder9.build());
                            aihf aihfVarCreateBuilder10 = alerVar.createBuilder();
                            aihfVarCreateBuilder10.copyOnWrite();
                            aler alerVar12 = (aler) aihfVarCreateBuilder10.instance;
                            alerVar12.b |= 2;
                            alerVar12.d = 200;
                            aihfVarCreateBuilder10.copyOnWrite();
                            aler alerVar13 = (aler) aihfVarCreateBuilder10.instance;
                            alerVar13.b |= 1;
                            alerVar13.c = "2";
                            aihfVarCreateBuilder4.aX((aler) aihfVarCreateBuilder10.build());
                            alesVar = (ales) aihfVarCreateBuilder4.build();
                        }
                        agbo agboVar = (agbo) gmjVar3.a.io();
                        Object obj3 = gmjVar3.f;
                        aihf aihfVarCreateBuilder11 = aooz.a.createBuilder();
                        float f2 = alesVar.c;
                        aihfVarCreateBuilder11.copyOnWrite();
                        aooz aoozVar = (aooz) aihfVarCreateBuilder11.instance;
                        aoozVar.b |= 4;
                        float f3 = 100.0f;
                        aoozVar.c = f2 / 100.0f;
                        float f4 = alesVar.d;
                        aihfVarCreateBuilder11.copyOnWrite();
                        aooz aoozVar2 = (aooz) aihfVarCreateBuilder11.instance;
                        aoozVar2.b |= 8;
                        aoozVar2.d = f4 / 100.0f;
                        float f5 = alesVar.e;
                        aihfVarCreateBuilder11.copyOnWrite();
                        aooz aoozVar3 = (aooz) aihfVarCreateBuilder11.instance;
                        aoozVar3.b |= SemanticState.LiveRegion;
                        aoozVar3.i = f5 / 100.0f;
                        askp askpVar = askp.a;
                        aihf aihfVarCreateBuilder12 = askpVar.createBuilder();
                        Context context = (Context) obj3;
                        String string = context.getString(R.string.normal_playback_rate_label);
                        aihfVarCreateBuilder12.copyOnWrite();
                        askp askpVar2 = (askp) aihfVarCreateBuilder12.instance;
                        string.getClass();
                        askpVar2.b |= 1;
                        askpVar2.c = string;
                        askp askpVar3 = (askp) aihfVarCreateBuilder12.build();
                        aihfVarCreateBuilder11.copyOnWrite();
                        aooz aoozVar4 = (aooz) aihfVarCreateBuilder11.instance;
                        askpVar3.getClass();
                        aoozVar4.j = askpVar3;
                        aoozVar4.b |= SemanticState.ReadOnly;
                        aihf aihfVarCreateBuilder13 = askpVar.createBuilder();
                        String string2 = context.getString(R.string.recently_selected_playback_rate_label);
                        aihfVarCreateBuilder13.copyOnWrite();
                        askp askpVar4 = (askp) aihfVarCreateBuilder13.instance;
                        string2.getClass();
                        askpVar4.b |= 1;
                        askpVar4.c = string2;
                        askp askpVar5 = (askp) aihfVarCreateBuilder13.build();
                        aihfVarCreateBuilder11.copyOnWrite();
                        aooz aoozVar5 = (aooz) aihfVarCreateBuilder11.instance;
                        askpVar5.getClass();
                        aoozVar5.k = askpVar5;
                        aoozVar5.b |= SemanticState.Modal;
                        String string3 = context.getString(R.string.accessibility_increase_playback_speed);
                        aihfVarCreateBuilder11.copyOnWrite();
                        aooz aoozVar6 = (aooz) aihfVarCreateBuilder11.instance;
                        string3.getClass();
                        aoozVar6.b |= 16;
                        aoozVar6.e = string3;
                        String string4 = context.getString(R.string.accessibility_increment_button_max_limit_reached);
                        aihfVarCreateBuilder11.copyOnWrite();
                        aooz aoozVar7 = (aooz) aihfVarCreateBuilder11.instance;
                        string4.getClass();
                        aoozVar7.b |= 32;
                        aoozVar7.f = string4;
                        String string5 = context.getString(R.string.accessibility_decrease_playback_speed);
                        aihfVarCreateBuilder11.copyOnWrite();
                        aooz aoozVar8 = (aooz) aihfVarCreateBuilder11.instance;
                        string5.getClass();
                        aoozVar8.b |= 64;
                        aoozVar8.g = string5;
                        String string6 = context.getString(R.string.accessibility_decrement_button_min_limit_reached);
                        aihfVarCreateBuilder11.copyOnWrite();
                        aooz aoozVar9 = (aooz) aihfVarCreateBuilder11.instance;
                        string6.getClass();
                        aoozVar9.b |= SemanticState.Focused;
                        aoozVar9.h = string6;
                        for (aler alerVar14 : alesVar.f) {
                            float f6 = alerVar14.d / f3;
                            String str2 = alerVar14.c;
                            aihf aihfVarCreateBuilder14 = aooy.a.createBuilder();
                            aihf aihfVarCreateBuilder15 = askpVar.createBuilder();
                            aihfVarCreateBuilder15.copyOnWrite();
                            askp askpVar6 = (askp) aihfVarCreateBuilder15.instance;
                            str2.getClass();
                            askpVar6.b |= i2;
                            askpVar6.c = str2;
                            askp askpVar7 = (askp) aihfVarCreateBuilder15.build();
                            aihfVarCreateBuilder14.copyOnWrite();
                            aooy aooyVar = (aooy) aihfVarCreateBuilder14.instance;
                            askpVar7.getClass();
                            aooyVar.d = askpVar7;
                            aooyVar.c |= i2;
                            aihf aihfVarCreateBuilder16 = appk.a.createBuilder();
                            aihfVarCreateBuilder16.copyOnWrite();
                            appk appkVar = (appk) aihfVarCreateBuilder16.instance;
                            appkVar.b = 6;
                            appkVar.c = Float.valueOf(f6);
                            appk appkVar2 = (appk) aihfVarCreateBuilder16.build();
                            aihfVarCreateBuilder14.copyOnWrite();
                            aooy aooyVar2 = (aooy) aihfVarCreateBuilder14.instance;
                            appkVar2.getClass();
                            aooyVar2.e = appkVar2;
                            aooyVar2.c |= 2;
                            aihh aihhVar4 = (aihh) apjj.a.createBuilder();
                            aihl aihlVar = aiqc.b;
                            aihf aihfVarCreateBuilder17 = aiqc.a.createBuilder();
                            aihfVarCreateBuilder17.copyOnWrite();
                            aiqc aiqcVar = (aiqc) aihfVarCreateBuilder17.instance;
                            str2.getClass();
                            int i3 = i2;
                            aiqcVar.c |= 1;
                            aiqcVar.d = str2;
                            aihhVar4.e(aihlVar, (aiqc) aihfVarCreateBuilder17.build());
                            aihfVarCreateBuilder14.copyOnWrite();
                            aooy aooyVar3 = (aooy) aihfVarCreateBuilder14.instance;
                            apjj apjjVar = (apjj) aihhVar4.build();
                            apjjVar.getClass();
                            aooyVar3.f = apjjVar;
                            aooyVar3.c |= 32;
                            aooy aooyVar4 = (aooy) aihfVarCreateBuilder14.build();
                            aihh aihhVar5 = (aihh) apji.a.createBuilder();
                            aihhVar5.e(aooy.b, aooyVar4);
                            apji apjiVar = (apji) aihhVar5.build();
                            aihfVarCreateBuilder11.copyOnWrite();
                            aooz aoozVar10 = (aooz) aihfVarCreateBuilder11.instance;
                            apjiVar.getClass();
                            aiie aiieVar2 = aoozVar10.l;
                            if (!aiieVar2.c()) {
                                aoozVar10.l = aihn.mutableCopy(aiieVar2);
                            }
                            aoozVar10.l.add(apjiVar);
                            i2 = i3;
                            f3 = 100.0f;
                        }
                        i = i2;
                        if (alesVar.g) {
                            aihf aihfVarCreateBuilder18 = aopa.a.createBuilder();
                            aihf aihfVarCreateBuilder19 = askpVar.createBuilder();
                            String string7 = context.getString(R.string.trim_silence_label);
                            aihfVarCreateBuilder19.copyOnWrite();
                            askp askpVar8 = (askp) aihfVarCreateBuilder19.instance;
                            string7.getClass();
                            askpVar8.b |= 1;
                            askpVar8.c = string7;
                            aihfVarCreateBuilder18.copyOnWrite();
                            aopa aopaVar = (aopa) aihfVarCreateBuilder18.instance;
                            askp askpVar9 = (askp) aihfVarCreateBuilder19.build();
                            askpVar9.getClass();
                            aopaVar.d = askpVar9;
                            aopaVar.c |= 1;
                            aihf aihfVarCreateBuilder20 = askpVar.createBuilder();
                            String string8 = context.getString(R.string.trim_silence_description);
                            aihfVarCreateBuilder20.copyOnWrite();
                            askp askpVar10 = (askp) aihfVarCreateBuilder20.instance;
                            string8.getClass();
                            askpVar10.b |= 1;
                            askpVar10.c = string8;
                            aihfVarCreateBuilder18.copyOnWrite();
                            aopa aopaVar2 = (aopa) aihfVarCreateBuilder18.instance;
                            askp askpVar11 = (askp) aihfVarCreateBuilder20.build();
                            askpVar11.getClass();
                            aopaVar2.e = askpVar11;
                            aopaVar2.c |= 2;
                            String string9 = context.getString(R.string.accessibility_trim_silence_on);
                            aihfVarCreateBuilder18.copyOnWrite();
                            aopa aopaVar3 = (aopa) aihfVarCreateBuilder18.instance;
                            string9.getClass();
                            aopaVar3.c |= 4;
                            aopaVar3.f = string9;
                            String string10 = context.getString(R.string.accessibility_trim_silence_off);
                            aihfVarCreateBuilder18.copyOnWrite();
                            aopa aopaVar4 = (aopa) aihfVarCreateBuilder18.instance;
                            string10.getClass();
                            aopaVar4.c |= 8;
                            aopaVar4.g = string10;
                            aopa aopaVar5 = (aopa) aihfVarCreateBuilder18.build();
                            aihh aihhVar6 = (aihh) apji.a.createBuilder();
                            aihhVar6.e(aopa.b, aopaVar5);
                            apji apjiVar2 = (apji) aihhVar6.build();
                            aihfVarCreateBuilder11.copyOnWrite();
                            aooz aoozVar11 = (aooz) aihfVarCreateBuilder11.instance;
                            apjiVar2.getClass();
                            aoozVar11.m = apjiVar2;
                            aoozVar11.b |= SemanticState.Obscured;
                        }
                        aooz aoozVar12 = (aooz) aihfVarCreateBuilder11.build();
                        InstanceProxy instanceProxyD = agboVar.d();
                        if (instanceProxyD instanceof agbp) {
                            agcv agcvVar = ((agbp) instanceProxyD).a;
                        }
                        ajwo ajwoVar6 = ajwo.a;
                        ajwo ajwoVar7 = (ajwo) agboVar.f(-599461955, aoozVar12, aihn.getParserForClass(ajwo.class));
                        aihfVar.copyOnWrite();
                        aorw aorwVar = (aorw) aihfVar.instance;
                        ajwoVar7.getClass();
                        aorwVar.l = ajwoVar7;
                        aorwVar.c |= 134217728;
                    }
                    hun hunVar = new hun(aihfVarCreateBuilder3, 7);
                    if (i == optional2.isPresent()) {
                        Object obj4 = optional2.get();
                        Object obj5 = hunVar.a;
                        aihf aihfVarCreateBuilder21 = aorn.a.createBuilder();
                        aihfVarCreateBuilder21.copyOnWrite();
                        aorn aornVar = (aorn) aihfVarCreateBuilder21.instance;
                        aornVar.d = (amks) obj4;
                        aornVar.b |= 4;
                        ((aihf) obj5).cb(aihfVarCreateBuilder21);
                    }
                    return Optional.of((aorw) aihfVarCreateBuilder3.build());
                }
            }, r1);
        }
        return afxd.f(listenableFutureN).h(new ahcy() { // from class: iag
            /* JADX WARN: Code duplicated, block: B:10:0x007e  */
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                boolean z2;
                ListenableFuture listenableFutureG;
                Optional optional2 = (Optional) obj;
                final aihh aihhVar4 = aihhVar2;
                hun hunVar = new hun(aihhVar4, 6);
                if (true == optional2.isPresent()) {
                    Object obj2 = optional2.get();
                    Object obj3 = hunVar.a;
                    aihf aihfVarCreateBuilder3 = alzo.a.createBuilder();
                    aihfVarCreateBuilder3.copyOnWrite();
                    alzo alzoVar = (alzo) aihfVarCreateBuilder3.instance;
                    alzoVar.c = (aorw) obj2;
                    alzoVar.b = 78882851;
                    ((aihf) obj3).copyOnWrite();
                    amae amaeVar6 = (amae) ((aihh) obj3).instance;
                    alzo alzoVar2 = (alzo) aihfVarCreateBuilder3.build();
                    amae amaeVar7 = amae.a;
                    alzoVar2.getClass();
                    amaeVar6.h = alzoVar2;
                    amaeVar6.b |= 32;
                }
                boolean z3 = z;
                final int i = iA;
                final List list2 = list;
                abnl abnlVar2 = abnlVar;
                final ahgb ahgbVar = this.g;
                boolean zM = hna.m(abnlVar2);
                if (z3) {
                    z2 = false;
                } else {
                    ((Optional) ahgbVar.c).isPresent();
                    if (igs.a.contains(((htf) list2.get(i)).b.getMusicVideoType())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                ListenableFuture listenableFutureAr = aher.a;
                if (z2) {
                    final vxz vxzVar = (vxz) ahgbVar.a;
                    if (vxzVar.l(40, 45677954L, false)) {
                        Object obj4 = ahgbVar.e;
                        String str2 = ((htf) list2.get(i)).a;
                        Optional optional3 = (Optional) ahgbVar.c;
                        if (optional3.isEmpty()) {
                            ((agrc) ((agrc) iaq.a.b()).k("com/google/android/apps/youtube/music/player/offline/MusicWatchNextResponseFactoryUtils", "addLyricsEngagementPanel", 208, "MusicWatchNextResponseFactoryUtils.java")).t("DownloadsLyricsPageProvider is not available when adding lyrics engagement panel.");
                        } else {
                            final Context context = (Context) obj4;
                            listenableFutureAr = ahno.ar(((kwq) optional3.get()).m(str2), new agek() { // from class: iap
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.agek
                                public final Object apply(Object obj5) {
                                    akrn akrnVar = (akrn) obj5;
                                    aihf aihfVarCreateBuilder4 = akuh.a.createBuilder();
                                    aihfVarCreateBuilder4.copyOnWrite();
                                    akuh akuhVar = (akuh) aihfVarCreateBuilder4.instance;
                                    akrnVar.getClass();
                                    akuhVar.c = akrnVar;
                                    akuhVar.b = 153515154;
                                    akuh akuhVar2 = (akuh) aihfVarCreateBuilder4.build();
                                    aihf aihfVarCreateBuilder5 = akud.a.createBuilder();
                                    akuc akucVar = akuc.ENGAGEMENT_PANEL_SURFACE_WATCH;
                                    aihfVarCreateBuilder5.copyOnWrite();
                                    akud akudVar = (akud) aihfVarCreateBuilder5.instance;
                                    akudVar.c = akucVar.i;
                                    akudVar.b |= 1;
                                    aihfVarCreateBuilder5.copyOnWrite();
                                    akud akudVar2 = (akud) aihfVarCreateBuilder5.instance;
                                    akudVar2.b |= 2;
                                    akudVar2.d = "music_offline_lyrics_panel";
                                    akud akudVar3 = (akud) aihfVarCreateBuilder5.build();
                                    aihf aihfVarCreateBuilder6 = akuj.b.createBuilder();
                                    aihfVarCreateBuilder6.copyOnWrite();
                                    akuj akujVar = (akuj) aihfVarCreateBuilder6.instance;
                                    akudVar3.getClass();
                                    akujVar.f = akudVar3;
                                    akujVar.e = 18;
                                    aihfVarCreateBuilder6.copyOnWrite();
                                    akuj akujVar2 = (akuj) aihfVarCreateBuilder6.instance;
                                    akuhVar2.getClass();
                                    akujVar2.h = akuhVar2;
                                    akujVar2.c |= 4;
                                    aihfVarCreateBuilder6.copyOnWrite();
                                    akuj akujVar3 = (akuj) aihfVarCreateBuilder6.instance;
                                    akujVar3.c |= SemanticState.Focused;
                                    akujVar3.m = true;
                                    aihfVarCreateBuilder6.copyOnWrite();
                                    akuj akujVar4 = (akuj) aihfVarCreateBuilder6.instance;
                                    akujVar4.c |= 16777216;
                                    akujVar4.D = 95102;
                                    aihfVarCreateBuilder6.copyOnWrite();
                                    akuj akujVar5 = (akuj) aihfVarCreateBuilder6.instance;
                                    akujVar5.c |= 2097152;
                                    akujVar5.A = true;
                                    aihfVarCreateBuilder6.copyOnWrite();
                                    akuj akujVar6 = (akuj) aihfVarCreateBuilder6.instance;
                                    akujVar6.c |= 4194304;
                                    akujVar6.B = true;
                                    vxz vxzVar2 = vxzVar;
                                    if (vxzVar2.l(108, 45806734L, false)) {
                                        aihfVarCreateBuilder6.copyOnWrite();
                                        akuj akujVar7 = (akuj) aihfVarCreateBuilder6.instance;
                                        akujVar7.O = 1;
                                        akujVar7.d |= 32;
                                    } else {
                                        Context context2 = context;
                                        aihf aihfVarCreateBuilder7 = akui.a.createBuilder();
                                        aihf aihfVarCreateBuilder8 = akuo.a.createBuilder();
                                        aihh aihhVar5 = (aihh) alay.a.createBuilder();
                                        String string = context2.getString(R.string.lyrics_tab_title);
                                        aihhVar5.copyOnWrite();
                                        alay alayVar = (alay) aihhVar5.instance;
                                        string.getClass();
                                        alayVar.b |= 1;
                                        alayVar.d = string;
                                        aihfVarCreateBuilder8.copyOnWrite();
                                        akuo akuoVar = (akuo) aihfVarCreateBuilder8.instance;
                                        alay alayVar2 = (alay) aihhVar5.build();
                                        alayVar2.getClass();
                                        akuoVar.e = alayVar2;
                                        akuoVar.b |= 2;
                                        akuo akuoVar2 = (akuo) aihfVarCreateBuilder8.build();
                                        aihfVarCreateBuilder7.copyOnWrite();
                                        akui akuiVar = (akui) aihfVarCreateBuilder7.instance;
                                        akuoVar2.getClass();
                                        akuiVar.c = akuoVar2;
                                        akuiVar.b = 138681548;
                                        akui akuiVar2 = (akui) aihfVarCreateBuilder7.build();
                                        aihfVarCreateBuilder6.copyOnWrite();
                                        akuj akujVar8 = (akuj) aihfVarCreateBuilder6.instance;
                                        akuiVar2.getClass();
                                        akujVar8.g = akuiVar2;
                                        akujVar8.c |= 2;
                                    }
                                    if (vxzVar2.l(67, 45726685L, false)) {
                                        String strAM = kro.aM();
                                        aihfVarCreateBuilder6.copyOnWrite();
                                        akuj akujVar9 = (akuj) aihfVarCreateBuilder6.instance;
                                        strAM.getClass();
                                        akujVar9.d |= SemanticState.Hidden;
                                        akujVar9.Q = strAM;
                                        aihfVarCreateBuilder6.copyOnWrite();
                                        akuj akujVar10 = (akuj) aihfVarCreateBuilder6.instance;
                                        akujVar10.P = 4;
                                        akujVar10.d |= 64;
                                    }
                                    if (vxzVar2.l(105, 45795183L, false)) {
                                        agke agkeVarR = agke.r(akua.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER, akua.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_MINI_PLAYER);
                                        aihfVarCreateBuilder6.copyOnWrite();
                                        akuj akujVar11 = (akuj) aihfVarCreateBuilder6.instance;
                                        akujVar11.a();
                                        agqs agqsVarListIterator = agkeVarR.listIterator(0);
                                        while (agqsVarListIterator.hasNext()) {
                                            akujVar11.r.h(((akua) agqsVarListIterator.next()).f);
                                        }
                                    }
                                    aihh aihhVar6 = aihhVar4;
                                    aihf aihfVarCreateBuilder9 = akuf.a.createBuilder();
                                    akuj akujVar12 = (akuj) aihfVarCreateBuilder6.build();
                                    aihfVarCreateBuilder9.copyOnWrite();
                                    akuf akufVar = (akuf) aihfVarCreateBuilder9.instance;
                                    akujVar12.getClass();
                                    akufVar.c = akujVar12;
                                    akufVar.b = 138681066;
                                    akuf akufVar2 = (akuf) aihfVarCreateBuilder9.build();
                                    aihhVar6.copyOnWrite();
                                    amae amaeVar8 = (amae) aihhVar6.instance;
                                    amae amaeVar9 = amae.a;
                                    akufVar2.getClass();
                                    aiie aiieVar2 = amaeVar8.r;
                                    if (!aiieVar2.c()) {
                                        amaeVar8.r = aihn.mutableCopy(aiieVar2);
                                    }
                                    amaeVar8.r.add(akufVar2);
                                    return null;
                                }
                            }, MoreExecutors.directExecutor());
                        }
                    }
                }
                boolean z4 = !((vxz) ahgbVar.a).l(40, 45677954L, false) && z2;
                aihf aihfVarCreateBuilder4 = amah.a.createBuilder();
                if (zM) {
                    aihf aihfVarCreateBuilder5 = aqjj.a.createBuilder();
                    String string = ((Context) ahgbVar.e).getString(R.string.default_queue_title);
                    aihfVarCreateBuilder5.copyOnWrite();
                    aqjj aqjjVar = (aqjj) aihfVarCreateBuilder5.instance;
                    string.getClass();
                    aqjjVar.b |= 4;
                    aqjjVar.e = string;
                    aihf aihfVarCreateBuilder6 = aqjg.a.createBuilder();
                    anvq anvqVar = anvq.a;
                    aihfVarCreateBuilder6.copyOnWrite();
                    aqjg aqjgVar = (aqjg) aihfVarCreateBuilder6.instance;
                    anvqVar.getClass();
                    aqjgVar.e = anvqVar;
                    aqjgVar.b |= 4194304;
                    aihfVarCreateBuilder5.copyOnWrite();
                    aqjj aqjjVar2 = (aqjj) aihfVarCreateBuilder5.instance;
                    aqjg aqjgVar2 = (aqjg) aihfVarCreateBuilder6.build();
                    aqjgVar2.getClass();
                    aqjjVar2.i = aqjgVar2;
                    aqjjVar2.b |= 16384;
                    aihfVarCreateBuilder4.copyOnWrite();
                    amah amahVar = (amah) aihfVarCreateBuilder4.instance;
                    aqjj aqjjVar3 = (aqjj) aihfVarCreateBuilder5.build();
                    aqjjVar3.getClass();
                    amahVar.c = aqjjVar3;
                    amahVar.b = 58174010;
                    iaq.b(aihhVar4, (amah) aihfVarCreateBuilder4.build(), z4 ? Optional.of(ahgbVar.ab(((htf) list2.get(i)).a)) : Optional.empty());
                    listenableFutureG = ahno.ar(listenableFutureAr, new hqt(18), MoreExecutors.directExecutor());
                } else {
                    iar iarVar2 = iarVar;
                    int size = list2.size();
                    aihh aihhVar5 = (aihh) aouj.a.createBuilder();
                    String strU = abnlVar2.u();
                    aihhVar5.copyOnWrite();
                    aouj aoujVar = (aouj) aihhVar5.instance;
                    strU.getClass();
                    aoujVar.c |= SemanticState.Multiline;
                    aoujVar.i = strU;
                    alay alayVarAa4 = ahgb.aa(iarVar2.b);
                    aihhVar5.copyOnWrite();
                    aouj aoujVar2 = (aouj) aihhVar5.instance;
                    alayVarAa4.getClass();
                    aoujVar2.f = alayVarAa4;
                    int i2 = 2;
                    aoujVar2.c |= 2;
                    aihhVar5.copyOnWrite();
                    aouj aoujVar3 = (aouj) aihhVar5.instance;
                    aoujVar3.c |= SemanticState.Modal;
                    aoujVar3.h = i;
                    aihhVar5.copyOnWrite();
                    aouj aoujVar4 = (aouj) aihhVar5.instance;
                    aoujVar4.c |= 16384;
                    aoujVar4.k = size;
                    alay alayVarAa5 = ahgb.aa(((Context) ahgbVar.e).getResources().getQuantityString(R.plurals.offline_playlist_size, size, Integer.valueOf(size)));
                    aihhVar5.copyOnWrite();
                    aouj aoujVar5 = (aouj) aihhVar5.instance;
                    alayVarAa5.getClass();
                    aoujVar5.l = alayVarAa5;
                    aoujVar5.c |= 32768;
                    ArrayList arrayList = new ArrayList(list2.size());
                    int i3 = 0;
                    while (i3 < list2.size()) {
                        htf htfVar2 = (htf) list2.get(i3);
                        Object obj5 = ahgbVar.b;
                        anyx anyxVar2 = htfVar2.b;
                        zh zhVar = new zh();
                        zhVar.a = i2;
                        imk imkVarD = zhVar.d();
                        vzq vzqVarA = ini.a();
                        vzqVarA.e(i3);
                        vzqVarA.f(i);
                        vzqVarA.d(abnlVar2.u());
                        arrayList.add(((hfn) obj5).ao(anyx.class, aoun.class, anyxVar2, agkj.k("display_context", imkVarD, "playlist_panel_video_context", vzqVarA.c())));
                        i3++;
                        iarVar2 = iarVar2;
                        aihfVarCreateBuilder4 = aihfVarCreateBuilder4;
                        i2 = 2;
                    }
                    final iar iarVar3 = iarVar2;
                    final aihf aihfVar = aihfVarCreateBuilder4;
                    afxd afxdVarH = afxd.f(listenableFutureAr).h(new hqj(ahno.au(arrayList).k(new uf(arrayList, aihhVar5, 18), MoreExecutors.directExecutor()), 14), MoreExecutors.directExecutor());
                    final boolean z5 = z4;
                    listenableFutureG = afxdVarH.g(new agek() { // from class: iaf
                        @Override // defpackage.agek
                        public final Object apply(Object obj6) {
                            Optional optionalEmpty3;
                            aihf aihfVarCreateBuilder7 = anvq.a.createBuilder();
                            aihh aihhVar6 = (aihh) apji.a.createBuilder();
                            aihhVar6.e(aouq.a, (aouj) obj6);
                            aihfVarCreateBuilder7.copyOnWrite();
                            anvq anvqVar2 = (anvq) aihfVarCreateBuilder7.instance;
                            apji apjiVar = (apji) aihhVar6.build();
                            apjiVar.getClass();
                            anvqVar2.c = apjiVar;
                            anvqVar2.b |= 1;
                            ahgb ahgbVar2 = ahgbVar;
                            Context context2 = (Context) ahgbVar2.e;
                            String string2 = context2.getString(R.string.queue_header_title);
                            iar iarVar4 = iarVar3;
                            String str3 = iarVar4.a;
                            ajwo ajwoVarT = TextUtils.isEmpty(str3) ? null : fhz.T(str3, iarVar4.c);
                            String str4 = iarVar4.b;
                            boolean z6 = z5;
                            aihf aihfVar2 = aihfVar;
                            apji apjiVarI = hna.i(context2, string2, str4, ajwoVarT);
                            aihfVarCreateBuilder7.copyOnWrite();
                            anvq anvqVar3 = (anvq) aihfVarCreateBuilder7.instance;
                            apjiVarI.getClass();
                            anvqVar3.e = apjiVarI;
                            anvqVar3.b |= 4;
                            anvq anvqVar4 = (anvq) aihfVarCreateBuilder7.build();
                            aihf aihfVarCreateBuilder8 = aqjj.a.createBuilder();
                            String string3 = context2.getString(R.string.default_queue_title);
                            aihfVarCreateBuilder8.copyOnWrite();
                            aqjj aqjjVar4 = (aqjj) aihfVarCreateBuilder8.instance;
                            string3.getClass();
                            aqjjVar4.b |= 4;
                            aqjjVar4.e = string3;
                            aihf aihfVarCreateBuilder9 = aqjg.a.createBuilder();
                            aihfVarCreateBuilder9.copyOnWrite();
                            aqjg aqjgVar3 = (aqjg) aihfVarCreateBuilder9.instance;
                            anvqVar4.getClass();
                            aqjgVar3.e = anvqVar4;
                            aqjgVar3.b |= 4194304;
                            aihfVarCreateBuilder8.copyOnWrite();
                            aqjj aqjjVar5 = (aqjj) aihfVarCreateBuilder8.instance;
                            aqjg aqjgVar4 = (aqjg) aihfVarCreateBuilder9.build();
                            aqjgVar4.getClass();
                            aqjjVar5.i = aqjgVar4;
                            aqjjVar5.b |= 16384;
                            aihfVar2.copyOnWrite();
                            amah amahVar2 = (amah) aihfVar2.instance;
                            aqjj aqjjVar6 = (aqjj) aihfVarCreateBuilder8.build();
                            amah amahVar3 = amah.a;
                            aqjjVar6.getClass();
                            amahVar2.c = aqjjVar6;
                            amahVar2.b = 58174010;
                            amah amahVar4 = (amah) aihfVar2.build();
                            if (z6) {
                                optionalEmpty3 = Optional.of(ahgbVar2.ab(((htf) list2.get(i)).a));
                            } else {
                                optionalEmpty3 = Optional.empty();
                            }
                            iaq.b(aihhVar4, amahVar4, optionalEmpty3);
                            return null;
                        }
                    }, MoreExecutors.directExecutor());
                }
                return ahno.ar(listenableFutureG, new hrk(aihhVar4, 20), MoreExecutors.directExecutor());
            }
        }, MoreExecutors.directExecutor());
    }

    public final amah ab(String str) {
        aihf aihfVarCreateBuilder = amah.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aqjj.a.createBuilder();
        String string = ((Context) this.e).getString(R.string.lyrics_tab_title);
        aihfVarCreateBuilder2.copyOnWrite();
        aqjj aqjjVar = (aqjj) aihfVarCreateBuilder2.instance;
        string.getClass();
        aqjjVar.b |= 4;
        aqjjVar.e = string;
        aihf aihfVarCreateBuilder3 = apmo.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        apmo apmoVar = (apmo) aihfVarCreateBuilder3.instance;
        apmoVar.b |= 1;
        apmoVar.c = 95102;
        apmo apmoVar2 = (apmo) aihfVarCreateBuilder3.build();
        aihfVarCreateBuilder2.copyOnWrite();
        aqjj aqjjVar2 = (aqjj) aihfVarCreateBuilder2.instance;
        apmoVar2.getClass();
        aqjjVar2.l = apmoVar2;
        aqjjVar2.b |= 2097152;
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = ajmj.a;
        aihf aihfVarCreateBuilder4 = ajmf.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        ajmf ajmfVar = (ajmf) aihfVarCreateBuilder4.instance;
        ajmfVar.b |= 1;
        ajmfVar.c = "FEmusic_offline_lyrics_".concat(String.valueOf(str));
        aihf aihfVarCreateBuilder5 = ajmh.a.createBuilder();
        aihf aihfVarCreateBuilder6 = ajmg.a.createBuilder();
        aihfVarCreateBuilder6.copyOnWrite();
        ajmg ajmgVar = (ajmg) aihfVarCreateBuilder6.instance;
        ajmgVar.c = 6;
        ajmgVar.b |= 1;
        aihfVarCreateBuilder6.copyOnWrite();
        ajmg ajmgVar2 = (ajmg) aihfVarCreateBuilder6.instance;
        ajmgVar2.d = 2;
        ajmgVar2.b |= 2;
        aihfVarCreateBuilder5.copyOnWrite();
        ajmh ajmhVar = (ajmh) aihfVarCreateBuilder5.instance;
        ajmg ajmgVar3 = (ajmg) aihfVarCreateBuilder6.build();
        ajmgVar3.getClass();
        ajmhVar.c = ajmgVar3;
        ajmhVar.b |= 16;
        aihfVarCreateBuilder4.copyOnWrite();
        ajmf ajmfVar2 = (ajmf) aihfVarCreateBuilder4.instance;
        ajmh ajmhVar2 = (ajmh) aihfVarCreateBuilder5.build();
        ajmhVar2.getClass();
        ajmfVar2.g = ajmhVar2;
        ajmfVar2.b |= 32;
        aihhVar.e(aihlVar, (ajmf) aihfVarCreateBuilder4.build());
        aihl aihlVar2 = aoaq.b;
        aihf aihfVarCreateBuilder7 = aoar.a.createBuilder();
        aihfVarCreateBuilder7.copyOnWrite();
        aoar aoarVar = (aoar) aihfVarCreateBuilder7.instance;
        aoarVar.b |= 2;
        aoarVar.d = 3832;
        aihhVar.e(aihlVar2, (aoar) aihfVarCreateBuilder7.build());
        aihfVarCreateBuilder2.copyOnWrite();
        aqjj aqjjVar3 = (aqjj) aihfVarCreateBuilder2.instance;
        ajwo ajwoVar = (ajwo) aihhVar.build();
        ajwoVar.getClass();
        aqjjVar3.d = ajwoVar;
        aqjjVar3.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        amah amahVar = (amah) aihfVarCreateBuilder.instance;
        aqjj aqjjVar4 = (aqjj) aihfVarCreateBuilder2.build();
        aqjjVar4.getClass();
        amahVar.c = aqjjVar4;
        amahVar.b = 58174010;
        return (amah) aihfVarCreateBuilder.build();
    }

    public final String ac(htf htfVar) {
        boolean zC = igs.c(htfVar.b.getMusicVideoType());
        Object obj = this.e;
        return zC ? ((Context) obj).getString(R.string.offline_episodes_detail_page_title) : ((Context) obj).getString(R.string.offline_songs_title);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public final void ad(String str, List list, List list2) {
        Optional optionalFindFirst = Collection.EL.stream(list).findFirst();
        hmr hmrVar = new hmr(this, str, list2, 2);
        if (true == optionalFindFirst.isPresent()) {
            Object obj = optionalFindFirst.get();
            Object obj2 = hmrVar.a;
            Object obj3 = hmrVar.b;
            ?? r5 = hmrVar.c;
            ((aha) ((ahgb) obj2).e).put(obj, Integer.valueOf(hmy.p((String) obj3, obj) - 1));
            r5.add(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, wco] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, zwb] */
    public final ListenableFuture ae(List list) {
        ?? r0 = this.e;
        hpy hpyVar = (hpy) r0.io();
        Stream map = Collection.EL.stream(list).map(new hsw(0));
        Collector collector = aghu.a;
        ListenableFuture listenableFutureB = hpyVar.b((List) map.collect(collector));
        int i = 3;
        int i2 = 2;
        if (!((vxz) this.c).k(45861162L, false)) {
            ListenableFuture listenableFutureB2 = ((hpy) r0.io()).b((List) Collection.EL.stream(list).map(new hsw(i2)).collect(collector));
            ListenableFuture listenableFutureB3 = ((hpy) r0.io()).b((List) Collection.EL.stream(list).map(new hsw(i)).collect(collector));
            return ahno.av(listenableFutureB, listenableFutureB2, listenableFutureB3).k(new egz(listenableFutureB, listenableFutureB2, listenableFutureB3, 11), this.a);
        }
        wcn wcnVarB = this.b.b(this.d.e());
        ListenableFuture listenableFutureB4 = tzk.b(wcnVarB.q(557));
        ListenableFuture listenableFutureB5 = tzk.b(wcnVarB.q(62));
        return ahno.av(listenableFutureB, listenableFutureB4, listenableFutureB5).k(new hlm(listenableFutureB, listenableFutureB4, agkz.n(list), listenableFutureB5, 3), this.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [awmd, java.lang.Object] */
    public final void ah(alri alriVar, ajwo ajwoVar, Map map) {
        jgc jgcVar = (jgc) this.e;
        ttm ttmVar = (ttm) jgcVar.b.io();
        ttmVar.getClass();
        huf hufVar = (huf) jgcVar.i.io();
        hufVar.getClass();
        hpy hpyVar = (hpy) jgcVar.f.io();
        hpyVar.getClass();
        hpb hpbVar = (hpb) jgcVar.a.io();
        hpbVar.getClass();
        khn khnVar = (khn) jgcVar.k.io();
        khnVar.getClass();
        tbt tbtVar = (tbt) jgcVar.g.io();
        tbtVar.getClass();
        Executor executor = (Executor) jgcVar.e.io();
        executor.getClass();
        vxz vxzVar = (vxz) jgcVar.d.io();
        vxzVar.getClass();
        vxz vxzVar2 = (vxz) jgcVar.j.io();
        vxzVar2.getClass();
        awkv awkvVar = (awkv) jgcVar.h.io();
        awkvVar.getClass();
        awkv awkvVar2 = (awkv) jgcVar.c.io();
        awkvVar2.getClass();
        ajwoVar.getClass();
        new hfe(ttmVar, hufVar, hpyVar, hpbVar, khnVar, tbtVar, jgcVar.l, executor, vxzVar, vxzVar2, awkvVar, awkvVar2, ajwoVar, map).a(alriVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ttm] */
    public final void ai(Throwable th) {
        ((khn) this.b).h(this.c.b(th));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [awmd, java.lang.Object] */
    public final void aj(alrk alrkVar, ajwo ajwoVar, Map map) {
        jgc jgcVar = (jgc) this.d;
        ttm ttmVar = (ttm) jgcVar.b.io();
        ttmVar.getClass();
        huf hufVar = (huf) jgcVar.i.io();
        hufVar.getClass();
        hpy hpyVar = (hpy) jgcVar.f.io();
        hpyVar.getClass();
        hpb hpbVar = (hpb) jgcVar.a.io();
        hpbVar.getClass();
        khn khnVar = (khn) jgcVar.k.io();
        khnVar.getClass();
        tbt tbtVar = (tbt) jgcVar.g.io();
        tbtVar.getClass();
        Executor executor = (Executor) jgcVar.e.io();
        executor.getClass();
        vxz vxzVar = (vxz) jgcVar.d.io();
        vxzVar.getClass();
        vxz vxzVar2 = (vxz) jgcVar.j.io();
        vxzVar2.getClass();
        awkv awkvVar = (awkv) jgcVar.h.io();
        awkvVar.getClass();
        awkv awkvVar2 = (awkv) jgcVar.c.io();
        awkvVar2.getClass();
        ajwoVar.getClass();
        new hfm(ttmVar, hufVar, hpyVar, hpbVar, khnVar, tbtVar, jgcVar.l, executor, vxzVar, vxzVar2, awkvVar, awkvVar2, ajwoVar, map).a(alrkVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [awmd, java.lang.Object] */
    public final void ak(alrm alrmVar, ajwo ajwoVar, Map map) {
        jgc jgcVar = (jgc) this.a;
        ttm ttmVar = (ttm) jgcVar.b.io();
        ttmVar.getClass();
        huf hufVar = (huf) jgcVar.i.io();
        hufVar.getClass();
        hpy hpyVar = (hpy) jgcVar.f.io();
        hpyVar.getClass();
        hpb hpbVar = (hpb) jgcVar.a.io();
        hpbVar.getClass();
        khn khnVar = (khn) jgcVar.k.io();
        khnVar.getClass();
        tbt tbtVar = (tbt) jgcVar.g.io();
        tbtVar.getClass();
        Executor executor = (Executor) jgcVar.e.io();
        executor.getClass();
        vxz vxzVar = (vxz) jgcVar.d.io();
        vxzVar.getClass();
        vxz vxzVar2 = (vxz) jgcVar.j.io();
        vxzVar2.getClass();
        awkv awkvVar = (awkv) jgcVar.h.io();
        awkvVar.getClass();
        awkv awkvVar2 = (awkv) jgcVar.c.io();
        awkvVar2.getClass();
        ajwoVar.getClass();
        new hfr(ttmVar, hufVar, hpyVar, hpbVar, khnVar, tbtVar, jgcVar.l, executor, vxzVar, vxzVar2, awkvVar, awkvVar2, ajwoVar, map).a(alrmVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void al(Class cls, String str, zb zbVar) {
        this.a.put(cls, zbVar);
        if (str != null) {
            this.e.put(str, cls);
            this.b.put(cls, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0230 A[Catch: ClassNotFoundException -> 0x024b, ktl -> 0x0254, all -> 0x025f, TryCatch #1 {ktl -> 0x0254, blocks: (B:87:0x0189, B:91:0x01a1, B:93:0x01ab, B:95:0x01b1, B:96:0x01b6, B:98:0x01be, B:99:0x01c8, B:100:0x01e0, B:105:0x0213, B:106:0x022f, B:107:0x0230, B:108:0x023a, B:109:0x023b, B:110:0x024a), top: B:125:0x0189, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x023b A[Catch: ClassNotFoundException -> 0x024b, ktl -> 0x0254, all -> 0x025f, TryCatch #1 {ktl -> 0x0254, blocks: (B:87:0x0189, B:91:0x01a1, B:93:0x01ab, B:95:0x01b1, B:96:0x01b6, B:98:0x01be, B:99:0x01c8, B:100:0x01e0, B:105:0x0213, B:106:0x022f, B:107:0x0230, B:108:0x023a, B:109:0x023b, B:110:0x024a), top: B:125:0x0189, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01a1 A[Catch: ClassNotFoundException -> 0x024b, ktl -> 0x0254, all -> 0x025f, TRY_ENTER, TryCatch #1 {ktl -> 0x0254, blocks: (B:87:0x0189, B:91:0x01a1, B:93:0x01ab, B:95:0x01b1, B:96:0x01b6, B:98:0x01be, B:99:0x01c8, B:100:0x01e0, B:105:0x0213, B:106:0x022f, B:107:0x0230, B:108:0x023a, B:109:0x023b, B:110:0x024a), top: B:125:0x0189, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ab A[Catch: ClassNotFoundException -> 0x024b, ktl -> 0x0254, all -> 0x025f, TryCatch #1 {ktl -> 0x0254, blocks: (B:87:0x0189, B:91:0x01a1, B:93:0x01ab, B:95:0x01b1, B:96:0x01b6, B:98:0x01be, B:99:0x01c8, B:100:0x01e0, B:105:0x0213, B:106:0x022f, B:107:0x0230, B:108:0x023a, B:109:0x023b, B:110:0x024a), top: B:125:0x0189, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01b1 A[Catch: ClassNotFoundException -> 0x024b, ktl -> 0x0254, all -> 0x025f, TryCatch #1 {ktl -> 0x0254, blocks: (B:87:0x0189, B:91:0x01a1, B:93:0x01ab, B:95:0x01b1, B:96:0x01b6, B:98:0x01be, B:99:0x01c8, B:100:0x01e0, B:105:0x0213, B:106:0x022f, B:107:0x0230, B:108:0x023a, B:109:0x023b, B:110:0x024a), top: B:125:0x0189, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01be A[Catch: ClassNotFoundException -> 0x024b, ktl -> 0x0254, all -> 0x025f, TRY_LEAVE, TryCatch #1 {ktl -> 0x0254, blocks: (B:87:0x0189, B:91:0x01a1, B:93:0x01ab, B:95:0x01b1, B:96:0x01b6, B:98:0x01be, B:99:0x01c8, B:100:0x01e0, B:105:0x0213, B:106:0x022f, B:107:0x0230, B:108:0x023a, B:109:0x023b, B:110:0x024a), top: B:125:0x0189, outer: #15 }] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.util.List] */
    public final synchronized elq am(ktq ktqVar, Parcelable parcelable, FileInputStream fileInputStream) {
        Class clsJ;
        ktm ktmVarH;
        File file;
        if (P(ktqVar)) {
            clsJ = ((elq) this.c).j(ktqVar);
            if (clsJ != null) {
                kyr.m(((kyr) this.e).g(ktqVar.a));
            } else {
                ktmVarH = ((kyr) this.e).h(ktqVar);
                if (ktmVarH != null) {
                    throw new ktp(a.bT(ktqVar.a, "VM key ", " not found in the cache"));
                }
                if (ksy.b()) {
                    ktmVarH.a.setWritable(false, false);
                }
                file = ktmVarH.a;
                if (au(file)) {
                    kyr.l(ktmVarH);
                    throw new ClassNotFoundException("APK signature verification failed");
                }
                ((ktu) this.b).c(7, ktt.c);
                DexClassLoader dexClassLoader = new DexClassLoader(file.getAbsolutePath(), ktmVarH.b.getAbsolutePath(), null, ((Context) this.d).getClassLoader());
                ((ktu) this.b).c(8, ktt.c);
                clsJ = dexClassLoader.loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                ((elq) this.c).a.put(ktqVar, clsJ);
            }
            ((ktu) this.b).c(9, ktt.c);
        } else {
            Object obj = this.e;
            String strValueOf = String.valueOf(String.valueOf(UUID.randomUUID()));
            ksy ksyVar = kya.a;
            File fileI = ((kyr) obj).i();
            int i = kye.a;
            File file2 = new File(ksy.ao(fileI, strValueOf.concat(".apk")));
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                        try {
                            FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary2 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
                            try {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary2.transferFrom(fileChannelConvertMaybeLegacyFileChannelFromLibrary, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size());
                                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary2 != null) {
                                    fileChannelConvertMaybeLegacyFileChannelFromLibrary2.close();
                                }
                                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                                }
                                fileOutputStream.close();
                                ?? r4 = ((kyr) obj).a;
                                synchronized (r4) {
                                    try {
                                        ktm ktmVarF = ((kyr) obj).f();
                                        r4.add(ktmVarF.a());
                                        File fileA = ktmVarF.a();
                                        if (fileA.exists() || fileA.mkdirs()) {
                                            File file3 = ktmVarF.b;
                                            if (file3.exists() || file3.mkdirs()) {
                                                try {
                                                    File file4 = ktmVarF.c;
                                                    if (file4.exists() || file4.createNewFile()) {
                                                        File file5 = ktmVarF.a;
                                                        kyr.k(file2, file5);
                                                        ktm ktmVarG = ((kyr) obj).g(ktqVar.a);
                                                        if (ktmVarG.a().exists()) {
                                                            ktm ktmVarF2 = ((kyr) obj).f();
                                                            ((kyr) obj).a.add(ktmVarF2.a());
                                                            kyr.k(ktmVarG.a(), ktmVarF2.a());
                                                        }
                                                        kyr.m(ktmVarF);
                                                        if (ksy.b()) {
                                                            file5.setWritable(false, false);
                                                        }
                                                        kyr.k(ktmVarF.a(), ktmVarG.a());
                                                        String[] list = ((kyr) obj).i().list();
                                                        aguu.ak(list);
                                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                                        for (String str : list) {
                                                            ktm ktmVarG2 = ((kyr) obj).g(str);
                                                            if (ktmVarG2.b()) {
                                                                File file6 = ktmVarG2.c;
                                                                if (!file6.exists() || jCurrentTimeMillis >= file6.lastModified() + 1209600000) {
                                                                    kyr.l(ktmVarG2);
                                                                }
                                                            }
                                                        }
                                                        ((kyr) obj).j();
                                                    }
                                                } catch (IOException unused) {
                                                }
                                            }
                                        }
                                        throw new ktl(a.cn((byte) 46, ktmVarF, "Failed to make directories for "));
                                    } catch (Throwable th) {
                                        ((kyr) obj).j();
                                        throw th;
                                    }
                                }
                                file2.delete();
                                ((ktu) this.b).c(6, ktt.c);
                                try {
                                    try {
                                        clsJ = ((elq) this.c).j(ktqVar);
                                        if (clsJ != null) {
                                            try {
                                                kyr.m(((kyr) this.e).g(ktqVar.a));
                                            } catch (ktl unused2) {
                                            }
                                        } else {
                                            ktmVarH = ((kyr) this.e).h(ktqVar);
                                            if (ktmVarH != null) {
                                                throw new ktp(a.bT(ktqVar.a, "VM key ", " not found in the cache"));
                                            }
                                            if (ksy.b()) {
                                                ktmVarH.a.setWritable(false, false);
                                            }
                                            file = ktmVarH.a;
                                            if (au(file)) {
                                                kyr.l(ktmVarH);
                                                throw new ClassNotFoundException("APK signature verification failed");
                                            }
                                            ((ktu) this.b).c(7, ktt.c);
                                            try {
                                                DexClassLoader dexClassLoader2 = new DexClassLoader(file.getAbsolutePath(), ktmVarH.b.getAbsolutePath(), null, ((Context) this.d).getClassLoader());
                                                ((ktu) this.b).c(8, ktt.c);
                                                clsJ = dexClassLoader2.loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                                                ((elq) this.c).a.put(ktqVar, clsJ);
                                            } catch (SecurityException e) {
                                                Log.w("DG", "Failed to load APK at ".concat(String.valueOf(ktmVarH.a.getAbsolutePath())), e);
                                                throw new ClassNotFoundException("Failed to create ClassLoader", e);
                                            }
                                        }
                                        ((ktu) this.b).c(9, ktt.c);
                                    } catch (ktl e2) {
                                        throw new ktp("Exception in VM cache lookup", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
                                    throw new ktp("Couldn't load VM class", e3);
                                }
                            } catch (Throwable th2) {
                                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary2 == null) {
                                    throw th2;
                                }
                                try {
                                    fileChannelConvertMaybeLegacyFileChannelFromLibrary2.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                    throw th;
                                }
                            }
                        } catch (Throwable th5) {
                            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary == null) {
                                throw th5;
                            }
                            try {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        fileOutputStream.close();
                        throw th7;
                    }
                } catch (Throwable th8) {
                    file2.delete();
                    throw th8;
                }
            } catch (Exception e4) {
                throw new ktr(e4);
            }
        }
        throw th;
        return new elq(clsJ, (Context) this.d, parcelable);
    }

    public final void ao(kty ktyVar, kjc kjcVar) {
        ((kuc) this.c).a.add(new hrr(this, ktyVar, kjcVar, 2, (short[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [awmd, java.lang.Object] */
    public final aeaj b(adme admeVar) {
        Context context = (Context) this.d.io();
        context.getClass();
        advb advbVar = (advb) this.c.io();
        advbVar.getClass();
        aeiv aeivVar = (aeiv) this.e.io();
        aeivVar.getClass();
        aduv aduvVar = (aduv) this.a.io();
        aduvVar.getClass();
        adsa adsaVar = (adsa) this.b.io();
        adsaVar.getClass();
        return new aeaj(context, advbVar, aeivVar, aduvVar, adsaVar, admeVar);
    }

    public final int c() {
        return ((CardboardView.Eye) this.c).getEyeType();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, vxe] */
    public final void d(ajcp ajcpVar) {
        if ((ajcpVar.b & 2) != 0) {
            ?? r1 = this.c;
            ajwo ajwoVar = ajcpVar.d;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            r1.a(ajwoVar);
        }
    }

    public final void e() {
        ((aaap) this.a).a("InteractionLoggingScreen missing for logging event.");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, xgn] */
    public final void f(ajcp ajcpVar, Optional optional, Bundle bundle) {
        xgt xgtVarB = aabp.b(bundle);
        if (xgtVarB == null) {
            e();
            return;
        }
        amud amudVar = ajcpVar.f;
        if (amudVar == null) {
            amudVar = amud.b;
        }
        if ((amudVar.c & 1) != 0) {
            ?? r0 = this.b;
            r0.C(xgtVarB);
            amud amudVar2 = ajcpVar.f;
            if (amudVar2 == null) {
                amudVar2 = amud.b;
            }
            r0.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(amudVar2.d, (amud) null), null);
            if (optional.isEmpty()) {
                return;
            }
            amud amudVar3 = ((ajcs) optional.get()).m;
            if (amudVar3 == null) {
                amudVar3 = amud.b;
            }
            if ((amudVar3.c & 1) != 0) {
                amud amudVar4 = ((ajcs) optional.get()).m;
                if (amudVar4 == null) {
                    amudVar4 = amud.b;
                }
                aq(amudVar4.d);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xgn] */
    public final void g(aigj aigjVar, xgt xgtVar) {
        this.b.C(xgtVar);
        aq(aigjVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xgn] */
    public final void h(ajcs ajcsVar, Bundle bundle) {
        if (bundle == null) {
            e();
            return;
        }
        xgt xgtVarB = aabp.b(bundle);
        if (xgtVarB == null) {
            e();
            return;
        }
        amud amudVar = ajcsVar.m;
        if (amudVar == null) {
            amudVar = amud.b;
        }
        if ((amudVar.c & 1) != 0) {
            ?? r2 = this.b;
            r2.C(xgtVarB);
            amud amudVar2 = ajcsVar.m;
            if (amudVar2 == null) {
                amudVar2 = amud.b;
            }
            xgj xgjVar = new xgj(amudVar2.d, (amud) null);
            xgj xgjVar2 = new xgj(xhb.b(74726));
            r2.m(xgjVar2, xgjVar);
            r2.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar2, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, vxe] */
    public final void i(ajcs ajcsVar) {
        if ((ajcsVar.b & 8) != 0) {
            ?? r1 = this.c;
            ajwo ajwoVar = ajcsVar.f;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            r1.a(ajwoVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:250:0x065b  */
    /* JADX WARN: Code duplicated, block: B:252:0x066e  */
    /* JADX WARN: Code duplicated, block: B:253:0x0674  */
    /* JADX WARN: Code duplicated, block: B:266:0x060f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102  */
    /* JADX WARN: Code duplicated, block: B:64:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.Object, wyl] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r5v105, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r5v127, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r5v71, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.lang.Object, xgm] */
    public final void k(List list, wxi wxiVar, boolean z) {
        int i;
        boolean z2;
        int i2;
        aihl aihlVarCheckIsLite;
        LinearLayoutManager linearLayoutManager;
        wwv wwvVarA;
        ammm ammmVar;
        amow amowVar;
        amow amowVar2;
        ammm ammmVar2;
        int iAV;
        int iAS;
        int i3 = 1;
        if (wxiVar == null && list.size() == 1) {
            ajwo ajwoVar = (ajwo) list.get(0);
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aiwz.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                this.d.d(list, null);
                return;
            }
        }
        wxp wxpVarJg = wxiVar.jg();
        if (wxpVarJg == null) {
            i = 0;
            z2 = false;
        } else {
            i = (wxpVarJg.i() || !wxpVarJg.g()) ? 0 : 1;
            z2 = !wxpVarJg.j() && wxpVarJg.h();
        }
        ArrayList arrayList = new ArrayList(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajwo ajwoVar2 = (ajwo) it.next();
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ammh.b);
            ajwoVar2.c(aihlVarCheckIsLite3);
            if (ajwoVar2.j.n(aihlVarCheckIsLite3.d)) {
                ?? r12 = this.a;
                ?? r13 = this.c;
                wwv wwvVarA2 = wxiVar.A();
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ammh.b);
                ajwoVar2.c(aihlVarCheckIsLite4);
                i2 = i3;
                Object objK = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
                ammh ammhVar = (ammh) (objK == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK));
                if (ammhVar.e.isEmpty()) {
                    amowVar = ammhVar.d;
                    if (amowVar == null) {
                        amowVar = amow.a;
                    }
                    wwvVarA2.k(amowVar, z);
                    amowVar2 = ammhVar.d;
                    if (amowVar2 == null) {
                        amowVar2 = amow.a;
                    }
                    if ((ammhVar.c & 4) != 0) {
                        ammmVar2 = ammhVar.f;
                        if (ammmVar2 == null) {
                            ammmVar2 = ammm.a;
                        }
                    } else {
                        ammmVar2 = null;
                    }
                    wvs.d(wwvVarA2, amowVar2, ammmVar2);
                    if ((ammhVar.c & 8) != 0) {
                        aijp aijpVarAv = ahng.av(r13.f());
                        iAS = a.aS(ammhVar.g);
                        if (iAS == 0) {
                            iAS = i2;
                        }
                        r12.e(iAS, aijpVarAv);
                    }
                    if ((ammhVar.c & 32) != 0) {
                        aijp aijpVarAv2 = ahng.av(r13.f());
                        iAV = a.aV(ammhVar.i);
                        if (iAV == 0) {
                            iAV = i2;
                        }
                        r12.f(iAV, aijpVarAv2);
                    }
                } else {
                    String str = ammhVar.e;
                    amow amowVar3 = ammhVar.d;
                    if (amowVar3 == null) {
                        amowVar3 = amow.a;
                    }
                    wwvVarA2.l(str, yno.dO(amowVar3));
                    String str2 = ammhVar.e;
                    amow amowVar4 = ammhVar.d;
                    if (amowVar4 == null) {
                        amowVar4 = amow.a;
                    }
                    if (!wwvVarA2.t(str2, amowVar4, z)) {
                        amowVar = ammhVar.d;
                        if (amowVar == null) {
                            amowVar = amow.a;
                        }
                        wwvVarA2.k(amowVar, z);
                        amowVar2 = ammhVar.d;
                        if (amowVar2 == null) {
                            amowVar2 = amow.a;
                        }
                        if ((ammhVar.c & 4) != 0) {
                            ammmVar2 = ammhVar.f;
                            if (ammmVar2 == null) {
                                ammmVar2 = ammm.a;
                            }
                        } else {
                            ammmVar2 = null;
                        }
                        wvs.d(wwvVarA2, amowVar2, ammmVar2);
                        if ((ammhVar.c & 8) != 0) {
                            aijp aijpVarAv3 = ahng.av(r13.f());
                            iAS = a.aS(ammhVar.g);
                            if (iAS == 0) {
                                iAS = i2;
                            }
                            r12.e(iAS, aijpVarAv3);
                        }
                        if ((ammhVar.c & 32) != 0) {
                            aijp aijpVarAv4 = ahng.av(r13.f());
                            iAV = a.aV(ammhVar.i);
                            if (iAV == 0) {
                                iAV = i2;
                            }
                            r12.f(iAV, aijpVarAv4);
                        }
                    }
                }
            } else {
                i2 = i3;
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ammi.b);
                ajwoVar2.c(aihlVarCheckIsLite5);
                if (ajwoVar2.j.n(aihlVarCheckIsLite5.d)) {
                    ?? r5 = this.c;
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ammi.b);
                    ajwoVar2.c(aihlVarCheckIsLite6);
                    Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite6.d);
                    ammi ammiVar = (ammi) (objK2 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK2));
                    try {
                        ammj ammjVar = ammiVar.d;
                        if (ammjVar == null) {
                            ammjVar = ammj.a;
                        }
                        aihf builder = ((ampd) aihn.parseFrom(ampd.a, (ammjVar.b == 117300536 ? (ampd) ammjVar.c : ampd.a).toByteArray(), ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
                        String str3 = (String) wxiVar.g("ClientMessageIdKey");
                        builder.copyOnWrite();
                        ampd ampdVar = (ampd) builder.instance;
                        str3.getClass();
                        ampdVar.b |= 1;
                        ampdVar.c = str3;
                        Object objG = wxiVar.g("MessageKey");
                        if (objG instanceof alay) {
                            alay alayVar = (alay) objG;
                            builder.copyOnWrite();
                            ampd ampdVar2 = (ampd) builder.instance;
                            alayVar.getClass();
                            ampdVar2.g = alayVar;
                            ampdVar2.b |= 16;
                        } else if (objG != null) {
                            alay alayVarC = ackj.c((String) objG);
                            builder.copyOnWrite();
                            ampd ampdVar3 = (ampd) builder.instance;
                            alayVarC.getClass();
                            ampdVar3.g = alayVarC;
                            ampdVar3.b |= 16;
                        }
                        long jB = ahbu.b(r5.f());
                        builder.copyOnWrite();
                        ampd ampdVar4 = (ampd) builder.instance;
                        ampdVar4.b |= 2;
                        ampdVar4.d = jB;
                        aihf aihfVarCreateBuilder = amow.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        amow amowVar5 = (amow) aihfVarCreateBuilder.instance;
                        ampd ampdVar5 = (ampd) builder.build();
                        ampdVar5.getClass();
                        amowVar5.c = ampdVar5;
                        amowVar5.b = 117300536;
                        amow amowVar6 = (amow) aihfVarCreateBuilder.build();
                        wwv wwvVarA3 = wxiVar.A();
                        wwvVarA3.k(amowVar6, z);
                        if ((ammiVar.c & 2) != 0) {
                            ammmVar = ammiVar.e;
                            if (ammmVar == null) {
                                ammmVar = ammm.a;
                            }
                        } else {
                            ammmVar = null;
                        }
                        wvs.d(wwvVarA3, amowVar6, ammmVar);
                    } catch (aiik e) {
                        ((agrc) ((agrc) ((agrc) wvs.a.b()).j(e)).k("com/google/android/libraries/youtube/livechat/action/LiveChatActionHandlerUtils", "performAddFromTemplateAction", 's', "LiveChatActionHandlerUtils.java")).t("Error parsing live chat template");
                    }
                } else {
                    aihl aihlVarCheckIsLite7 = aihn.checkIsLite(ammt.b);
                    ajwoVar2.c(aihlVarCheckIsLite7);
                    if (ajwoVar2.j.n(aihlVarCheckIsLite7.d)) {
                        aihl aihlVarCheckIsLite8 = aihn.checkIsLite(ammt.b);
                        ajwoVar2.c(aihlVarCheckIsLite8);
                        Object objK3 = ajwoVar2.j.k(aihlVarCheckIsLite8.d);
                        String str4 = ((ammt) (objK3 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK3))).c;
                        wxiVar.A().r(str4, z);
                        wxiVar.e().i(str4);
                        xdb xdbVarD = wxiVar.D();
                        if (xdbVarD != null) {
                            xdbVarD.e(str4);
                        }
                    } else {
                        aihl aihlVar = amqi.b;
                        aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aihlVar);
                        ajwoVar2.c(aihlVarCheckIsLite9);
                        if (ajwoVar2.j.n(aihlVarCheckIsLite9.d)) {
                            aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aihlVar);
                            ajwoVar2.c(aihlVarCheckIsLite10);
                            Object objK4 = ajwoVar2.j.k(aihlVarCheckIsLite10.d);
                            String str5 = ((amqi) (objK4 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK4))).d;
                            wxiVar.A().q(str5, z);
                            wxq wxqVarE = wxiVar.e();
                            if (wxqVarE != null) {
                                wxqVarE.j(str5);
                            }
                            wwk wwkVarZ = wxiVar.z();
                            if (wwkVarZ != null) {
                                wwkVarZ.f(ajwoVar2);
                            }
                            xdb xdbVarD2 = wxiVar.D();
                            if (xdbVarD2 != null) {
                                xdbVarD2.d(ajwoVar2);
                            }
                        } else {
                            aihl aihlVarCheckIsLite11 = aihn.checkIsLite(ammk.b);
                            ajwoVar2.c(aihlVarCheckIsLite11);
                            if (ajwoVar2.j.n(aihlVarCheckIsLite11.d)) {
                                wxq wxqVarE2 = wxiVar.e();
                                aihl aihlVarCheckIsLite12 = aihn.checkIsLite(ammk.b);
                                ajwoVar2.c(aihlVarCheckIsLite12);
                                Object objK5 = ajwoVar2.j.k(aihlVarCheckIsLite12.d);
                                ammk ammkVar = (ammk) (objK5 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK5));
                                Duration durationOfSeconds = Duration.ofSeconds(ammkVar.d);
                                amrb amrbVar = ammkVar.c;
                                if (amrbVar == null) {
                                    amrbVar = amrb.a;
                                }
                                wxqVarE2.c(amrbVar, durationOfSeconds);
                            } else {
                                aihl aihlVar2 = apxl.b;
                                aihl aihlVarCheckIsLite13 = aihn.checkIsLite(aihlVar2);
                                ajwoVar2.c(aihlVarCheckIsLite13);
                                if (ajwoVar2.j.n(aihlVarCheckIsLite13.d)) {
                                    wxq wxqVarE3 = wxiVar.e();
                                    aihl aihlVarCheckIsLite14 = aihn.checkIsLite(aihlVar2);
                                    ajwoVar2.c(aihlVarCheckIsLite14);
                                    Object objK6 = ajwoVar2.j.k(aihlVarCheckIsLite14.d);
                                    apji apjiVar = ((apxl) (objK6 == null ? aihlVarCheckIsLite14.b : aihlVarCheckIsLite14.c(objK6))).c;
                                    if (apjiVar == null) {
                                        apjiVar = apji.a;
                                    }
                                    wxqVarE3.m(apjiVar);
                                } else {
                                    aihl aihlVarCheckIsLite15 = aihn.checkIsLite(apjb.b);
                                    ajwoVar2.c(aihlVarCheckIsLite15);
                                    if (ajwoVar2.j.n(aihlVarCheckIsLite15.d)) {
                                        wxq wxqVarE4 = wxiVar.e();
                                        aihl aihlVarCheckIsLite16 = aihn.checkIsLite(apjb.b);
                                        ajwoVar2.c(aihlVarCheckIsLite16);
                                        Object objK7 = ajwoVar2.j.k(aihlVarCheckIsLite16.d);
                                        wxqVarE4.g(((apjb) (objK7 == null ? aihlVarCheckIsLite16.b : aihlVarCheckIsLite16.c(objK7))).c);
                                    } else {
                                        aihl aihlVarCheckIsLite17 = aihn.checkIsLite(apxu.b);
                                        ajwoVar2.c(aihlVarCheckIsLite17);
                                        if (ajwoVar2.j.n(aihlVarCheckIsLite17.d)) {
                                            wxq wxqVarE5 = wxiVar.e();
                                            aihl aihlVarCheckIsLite18 = aihn.checkIsLite(apxu.b);
                                            ajwoVar2.c(aihlVarCheckIsLite18);
                                            Object objK8 = ajwoVar2.j.k(aihlVarCheckIsLite18.d);
                                            apji apjiVar2 = ((apxu) (objK8 == null ? aihlVarCheckIsLite18.b : aihlVarCheckIsLite18.c(objK8))).c;
                                            if (apjiVar2 == null) {
                                                apjiVar2 = apji.a;
                                            }
                                            wxqVarE5.n(apjiVar2);
                                        } else {
                                            aihl aihlVarCheckIsLite19 = aihn.checkIsLite(apjc.b);
                                            ajwoVar2.c(aihlVarCheckIsLite19);
                                            if (ajwoVar2.j.n(aihlVarCheckIsLite19.d)) {
                                                wxiVar.e().h();
                                            } else {
                                                aihl aihlVarCheckIsLite20 = aihn.checkIsLite(aiwo.a);
                                                ajwoVar2.c(aihlVarCheckIsLite20);
                                                if (ajwoVar2.j.n(aihlVarCheckIsLite20.d)) {
                                                    wvs.c(ajwoVar2, wxiVar);
                                                } else {
                                                    aihl aihlVarCheckIsLite21 = aihn.checkIsLite(apiy.a);
                                                    ajwoVar2.c(aihlVarCheckIsLite21);
                                                    if (ajwoVar2.j.n(aihlVarCheckIsLite21.d)) {
                                                        wvs.c(ajwoVar2, wxiVar);
                                                    } else {
                                                        aihl aihlVarCheckIsLite22 = aihn.checkIsLite(ammr.b);
                                                        ajwoVar2.c(aihlVarCheckIsLite22);
                                                        if (ajwoVar2.j.n(aihlVarCheckIsLite22.d)) {
                                                            wvs.b(ajwoVar2, wxiVar, z);
                                                        } else {
                                                            aihl aihlVarCheckIsLite23 = aihn.checkIsLite(amms.b);
                                                            ajwoVar2.c(aihlVarCheckIsLite23);
                                                            if (ajwoVar2.j.n(aihlVarCheckIsLite23.d)) {
                                                                wvs.b(ajwoVar2, wxiVar, z);
                                                            } else {
                                                                aihl aihlVarCheckIsLite24 = aihn.checkIsLite(ammu.b);
                                                                ajwoVar2.c(aihlVarCheckIsLite24);
                                                                if (ajwoVar2.j.n(aihlVarCheckIsLite24.d)) {
                                                                    wwv wwvVarA4 = wxiVar.A();
                                                                    aihl aihlVarCheckIsLite25 = aihn.checkIsLite(ammu.b);
                                                                    ajwoVar2.c(aihlVarCheckIsLite25);
                                                                    Object objK9 = ajwoVar2.j.k(aihlVarCheckIsLite25.d);
                                                                    ammu ammuVar = (ammu) (objK9 == null ? aihlVarCheckIsLite25.b : aihlVarCheckIsLite25.c(objK9));
                                                                    if (!ammuVar.c.isEmpty()) {
                                                                        String str6 = ammuVar.c;
                                                                        amow amowVar7 = ammuVar.d;
                                                                        if (amowVar7 == null) {
                                                                            amowVar7 = amow.a;
                                                                        }
                                                                        wwvVarA4.t(str6, amowVar7, z);
                                                                    }
                                                                } else {
                                                                    aihl aihlVarCheckIsLite26 = aihn.checkIsLite(ammy.b);
                                                                    ajwoVar2.c(aihlVarCheckIsLite26);
                                                                    if (ajwoVar2.j.n(aihlVarCheckIsLite26.d)) {
                                                                        wvs.a(ajwoVar2, wxiVar);
                                                                    } else {
                                                                        aihl aihlVarCheckIsLite27 = aihn.checkIsLite(ammo.b);
                                                                        ajwoVar2.c(aihlVarCheckIsLite27);
                                                                        if (ajwoVar2.j.n(aihlVarCheckIsLite27.d)) {
                                                                            wvs.a(ajwoVar2, wxiVar);
                                                                        } else {
                                                                            aihl aihlVarCheckIsLite28 = aihn.checkIsLite(amna.b);
                                                                            ajwoVar2.c(aihlVarCheckIsLite28);
                                                                            if (ajwoVar2.j.n(aihlVarCheckIsLite28.d)) {
                                                                                wvs.a(ajwoVar2, wxiVar);
                                                                            } else {
                                                                                aihl aihlVar3 = apyk.a;
                                                                                aihl aihlVarCheckIsLite29 = aihn.checkIsLite(aihlVar3);
                                                                                ajwoVar2.c(aihlVarCheckIsLite29);
                                                                                if (ajwoVar2.j.n(aihlVarCheckIsLite29.d)) {
                                                                                    aihl aihlVarCheckIsLite30 = aihn.checkIsLite(aihlVar3);
                                                                                    ajwoVar2.c(aihlVarCheckIsLite30);
                                                                                    Object objK10 = ajwoVar2.j.k(aihlVarCheckIsLite30.d);
                                                                                    apyj apyjVar = (apyj) (objK10 == null ? aihlVarCheckIsLite30.b : aihlVarCheckIsLite30.c(objK10));
                                                                                    apji apjiVar3 = apyjVar.b;
                                                                                    if (apjiVar3 == null) {
                                                                                        apjiVar3 = apji.a;
                                                                                    }
                                                                                    aihl aihlVarCheckIsLite31 = aihn.checkIsLite(aqog.a);
                                                                                    apjiVar3.c(aihlVarCheckIsLite31);
                                                                                    if (apjiVar3.j.n(aihlVarCheckIsLite31.d)) {
                                                                                        apji apjiVar4 = apyjVar.b;
                                                                                        if (apjiVar4 == null) {
                                                                                            apjiVar4 = apji.a;
                                                                                        }
                                                                                        aihl aihlVarCheckIsLite32 = aihn.checkIsLite(aqog.a);
                                                                                        apjiVar4.c(aihlVarCheckIsLite32);
                                                                                        Object objK11 = apjiVar4.j.k(aihlVarCheckIsLite32.d);
                                                                                        this.e.hB().d(new xgj(((aqof) (objK11 == null ? aihlVarCheckIsLite32.b : aihlVarCheckIsLite32.c(objK11))).p, (amud) null));
                                                                                        this.d.e(agke.q(ajwoVar2), wxiVar);
                                                                                    }
                                                                                } else {
                                                                                    aihl aihlVarCheckIsLite33 = aihn.checkIsLite(ammp.b);
                                                                                    ajwoVar2.c(aihlVarCheckIsLite33);
                                                                                    if (ajwoVar2.j.n(aihlVarCheckIsLite33.d)) {
                                                                                        aihl aihlVarCheckIsLite34 = aihn.checkIsLite(ammp.b);
                                                                                        ajwoVar2.c(aihlVarCheckIsLite34);
                                                                                        if (ajwoVar2.j.n(aihlVarCheckIsLite34.d) && (wwvVarA = wxiVar.A()) != null) {
                                                                                            aihl aihlVarCheckIsLite35 = aihn.checkIsLite(ammp.b);
                                                                                            ajwoVar2.c(aihlVarCheckIsLite35);
                                                                                            Object objK12 = ajwoVar2.j.k(aihlVarCheckIsLite35.d);
                                                                                            wwvVarA.u(((ammp) (objK12 == null ? aihlVarCheckIsLite35.b : aihlVarCheckIsLite35.c(objK12))).c, ajwoVar2, z);
                                                                                        }
                                                                                    } else {
                                                                                        aihl aihlVar4 = ammx.b;
                                                                                        aihl aihlVarCheckIsLite36 = aihn.checkIsLite(aihlVar4);
                                                                                        ajwoVar2.c(aihlVarCheckIsLite36);
                                                                                        if (!ajwoVar2.j.n(aihlVarCheckIsLite36.d) || wxpVarJg == null) {
                                                                                            aihl aihlVar5 = akrx.a;
                                                                                            aihl aihlVarCheckIsLite37 = aihn.checkIsLite(aihlVar5);
                                                                                            ajwoVar2.c(aihlVarCheckIsLite37);
                                                                                            if (ajwoVar2.j.n(aihlVarCheckIsLite37.d)) {
                                                                                                aihl aihlVarCheckIsLite38 = aihn.checkIsLite(aihlVar5);
                                                                                                ajwoVar2.c(aihlVarCheckIsLite38);
                                                                                                Object objK13 = ajwoVar2.j.k(aihlVarCheckIsLite38.d);
                                                                                                CommandOuterClass$Command commandOuterClass$Command = (CommandOuterClass$Command) (objK13 == null ? aihlVarCheckIsLite38.b : aihlVarCheckIsLite38.c(objK13));
                                                                                                aihl aihlVarCheckIsLite39 = aihn.checkIsLite(asst.b);
                                                                                                commandOuterClass$Command.c(aihlVarCheckIsLite39);
                                                                                                if (commandOuterClass$Command.j.n(aihlVarCheckIsLite39.d)) {
                                                                                                    wxiVar.b().a(ajwoVar2);
                                                                                                } else {
                                                                                                    aihlVarCheckIsLite = aihn.checkIsLite(aomn.b);
                                                                                                    ajwoVar2.c(aihlVarCheckIsLite);
                                                                                                    if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                                                                                                        this.d.a(ajwoVar2);
                                                                                                    } else {
                                                                                                        arrayList.clear();
                                                                                                        arrayList.add(ajwoVar2);
                                                                                                        this.d.e(arrayList, wxiVar);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                aihlVarCheckIsLite = aihn.checkIsLite(aomn.b);
                                                                                                ajwoVar2.c(aihlVarCheckIsLite);
                                                                                                if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                                                                                                    this.d.a(ajwoVar2);
                                                                                                } else {
                                                                                                    arrayList.clear();
                                                                                                    arrayList.add(ajwoVar2);
                                                                                                    this.d.e(arrayList, wxiVar);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            aihl aihlVarCheckIsLite40 = aihn.checkIsLite(aihlVar4);
                                                                                            ajwoVar2.c(aihlVarCheckIsLite40);
                                                                                            Object objK14 = ajwoVar2.j.k(aihlVarCheckIsLite40.d);
                                                                                            int iIndexOf = wxiVar.A().a.indexOf(((ammx) (objK14 == null ? aihlVarCheckIsLite40.b : aihlVarCheckIsLite40.c(objK14))).c);
                                                                                            xbn xbnVar = (xbn) wxpVarJg;
                                                                                            adkz adkzVar = xbnVar.f;
                                                                                            if (adkzVar != null && adkzVar.a() > iIndexOf && iIndexOf >= 0 && (linearLayoutManager = (LinearLayoutManager) xbnVar.q().n) != null) {
                                                                                                linearLayoutManager.scrollToPositionWithOffset(iIndexOf, 0);
                                                                                            }
                                                                                            i = ((iIndexOf ^ (-1)) >>> 31) ^ 1;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i3 = i2;
        }
        if (i != 0 && wxpVarJg != null) {
            this.b.execute(afwl.i(new wvr(wxpVarJg, 0)));
        }
        if (!z2 || wxpVarJg == null) {
            return;
        }
        wxpVarJg.f();
    }

    public final Size l() {
        vbu vbuVar = (vbu) this.e;
        return new Size(vbuVar.d, vbuVar.e);
    }

    public final Optional m() {
        return (Optional) this.d;
    }

    public final Optional n() {
        augy augyVar = (augy) this.c;
        if ((augyVar.b & SemanticState.Modal) == 0) {
            return Optional.empty();
        }
        aimy aimyVar = augyVar.q;
        if (aimyVar == null) {
            aimyVar = aimy.a;
        }
        return Optional.of(aimyVar);
    }

    public final Optional o() {
        return (Optional) this.a;
    }

    public final Optional p() {
        return (Optional) this.b;
    }

    public final jrr q() {
        return (jrr) ((aihn) this.c).toBuilder();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [wjf] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final Object r(vdn vdnVar, awoq awoqVar) throws Throwable {
        vdp vdpVar;
        ?? r4;
        if (awoqVar instanceof vdp) {
            vdpVar = (vdp) awoqVar;
            int i = vdpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vdpVar.c = i - Integer.MIN_VALUE;
            } else {
                vdpVar = new vdp(this, awoqVar);
            }
        } else {
            vdpVar = new vdp(this, awoqVar);
        }
        Object objI = vdpVar.b;
        awox awoxVar = awox.a;
        int i2 = vdpVar.c;
        if (i2 == 0) {
            atqp.j(objI);
            wjf wjfVar = vdnVar.b;
            Object obj = this.b;
            vdpVar.a = wjfVar;
            vdpVar.c = 1;
            objI = ((zf) obj).I(wjfVar, vdpVar);
            if (objI == awoxVar) {
                return awoxVar;
            }
            r4 = wjfVar;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = vdpVar.a;
            atqp.j(objI);
            r4 = obj2;
        }
        byte[] bArr = (byte[]) objI;
        if (bArr == null) {
            twu.d("ASCmpCompute", 5, "Failed to fetch waveform data", null);
        }
        String strG = r4.G();
        strG.getClass();
        return new vdo(strG, bArr, ahng.C(r4.g().h));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final Object s(aufa aufaVar, awoq awoqVar) throws Throwable {
        vdq vdqVar;
        vdw vdwVar;
        Object vdhVar;
        Object vdiVar;
        Object next;
        aufa aufaVar2 = aufaVar;
        if (awoqVar instanceof vdq) {
            vdqVar = (vdq) awoqVar;
            int i = vdqVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vdqVar.b = i - Integer.MIN_VALUE;
            } else {
                vdqVar = new vdq(this, awoqVar);
            }
        } else {
            vdqVar = new vdq(this, awoqVar);
        }
        Object objC = vdqVar.a;
        awox awoxVar = awox.a;
        int i2 = vdqVar.b;
        try {
            if (i2 == 0) {
                atqp.j(objC);
                int i3 = aufaVar2.c;
                if (i3 != 102) {
                    twu.d("ASCmpCompute", 6, "Invalid video ID asset", null);
                    vdwVar = null;
                } else if (((i3 == 102 ? (auey) aufaVar2.d : auey.a).b & 1) == 0) {
                    twu.d("ASCmpCompute", 6, "Invalid video ID asset", null);
                    vdwVar = null;
                } else {
                    int i4 = aufaVar2.c;
                    if (((i4 == 102 ? (auey) aufaVar2.d : auey.a).b & 2) != 0) {
                        auey aueyVar = i4 == 102 ? (auey) aufaVar2.d : auey.a;
                        aueyVar.getClass();
                        String str = aueyVar.c;
                        str.getClass();
                        String str2 = aueyVar.d;
                        str2.getClass();
                        aigj aigjVar = aigj.d;
                        aigjVar.getClass();
                        vdwVar = new vdw(str, str2, aigjVar);
                    } else {
                        twu.d("ASCmpCompute", 6, "Invalid video ID asset", null);
                        vdwVar = null;
                    }
                }
                if (vdwVar != null) {
                    Object obj = this.c;
                    vdqVar.c = aufaVar2;
                    vdqVar.b = 1;
                    vdx vdxVar = new vdx(vdwVar.a, vdwVar.b);
                    Object objComputeIfAbsent = ConcurrentMap.EL.computeIfAbsent(((aaok) obj).d, vdxVar, new uot(new hgo(vdwVar, obj, vdxVar, 8, (int[]) null), 13));
                    objComputeIfAbsent.getClass();
                    objC = ((awuz) objComputeIfAbsent).c(vdqVar);
                    if (objC == awoxVar) {
                        return awoxVar;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aufaVar2 = vdqVar.c;
            atqp.j(objC);
            wjf wjfVar = (wjf) objC;
            Object obj2 = this.a;
            wjfVar.getClass();
            wja wjaVarG = wjfVar.g();
            if (wjaVarG == null) {
                vdiVar = new vdh("No supported streams found in response", null);
            } else {
                try {
                    wgs[] wgsVarArr = ((ytv) ((aaok) obj2).b).b(wjaVarG, wjfVar.f(), true, null, Alert.DURATION_SHOW_INDEFINITELY).c;
                    wgsVarArr.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (wgs wgsVar : wgsVarArr) {
                        String string = wgsVar.e.toString();
                        string.getClass();
                        if (string.length() > 0) {
                            arrayList.add(wgsVar);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        twu.d("VideoIdAssetUtils", 6, "No usable audio streams found in response", null);
                        vdhVar = new vdh("No usable audio streams found in response", null);
                        vdiVar = vdhVar;
                    } else {
                        Iterator it = arrayList.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((wgs) next).f() != 3);
                        wgs wgsVar2 = (wgs) next;
                        if (wgsVar2 != null) {
                            vdiVar = new vdi(wgsVar2);
                        } else {
                            twu.d("VideoIdAssetUtils", 5, "Medium quality stream not found, using the first available stream. ", null);
                            Object objX = atqq.X(arrayList);
                            objX.getClass();
                            vdiVar = new vdi((wgs) objX);
                        }
                    }
                } catch (yof e) {
                    twu.d("VideoIdAssetUtils", 6, "No supported streams found in response", null);
                    vdhVar = new vdh("No supported streams found in response", e);
                }
            }
            Objects.checkIndex(0, 3);
            if (vdiVar instanceof vdi) {
                wgs wgsVar3 = ((vdi) vdiVar).a;
                auey aueyVar2 = aufaVar2.c == 102 ? (auey) aufaVar2.d : auey.a;
                aueyVar2.getClass();
                return new vdn(aueyVar2, wjfVar, wgsVar3);
            }
            if (!(vdiVar instanceof vdh)) {
                throw new awmj();
            }
            vdh vdhVar2 = (vdh) vdiVar;
            Exception exc = vdhVar2.b;
            String str3 = vdhVar2.a;
            if (exc == null) {
                twu.d("ASCmpCompute", 6, str3, null);
            } else {
                twu.d("ASCmpCompute", 6, str3, exc);
            }
            return null;
        } catch (Exception e2) {
            twu.d("ASCmpCompute", 6, "Failed to request player response", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, zvl] */
    public final String t(uzz uzzVar) {
        if (uzzVar == null) {
            return null;
        }
        try {
            String str = uzzVar.f;
            if (str != null) {
                return wfs.d(str).f.B();
            }
            return null;
        } catch (Exception e) {
            ?? r4 = this.c;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.j = 40;
            zvjVarA.i = 397;
            zvjVarA.d("[Creation][Android][Effects]failed to deserialize effect entity key for asset id: ".concat(String.valueOf(uzzVar.a)));
            zvjVarA.f(e);
            r4.a(zvjVarA.a());
            return null;
        }
    }

    public final List u(List list, uzw uzwVar) {
        aldh aldhVar;
        aldh aldhVar2;
        aldh aldhVar3;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uzw uzwVar2 = (uzw) it.next();
            String str = uzwVar2.a;
            if (!awrc.c(str, uzwVar.a)) {
                boolean zV = v(uzwVar2.b, uzwVar.b);
                boolean z = false;
                if (!zV && (aldhVar = uzwVar.c) != null && (aldhVar2 = uzwVar2.c) != null && ((aldhVar2 == (aldhVar3 = aldh.XENO_EFFECT_RENDERING_LAYER_GREEN_SCREEN) && aldhVar == aldh.XENO_EFFECT_RENDERING_LAYER_CAMERA_FOREGROUND) || (aldhVar == aldhVar3 && aldhVar2 == aldh.XENO_EFFECT_RENDERING_LAYER_CAMERA_FOREGROUND))) {
                    z = true;
                }
                if (zV || z) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public final boolean v(String str, String str2) {
        if (w(str) && w(str2)) {
            return true;
        }
        if (x(str) && x(str2)) {
            return true;
        }
        if (awrc.c(str, "layout_recomp_item_selected_entity") && awrc.c(str2, "layout_recomp_item_selected_entity")) {
            return true;
        }
        if (awrc.c(str, "layout_collab_item_selected_entity") && awrc.c(str2, "layout_collab_item_selected_entity")) {
            return true;
        }
        return !((vao) this.b).f(str, str2) && (w(str) || w(str2));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Set] */
    public final boolean w(String str) {
        return str != null && this.d.contains(str);
    }

    public final boolean x(String str) {
        if (str != null) {
            return (((aaok) this.a).F() && (awrc.c(str, "thumbnail_editor_filter_item_selected_entity") || awrc.c(str, xsc.C("thumbnail_editor_filter_item_selected_entity")))) || awrc.c(str, "editor_filter_item_selected_entity") || awrc.c(str, xsc.C("editor_filter_item_selected_entity"));
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, vbf] */
    public final boolean y(String str, String str2) {
        if (v(str, str2)) {
            return (((vao) this.b).d(this.e.a()) || (w(str) && w(str2)) || ((awrc.c(str, "layout_recomp_item_selected_entity") && awrc.c(str2, "layout_recomp_item_selected_entity")) || (awrc.c(str, "layout_collab_item_selected_entity") && awrc.c(str2, "layout_collab_item_selected_entity")))) ? false : true;
        }
        return true;
    }

    public final boolean z(String str) {
        return !((vao) this.b).f(str) && w(str);
    }

    public ahgb(Context context, hfn hfnVar, Optional optional, vxz vxzVar, Optional optional2) {
        this.e = context;
        this.b = hfnVar;
        this.d = optional;
        this.a = vxzVar;
        this.c = optional2;
    }

    public ahgb(Context context, kyr kyrVar, elq elqVar, ktn ktnVar, ktu ktuVar) {
        this.d = context;
        this.e = kyrVar;
        this.c = elqVar;
        this.a = ktnVar;
        this.b = ktuVar;
    }

    public ahgb(aunn aunnVar, yu yuVar, aunn aunnVar2, aunn aunnVar3, jnm jnmVar) {
        this.a = aunnVar;
        this.b = yuVar;
        this.d = aunnVar2;
        this.e = aunnVar3;
        this.c = jnmVar;
    }

    public ahgb(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, tqj tqjVar) {
        this.a = awmdVar;
        this.d = awmdVar2;
        this.b = awmdVar3;
        this.c = awmdVar4;
        this.e = tqjVar;
    }

    public ahgb(awmd awmdVar, uko ukoVar, vxe vxeVar, aaok aaokVar, adxj adxjVar) {
        this.c = awmdVar;
        this.d = vxeVar;
        this.e = ukoVar;
        this.a = aaokVar;
        this.b = adxjVar;
    }

    public ahgb(awmd awmdVar, wco wcoVar, zwb zwbVar, vxz vxzVar, Executor executor) {
        this.e = awmdVar;
        this.b = wcoVar;
        this.d = zwbVar;
        this.c = vxzVar;
        this.a = executor;
    }

    public ahgb(dlr dlrVar, Executor executor, mbc mbcVar, vyo vyoVar, spv spvVar) {
        this.b = dlrVar;
        this.c = executor;
        this.d = mbcVar;
        this.a = vyoVar;
        this.e = spvVar;
    }

    public ahgb(Optional optional, Optional optional2, audb audbVar, audc audcVar, anck anckVar) {
        this.c = optional;
        this.a = optional2;
        this.d = audbVar;
        this.e = audcVar;
        this.b = anckVar;
    }

    private ahgb(String str, aigj aigjVar, ahfz ahfzVar, ahga ahgaVar, Integer num) {
        this.a = str;
        this.b = aigjVar;
        this.c = ahfzVar;
        this.d = ahgaVar;
        this.e = num;
    }

    public ahgb(jgc jgcVar, jgc jgcVar2, jgc jgcVar3, khn khnVar, ttm ttmVar) {
        this.d = jgcVar;
        this.e = jgcVar2;
        this.a = jgcVar3;
        this.b = khnVar;
        this.c = ttmVar;
    }

    public ahgb(mbc mbcVar, aaew aaewVar, abqq abqqVar, aaek aaekVar, vyo vyoVar) {
        this.e = mbcVar;
        this.d = aaewVar;
        this.b = abqqVar;
        this.a = aaekVar;
        this.c = vyoVar;
    }

    public ahgb(xgn xgnVar, aaap aaapVar, vxe vxeVar, elr elrVar, vxz vxzVar) {
        this.b = xgnVar;
        this.a = aaapVar;
        this.c = vxeVar;
        this.d = elrVar;
        this.e = vxzVar;
    }

    public ahgb(aeot aeotVar, Executor executor, mbc mbcVar) {
        this.c = aeotVar;
        this.b = executor;
        this.d = mbcVar;
        this.a = new AtomicInteger();
        this.e = new aeou(this);
    }

    public ahgb(Context context, tqj tqjVar, Executor executor) {
        context.getClass();
        tqjVar.getClass();
        executor.getClass();
        this.a = context;
        this.e = tqjVar;
        this.b = executor;
        this.d = "/proc/self/cpuset";
        this.c = new awmp(new pbm(this, 5));
    }

    public ahgb(Handler handler, kqs kqsVar, kuc kucVar) {
        this.b = new AtomicInteger();
        this.a = new AtomicInteger();
        kro.d(kqsVar.q == handler.getLooper(), "GmsClient invokes callbacks is on an unexpected worker thread");
        this.d = handler;
        this.e = kqsVar;
        this.c = kucVar;
    }

    public ahgb(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.e = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
        this.a = awmdVar5;
    }

    public ahgb(itu ituVar, awmd awmdVar, ttm ttmVar, tbt tbtVar, jin jinVar) {
        ituVar.getClass();
        this.e = ituVar;
        awmdVar.getClass();
        this.b = awmdVar;
        ttmVar.getClass();
        this.a = ttmVar;
        this.d = tbtVar;
        this.c = jinVar;
    }

    public ahgb(mbc mbcVar, elr elrVar, awmd awmdVar, String str, aacg aacgVar) {
        this.e = mbcVar;
        this.c = elrVar;
        this.b = awmdVar;
        typ.f(str);
        this.d = str;
        this.a = aacgVar;
    }

    public ahgb(zvl zvlVar, Set set, vao vaoVar, aaok aaokVar, vbf vbfVar) {
        zvlVar.getClass();
        set.getClass();
        aaokVar.getClass();
        this.c = zvlVar;
        this.d = set;
        this.b = vaoVar;
        this.a = aaokVar;
        this.e = vbfVar;
    }

    public ahgb(byte[] bArr) {
        this.d = new ArrayList();
        this.c = new ArrayList();
        this.a = new ArrayList();
        this.e = new aha(0);
        this.b = new fui(this, 2);
    }

    public ahgb(byte[] bArr, byte[] bArr2) {
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = new HashMap();
        this.e = new HashMap();
        this.b = new HashMap();
    }

    public ahgb(float[] fArr, float[] fArr2, abbw abbwVar, CardboardView.Eye eye) {
        fArr2.getClass();
        this.a = fArr2;
        this.d = fArr;
        float[] fArr3 = new float[16];
        this.b = fArr3;
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr, 0);
        this.e = abbwVar;
        this.c = eye;
    }

    public ahgb(zf zfVar, aaok aaokVar, xsc xscVar, awut awutVar, aaok aaokVar2) {
        aaokVar.getClass();
        xscVar.getClass();
        awutVar.getClass();
        this.b = zfVar;
        this.c = aaokVar;
        this.e = xscVar;
        this.d = awutVar;
        this.a = aaokVar2;
    }

    public ahgb(RiveFile riveFile, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, RiveCanvasSession riveCanvasSession) {
        riveFile.getClass();
        this.d = riveFile;
        this.e = artboard;
        this.a = stateMachine;
        this.b = viewModelInstance;
        this.c = riveCanvasSession;
    }

    public ahgb(augy augyVar, vbu vbuVar) {
        this(augyVar, vbuVar, Optional.empty());
    }

    public ahgb(augy augyVar, vbu vbuVar, Optional optional) {
        Optional optionalEmpty = Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        this.c = augyVar;
        this.e = vbuVar;
        this.b = optional;
        this.a = optionalEmpty;
        this.d = optionalEmpty2;
    }

    public ahgb(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5) {
        awmdVar.getClass();
        this.d = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.e = awmdVar3;
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
    }

    public ahgb(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, char[] cArr) {
        awmdVar.getClass();
        this.c = awmdVar;
        this.e = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
        this.a = awmdVar5;
    }

    public ahgb(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.e = awmdVar;
        this.d = awmdVar2;
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
        awmdVar5.getClass();
        this.a = awmdVar5;
    }

    public ahgb(mqf mqfVar, avmb avmbVar) {
        avmb avmbVarA = avmh.a();
        this.d = mqfVar;
        this.b = avmbVar;
        this.e = avmbVarA;
        this.a = new AtomicReference();
        this.c = new AtomicBoolean(true);
    }

    public ahgb(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, byte[] bArr) {
        awmdVar.getClass();
        this.d = awmdVar;
        awmdVar2.getClass();
        this.e = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
        awmdVar4.getClass();
        this.c = awmdVar4;
        this.a = awmdVar5;
    }

    public ahgb() {
        this.a = new HashSet();
        this.d = new HashSet();
        this.e = new HashSet();
        this.c = new HashSet();
        this.b = new ArrayList();
    }

    public ahgb(Context context, SharedPreferences sharedPreferences, aunn aunnVar, omj omjVar) {
        this.d = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        this.c = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        ixt.Z(dir2);
        this.a = dir2;
        this.e = aunnVar;
        this.b = omjVar;
    }

    public ahgb(bec becVar, awut awutVar, aunn aunnVar, affd affdVar, mbc mbcVar) {
        becVar.getClass();
        awutVar.getClass();
        aunnVar.getClass();
        mbcVar.getClass();
        this.b = becVar;
        this.c = awutVar;
        this.a = aunnVar;
        this.e = affdVar;
        this.d = mbcVar;
    }

    public ahgb(vxe vxeVar, Executor executor, xgm xgmVar, wyl wylVar, mbc mbcVar) {
        vxeVar.getClass();
        this.d = vxeVar;
        this.b = executor;
        this.e = xgmVar;
        this.a = wylVar;
        this.c = mbcVar;
    }

    public ahgb(aejd aejdVar, lqa lqaVar, ScheduledExecutorService scheduledExecutorService, String str, String str2) {
        this.d = aejdVar;
        this.e = lqaVar;
        this.a = scheduledExecutorService;
        this.b = str;
        this.c = str2;
    }

    public ahgb(xzx xzxVar, yad yadVar, yaw yawVar, ybm ybmVar, yce yceVar) {
        xzxVar.getClass();
        yadVar.getClass();
        yawVar.getClass();
        ybmVar.getClass();
        yceVar.getClass();
        this.c = xzxVar;
        this.e = yadVar;
        this.b = yawVar;
        this.d = ybmVar;
        this.a = yceVar;
    }
}
