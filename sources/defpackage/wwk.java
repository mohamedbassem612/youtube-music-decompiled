package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wwk {
    public long c;
    public CountDownTimer d;
    public final vxz e;
    private final Executor f;
    private final avmb g;
    private amno i;
    private boolean j;
    private final wbz k;
    private final Context l;
    private final vxz n;
    private final aaok o;
    private final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    final ConcurrentLinkedDeque a = new ConcurrentLinkedDeque();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final avmm m = new avmm();

    public wwk(Context context, Executor executor, avmb avmbVar, wbz wbzVar, aaok aaokVar, vxz vxzVar, vxz vxzVar2) {
        this.l = context;
        this.f = executor;
        this.g = avmbVar;
        this.k = wbzVar;
        this.o = aaokVar;
        this.n = vxzVar;
        this.e = vxzVar2;
    }

    private final ampd h() {
        amno amnoVar = this.i;
        if (amnoVar != null && (amnoVar.b & 8) != 0) {
            apji apjiVar = amnoVar.f;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ampf.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = this.i.f;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ampf.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (ampd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    private final void i(String str, String str2, String str3, String str4) {
        wer werVarE = this.k.c().e();
        aqzn aqznVarE = aqzp.e(wfs.g(176, str));
        aqznVarE.am(str2);
        aqznVarE.an(Integer.valueOf(str2.length()));
        aqznVarE.aq(Boolean.FALSE);
        if (!str3.isEmpty()) {
            aqznVarE.ar(str3);
            aqznVarE.as(Integer.valueOf(str3.length()));
        }
        if (!str4.isEmpty()) {
            aqznVarE.ao(str4);
            aqznVarE.ap(Integer.valueOf(str4.length()));
        }
        werVarE.m(aqznVarE);
        werVarE.b().G();
    }

    private final void j(amno amnoVar) {
        for (wxk wxkVar : this.h) {
            this.f.execute(afwl.i(new wtg(wxkVar, amnoVar, 5)));
            if ((wxkVar instanceof wvx) && l(amnoVar) && l(amnoVar)) {
                amnn amnnVar = amnoVar.k;
                if (amnnVar == null) {
                    amnnVar = amnn.a;
                }
                wbz wbzVar = this.k;
                String str = amnnVar.f;
                wby wbyVarC = wbzVar.c();
                mnt mntVar = new mnt(this, amnoVar, 13);
                this.m.c(wbyVarC.j(str, false).O(this.g).ag(mntVar, new vqe(11)));
            }
        }
        this.i = amnoVar;
        this.j = false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0112  */
    private final boolean k(ajwo ajwoVar) {
        akrn akrnVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ammr.b);
        ajwoVar.c(aihlVarCheckIsLite);
        String str = null;
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ammr.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            ammr ammrVar = (ammr) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            ampd ampdVarH = h();
            if (ampdVarH != null) {
                return TextUtils.equals((ammrVar.c & 8) != 0 ? ammrVar.g : null, (ampdVarH.b & 1) != 0 ? ampdVarH.c : null);
            }
        } else {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(amms.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(amms.b);
                ajwoVar.c(aihlVarCheckIsLite4);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                amms ammsVar = (amms) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                ampd ampdVarH2 = h();
                if (ampdVarH2 != null) {
                    return TextUtils.equals((ammsVar.c & 8) != 0 ? ammsVar.g : null, (ampdVarH2.b & 8) != 0 ? ampdVarH2.f : null);
                }
            } else {
                aihl aihlVar = amqi.b;
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite5);
                if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar);
                    ajwoVar.c(aihlVarCheckIsLite6);
                    Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
                    amqi amqiVar = (amqi) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
                    ampd ampdVarH3 = h();
                    amno amnoVar = this.i;
                    if (amnoVar == null || (amnoVar.b & 8) == 0) {
                        akrnVar = null;
                    } else {
                        apji apjiVar = amnoVar.f;
                        if (apjiVar == null) {
                            apjiVar = apji.a;
                        }
                        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(akrs.a);
                        apjiVar.c(aihlVarCheckIsLite7);
                        if (apjiVar.j.n(aihlVarCheckIsLite7.d)) {
                            apji apjiVar2 = this.i.f;
                            if (apjiVar2 == null) {
                                apjiVar2 = apji.a;
                            }
                            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(akrs.a);
                            apjiVar2.c(aihlVarCheckIsLite8);
                            Object objK4 = apjiVar2.j.k(aihlVarCheckIsLite8.d);
                            akrnVar = (akrn) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4));
                        } else {
                            akrnVar = null;
                        }
                    }
                    String str2 = (amqiVar.c & 1) != 0 ? amqiVar.d : null;
                    if (ampdVarH3 != null) {
                        return TextUtils.equals(str2, (ampdVarH3.b & 8) != 0 ? ampdVarH3.f : null);
                    }
                    if (akrnVar != null) {
                        if ((akrnVar.b & 2) != 0) {
                            akro akroVar = akrnVar.c;
                            if (akroVar == null) {
                                akroVar = akro.a;
                            }
                            str = akroVar.e;
                        }
                        return TextUtils.equals(str2, str);
                    }
                }
            }
        }
        return false;
    }

    private final boolean l(amno amnoVar) {
        if ((amnoVar.b & SemanticState.ReadOnly) != 0) {
            amnn amnnVar = amnoVar.k;
            if (amnnVar == null) {
                amnnVar = amnn.a;
            }
            if (amnnVar.c) {
                amnn amnnVar2 = amnoVar.k;
                if (amnnVar2 == null) {
                    amnnVar2 = amnn.a;
                }
                if ((amnnVar2.b & 16) != 0) {
                    return this.n.m(52, 45694220L);
                }
            }
        }
        return false;
    }

    public final void a(wxk wxkVar) {
        wxkVar.j(this);
        this.h.add(wxkVar);
        wxkVar.k();
        amno amnoVar = this.i;
        if (amnoVar == null || this.j) {
            return;
        }
        wxkVar.d(amnoVar);
    }

    public final void b() {
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void c(String str) {
        if (this.i != null) {
            ArrayList arrayList = new ArrayList();
            ConcurrentLinkedDeque<amno> concurrentLinkedDeque = this.a;
            for (amno amnoVar : concurrentLinkedDeque) {
                if (TextUtils.equals(amnoVar.d, str)) {
                    arrayList.add(amnoVar);
                }
            }
            concurrentLinkedDeque.removeAll(arrayList);
            if (!concurrentLinkedDeque.isEmpty()) {
                if (this.i.equals(concurrentLinkedDeque.peekFirst())) {
                    return;
                }
                j((amno) concurrentLinkedDeque.peekFirst());
                return;
            }
            for (wxk wxkVar : this.h) {
                Executor executor = this.f;
                wxkVar.getClass();
                executor.execute(afwl.i(new wvr(wxkVar, 7)));
            }
            this.i = null;
        }
    }

    public final void d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((wxj) it.next()).Y();
        }
    }

    public final void e() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((wxj) it.next()).Z();
        }
    }

    public final void f(ajwo ajwoVar) {
        String str;
        String str2;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aiwo.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aiwo.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            aiwn aiwnVar = (aiwn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            apji apjiVar = aiwnVar.b;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(amnp.a);
            apjiVar.c(aihlVarCheckIsLite3);
            if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(amnp.a);
                apjiVar.c(aihlVarCheckIsLite4);
                Object objK2 = apjiVar.j.k(aihlVarCheckIsLite4.d);
                amno amnoVar = (amno) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                int iBe = a.be(amnoVar.c);
                if (iBe != 0 && iBe == 3) {
                    Object obj = this.o.b;
                    Activity activity = (Activity) obj;
                    if (!activity.isFinishing() && !activity.isDestroyed() && (obj instanceof cf)) {
                        dd supportFragmentManager = ((cf) obj).getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        cc ccVarG = supportFragmentManager.g("live_chat_poll_creation_fragment");
                        if (ccVarG instanceof wzl) {
                            ((wzl) ccVarG).z();
                            Context context = this.l;
                            tuk.o(context, context.getString(R.string.live_chat_ongoing_poll_error), 0);
                        }
                    }
                }
                aiwm aiwmVar = aiwnVar.c;
                if (aiwmVar == null) {
                    aiwmVar = aiwm.a;
                }
                if (aiwmVar.b) {
                    aiwm aiwmVar2 = aiwnVar.c;
                    if (aiwmVar2 == null) {
                        aiwmVar2 = aiwm.a;
                    }
                    this.d = new wwj(this, aiwmVar2.c, new wtg(this, amnoVar, 7)).start();
                }
                amno amnoVar2 = this.i;
                if (amnoVar2 == null || !amnoVar.d.equals(amnoVar2.d)) {
                    boolean z = amnoVar.g;
                    if (!amnoVar.j) {
                        ArrayList arrayList = new ArrayList();
                        ConcurrentLinkedDeque<amno> concurrentLinkedDeque = this.a;
                        for (amno amnoVar3 : concurrentLinkedDeque) {
                            if (!amnoVar3.j) {
                                arrayList.add(amnoVar3);
                            }
                        }
                        concurrentLinkedDeque.removeAll(arrayList);
                    }
                    this.a.addFirst(amnoVar);
                    j(amnoVar);
                    return;
                }
                return;
            }
            return;
        }
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apiy.a);
        ajwoVar.c(aihlVarCheckIsLite5);
        if (ajwoVar.j.n(aihlVarCheckIsLite5.d) && this.i != null) {
            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(apiy.a);
            ajwoVar.c(aihlVarCheckIsLite6);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
            c(((apix) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))).b);
            return;
        }
        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(ammr.b);
        ajwoVar.c(aihlVarCheckIsLite7);
        int i = 6;
        if (!ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(amms.b);
            ajwoVar.c(aihlVarCheckIsLite8);
            if (!ajwoVar.j.n(aihlVarCheckIsLite8.d)) {
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(amqi.b);
                ajwoVar.c(aihlVarCheckIsLite9);
                if (ajwoVar.j.n(aihlVarCheckIsLite9.d) && k(ajwoVar)) {
                    this.j = false;
                    for (wxk wxkVar : this.h) {
                        Executor executor = this.f;
                        wxkVar.getClass();
                        executor.execute(afwl.i(new wvr(wxkVar, i)));
                    }
                    return;
                }
                return;
            }
        }
        if (k(ajwoVar)) {
            this.j = true;
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                this.f.execute(afwl.i(new wtg((wxk) it.next(), ajwoVar, i)));
            }
        }
        aihl aihlVarCheckIsLite10 = aihn.checkIsLite(ammr.b);
        ajwoVar.c(aihlVarCheckIsLite10);
        if (ajwoVar.j.n(aihlVarCheckIsLite10.d)) {
            aihl aihlVarCheckIsLite11 = aihn.checkIsLite(ammr.b);
            ajwoVar.c(aihlVarCheckIsLite11);
            Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite11.d);
            ammr ammrVar = (ammr) (objK4 == null ? aihlVarCheckIsLite11.b : aihlVarCheckIsLite11.c(objK4));
            String str3 = (ammrVar.c & 8) != 0 ? ammrVar.g : null;
            alay alayVar = ammrVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            alay alayVar2 = ammrVar.e;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            alay alayVar3 = ammrVar.f;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
            if (str3 != null) {
                i(str3, ackj.k(null, alayVar, null, false).toString(), ackj.k(null, alayVar2, null, false).toString(), ackj.k(null, alayVar3, null, false).toString());
                return;
            }
            return;
        }
        aihl aihlVarCheckIsLite12 = aihn.checkIsLite(amms.b);
        ajwoVar.c(aihlVarCheckIsLite12);
        if (ajwoVar.j.n(aihlVarCheckIsLite12.d)) {
            aihl aihlVarCheckIsLite13 = aihn.checkIsLite(amms.b);
            ajwoVar.c(aihlVarCheckIsLite13);
            Object objK5 = ajwoVar.j.k(aihlVarCheckIsLite13.d);
            amms ammsVar = (amms) (objK5 == null ? aihlVarCheckIsLite13.b : aihlVarCheckIsLite13.c(objK5));
            String str4 = (ammsVar.c & 8) != 0 ? ammsVar.g : null;
            alay alayVar4 = ammsVar.d;
            if (alayVar4 == null) {
                alayVar4 = alay.a;
            }
            alay alayVar5 = ammsVar.e;
            if (alayVar5 == null) {
                alayVar5 = alay.a;
            }
            alay alayVar6 = ammsVar.f;
            if (alayVar6 == null) {
                alayVar6 = alay.a;
            }
            for (amno amnoVar4 : this.a) {
                if (amnoVar4 != null && (amnoVar4.b & 8) != 0) {
                    apji apjiVar2 = amnoVar4.f;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite14 = aihn.checkIsLite(akrs.a);
                    apjiVar2.c(aihlVarCheckIsLite14);
                    if (apjiVar2.j.n(aihlVarCheckIsLite14.d)) {
                        apji apjiVar3 = amnoVar4.f;
                        if (apjiVar3 == null) {
                            apjiVar3 = apji.a;
                        }
                        aihl aihlVarCheckIsLite15 = aihn.checkIsLite(akrs.a);
                        apjiVar3.c(aihlVarCheckIsLite15);
                        Object objK6 = apjiVar3.j.k(aihlVarCheckIsLite15.d);
                        akrn akrnVar = (akrn) (objK6 == null ? aihlVarCheckIsLite15.b : aihlVarCheckIsLite15.c(objK6));
                        if ((akrnVar.b & 2) != 0) {
                            akro akroVar = akrnVar.c;
                            if (akroVar == null) {
                                akroVar = akro.a;
                            }
                            str = akroVar.e;
                        } else {
                            str = null;
                        }
                        if ((akrnVar.b & 2) != 0) {
                            akro akroVar2 = akrnVar.c;
                            if (akroVar2 == null) {
                                akroVar2 = akro.a;
                            }
                            str2 = akroVar2.d;
                        } else {
                            str2 = null;
                        }
                        if (str4 != null && str != null && TextUtils.equals(str4, str) && str2 != null) {
                            i(str2, ackj.k(null, alayVar4, null, false).toString(), ackj.k(null, alayVar5, null, false).toString(), ackj.k(null, alayVar6, null, false).toString());
                        }
                    }
                }
            }
        }
    }

    public final void g() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.h;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((wxk) it.next()).c();
        }
        b();
        copyOnWriteArrayList.clear();
        this.a.clear();
        this.b.clear();
        this.m.b();
        this.i = null;
        this.j = false;
    }
}
