package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jij {
    public final Object a;
    public final Object b;
    public final Object c;

    public jij(Context context, byte[] bArr) {
        this.a = new afv();
        this.c = context;
        this.b = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || B()) {
                return;
            }
            y();
        } catch (IOException unused) {
        }
    }

    private static final ajwo S(String str) {
        ajwo ajwoVarAi = kro.ai(str);
        ajwo ajwoVar = ajwo.a;
        aihh aihhVar = (aihh) ajwoVar.createBuilder();
        aihl aihlVar = anqn.b;
        aihf aihfVarCreateBuilder = anqn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anqn anqnVar = (anqn) aihfVarCreateBuilder.instance;
        ajwoVarAi.getClass();
        anqnVar.d = ajwoVarAi;
        anqnVar.c |= 1;
        aihhVar.e(aihlVar, (anqn) aihfVarCreateBuilder.build());
        ajwo ajwoVar2 = (ajwo) aihhVar.build();
        aihh aihhVar2 = (aihh) ajwoVar.createBuilder();
        aihl aihlVar2 = ajwm.b;
        aihf aihfVarCreateBuilder2 = ajwm.a.createBuilder();
        aihfVarCreateBuilder2.aP(ajwoVarAi);
        aihfVarCreateBuilder2.aP(ajwoVar2);
        aihhVar2.e(aihlVar2, (ajwm) aihfVarCreateBuilder2.build());
        return (ajwo) aihhVar2.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture T(final Function function) {
        return ((qrx) this.b).a(new agek() { // from class: ibq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                ailh ailhVar = (ailh) obj;
                kjc kjcVar = (kjc) this.b.c;
                String strO = kjcVar.o();
                ailz ailzVar = ailz.a;
                ailz ailzVar2 = (ailz) ailhVar.b.get(strO);
                if (ailzVar2 != null) {
                    ailzVar = ailzVar2;
                }
                Function function2 = function;
                aihf builder = ailzVar.toBuilder();
                aihf builder2 = ailhVar.toBuilder();
                String strO2 = kjcVar.o();
                ailz ailzVar3 = (ailz) ((aihf) function2.apply(builder)).build();
                ailzVar3.getClass();
                builder2.copyOnWrite();
                ailh ailhVar2 = (ailh) builder2.instance;
                aiip aiipVar = ailhVar2.b;
                if (!aiipVar.b) {
                    ailhVar2.b = aiipVar.a();
                }
                ailhVar2.b.put(strO2, ailzVar3);
                return (ailh) builder2.build();
            }
        }, this.a);
    }

    private static void U(HttpURLConnection httpURLConnection) {
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                errorStream.close();
            }
        } catch (IOException unused2) {
        }
    }

    private static final String V(String str, String str2, String str3) {
        return str + "|T|" + str2 + '|' + str3;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture W(afmr afmrVar) {
        return ahng.r(afwl.j(new afmn(this, afmrVar, 0)), this.b);
    }

    public static final anxn e(String str) {
        aihf aihfVarCreateBuilder = anxn.a.createBuilder();
        alay alayVarD = ackj.d(str);
        aihfVarCreateBuilder.copyOnWrite();
        anxn anxnVar = (anxn) aihfVarCreateBuilder.instance;
        alayVarD.getClass();
        anxnVar.c = alayVarD;
        anxnVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anxn anxnVar2 = (anxn) aihfVarCreateBuilder.instance;
        anxnVar2.e = 2;
        anxnVar2.b |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        anxn anxnVar3 = (anxn) aihfVarCreateBuilder.instance;
        anxnVar3.f = 2;
        anxnVar3.b |= 8;
        return (anxn) aihfVarCreateBuilder.build();
    }

    public static angn h(aliz alizVar, String str, Optional optional) {
        aihf aihfVarCreateBuilder = angn.a.createBuilder();
        aihf aihfVarCreateBuilder2 = angt.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        angt angtVar = (angt) aihfVarCreateBuilder2.instance;
        angtVar.c = alizVar.yN;
        angtVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        angn angnVar = (angn) aihfVarCreateBuilder.instance;
        angt angtVar2 = (angt) aihfVarCreateBuilder2.build();
        angtVar2.getClass();
        angnVar.d = angtVar2;
        angnVar.c = 2;
        aihf aihfVarCreateBuilder3 = angq.a.createBuilder();
        aihf aihfVarCreateBuilder4 = angp.a.createBuilder();
        alay alayVarD = ackj.d(str);
        aihfVarCreateBuilder4.copyOnWrite();
        angp angpVar = (angp) aihfVarCreateBuilder4.instance;
        alayVarD.getClass();
        angpVar.c = alayVarD;
        angpVar.b |= 1;
        aihfVarCreateBuilder3.copyOnWrite();
        angq angqVar = (angq) aihfVarCreateBuilder3.instance;
        angp angpVar2 = (angp) aihfVarCreateBuilder4.build();
        angpVar2.getClass();
        angqVar.c = angpVar2;
        angqVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        angn angnVar2 = (angn) aihfVarCreateBuilder.instance;
        angq angqVar2 = (angq) aihfVarCreateBuilder3.build();
        angqVar2.getClass();
        angnVar2.f = angqVar2;
        angnVar2.b |= 2;
        jfn jfnVar = new jfn(aihfVarCreateBuilder, 3);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = jfnVar.a;
            aihf aihfVarCreateBuilder5 = ajng.a.createBuilder();
            aihfVarCreateBuilder5.copyOnWrite();
            ajng ajngVar = (ajng) aihfVarCreateBuilder5.instance;
            ajngVar.c = (ajnf) obj;
            ajngVar.b |= 1;
            aihf aihfVar = (aihf) obj2;
            aihfVar.copyOnWrite();
            angn angnVar3 = (angn) aihfVar.instance;
            ajng ajngVar2 = (ajng) aihfVarCreateBuilder5.build();
            ajngVar2.getClass();
            angnVar3.h = ajngVar2;
            angnVar3.b |= 16;
        }
        return (angn) aihfVarCreateBuilder.build();
    }

    public static Object v(lpa lpaVar) throws IOException {
        try {
            return mda.o(lpaVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e2);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void A(String str, String str2, String str3, String str4, String str5) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = ahrq.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str4);
            jSONObject.put("appVersion", str5);
            jSONObject.put("timestamp", jCurrentTimeMillis);
            string = jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseInstanceId", "Failed to encode token: ".concat(e.toString()));
            string = null;
        }
        if (string == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putString(V(str, str2, str3), string);
        editorEdit.commit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized boolean B() {
        return this.b.getAll().isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void C(String str) {
        ?? r0 = this.b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (r0.contains(str.concat("|S|cre"))) {
            String string = r0.getString(str.concat("|S|cre"), null);
            jCurrentTimeMillis = 0;
            if (string != null) {
                try {
                    jCurrentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
        } else {
            ?? r1 = this.b;
            String strConcat = str.concat("|S|cre");
            SharedPreferences.Editor editorEdit = r1.edit();
            editorEdit.putString(strConcat, String.valueOf(jCurrentTimeMillis));
            editorEdit.commit();
        }
        this.a.put(str, Long.valueOf(jCurrentTimeMillis));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final boolean D() {
        return this.a.isEmpty();
    }

    public final File E() {
        return new File(((auor) this.c).i((afqw) this.a), (String) this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ahdm F(qsr qsrVar) {
        qsrVar.d((Executor) this.b);
        return ahdm.b(qsrVar, MoreExecutors.directExecutor());
    }

    public final ahdm G(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        strArr.getClass();
        uri.getClass();
        afmq afmqVar = new afmq(this, uri, strArr, str, strArr2, str2);
        int i = qsr.a;
        return F(new qsp(afmqVar));
    }

    public final ListenableFuture H(Uri uri, ContentValues[] contentValuesArr) {
        return W(new afmo(uri, contentValuesArr, 0));
    }

    public final ListenableFuture I(Uri uri, ContentValues contentValues) {
        return W(new afmo(uri, contentValues, 1));
    }

    public final ListenableFuture J(final Uri uri, final ContentValues contentValues, final String str, final String[] strArr) {
        return W(new afmr() { // from class: afmm
            @Override // defpackage.afmr
            public final Object a(abhh abhhVar) {
                final Uri uri2 = uri;
                final ContentValues contentValues2 = contentValues;
                final String str2 = str;
                final String[] strArr2 = strArr;
                Integer num = (Integer) abhhVar.g(uri2, new aflc() { // from class: afkq
                    @Override // defpackage.aflc
                    public final Object a(ContentProviderClient contentProviderClient) {
                        return Integer.valueOf(contentProviderClient.update(uri2, contentValues2, str2, strArr2));
                    }
                });
                num.intValue();
                return num;
            }
        });
    }

    public final ListenableFuture K(Uri uri, String[] strArr) {
        return W(new afmo(uri, strArr, 2));
    }

    public final ListenableFuture L(ListenableFuture listenableFuture, ahcy ahcyVar) {
        Set set = (Set) ((aupo) this.a).b;
        int size = set.size();
        aguu.ag(size, "expectedSize");
        agkx agkxVar = new agkx(size);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            agkxVar.c(new afsp(ahcyVar, (aflh) it.next(), 1));
        }
        return ((ahpu) this.c).h(new ojf(listenableFuture, 15), agkxVar.g());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final afju M(Class cls) {
        afju afjuVar;
        cls.getClass();
        synchronized (this.b) {
            ?? r1 = this.a;
            Object obj = r1.get(cls);
            if (obj == null) {
                ght ghtVar = ((ghs) ((hhb) this.c).a).a;
                Context context = (Context) ghtVar.v.io();
                afju afjuVar2 = new afju(context, (ahey) ghtVar.z.io(), ghtVar.gC());
                r1.put(cls, afjuVar2);
                obj = afjuVar2;
            }
            afjuVar = (afju) obj;
        }
        return afjuVar;
    }

    public final void N() {
        afuu afuuVarC = afwt.c(107, "onBeforeNoAccountAvailable");
        try {
            agqr it = ((agpr) this.c).iterator();
            while (it.hasNext()) {
                afgr afgrVar = (afgr) it.next();
                if (afgrVar instanceof afgs) {
                    ((afgs) afgrVar).b();
                }
            }
            for (afgr afgrVar2 : (ArrayList) this.b) {
                if (afgrVar2 instanceof afgs) {
                    ((afgs) afgrVar2).b();
                }
            }
            afuuVarC.close();
        } catch (Throwable th) {
            try {
                afuuVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void O() {
        afuu afuuVarC = afwt.c(108, "onBeforeAccountLoading");
        try {
            agqr it = ((agpr) this.c).iterator();
            while (it.hasNext()) {
                afgr afgrVar = (afgr) it.next();
                if (afgrVar instanceof afgs) {
                    ((afgs) afgrVar).a();
                }
            }
            for (afgr afgrVar2 : (ArrayList) this.b) {
                if (afgrVar2 instanceof afgs) {
                    ((afgs) afgrVar2).a();
                }
            }
            afuuVarC.close();
        } catch (Throwable th) {
            try {
                afuuVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    public final void P(afhq afhqVar) {
        if (afhqVar.equals(afhq.a)) {
            throw new IllegalStateException();
        }
        if ((afhqVar.b & SemanticState.Hidden) == 0) {
            throw new IllegalStateException();
        }
        agqr it = ((agpr) this.c).iterator();
        while (it.hasNext()) {
            ((afgr) it.next()).E();
        }
        ?? r2 = this.b;
        int size = r2.size();
        for (int i = 0; i < size; i++) {
            ((afgr) r2.get(i)).E();
        }
    }

    public final void Q() {
        afuu afuuVarD = afwt.d(106, "onBeforeActivityAccountReady", afux.a, true);
        try {
            agqr it = ((agpr) this.c).iterator();
            while (it.hasNext()) {
                afgr afgrVar = (afgr) it.next();
                if (afgrVar instanceof afgs) {
                    ((afgs) afgrVar).c();
                }
            }
            for (afgr afgrVar2 : (ArrayList) this.b) {
                if (afgrVar2 instanceof afgs) {
                    ((afgs) afgrVar2).c();
                }
            }
            afuuVarD.close();
        } catch (Throwable th) {
            try {
                afuuVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized aerl R(akmm akmmVar) {
        aero aeroVar;
        ght ghtVar;
        List list;
        ?? r0 = this.c;
        aero aeroVar2 = (aero) r0.get(akmmVar);
        if (aeroVar2 == null) {
            switch (akmmVar.ordinal()) {
                case 1:
                    list = ((akml) this.a).b;
                    break;
                case 2:
                    list = ((akml) this.a).c;
                    break;
                case 3:
                    list = ((akml) this.a).d;
                    break;
                case 4:
                    list = ((akml) this.a).e;
                    break;
                case 5:
                    list = ((akml) this.a).f;
                    break;
                case 6:
                    list = ((akml) this.a).g;
                    break;
                case 7:
                    list = ((akml) this.a).h;
                    break;
                case 8:
                    list = ((akml) this.a).i;
                    break;
                case 9:
                    list = ((akml) this.a).j;
                    break;
                case 10:
                    list = ((akml) this.a).k;
                    break;
                case 11:
                    list = ((akml) this.a).l;
                    break;
                case 12:
                    list = ((akml) this.a).m;
                    break;
                case 13:
                    list = ((akml) this.a).n;
                    break;
                case 14:
                    list = ((akml) this.a).o;
                    break;
                case 15:
                    list = ((akml) this.a).p;
                    break;
                default:
                    list = agpi.a;
                    break;
            }
            aero aeroVar3 = new aero(list);
            r0.put(akmmVar, aeroVar3);
            aeroVar = aeroVar3;
        } else {
            aeroVar = aeroVar2;
        }
        ghtVar = ((gjc) ((hhb) this.b).a).a;
        return new aerl((mbc) ghtVar.l.io(), new aero((Context) ghtVar.a.a.v.io()), ghtVar.aZ, (ahey) ghtVar.u.io(), akmmVar, aeroVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [awmd, java.lang.Object] */
    public final jbm a(View view, View view2, View.OnClickListener onClickListener, Object obj, boolean z) {
        aduv aduvVar = (aduv) this.b.io();
        aduvVar.getClass();
        vxe vxeVar = (vxe) this.c.io();
        vxeVar.getClass();
        Optional optional = (Optional) this.a.io();
        optional.getClass();
        view.getClass();
        return new jbm(aduvVar, vxeVar, optional, view, view2, onClickListener, obj, z);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aunn, java.lang.Object] */
    public final boolean b() {
        ?? r1 = this.a;
        return (r1 == 0 || ((abvk) r1.io()).h() == null || ((abvk) r1.io()).h().c() == null || !((abvk) r1.io()).h().c().S()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aunn, java.lang.Object] */
    public final boolean c() {
        ?? r0;
        return (((tfq) this.c).h() || ((r0 = this.a) != 0 && ((abvk) r0.io()).h() != null && ((abvk) r0.io()).h().c() != null && ((abvk) r0.io()).h().c().R()) || b() || ((jnm) this.b).C()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, zwb] */
    public final anxn d(String str) {
        agjz agjzVar = new agjz(4);
        abut abutVar = new abut();
        abutVar.h(hdu.d.contains(str));
        Context context = (Context) this.b;
        abutVar.i(context.getString(R.string.pivot_library));
        abutVar.k(S("FEmusic_library_landing"));
        aiqd aiqdVar = aiqd.a;
        aihf aihfVarCreateBuilder = aiqdVar.createBuilder();
        String string = context.getString(R.string.sort_filter_button_selected_a11y_label, context.getString(R.string.library_content_selector_library_a11y_label));
        aihfVarCreateBuilder.copyOnWrite();
        aiqd aiqdVar2 = (aiqd) aihfVarCreateBuilder.instance;
        string.getClass();
        aiqdVar2.b |= 2;
        aiqdVar2.c = string;
        abutVar.j((aiqd) aihfVarCreateBuilder.build());
        aihf aihfVarCreateBuilder2 = aiqdVar.createBuilder();
        String string2 = context.getString(R.string.library_content_selector_library_a11y_label);
        aihfVarCreateBuilder2.copyOnWrite();
        aiqd aiqdVar3 = (aiqd) aihfVarCreateBuilder2.instance;
        string2.getClass();
        aiqdVar3.b |= 2;
        aiqdVar3.c = string2;
        abutVar.g((aiqd) aihfVarCreateBuilder2.build());
        agjzVar.h(abutVar.f());
        abut abutVar2 = new abut();
        abutVar2.h(hdu.c.contains(str));
        abutVar2.i(context.getString(R.string.library_downloads_shelf_title));
        abutVar2.k(S("FEmusic_offline"));
        aihf aihfVarCreateBuilder3 = aiqdVar.createBuilder();
        String string3 = context.getString(R.string.sort_filter_button_selected_a11y_label, context.getString(R.string.library_content_selector_downloads_a11y_label));
        aihfVarCreateBuilder3.copyOnWrite();
        aiqd aiqdVar4 = (aiqd) aihfVarCreateBuilder3.instance;
        string3.getClass();
        aiqdVar4.b |= 2;
        aiqdVar4.c = string3;
        abutVar2.j((aiqd) aihfVarCreateBuilder3.build());
        aihf aihfVarCreateBuilder4 = aiqdVar.createBuilder();
        String string4 = context.getString(R.string.library_content_selector_downloads_a11y_label);
        aihfVarCreateBuilder4.copyOnWrite();
        aiqd aiqdVar5 = (aiqd) aihfVarCreateBuilder4.instance;
        string4.getClass();
        aiqdVar5.b |= 2;
        aiqdVar5.c = string4;
        abutVar2.g((aiqd) aihfVarCreateBuilder4.build());
        agjzVar.h(abutVar2.f());
        axfd axfdVar = (axfd) this.c;
        anki ankiVarAp = axfdVar.ap(axfdVar.b.e());
        if (ankiVarAp != null && ankiVarAp.m) {
            abut abutVar3 = new abut();
            abutVar3.h(hdu.f.contains(str));
            abutVar3.i(context.getString(R.string.library_uploads_title));
            abutVar3.k(S("FEmusic_library_privately_owned_landing"));
            aihf aihfVarCreateBuilder5 = aiqdVar.createBuilder();
            String string5 = context.getString(R.string.sort_filter_button_selected_a11y_label, context.getString(R.string.library_content_selector_uploads_a11y_label));
            aihfVarCreateBuilder5.copyOnWrite();
            aiqd aiqdVar6 = (aiqd) aihfVarCreateBuilder5.instance;
            string5.getClass();
            aiqdVar6.b |= 2;
            aiqdVar6.c = string5;
            abutVar3.j((aiqd) aihfVarCreateBuilder5.build());
            aihf aihfVarCreateBuilder6 = aiqdVar.createBuilder();
            String string6 = context.getString(R.string.library_content_selector_uploads_a11y_label);
            aihfVarCreateBuilder6.copyOnWrite();
            aiqd aiqdVar7 = (aiqd) aihfVarCreateBuilder6.instance;
            string6.getClass();
            aiqdVar7.b |= 2;
            aiqdVar7.c = string6;
            abutVar3.g((aiqd) aihfVarCreateBuilder6.build());
            agjzVar.h(abutVar3.f());
        }
        abut abutVar4 = new abut();
        abutVar4.h(hdu.e.contains(str));
        abutVar4.i(context.getString(R.string.library_device_files_songs_shelf_title));
        abutVar4.k(S("FEmusic_library_sideloaded_tracks"));
        aihf aihfVarCreateBuilder7 = aiqdVar.createBuilder();
        String string7 = context.getString(R.string.sort_filter_button_selected_a11y_label, context.getString(R.string.library_content_selector_sideloaded_a11y_label));
        aihfVarCreateBuilder7.copyOnWrite();
        aiqd aiqdVar8 = (aiqd) aihfVarCreateBuilder7.instance;
        string7.getClass();
        aiqdVar8.b |= 2;
        aiqdVar8.c = string7;
        abutVar4.j((aiqd) aihfVarCreateBuilder7.build());
        aihf aihfVarCreateBuilder8 = aiqdVar.createBuilder();
        String string8 = context.getString(R.string.library_content_selector_sideloaded_a11y_label);
        aihfVarCreateBuilder8.copyOnWrite();
        aiqd aiqdVar9 = (aiqd) aihfVarCreateBuilder8.instance;
        string8.getClass();
        aiqdVar9.b |= 2;
        aiqdVar9.c = string8;
        abutVar4.g((aiqd) aihfVarCreateBuilder8.build());
        agjzVar.h(abutVar4.f());
        return ((jlb) this.a).a(agjzVar.g(), context.getString(R.string.library_content_selector_label), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        if (r4 > 1800000) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [agfr, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(int r20, int r21, long r22, long r24, long r26) {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            java.lang.Object r0 = r1.c     // Catch: java.lang.Throwable -> L86
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r0.io()     // Catch: java.lang.Throwable -> L86
            java.lang.Double r0 = (java.lang.Double) r0     // Catch: java.lang.Throwable -> L86
            double r4 = r0.doubleValue()     // Catch: java.lang.Throwable -> L86
            java.util.Random r0 = new java.util.Random     // Catch: java.lang.Throwable -> L86
            r0.<init>()     // Catch: java.lang.Throwable -> L86
            float r0 = r0.nextFloat()     // Catch: java.lang.Throwable -> L86
            double r6 = (double) r0     // Catch: java.lang.Throwable -> L86
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L82
            java.lang.Object r0 = r1.b     // Catch: java.lang.Throwable -> L86
            r4 = r0
            java.util.concurrent.atomic.AtomicLong r4 = (java.util.concurrent.atomic.AtomicLong) r4     // Catch: java.lang.Throwable -> L86
            long r4 = r4.get()     // Catch: java.lang.Throwable -> L86
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L41
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0     // Catch: java.lang.Throwable -> L86
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L86
            long r4 = r2 - r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.Throwable -> L86
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L82
        L41:
            java.lang.Object r0 = r1.a     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r0.io()     // Catch: java.lang.Throwable -> L86
            krw r0 = (defpackage.krw) r0     // Catch: java.lang.Throwable -> L86
            krv r4 = new krv     // Catch: java.lang.Throwable -> L86
            r5 = 1
            krj[] r6 = new defpackage.krj[r5]     // Catch: java.lang.Throwable -> L86
            krj r7 = new krj     // Catch: java.lang.Throwable -> L86
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L86
            long r8 = r8 - r26
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L86
            r10 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r9 = r21
            r11 = r22
            r13 = r24
            r18 = r8
            r8 = r20
            r7.<init>(r8, r9, r10, r11, r13, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L86
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> L86
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch: java.lang.Throwable -> L86
            r4.<init>(r8, r6)     // Catch: java.lang.Throwable -> L86
            lpa r0 = r0.a(r4)     // Catch: java.lang.Throwable -> L86
            kfe r4 = new kfe     // Catch: java.lang.Throwable -> L86
            r4.<init>(r1, r2, r5)     // Catch: java.lang.Throwable -> L86
            r0.p(r4)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r19)
            goto L83
        L82:
            monitor-exit(r19)
        L83:
            return
        L84:
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L86
            throw r0
        L86:
            r0 = move-exception
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jij.f(int, int, long, long, long):void");
    }

    public final agke g() {
        apji apjiVar = apji.a;
        aihh aihhVar = (aihh) apjiVar.createBuilder();
        aihl aihlVar = ajnp.a;
        ajnf ajnfVar = ajnf.a;
        aihh aihhVar2 = (aihh) ajnfVar.createBuilder();
        alja aljaVar = alja.a;
        aihh aihhVar3 = (aihh) aljaVar.createBuilder();
        aliz alizVar = aliz.WATCH_HISTORY;
        aihhVar3.copyOnWrite();
        alja aljaVar2 = (alja) aihhVar3.instance;
        aljaVar2.c = alizVar.yN;
        aljaVar2.b |= 1;
        aihhVar2.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar2.instance;
        alja aljaVar3 = (alja) aihhVar3.build();
        aljaVar3.getClass();
        ajnfVar2.f = aljaVar3;
        ajnfVar2.e = 8;
        aiqe aiqeVar = aiqe.a;
        aihf aihfVarCreateBuilder = aiqeVar.createBuilder();
        aiqd aiqdVar = aiqd.a;
        aihf aihfVarCreateBuilder2 = aiqdVar.createBuilder();
        Context context = (Context) this.c;
        String string = context.getString(R.string.title_history_new);
        aihfVarCreateBuilder2.copyOnWrite();
        aiqd aiqdVar2 = (aiqd) aihfVarCreateBuilder2.instance;
        string.getClass();
        aiqdVar2.b |= 2;
        aiqdVar2.c = string;
        aihfVarCreateBuilder.copyOnWrite();
        aiqe aiqeVar2 = (aiqe) aihfVarCreateBuilder.instance;
        aiqd aiqdVar3 = (aiqd) aihfVarCreateBuilder2.build();
        aiqdVar3.getClass();
        aiqeVar2.c = aiqdVar3;
        aiqeVar2.b |= 1;
        aihhVar2.copyOnWrite();
        ajnf ajnfVar3 = (ajnf) aihhVar2.instance;
        aiqe aiqeVar3 = (aiqe) aihfVarCreateBuilder.build();
        aiqeVar3.getClass();
        ajnfVar3.v = aiqeVar3;
        ajnfVar3.b |= 262144;
        aihh aihhVar4 = (aihh) kro.ai("FEmusic_history").toBuilder();
        aihl aihlVar2 = aoaq.b;
        aihf aihfVarCreateBuilder3 = aoar.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        aoar aoarVar = (aoar) aihfVarCreateBuilder3.instance;
        aoarVar.b |= 2;
        aoarVar.d = 167774;
        aihhVar4.e(aihlVar2, (aoar) aihfVarCreateBuilder3.build());
        aihhVar2.copyOnWrite();
        ajnf ajnfVar4 = (ajnf) aihhVar2.instance;
        ajwo ajwoVar = (ajwo) aihhVar4.build();
        ajwoVar.getClass();
        ajnfVar4.r = ajwoVar;
        ajnfVar4.b |= SemanticState.Obscured;
        aihhVar.e(aihlVar, (ajnf) aihhVar2.build());
        apji apjiVar2 = (apji) aihhVar.build();
        aihh aihhVar5 = (aihh) apjiVar.createBuilder();
        aihl aihlVar3 = ajnp.a;
        aihh aihhVar6 = (aihh) ajnfVar.createBuilder();
        aihh aihhVar7 = (aihh) aljaVar.createBuilder();
        aliz alizVar2 = aliz.SETTINGS;
        aihhVar7.copyOnWrite();
        alja aljaVar4 = (alja) aihhVar7.instance;
        aljaVar4.c = alizVar2.yN;
        aljaVar4.b |= 1;
        aihhVar6.copyOnWrite();
        ajnf ajnfVar5 = (ajnf) aihhVar6.instance;
        alja aljaVar5 = (alja) aihhVar7.build();
        aljaVar5.getClass();
        ajnfVar5.f = aljaVar5;
        ajnfVar5.e = 8;
        aihf aihfVarCreateBuilder4 = aiqeVar.createBuilder();
        aihf aihfVarCreateBuilder5 = aiqdVar.createBuilder();
        String string2 = context.getString(R.string.offline_mixtape_storage_settings);
        aihfVarCreateBuilder5.copyOnWrite();
        aiqd aiqdVar4 = (aiqd) aihfVarCreateBuilder5.instance;
        string2.getClass();
        aiqdVar4.b |= 2;
        aiqdVar4.c = string2;
        aihfVarCreateBuilder4.copyOnWrite();
        aiqe aiqeVar4 = (aiqe) aihfVarCreateBuilder4.instance;
        aiqd aiqdVar5 = (aiqd) aihfVarCreateBuilder5.build();
        aiqdVar5.getClass();
        aiqeVar4.c = aiqdVar5;
        aiqeVar4.b |= 1;
        aihhVar6.copyOnWrite();
        ajnf ajnfVar6 = (ajnf) aihhVar6.instance;
        aiqe aiqeVar5 = (aiqe) aihfVarCreateBuilder4.build();
        aiqeVar5.getClass();
        ajnfVar6.v = aiqeVar5;
        ajnfVar6.b |= 262144;
        ajwo ajwoVarA = ixt.A();
        aihhVar6.copyOnWrite();
        ajnf ajnfVar7 = (ajnf) aihhVar6.instance;
        ajwoVarA.getClass();
        ajnfVar7.r = ajwoVarA;
        ajnfVar7.b |= SemanticState.Obscured;
        aihhVar5.e(aihlVar3, (ajnf) aihhVar6.build());
        apji apjiVar3 = (apji) aihhVar5.build();
        aihh aihhVar8 = (aihh) apjiVar.createBuilder();
        aihl aihlVar4 = ajnp.a;
        aihh aihhVar9 = (aihh) ajnfVar.createBuilder();
        aihh aihhVar10 = (aihh) aljaVar.createBuilder();
        aliz alizVar3 = aliz.SEARCH;
        aihhVar10.copyOnWrite();
        alja aljaVar6 = (alja) aihhVar10.instance;
        aljaVar6.c = alizVar3.yN;
        aljaVar6.b |= 1;
        aihhVar9.copyOnWrite();
        ajnf ajnfVar8 = (ajnf) aihhVar9.instance;
        alja aljaVar7 = (alja) aihhVar10.build();
        aljaVar7.getClass();
        ajnfVar8.f = aljaVar7;
        ajnfVar8.e = 8;
        aihf aihfVarCreateBuilder6 = aiqeVar.createBuilder();
        aihf aihfVarCreateBuilder7 = aiqdVar.createBuilder();
        String string3 = context.getString(R.string.search);
        aihfVarCreateBuilder7.copyOnWrite();
        aiqd aiqdVar6 = (aiqd) aihfVarCreateBuilder7.instance;
        string3.getClass();
        aiqdVar6.b |= 2;
        aiqdVar6.c = string3;
        aihfVarCreateBuilder6.copyOnWrite();
        aiqe aiqeVar6 = (aiqe) aihfVarCreateBuilder6.instance;
        aiqd aiqdVar7 = (aiqd) aihfVarCreateBuilder7.build();
        aiqdVar7.getClass();
        aiqeVar6.c = aiqdVar7;
        aiqeVar6.b |= 1;
        aihhVar9.copyOnWrite();
        ajnf ajnfVar9 = (ajnf) aihhVar9.instance;
        aiqe aiqeVar7 = (aiqe) aihfVarCreateBuilder6.build();
        aiqeVar7.getClass();
        ajnfVar9.v = aiqeVar7;
        ajnfVar9.b |= 262144;
        aihh aihhVar11 = (aihh) ajwo.a.createBuilder();
        aihl aihlVar5 = apni.a;
        aihh aihhVar12 = (aihh) apng.a.createBuilder();
        aihhVar12.copyOnWrite();
        apng apngVar = (apng) aihhVar12.instance;
        apngVar.b |= SemanticState.Hidden;
        apngVar.g = true;
        alxq alxqVar = alxq.MUSIC_SEARCH_REQUEST_TYPE_LIBRARY;
        aihhVar12.copyOnWrite();
        apng apngVar2 = (apng) aihhVar12.instance;
        apngVar2.i = alxqVar.h;
        apngVar2.b |= 16777216;
        aihhVar11.e(aihlVar5, (apng) aihhVar12.build());
        aihhVar9.copyOnWrite();
        ajnf ajnfVar10 = (ajnf) aihhVar9.instance;
        ajwo ajwoVar2 = (ajwo) aihhVar11.build();
        ajwoVar2.getClass();
        ajnfVar10.r = ajwoVar2;
        ajnfVar10.b |= SemanticState.Obscured;
        aihhVar8.e(aihlVar4, (ajnf) aihhVar9.build());
        return agke.s(apjiVar2, apjiVar3, (apji) aihhVar8.build());
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v23, types: [aunn, java.lang.Object] */
    @tcc
    public final void handleAddToToastEvent(vvr vvrVar) {
        jij jijVar;
        alay alayVar;
        jir jirVarA;
        alay alayVar2;
        alay alayVar3;
        vvrVar.getClass();
        aocd aocdVar = (aocd) vvrVar.b.f();
        if (aocdVar != null) {
            Object objF = ((agev) vvrVar.e).f();
            jio jioVarE = jin.e();
            if ((aocdVar.b & 1) != 0) {
                alayVar2 = aocdVar.c;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            jik jikVar = (jik) jioVarE;
            jikVar.k(ackj.k(null, alayVar2, null, false));
            ajng ajngVar = aocdVar.d;
            if (ajngVar == null) {
                ajngVar = ajng.a;
            }
            if ((ajngVar.b & 1) != 0) {
                ajng ajngVar2 = aocdVar.d;
                if (ajngVar2 == null) {
                    ajngVar2 = ajng.a;
                }
                ajnf ajnfVar = ajngVar2.c;
                if (ajnfVar == null) {
                    ajnfVar = ajnf.a;
                }
                ajnf ajnfVar2 = ajnfVar;
                ajnfVar2.getClass();
                if ((ajnfVar2.b & 64) != 0) {
                    alayVar3 = ajnfVar2.m;
                    if (alayVar3 == null) {
                        alayVar3 = alay.a;
                    }
                } else {
                    alayVar3 = null;
                }
                Spanned spannedK = ackj.k(null, alayVar3, null, false);
                ivx ivxVar = new ivx(objF, (Object) ajnfVar2, (Object) this, 4, (char[]) null);
                jijVar = this;
                jioVarE.l(spannedK, ivxVar);
            } else {
                jijVar = this;
            }
            if ((aocdVar.b & SemanticState.Focused) != 0) {
                int iAV = a.aV(aocdVar.f);
                jikVar.c = iAV != 0 ? iAV : 1;
            }
            jirVarA = jioVarE.b();
        } else {
            jijVar = this;
            aoda aodaVar = (aoda) vvrVar.a.f();
            if (aodaVar == null) {
                return;
            }
            Object objF2 = ((agev) vvrVar.e).f();
            jio jioVarE2 = jin.e();
            if ((aodaVar.b & 1) != 0) {
                alayVar = aodaVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            jik jikVar2 = (jik) jioVarE2;
            jikVar2.k(ackj.k(null, alayVar, null, false));
            int i = aodaVar.b;
            if ((i & 2) != 0 && (i & 4) != 0) {
                alay alayVar4 = aodaVar.d;
                if (alayVar4 == null) {
                    alayVar4 = alay.a;
                }
                jioVarE2.l(ackj.k(null, alayVar4, null, false), new ivx(objF2, (Object) jijVar, (Object) aodaVar, 5, (short[]) null));
            }
            if ((aodaVar.b & 64) != 0) {
                int iAV2 = a.aV(aodaVar.f);
                jikVar2.c = iAV2 != 0 ? iAV2 : 1;
            }
            jirVarA = jioVarE2.b();
        }
        ((jin) jijVar.a.io()).d(jirVarA);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [iup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [iup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [iup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v11, types: [iup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v7, types: [iup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [iup, java.lang.Object] */
    public final ListenableFuture i(apzf apzfVar) {
        if (apzfVar.e.isEmpty()) {
            return ahno.ar(this.a.q(), new idw(this, apzfVar, 3), this.c);
        }
        Uri uri = Uri.parse(apzfVar.e);
        byte[] bArr = null;
        switch (ish.q.match(uri)) {
            case 1:
                return ahno.ar(this.a.q(), new idw(this, uri, 4, bArr), this.c);
            case 2:
                return this.a.l(uri);
            case 3:
            case 6:
                return this.a.w(uri);
            case 4:
                return this.a.r(uri);
            case 5:
                String queryParameter = uri.getQueryParameter("list");
                if (queryParameter != null && queryParameter.equals("PLSL")) {
                    return ahno.ar(this.a.q(), new idw(this, uri, 5, bArr), this.c);
                }
                break;
        }
        return ahng.m(new IOException("No matching tracks."));
    }

    public final Optional j() {
        Optional optional = (Optional) ((awku) this.a).aD();
        return optional == null ? Optional.empty() : optional;
    }

    public final void k(wgi wgiVar) {
        if (wgiVar.f().isPresent()) {
            ((awku) this.a).kk(wgiVar.f());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aunn, java.lang.Object] */
    public final void l() {
        int i = 12;
        ((abvn) this.c.io()).P().x(new hgu(i)).y(new hbz(15)).x(new hgu(13)).L((avmb) this.b).al(new hxi(this.a, 18), new hyx(i));
    }

    public final void m(alvy alvyVar) {
        if ((alvyVar.b & 131072) != 0) {
            ((awku) this.a).kk(Optional.of(alvyVar.n));
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture n() {
        return ahcs.e(((qrx) this.b).c(), afwl.a(new iat(this, 8)), this.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture o() {
        return ahcs.e(((qrx) this.b).c(), afwl.a(new iat(this, 9)), this.a);
    }

    public final ListenableFuture p(final float f) {
        return T(new Function() { // from class: ibp
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo840andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aihf aihfVar = (aihf) obj;
                aihfVar.copyOnWrite();
                ailz ailzVar = (ailz) aihfVar.instance;
                ailz ailzVar2 = ailz.a;
                ailzVar.b |= 1;
                ailzVar.c = f;
                return aihfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final ListenableFuture q(boolean z) {
        return T(new ypy(z, 1));
    }

    public final void r() {
        fhd fhdVar = ((fkt) this.a).b;
        try {
            ((fgy) this.b).I(fhdVar);
        } catch (Exception e) {
            gzj.bv(fhdVar, e);
        }
    }

    public final void s() {
        fhd fhdVar = ((fkt) this.a).b;
        try {
            ((fgy) this.b).K(fhdVar);
        } catch (Exception e) {
            gzj.bv(fhdVar, e);
        }
    }

    public final boolean t(Class cls, Class cls2) {
        return ((Class) this.a).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #1 {all -> 0x005d, blocks: (B:6:0x0023, B:8:0x002b, B:10:0x0033, B:11:0x003b, B:12:0x0044, B:14:0x004a), top: B:29:0x0023 }] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void u(String str, int i) {
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.a;
        reentrantReadWriteLock.readLock().lock();
        try {
            ?? r1 = this.c;
            ahud ahudVar = (ahud) r1.get(str);
            if (ahudVar != null) {
                if (!ahudVar.n(i)) {
                    ((AtomicInteger) this.b).incrementAndGet();
                }
                ((ReentrantReadWriteLock) this.a).readLock().unlock();
                return;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                ahud ahudVar2 = (ahud) r1.get(str);
                if (ahudVar2 != null) {
                    if (!ahudVar2.n(i)) {
                        ((AtomicInteger) this.b).incrementAndGet();
                    }
                } else if (r1.size() >= 256) {
                    ((AtomicInteger) this.b).incrementAndGet();
                } else {
                    ahudVar2 = new ahud((byte[]) null);
                    r1.put(str, ahudVar2);
                    if (!ahudVar2.n(i)) {
                        ((AtomicInteger) this.b).incrementAndGet();
                    }
                }
            } finally {
                ((ReentrantReadWriteLock) this.a).writeLock().unlock();
            }
        } catch (Throwable th) {
            ((ReentrantReadWriteLock) this.a).readLock().unlock();
            throw th;
        }
    }

    public final void w(String str, String str2, String str3, String str4) throws IOException {
        if (str2 == null || str3 == null) {
            throw new IOException("FIS auth token or FIS ID is empty");
        }
        ahnr ahnrVar = (ahnr) this.c;
        String str5 = ahnrVar.e().d;
        String str6 = ahnrVar.e().a;
        if (str5 == null) {
            throw new IOException("Project ID or API Key is missing");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fcmregistrations.googleapis.com/v1/projects/" + str5 + "/registrations/" + str3 + "/topicSubscriptions/" + str + ':' + str4).openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("x-goog-api-key", str6);
        httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
        httpURLConnection.setDoOutput(false);
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                U(httpURLConnection);
                httpURLConnection.disconnect();
                if (responseCode < 200 || responseCode >= 300) {
                    if (responseCode == 404 || responseCode == 403) {
                        throw new IOException(a.ca(responseMessage, str4, "Topic ", " failed: "));
                    }
                    if (responseCode < 500) {
                        throw new IOException(a.cg(responseCode, str4, "Topic ", " failed with status: "));
                    }
                    throw new IOException("INTERNAL_SERVER_ERROR");
                }
            } catch (IOException e) {
                throw new IOException("SERVICE_NOT_AVAILABLE", e);
            }
        } catch (Throwable th) {
            U(httpURLConnection);
            httpURLConnection.disconnect();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized ahrq x(String str, String str2, String str3) {
        ahrq ahrqVar;
        try {
            ?? r0 = this.b;
            String strV = V(str, str2, str3);
            ahrqVar = null;
            String string = r0.getString(strV, null);
            long j = ahrq.a;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        ahrqVar = new ahrq(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                    } catch (JSONException e) {
                        Log.w("FirebaseInstanceId", "Failed to parse token: ".concat(e.toString()));
                    }
                } else {
                    ahrqVar = new ahrq(string, null, 0L);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return ahrqVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void y() {
        this.a.clear();
        this.b.edit().clear().commit();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void z(String str, String str2, String str3) {
        ?? r0 = this.b;
        String strV = V(str, str2, str3);
        SharedPreferences.Editor editorEdit = r0.edit();
        editorEdit.remove(strV);
        editorEdit.commit();
    }

    public jij(ahnr ahnrVar, FirebaseMessaging firebaseMessaging, ahrw ahrwVar) {
        this.b = ahrwVar;
        this.c = ahnrVar;
        this.a = firebaseMessaging;
    }

    public jij(ahpu ahpuVar, awmd awmdVar, awmd awmdVar2) {
        this.c = ahpuVar;
        this.a = awmdVar;
        this.b = awmdVar2;
    }

    public jij(Context context, Object obj, Object obj2) {
        this.b = context;
        this.a = obj;
        this.c = obj2;
    }

    public jij(Context context, jij jijVar, vxz vxzVar) {
        this.c = context;
        this.a = jijVar;
        this.b = vxzVar;
    }

    public jij(hed hedVar, hed hedVar2, vxz vxzVar) {
        this.a = hedVar;
        this.b = hedVar2;
        this.c = vxzVar;
    }

    public jij(Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public jij(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public jij(Object obj, Object obj2, Object obj3, char[] cArr) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public jij(long j, String str, jij jijVar) {
        this.c = Long.valueOf(j);
        this.a = str;
        this.b = jijVar;
    }

    public jij(abxv abxvVar, kro kroVar) {
        this.a = abxvVar;
        this.c = kroVar;
        this.b = new HashSet();
    }

    public jij(ahok ahokVar) {
        this.c = new HashSet();
        this.a = new HashSet();
        this.b = ahokVar;
    }

    public jij(aunn aunnVar, avmb avmbVar) {
        this.a = new awku(Optional.empty());
        this.c = aunnVar;
        this.b = avmbVar;
    }

    public jij(awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this.b = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        this.a = awmdVar3;
    }

    public jij(byte[] bArr) {
        this.a = new ReentrantReadWriteLock(false);
        this.c = new HashMap();
        this.b = new AtomicInteger();
        new ArrayList();
    }

    public jij() {
        this.a = new ArrayList();
        this.c = new ArrayList();
        this.b = new ArrayList();
    }

    public jij(aunn aunnVar, aunn aunnVar2, xgm xgmVar) {
        aunnVar.getClass();
        aunnVar2.getClass();
        xgmVar.getClass();
        this.a = aunnVar;
        this.b = aunnVar2;
        this.c = xgmVar;
    }

    public jij(afvl afvlVar, aftj aftjVar, afvl afvlVar2) {
        this.a = afvlVar;
        this.b = aftjVar;
        this.c = afvlVar2;
    }

    public jij(Context context) {
        int i = 0;
        this.c = aguu.al(new jxp(i));
        this.b = new AtomicLong(-1L);
        this.a = aguu.al(new jxq(context, new krx("auth:gau"), i));
    }

    public jij(vxu vxuVar, hhb hhbVar) {
        this.c = new afv();
        ajvu ajvuVarC = vxuVar.c();
        aqil aqilVar = (ajvuVarC == null ? ajvu.a : ajvuVarC).q;
        akml akmlVar = (aqilVar == null ? aqil.a : aqilVar).s;
        this.a = akmlVar == null ? akml.a : akmlVar;
        this.b = hhbVar;
    }

    public jij(Set set) {
        this.a = new Random();
        this.c = set;
        this.b = new ArrayList(2);
    }

    public jij(hhb hhbVar) {
        hhbVar.getClass();
        this.c = hhbVar;
        this.b = new Object();
        this.a = new LinkedHashMap();
    }
}
