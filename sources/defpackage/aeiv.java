package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeiv {
    public final Object a;
    public final Object b;
    public Object c;

    public aeiv(uru uruVar) {
        this.c = yno.gy(uruVar.a);
        ArrayDeque arrayDeque = new ArrayDeque();
        List listAo = atqq.ao(uruVar.b, 25);
        ArrayList arrayList = new ArrayList(atqq.N(listAo, 10));
        Iterator it = listAo.iterator();
        while (it.hasNext()) {
            arrayList.add(yno.gy((auew) it.next()));
        }
        arrayDeque.addAll(arrayList);
        this.b = arrayDeque;
        ArrayDeque arrayDeque2 = new ArrayDeque();
        List listAo2 = atqq.ao(uruVar.c, 25);
        ArrayList arrayList2 = new ArrayList(atqq.N(listAo2, 10));
        Iterator it2 = listAo2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(yno.gy((auew) it2.next()));
        }
        arrayDeque2.addAll(arrayList2);
        this.a = arrayDeque2;
    }

    private final synchronized void B(kth kthVar) {
        C();
        this.c = ((kyr) ((ek) this.a).a).b((String) this.b, kthVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ktf] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ktf] */
    private final synchronized void C() {
        ?? r0 = this.c;
        if (r0 != 0 && r0.c()) {
            this.c.close();
            this.c = null;
        }
    }

    private static final void D(List list) {
        Objects.toString(list);
    }

    public final eol A() {
        Object obj = this.b;
        Intent intent = (Intent) obj;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        Object obj2 = ((yt) this.a).a;
        Bundle bundle2 = new Bundle();
        if (obj2 != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", ((Integer) obj2).intValue());
        }
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.c == null) {
                this.c = ActivityOptions.makeBasic();
            }
            ((ActivityOptions) this.c).setShareIdentityEnabled(false);
        }
        if (Build.VERSION.SDK_INT >= 36) {
            if (this.c == null) {
                this.c = ActivityOptions.makeBasic();
            }
            ((ActivityOptions) this.c).setAllowPassThroughOnTouchOutside(!intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        Object obj3 = this.c;
        return new eol(obj, obj3 != null ? ((ActivityOptions) obj3).toBundle() : null, (byte[]) null);
    }

    public final void a() {
        d(25);
        c("ds_cc");
    }

    public final void b() {
        d(29);
        c("ds_delf");
    }

    public final void c(String str) {
        adyu adyuVar = new adyu(str, 5);
        Optional optional = (Optional) this.b;
        if (true == optional.isPresent()) {
            ((xir) optional.get()).n((String) adyuVar.a);
        }
    }

    public final void d(int i) {
        Object obj = this.c;
        if (obj != null) {
            Object obj2 = this.a;
            tvr tvrVar = new tvr(i, (arkf) obj, 2);
            Optional optional = (Optional) obj2;
            optional.isPresent();
            int i2 = tvrVar.a;
            Object obj3 = tvrVar.b;
            Object obj4 = optional.get();
            xfh xfhVar = new xfh(i2 - 1, 32);
            aihf aihfVarCreateBuilder = akzk.a.createBuilder();
            aihf aihfVarCreateBuilder2 = arjy.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            arjy arjyVar = (arjy) aihfVarCreateBuilder2.instance;
            arjyVar.d = ((arkf) obj3).z;
            arjyVar.b |= 2;
            arjy arjyVar2 = (arjy) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            akzk akzkVar = (akzk) aihfVarCreateBuilder.instance;
            arjyVar2.getClass();
            akzkVar.k = arjyVar2;
            akzkVar.b |= 2097152;
            xfhVar.a = (akzk) aihfVarCreateBuilder.build();
            ((abte) obj4).b(xfhVar, alai.FLOW_TYPE_WEB_VIEW);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final aqmh e(String str) {
        ?? r1 = this.a;
        if (!r1.containsKey(str)) {
            return null;
        }
        aqmh aqmhVar = ((aktj) r1.get(str)).f;
        return aqmhVar == null ? aqmh.a : aqmhVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final String f(String str) {
        aktj aktjVar = (aktj) this.a.get(str);
        if (aktjVar != null && (aktjVar.c & 4) != 0) {
            aqmh aqmhVar = aktjVar.f;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            if ((aqmhVar.b & 8) != 0) {
                aqmh aqmhVar2 = aktjVar.f;
                if (aqmhVar2 == null) {
                    aqmhVar2 = aqmh.a;
                }
                aiqe aiqeVar = aqmhVar2.e;
                if (aiqeVar == null) {
                    aiqeVar = aiqe.a;
                }
                if ((aiqeVar.b & 1) != 0) {
                    aqmh aqmhVar3 = aktjVar.f;
                    if (aqmhVar3 == null) {
                        aqmhVar3 = aqmh.a;
                    }
                    aiqe aiqeVar2 = aqmhVar3.e;
                    if (aiqeVar2 == null) {
                        aiqeVar2 = aiqe.a;
                    }
                    aiqd aiqdVar = aiqeVar2.c;
                    if (aiqdVar == null) {
                        aiqdVar = aiqd.a;
                    }
                    return aiqdVar.c;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final String g(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        ?? r1 = this.b;
        if (r1.containsKey(lowerCase)) {
            return (String) r1.get(str.toLowerCase(Locale.ROOT));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final String h(String str) {
        ?? r1 = this.a;
        aktj aktjVar = (aktj) r1.get(str);
        if (aktjVar == null) {
            return "";
        }
        if (!aktjVar.g) {
            return str;
        }
        aktj aktjVar2 = (aktj) r1.get(str);
        return (aktjVar2 == null || aktjVar2.e.size() <= 0 || TextUtils.isEmpty((String) aktjVar2.e.get(0))) ? " " : (String) aktjVar2.e.get(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Pattern i() {
        if (this.b.isEmpty()) {
            return null;
        }
        return (Pattern) this.c;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    public final void j(List list, boolean z) {
        if (z) {
            this.c = null;
            this.a.clear();
            this.b.clear();
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aktj aktjVar = (aktj) it.next();
                this.a.put(aktjVar.d, aktjVar);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (aktj aktjVar2 : this.a.values()) {
            if (!aktjVar2.h) {
                for (String str : aktjVar2.e) {
                    if (aktjVar2.g) {
                        this.b.put(str.toLowerCase(Locale.ROOT), aktjVar2.d);
                        arrayList.add("(" + str.replaceAll("([^a-zA-Z0-9 :_-])", "\\\\$1") + ')');
                    }
                }
            }
        }
        Collections.sort(arrayList);
        if (this.b.isEmpty()) {
            return;
        }
        this.c = Pattern.compile(TextUtils.join("|", arrayList), 10);
    }

    public final boolean k() {
        return this.c != null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.Temporal, java.lang.Object] */
    public final void l(boolean z, boolean z2, int i) {
        ?? r0 = this.c;
        if (r0 != 0) {
            aihf aihfVarCreateBuilder = arjk.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ((arjk) aihfVarCreateBuilder.instance).b = z2;
            aihfVarCreateBuilder.copyOnWrite();
            ((arjk) aihfVarCreateBuilder.instance).c = z;
            int seconds = (int) Duration.between(r0, Instant.now()).toSeconds();
            aihfVarCreateBuilder.copyOnWrite();
            ((arjk) aihfVarCreateBuilder.instance).d = seconds;
            aihfVarCreateBuilder.copyOnWrite();
            ((arjk) aihfVarCreateBuilder.instance).e = acfz.aw(i);
            xeu xeuVar = (xeu) this.a;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.WEB_LINK_TTS_PLAY_END);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                arjk arjkVar = (arjk) aihfVarCreateBuilder.build();
                arjkVar.getClass();
                alouVar.d = arjkVar;
                alouVar.c = 400;
                xeuVar.b((alou) alosVar.build());
            }
            this.c = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xgn] */
    public final void m(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i + (-2) != 95 ? 131462 : 153248;
        ?? r1 = this.b;
        r1.d(new xgj(xhb.b(i2)));
        r1.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(i2)), null);
        this.c = Instant.now();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xgn] */
    public final void n(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i + (-2) != 95 ? 131463 : 153249;
        ?? r2 = this.b;
        r2.d(new xgj(xhb.b(i2)));
        r2.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(i2)), null);
        l(false, false, i);
    }

    public final synchronized String o(Map map, kth kthVar) {
        r(kthVar);
        return p(map);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ktf] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ktf] */
    public final synchronized String p(Map map) {
        ?? r0;
        r0 = this.c;
        return (r0 == 0 || !r0.c()) ? "" : this.c.a(map);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ktf] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ktf] */
    public final synchronized void q(MotionEvent motionEvent) {
        ?? r0 = this.c;
        if (r0 == 0 || !r0.c()) {
            return;
        }
        HashMap map = new HashMap();
        map.put("evt", motionEvent);
        ?? r3 = this.c;
        r3.getClass();
        r3.b(map);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ktf] */
    public final synchronized void r(kth kthVar) {
        ?? r0 = this.c;
        if (r0 == 0 || !r0.c()) {
            B(kthVar);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void s() {
        this.a.execute(new vhm(this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
    public final void t(ugn ugnVar) {
        List listAk;
        ?? r0 = this.a;
        r0.lock();
        try {
            Iterator it = this.c.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (awrc.c(((ugn) it.next()).a, ugnVar.a)) {
                    break;
                } else {
                    i++;
                }
            }
            ?? r1 = this.c;
            if (i == -1) {
                listAk = atqq.ak(r1, ugnVar);
            } else {
                List listAr = atqq.ar(r1);
                listAr.set(i, ugnVar);
                listAk = listAr;
            }
            this.c = listAk;
            D(listAk);
            ((awli) this.b).kk(this.c);
        } finally {
            r0.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    public final void u(String str) {
        ?? r0 = this.a;
        r0.lock();
        try {
            ?? r1 = this.c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : r1) {
                if (!awrc.c(((ugn) obj).a, str)) {
                    arrayList.add(obj);
                }
            }
            this.c = arrayList;
            D(arrayList);
            ((awli) this.b).kk(this.c);
        } finally {
            r0.unlock();
        }
    }

    public final aqi v() {
        Object obj = this.c;
        if (obj != null) {
            return (aqi) obj;
        }
        awrc.b("completer");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final void w(ajza ajzaVar) {
        ajye ajyeVar;
        Object obj = this.b;
        Object obj2 = this.c;
        ?? r0 = ((lqa) obj).a;
        ArrayList arrayList = new ArrayList(tym.V(r0, obj2));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            srk srkVar = (srk) arrayList.get(i);
            tym.W(r0, ajzaVar, srkVar);
            tym.X(r0, obj2, srkVar);
            tym.Y(r0, obj2);
        }
        ajyf ajyfVar = ((ajza) this.c).c;
        if (ajyfVar == null) {
            ajyfVar = ajyf.a;
        }
        if (ajyfVar.b == 62285947) {
            ajyf ajyfVar2 = ((ajza) this.c).c;
            if (ajyfVar2 == null) {
                ajyfVar2 = ajyf.a;
            }
            ajyeVar = ajyfVar2.b == 62285947 ? (ajye) ajyfVar2.c : ajye.a;
        } else {
            ajyeVar = null;
        }
        this.c = ajzaVar;
        ajyf ajyfVar3 = ajzaVar.c;
        if (ajyfVar3 == null) {
            ajyfVar3 = ajyf.a;
        }
        ajye ajyeVar2 = ajyfVar3.b == 62285947 ? (ajye) ajyfVar3.c : ajye.a;
        ArrayList arrayList2 = new ArrayList(tym.V(r0, this.c));
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            srk srkVar2 = (srk) arrayList2.get(i2);
            srkVar2.J(ajyeVar, ajyeVar2);
            srkVar2.e();
        }
    }

    public final void x(dwy dwyVar) {
        this.c = dwyVar;
        new dhr((Object) this, (Object) dwyVar, 4, (byte[]) null).run();
    }

    public final void y(boa boaVar) {
        Object obj = this.c;
        if (obj != null) {
            ((bpg) obj).run();
        }
        bpg bpgVar = new bpg((boh) this.b, boaVar);
        this.c = bpgVar;
        ((Handler) this.a).postAtFrontOfQueue(bpgVar);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kyv] */
    public final synchronized void z(qcb qcbVar) {
        amsq amsqVar = ((vyo) this.b).b().d;
        if (amsqVar == null) {
            amsqVar = amsq.a;
        }
        if (amsqVar.b) {
            Object obj = this.a;
            if (aebx.b((Context) obj)) {
                if (this.c == null) {
                    int i = kyx.a;
                    this.c = new kza((Context) obj);
                }
                lpa lpaVarA = this.c.a();
                int i2 = 8;
                lpaVarA.o(new kbr(qcbVar, i2));
                lpaVarA.p(new kea(qcbVar, i2));
            }
        }
    }

    public aeiv(ek ekVar, String str) {
        this.a = ekVar;
        this.b = str;
        this.c = null;
    }

    public aeiv(xeu xeuVar, xgn xgnVar) {
        this.a = xeuVar;
        this.b = xgnVar;
    }

    public aeiv(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new auzc((byte[]) null, (byte[]) null);
        this.b = new auzc((byte[]) null, (byte[]) null);
        this.c = new aqy[32];
    }

    public aeiv() {
        this.b = new ArrayList();
        this.a = new ArrayList();
    }

    public aeiv(bog bogVar) {
        this.b = new boh(bogVar);
        this.a = new Handler(Looper.getMainLooper());
    }

    public aeiv(jum jumVar, gmj gmjVar) {
        this.b = jumVar;
        this.a = ((clo) gmjVar.f).b;
        this.c = gmjVar;
    }

    public aeiv(byte[] bArr) {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public aeiv(byte[] bArr, byte[] bArr2) {
        this.b = new Intent("android.intent.action.VIEW");
        this.a = new yt();
    }

    public aeiv(lqa lqaVar, ajza ajzaVar, lqa lqaVar2) {
        this.b = lqaVar;
        this.c = ajzaVar;
        this.a = lqaVar2;
        new HashSet();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xit] */
    public aeiv(Optional optional, Optional optional2) {
        this.a = optional;
        optional2.isPresent();
        this.b = Optional.ofNullable(optional2.get().n(184));
    }

    public aeiv(String str) {
        this.b = str;
        this.a = ape.f(new sdf(this, 4));
    }

    public aeiv(char[] cArr) {
        this.a = new ReentrantLock();
        awno awnoVar = awno.a;
        this.c = awnoVar;
        this.b = new awli(awnoVar);
    }

    public aeiv(Context context, Object obj) {
        this.a = context;
        this.b = obj;
    }

    public aeiv(Executor executor, qcb qcbVar) {
        this.a = executor;
        this.b = qcbVar;
        this.c = Optional.empty();
    }
}
