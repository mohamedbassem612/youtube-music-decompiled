package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebViewDatabase;
import app.rive.core.CommandQueue;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.lang.Iterable$EL;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aciz {
    public final Object a;
    public final Object b;

    public aciz(vxu vxuVar, mbc mbcVar) {
        this.a = mbcVar;
        agjz agjzVar = new agjz(4);
        apjn apjnVar = vxuVar.c().k;
        aksh akshVar = (apjnVar == null ? apjn.a : apjnVar).C;
        Iterable$EL.forEach((akshVar == null ? aksh.a : akshVar).b, new aalb(agjzVar, mbcVar, 3));
        this.b = agjzVar.g();
    }

    private final void F(File file, File file2) throws FileNotFoundException {
        File[] fileArrListFiles;
        HashSet hashSet = new HashSet();
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file3 : fileArrListFiles) {
                if (file3.getCanonicalPath().startsWith(file2.getCanonicalPath())) {
                    try {
                        F(file3, file2);
                    } catch (IOException e) {
                        hashSet.add(e);
                    }
                }
            }
        }
        if (file.delete() && hashSet.isEmpty()) {
            return;
        }
        FileNotFoundException fileNotFoundException = new FileNotFoundException("Failed to delete file: ".concat(String.valueOf(String.valueOf(file))));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            fileNotFoundException.addSuppressed((IOException) it.next());
        }
        throw fileNotFoundException;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aeda, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [aunn, java.lang.Object] */
    private final Typeface G(Context context, int i, boolean z) {
        int i2;
        acks acksVar;
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        int i4 = 700;
        int i5 = 2;
        if (i3 != 0) {
            if (i3 != 1) {
                i2 = 500;
                i4 = i3 == 2 ? 400 : 700;
            } else {
                i2 = 900;
            }
            int i6 = i2;
            i2 = i4;
            i4 = i6;
        } else {
            i2 = 300;
        }
        if (true != z) {
            i4 = i2;
        }
        ?? r3 = this.a;
        if (!r3.u() || (acksVar = (acks) this.b.io()) == null) {
            if (i3 != 0) {
                return ackp.b(context, "sans-serif", i4, false);
            }
            return z ? ackm.YOUTUBE_SANS_BOLD.c(context, 0) : ackm.YOUTUBE_SANS_LIGHT.c(context, 0);
        }
        if (i3 != 0) {
            if (i3 == 1 && r3.A()) {
                acksVar.b(context, 4);
            }
            i5 = 1;
        } else if (r3.z()) {
            acksVar.b(context, 4);
        }
        return acksVar.a(context, i5, i4, 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v2, types: [awmd, java.lang.Object] */
    public static /* synthetic */ Object o(aciz acizVar, byte[] bArr, awut awutVar, awqk awqkVar, awoq awoqVar) throws Throwable {
        adrg adrgVar;
        Throwable th;
        CommandQueue commandQueue;
        if (awoqVar instanceof adrg) {
            adrgVar = (adrg) awoqVar;
            int i = adrgVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                adrgVar.b = i - Integer.MIN_VALUE;
            } else {
                adrgVar = new adrg(acizVar, awoqVar);
            }
        } else {
            adrgVar = new adrg(acizVar, awoqVar);
        }
        adrg adrgVar2 = adrgVar;
        Object objAh = adrgVar2.a;
        awox awoxVar = awox.a;
        int i2 = adrgVar2.b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            commandQueue = adrgVar2.c;
            try {
                atqp.j(objAh);
                commandQueue.release("RiveSessionFactory", "Transfer");
                return objAh;
            } catch (Throwable th2) {
                th = th2;
                commandQueue.release("RiveSessionFactory", "Transfer");
                throw th;
            }
        }
        atqp.j(objAh);
        Object objIo = acizVar.a.io();
        objIo.getClass();
        CommandQueue commandQueue2 = (CommandQueue) objIo;
        try {
            acfz acfzVar = adqc.i;
            Object obj = acizVar.b;
            adrgVar2.c = commandQueue2;
            adrgVar2.b = 1;
            objAh = acfzVar.ah(bArr, (Context) obj, awutVar, commandQueue2, awqkVar, adrgVar2);
            if (objAh == awoxVar) {
                return awoxVar;
            }
            commandQueue = commandQueue2;
            commandQueue.release("RiveSessionFactory", "Transfer");
            return objAh;
        } catch (Throwable th3) {
            th = th3;
            commandQueue = commandQueue2;
            commandQueue.release("RiveSessionFactory", "Transfer");
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    public final void A(zwa zwaVar) throws FileNotFoundException {
        ((aegh) this.b.io()).h(zwaVar);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(null);
        cookieManager.flush();
        WebStorage.getInstance().deleteAllData();
        Context context = (Context) this.a;
        WebViewDatabase.getInstance(context).clearFormData();
        File file = new File(context.getCacheDir(), "org.chromium.android_webview");
        if (file.exists()) {
            F(file, file);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x013e  */
    /* JADX WARN: Code duplicated, block: B:127:0x016e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0170  */
    /* JADX WARN: Code duplicated, block: B:130:0x0174  */
    /* JADX WARN: Code duplicated, block: B:131:0x0177  */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:87:0x0110  */
    /* JADX WARN: Type inference failed for: r4v0, types: [aeda, java.lang.Object] */
    public final void B(aedv aedvVar, Context context, YouTubeAppCompatTextView youTubeAppCompatTextView) {
        int i;
        int i2;
        aedr aedrVarA;
        if (this.a.x() && (aedrVarA = aedi.a(aedvVar)) != null) {
            youTubeAppCompatTextView.setTypeface(G(context, aedvVar.a, aedrVarA.c));
            youTubeAppCompatTextView.setTextSize(2, aedrVarA.a);
            azw.k(youTubeAppCompatTextView, (int) TypedValue.applyDimension(2, aedrVarA.b, context.getResources().getDisplayMetrics()));
            return;
        }
        boolean z = aedvVar.d == 2;
        int i3 = aedvVar.a;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 1;
        if (i4 == 0) {
            int i5 = aedvVar.b;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                i = 24;
            } else if (i6 == 1) {
                i = 32;
            } else if (i6 == 2) {
                i = 40;
            } else if (i6 != 3) {
                if (i6 != 4) {
                    throw new RuntimeException(null, null);
                }
                i = 0;
            } else {
                i = 56;
            }
        } else if (i4 == 1) {
            int i7 = aedvVar.b;
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            if (i8 == 0) {
                i = 18;
            } else if (i8 == 1) {
                i = 20;
            } else if (i8 == 2) {
                i = 24;
            } else if (i8 != 3) {
                if (i8 != 4) {
                    throw new RuntimeException(null, null);
                }
                i = 0;
            } else {
                i = 32;
            }
        } else {
            if (i4 != 2 && i4 != 3) {
                throw new RuntimeException(null, null);
            }
            int i9 = aedvVar.b;
            int i10 = i9 - 1;
            if (i9 == 0) {
                throw null;
            }
            if (i10 == 0) {
                i = 10;
            } else if (i10 == 1) {
                i = 12;
            } else if (i10 == 2) {
                i = 14;
            } else if (i10 != 3) {
                if (i10 != 4) {
                    throw new RuntimeException(null, null);
                }
                i = 18;
            } else {
                i = 16;
            }
        }
        youTubeAppCompatTextView.setTypeface(G(context, i3, z));
        youTubeAppCompatTextView.setTextSize(2, i);
        int i11 = aedvVar.c;
        if (i4 == 0) {
            int i12 = aedvVar.b;
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        i2 = i11 == 2 ? 54 : 48;
                    } else if (i13 != 3) {
                        if (i13 != 4) {
                            throw new RuntimeException(null, null);
                        }
                        i2 = 0;
                    } else {
                        i2 = i11 == 2 ? 78 : 68;
                    }
                } else if (i11 == 2) {
                    i2 = 44;
                } else {
                    i2 = 38;
                }
            } else if (i11 == 2) {
                i2 = 32;
            } else {
                i2 = 30;
            }
        } else if (i4 == 1) {
            int i14 = aedvVar.b;
            int i15 = i14 - 1;
            if (i14 == 0) {
                throw null;
            }
            if (i15 != 0) {
                if (i15 == 1) {
                    i2 = i11 == 2 ? 28 : 24;
                } else if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 4) {
                            throw new RuntimeException(null, null);
                        }
                        i2 = 0;
                    } else if (i11 == 2) {
                        i2 = 44;
                    } else {
                        i2 = 38;
                    }
                } else if (i11 == 2) {
                    i2 = 32;
                } else {
                    i2 = 30;
                }
            } else if (i11 == 2) {
                i2 = 26;
            } else {
                i2 = 22;
            }
        } else {
            if (i4 != 2 && i4 != 3) {
                throw new RuntimeException(null, null);
            }
            int i16 = aedvVar.b;
            int i17 = i16 - 1;
            if (i16 == 0) {
                throw null;
            }
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 != 3) {
                            if (i17 != 4) {
                                throw new RuntimeException(null, null);
                            }
                            if (i11 == 2) {
                                i2 = 26;
                            }
                        } else if (i11 == 2) {
                        }
                        i2 = 22;
                    } else if (i11 == 2) {
                    }
                    i2 = 20;
                } else if (i11 != 2) {
                    i2 = 16;
                }
                i2 = 18;
            } else if (i11 == 2) {
                i2 = 16;
            } else {
                i2 = 14;
            }
        }
        azw.k(youTubeAppCompatTextView, (int) TypedValue.applyDimension(2, i2, context.getResources().getDisplayMetrics()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aeda, java.lang.Object] */
    public final boolean C() {
        return this.a.q();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aeda, java.lang.Object] */
    public final boolean D() {
        return this.a.r();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    public final qrx E(afra afraVar, ayq ayqVar) {
        Executor executor = afraVar.g;
        if (executor == null) {
            executor = (Executor) this.b.io();
        }
        Executor executor2 = executor;
        Object obj = this.a;
        executor2.getClass();
        ListenableFuture listenableFutureAp = ahno.ap(new aalq(afraVar, obj, 19, null), executor2);
        qrx qrxVarK = rmp.K(afraVar.a, listenableFutureAp, afraVar.b, ExtensionRegistryLite.getGeneratedRegistry(), executor2, afraVar.e, ayqVar);
        agke agkeVar = afraVar.d;
        if (!agkeVar.isEmpty()) {
            qrxVarK.b(new qrk(agkeVar, executor2));
        }
        return qrxVarK;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aeez, java.lang.Object] */
    public final void a(aefd aefdVar) {
        this.a.d(aefdVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final acji b() {
        ?? r0 = this.b;
        ?? r4 = this.a;
        acji acjiVar = new acji(atqq.D(r4), atqq.D(r0));
        r4.clear();
        r0.clear();
        return acjiVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void c(aciw aciwVar) {
        aciwVar.getClass();
        ?? r0 = this.a;
        String str = aciwVar.h;
        if (r0.containsKey(str)) {
            return;
        }
        ?? r3 = this.b;
        str.getClass();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void d(aciw aciwVar) {
        aciwVar.getClass();
        ?? r0 = this.b;
        String str = aciwVar.h;
        if (r0.containsKey(str)) {
            return;
        }
        ?? r3 = this.a;
        str.getClass();
    }

    public final void e(List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((aciw) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(List list) {
        list.getClass();
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            d((aciw) agqsVarListIterator.next());
        }
    }

    public final void g() {
        xeu xeuVar = (xeu) this.a;
        boolean z = xeuVar.b;
        Object obj = this.b;
        if (z) {
            int i = ((apgl) ((aihf) obj).instance).b;
            if ((i & 1) == 0 && (i & 2) == 0 && (i & 4) == 0 && (i & 8) == 0) {
                return;
            }
            xff xffVarA = xeuVar.a(obj, alot.REELS_SEQUENCE_MUTATION_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        apgl apglVar = (apgl) ((aihf) obj).build();
        if (apglVar.equals(apgl.a)) {
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        apglVar.getClass();
        alouVar.d = apglVar;
        alouVar.c = 527;
        xeuVar.b((alou) alosVar.build());
    }

    public final void h(apgi apgiVar) {
        aihf aihfVar = (aihf) this.b;
        aihfVar.copyOnWrite();
        apgl apglVar = (apgl) aihfVar.instance;
        apgl apglVar2 = apgl.a;
        apgiVar.getClass();
        apglVar.c = apgiVar;
        apglVar.b |= 1;
    }

    public final void i(apgm apgmVar) {
        aihf aihfVar = (aihf) this.b;
        aihfVar.copyOnWrite();
        apgl apglVar = (apgl) aihfVar.instance;
        apgl apglVar2 = apgl.a;
        apgmVar.getClass();
        apglVar.d = apgmVar;
        apglVar.b |= 2;
    }

    public final void j(apgn apgnVar) {
        aihf aihfVar = (aihf) this.b;
        aihfVar.copyOnWrite();
        apgl apglVar = (apgl) aihfVar.instance;
        apgl apglVar2 = apgl.a;
        apgnVar.getClass();
        apglVar.e = apgnVar;
        apglVar.b |= 4;
    }

    public final void k(int i) {
        aihf aihfVar = (aihf) this.b;
        aihfVar.copyOnWrite();
        apgl apglVar = (apgl) aihfVar.instance;
        apgl apglVar2 = apgl.a;
        apglVar.f = i - 1;
        apglVar.b |= 8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final adxz l(advq advqVar) {
        avmb avmbVar = (avmb) this.a.io();
        avmbVar.getClass();
        vxz vxzVar = (vxz) this.b.io();
        vxzVar.getClass();
        return new adxz(avmbVar, vxzVar, advqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final adxz m(advq advqVar, adxd adxdVar) {
        avmb avmbVar = (avmb) this.a.io();
        avmbVar.getClass();
        vxz vxzVar = (vxz) this.b.io();
        vxzVar.getClass();
        return new adxz(avmbVar, vxzVar, advqVar, adxdVar);
    }

    public final ajly n() {
        apkc apkcVar = (apkc) this.a;
        ajlx ajlxVar = apkcVar.h;
        if (ajlxVar == null) {
            ajlxVar = ajlx.a;
        }
        if ((ajlxVar.b & 2) == 0) {
            return null;
        }
        ajlx ajlxVar2 = apkcVar.h;
        if (ajlxVar2 == null) {
            ajlxVar2 = ajlx.a;
        }
        ajly ajlyVar = ajlxVar2.c;
        return ajlyVar == null ? ajly.a : ajlyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.AutoCloseable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final ahdm p(ahdh ahdhVar, Executor executor) {
        ahdm ahdmVar = new ahdm(ahng.g(agke.j(agix.b(this.a).c(new ampw(1)).d())).a(new ahdg(this, ahdhVar, 0), executor));
        ahdmVar.c.b.b(this.b, MoreExecutors.directExecutor());
        return ahdmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence, java.lang.Object] */
    public final void q(StringBuilder sb, Iterable iterable) {
        Iterator it = iterable.iterator();
        try {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object obj = this.b;
                sb.append(((ager) obj).a(entry.getKey()));
                ?? r4 = this.a;
                sb.append((CharSequence) r4);
                sb.append(((ager) obj).a(entry.getValue()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ((ager) obj).c);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(((ager) obj).a(entry2.getKey()));
                    sb.append((CharSequence) r4);
                    sb.append(((ager) obj).a(entry2.getValue()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r13v29, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [awmd, java.lang.Object] */
    public final void r(Thread thread, Throwable th) {
        int i;
        if (((trl) ((aess) this.a).e).c) {
            zvp.b(zvn.a, zvm.B, "Background Thread Uncaught Exception", th);
            String name = thread.getName();
            String strReplace = Log.getStackTraceString(th).replace(String.valueOf(th.getMessage()).concat("\n"), "\n");
            aesq aesqVar = (aesq) this.b.io();
            aihf aihfVarCreateBuilder = axhq.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            axhq axhqVar = (axhq) aihfVarCreateBuilder.instance;
            axhqVar.b |= 1;
            axhqVar.c = true;
            Object obj = aesqVar.c;
            try {
                aihf aihfVarCreateBuilder2 = axhg.a.createBuilder();
                aihf aihfVarCreateBuilder3 = axhf.a.createBuilder();
                long elapsedCpuTime = Process.getElapsedCpuTime();
                aihfVarCreateBuilder3.copyOnWrite();
                axhf axhfVar = (axhf) aihfVarCreateBuilder3.instance;
                axhfVar.b |= 1;
                axhfVar.c = elapsedCpuTime;
                boolean zB = ((aepv) aesqVar.b.io()).b();
                aihfVarCreateBuilder3.copyOnWrite();
                axhf axhfVar2 = (axhf) aihfVarCreateBuilder3.instance;
                axhfVar2.b |= 2;
                axhfVar2.d = zB;
                int iActiveCount = Thread.activeCount();
                aihfVarCreateBuilder3.copyOnWrite();
                axhf axhfVar3 = (axhf) aihfVarCreateBuilder3.instance;
                axhfVar3.b |= 4;
                axhfVar3.e = iActiveCount;
                axhf axhfVar4 = (axhf) aihfVarCreateBuilder3.build();
                aihfVarCreateBuilder2.copyOnWrite();
                axhg axhgVar = (axhg) aihfVarCreateBuilder2.instance;
                axhfVar4.getClass();
                axhgVar.c = axhfVar4;
                axhgVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                axhq axhqVar2 = (axhq) aihfVarCreateBuilder.instance;
                axhg axhgVar2 = (axhg) aihfVarCreateBuilder2.build();
                axhgVar2.getClass();
                axhqVar2.d = axhgVar2;
                axhqVar2.b |= 2;
            } catch (RuntimeException unused) {
            }
            String name2 = th.getClass().getName();
            for (Throwable cause = th.getCause(); cause != null && cause != cause.getCause(); cause = cause.getCause()) {
                name2 = cause.getClass().getName();
            }
            aihfVarCreateBuilder.copyOnWrite();
            axhq axhqVar3 = (axhq) aihfVarCreateBuilder.instance;
            name.getClass();
            axhqVar3.b |= 8;
            axhqVar3.f = name;
            int iP = a.P(th.getClass());
            aihfVarCreateBuilder.copyOnWrite();
            axhq axhqVar4 = (axhq) aihfVarCreateBuilder.instance;
            axhqVar4.g = iP - 1;
            axhqVar4.b |= 16;
            aihfVarCreateBuilder.copyOnWrite();
            axhq axhqVar5 = (axhq) aihfVarCreateBuilder.instance;
            name2.getClass();
            axhqVar5.b |= SemanticState.Focused;
            axhqVar5.h = name2;
            aihf aihfVarB = aext.b(th, true);
            aihfVarCreateBuilder.copyOnWrite();
            axhq axhqVar6 = (axhq) aihfVarCreateBuilder.instance;
            ahag ahagVar = (ahag) aihfVarB.build();
            ahagVar.getClass();
            axhqVar6.i = ahagVar;
            axhqVar6.b |= SemanticState.Hidden;
            axhq axhqVar7 = (axhq) aihfVarCreateBuilder.build();
            aihf aihfVarCreateBuilder4 = axhz.a.createBuilder();
            aihfVarCreateBuilder4.copyOnWrite();
            axhz axhzVar = (axhz) aihfVarCreateBuilder4.instance;
            axhqVar7.getClass();
            axhzVar.h = axhqVar7;
            axhzVar.b |= 64;
            aess aessVar = (aess) aesqVar.a;
            Context context = (Context) aessVar.c;
            String packageName = context.getPackageName();
            String strB = txz.b(context);
            String strB2 = qel.b(context);
            aihf aihfVarCreateBuilder5 = axhl.a.createBuilder();
            if (packageName != null) {
                aihfVarCreateBuilder5.copyOnWrite();
                axhl axhlVar = (axhl) aihfVarCreateBuilder5.instance;
                axhlVar.b |= 1;
                axhlVar.c = packageName;
                aihfVarCreateBuilder5.copyOnWrite();
                axhl axhlVar2 = (axhl) aihfVarCreateBuilder5.instance;
                strB.getClass();
                axhlVar2.b |= 2;
                axhlVar2.d = strB;
            }
            if (strB2 != null) {
                aihfVarCreateBuilder5.copyOnWrite();
                axhl axhlVar3 = (axhl) aihfVarCreateBuilder5.instance;
                axhlVar3.b |= 16;
                axhlVar3.g = strB2;
            }
            aihfVarCreateBuilder4.copyOnWrite();
            axhz axhzVar2 = (axhz) aihfVarCreateBuilder4.instance;
            axhl axhlVar4 = (axhl) aihfVarCreateBuilder5.build();
            axhlVar4.getClass();
            axhzVar2.q = axhlVar4;
            axhzVar2.b |= 8388608;
            axhz axhzVar3 = (axhz) aihfVarCreateBuilder4.build();
            aihf aihfVarCreateBuilder6 = aqih.a.createBuilder();
            aihf aihfVarCreateBuilder7 = aqib.a.createBuilder();
            long epochMilli = aessVar.d.f().toEpochMilli();
            aihfVarCreateBuilder7.copyOnWrite();
            aqib aqibVar = (aqib) aihfVarCreateBuilder7.instance;
            aqibVar.b |= 8;
            aqibVar.e = epochMilli;
            if (strReplace != null) {
                aihfVarCreateBuilder7.copyOnWrite();
                aqib aqibVar2 = (aqib) aihfVarCreateBuilder7.instance;
                aqibVar2.b |= 1;
                aqibVar2.c = strReplace;
            }
            int i2 = ((aqib) aihfVarCreateBuilder7.instance).b;
            if ((i2 & 1) != 0 || (i2 & 2) != 0) {
                aihfVarCreateBuilder6.copyOnWrite();
                aqih aqihVar = (aqih) aihfVarCreateBuilder6.instance;
                aqib aqibVar3 = (aqib) aihfVarCreateBuilder7.build();
                aqibVar3.getClass();
                aqihVar.g = aqibVar3;
                aqihVar.b |= 64;
            }
            aepv aepvVar = (aepv) aesqVar.b.io();
            aepvVar.g(aihfVarCreateBuilder6);
            aepvVar.f(aihfVarCreateBuilder6);
            aigj byteString = axhzVar3.toByteString();
            aihfVarCreateBuilder6.copyOnWrite();
            aqih aqihVar2 = (aqih) aihfVarCreateBuilder6.instance;
            aqihVar2.b |= 8;
            aqihVar2.f = byteString;
            aqih aqihVar3 = (aqih) aihfVarCreateBuilder6.build();
            aihf aihfVarCreateBuilder8 = ajej.a.createBuilder();
            Class<?> cls = th.getClass();
            if (cls == OutOfMemoryError.class) {
                i = 14;
            } else if (NullPointerException.class.isAssignableFrom(cls)) {
                i = 13;
            } else if (RuntimeException.class.isAssignableFrom(cls)) {
                i = 15;
            } else {
                i = Error.class.isAssignableFrom(cls) ? 16 : 1;
            }
            aihfVarCreateBuilder8.copyOnWrite();
            ajej ajejVar = (ajej) aihfVarCreateBuilder8.instance;
            ajejVar.c = i - 1;
            ajejVar.b |= 1;
            String strB3 = txz.b(context);
            aihfVarCreateBuilder8.copyOnWrite();
            ajej ajejVar2 = (ajej) aihfVarCreateBuilder8.instance;
            strB3.getClass();
            ajejVar2.b |= 2;
            ajejVar2.d = strB3;
            aihfVarCreateBuilder8.copyOnWrite();
            ajej ajejVar3 = (ajej) aihfVarCreateBuilder8.instance;
            aqihVar3.getClass();
            ajejVar3.e = aqihVar3;
            ajejVar3.b |= 16;
            aihf builder = ((ajej) aihfVarCreateBuilder8.build()).toBuilder();
            builder.copyOnWrite();
            ajej ajejVar4 = (ajej) builder.instance;
            ajejVar4.c = 16;
            ajejVar4.b |= 1;
            afba.U((aess) this.a, (ajej) builder.build(), aesv.BACKGROUND_THREAD_UNCAUGHT_EXCEPTION);
        }
    }

    public final wgd s() {
        Object obj = this.a;
        if (obj != null) {
            alxg alxgVar = (alxg) obj;
            if (!alxgVar.d.isEmpty() && ((alxl) alxgVar.d.get(0)).b == 49399797) {
                alxl alxlVar = (alxl) alxgVar.d.get(0);
                return new wgd(alxlVar.b == 49399797 ? (apoq) alxlVar.c : apoq.a);
            }
        }
        return null;
    }

    public final Intent t(String str, String str2, Bitmap bitmap) throws Exception {
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", str2);
        intent.putExtra("content_url", str);
        try {
            Uri uriL = aedi.l((Activity) this.a, aedi.m((Activity) this.a, bitmap, "background.png"));
            if (intent.getType() != null && !Objects.equals(intent.getType(), "image/*")) {
                throw new Exception("Background data and sticker data must share the same media type");
            }
            intent.setDataAndType(uriL, "image/*");
            intent.setFlags(1);
            return intent;
        } catch (IOException e) {
            throw new Exception("Failed to create story background asset.", e);
        }
    }

    public final void u(String str, String str2, Bitmap bitmap, Bitmap bitmap2) throws Exception {
        Intent intentT = t(str, str2, bitmap);
        try {
            File fileM = aedi.m((Activity) this.a, bitmap2, "sticker.png");
            Activity activity = (Activity) this.a;
            Uri uriL = aedi.l(activity, fileM);
            intentT.putExtra("interactive_asset_uri", uriL);
            if (intentT.getType() == null) {
                intentT.setType("image/*");
            } else if (!Objects.equals(intentT.getType(), "image/*")) {
                throw new Exception("Background data and sticker data must share the same media type");
            }
            activity.grantUriPermission("com.facebook.katana", uriL, 1);
            v(intentT);
        } catch (IOException e) {
            throw new Exception("Failed to create story sticker asset.", e);
        }
    }

    public final void v(Intent intent) throws Exception {
        Activity activity = (Activity) this.a;
        if (activity.getPackageManager().resolveActivity(intent, 0) == null) {
            throw new Exception("Unable to resolve activity for Facebook story sharing.");
        }
        activity.startActivityForResult(intent, 0);
        Object obj = this.b;
        if (obj != null) {
            ((aerv) obj).e("YTM_SHARE_TO_FACEBOOK_STORY");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final apqs w(apqs apqsVar) {
        apqs apqsVar2 = (apqs) this.b.get(apqsVar);
        return apqsVar2 != null ? apqsVar2 : apqsVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final apqz x(apqz apqzVar) {
        apqz apqzVar2 = (apqz) this.a.get(apqzVar);
        return apqzVar2 != null ? apqzVar2 : apqzVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void y() {
        this.b.clear();
        this.a.clear();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void z(apqs apqsVar, boolean z) {
        aihf builder = w(apqsVar).toBuilder();
        builder.copyOnWrite();
        apqs apqsVar2 = (apqs) builder.instance;
        apqsVar2.b |= SemanticState.Hidden;
        apqsVar2.f = z;
        this.b.put(apqsVar, (apqs) builder.build());
    }

    public aciz(Context context, awmd awmdVar) {
        this.a = context;
        this.b = awmdVar;
    }

    public aciz(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public aciz(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public aciz(Object obj, Object obj2, char[] cArr) {
        this.a = obj;
        this.b = obj2;
    }

    public aciz(awmd awmdVar, hil hilVar) {
        Boolean.FALSE.booleanValue();
        this.b = (Set) ((aupo) awmdVar).b;
        this.a = hilVar;
    }

    public aciz(ijt ijtVar, ijt ijtVar2) {
        ijtVar.getClass();
        this.b = ijtVar;
        this.a = ijtVar2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    public aciz(Set set) {
        this.b = set;
        this.a = new boolean[SemanticState.Hidden];
        for (int i = 0; i < 256; i++) {
            ((boolean[]) this.a)[i] = this.b.contains(Integer.valueOf(i));
        }
    }

    public aciz(xeu xeuVar) {
        this.a = xeuVar;
        this.b = apgl.a.createBuilder();
    }

    public aciz(char[] cArr) {
        this.b = DesugarCollections.synchronizedMap(new IdentityHashMap());
        this.a = DesugarCollections.synchronizedMap(new IdentityHashMap());
    }

    public aciz(Iterable iterable) {
        this.b = new ahde();
        this.a = agke.j(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ahdm ahdmVar = (ahdm) it.next();
            Object obj = this.b;
            aheu aheuVar = ahdm.a;
            ahdmVar.e((ahde) obj);
        }
    }

    public aciz(byte[] bArr) {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
    }

    public aciz(Context context) {
        context.getClass();
        this.b = context;
        String packageName = context.getPackageName();
        packageName.getClass();
        this.a = packageName;
        atqp.k(2, new afqt(this, 0));
    }

    public aciz(ager agerVar) {
        this.b = agerVar;
        this.a = "=";
    }

    public aciz() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public aciz(Context context, aeez aeezVar) {
        context.getClass();
        this.b = context;
        aeezVar.getClass();
        this.a = aeezVar;
    }

    public aciz(aciz acizVar) {
        this.a = new axlj((axlj) acizVar.a);
        this.b = Arrays.copyOf((long[]) acizVar.b, 10);
    }

    public aciz(awmd awmdVar, awmd awmdVar2, byte[] bArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
    }

    public aciz(apkc apkcVar) {
        aokf aokfVar;
        this.a = apkcVar;
        aokg aokgVar = apkcVar.c;
        if (((aokgVar == null ? aokg.a : aokgVar).b & 1) != 0) {
            aokg aokgVar2 = apkcVar.c;
            aokfVar = (aokgVar2 == null ? aokg.a : aokgVar2).c;
            if (aokfVar == null) {
                aokfVar = aokf.a;
            }
        } else {
            aokfVar = null;
        }
        this.b = aokfVar;
    }

    public aciz(awmd awmdVar, awmd awmdVar2) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
    }

    public aciz(awmd awmdVar, Context context) {
        awmdVar.getClass();
        context.getClass();
        this.a = awmdVar;
        this.b = context;
    }

    public aciz(vxz vxzVar) {
        vxzVar.getClass();
        this.b = vxzVar;
        this.a = new awmp(new acoo(this, 10));
    }

    public aciz(awmd awmdVar, awmd awmdVar2, char[] cArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
    }
}
