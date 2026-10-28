package defpackage;

import android.graphics.Rect;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hbr implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hbr(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v18, types: [avlw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [avlw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [avlw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        ajwi ajwiVarF;
        switch (this.$cid) {
            case 0:
                wjf wjfVar = ((aayw) obj).c;
                if (wjfVar != null && wjfVar.G() != null) {
                    hbs hbsVar = (hbs) this.a;
                    if (!hbsVar.d.isEmpty()) {
                        if (((String) hbsVar.d.get()).equals(wjfVar.G())) {
                        }
                    }
                    hbsVar.c.kk(wjfVar.G());
                    hbsVar.d = Optional.of(wjfVar.G());
                    break;
                }
                break;
            case 1:
                ((hbs) this.a).g((arge) obj);
                break;
            case 2:
                ((hbs) this.a).h((hww) obj);
                break;
            case 3:
                hbv hbvVar = (hbv) this.a;
                hbvVar.b.kk(hbvVar.d());
                break;
            case 4:
                ((hbv) this.a).d.kk((Rect) obj);
                break;
            case 5:
                ((hbv) this.a).c.kk((Integer) obj);
                break;
            case 6:
                ((awku) this.a).kk((Integer) obj);
                break;
            case 7:
                this.a.kk((weo) obj);
                break;
            case 8:
                this.a.b((Throwable) obj);
                break;
            case 9:
                this.a.d((avmn) obj);
                break;
            case 10:
                this.a.invoke(obj);
                break;
            case 11:
                this.a.invoke(obj);
                break;
            case 12:
                this.a.invoke(obj);
                break;
            case 13:
                this.a.invoke(obj);
                break;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                hdj hdjVar = (hdj) this.a;
                hdjVar.o();
                apji apjiVar = (apji) hdjVar.s.d.get(iIntValue);
                aihl aihlVarCheckIsLite = aihn.checkIsLite(anyj.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anyj.a);
                    apjiVar.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                    anyi anyiVar = (anyi) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    hdjVar.B(anyiVar);
                    hdjVar.C(anyiVar);
                }
                break;
            case 15:
                aldz aldzVar = (aldz) obj;
                hea heaVar = (hea) this.a;
                heaVar.c = null;
                int i = aldzVar.b;
                if (i != 2) {
                    heaVar.b(anvx.MUSIC_RADIO_BUILDER_BUTTON_STATE_SHOWING_INVALID_RADIO_MESSAGE);
                } else if (!(i == 2 ? (aldx) aldzVar.c : aldx.a).d) {
                    if ((aldzVar.b == 2 ? (aldx) aldzVar.c : aldx.a).c) {
                        heaVar.b(anvx.MUSIC_RADIO_BUILDER_BUTTON_STATE_CLICKABLE_EDIT_COMMAND);
                    } else {
                        heaVar.b(anvx.MUSIC_RADIO_BUILDER_BUTTON_STATE_CLICKABLE);
                    }
                    ajwo ajwoVar = (aldzVar.b == 2 ? (aldx) aldzVar.c : aldx.a).b;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    String str = heaVar.e;
                    if (str == null) {
                        ajwiVarF = ajwk.e("");
                    } else {
                        ajwk ajwkVar = (ajwk) heaVar.g.b(str, ajwk.class);
                        ajwiVarF = ajwkVar != null ? ajwkVar.d() : ajwk.e(heaVar.e);
                    }
                    aihf aihfVar = ajwiVarF.a;
                    aihfVar.copyOnWrite();
                    ajwl ajwlVar = (ajwl) aihfVar.instance;
                    ajwl ajwlVar2 = ajwl.a;
                    ajwoVar.getClass();
                    ajwlVar.d = ajwoVar;
                    ajwlVar.b |= 2;
                    hcb hcbVar = heaVar.g;
                    hcbVar.c();
                    hcbVar.e(ajwiVarF.am());
                } else {
                    ajwo ajwoVarA = (aldzVar.b == 2 ? (aldx) aldzVar.c : aldx.a).b;
                    if (ajwoVarA == null) {
                        ajwoVarA = ajwo.a;
                    }
                    if (heaVar.f != null) {
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajwm.b);
                        ajwoVarA.c(aihlVarCheckIsLite3);
                        if (ajwoVarA.j.n(aihlVarCheckIsLite3.d)) {
                            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajwm.b);
                            ajwoVarA.c(aihlVarCheckIsLite4);
                            Object objK2 = ajwoVarA.j.k(aihlVarCheckIsLite4.d);
                            Object objC = objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2);
                            aihf aihfVarCreateBuilder = ajwm.a.createBuilder();
                            Iterator it = ((ajwm) objC).c.iterator();
                            while (it.hasNext()) {
                                aihfVarCreateBuilder.aP(heaVar.a((ajwo) it.next()));
                            }
                            aihh aihhVar = (aihh) ajwo.a.createBuilder();
                            aihhVar.e(ajwm.b, (ajwm) aihfVarCreateBuilder.build());
                            ajwoVarA = (ajwo) aihhVar.build();
                        } else {
                            ajwoVarA = heaVar.a(ajwoVarA);
                        }
                    }
                    heaVar.b.a(ajwoVarA);
                }
                break;
            case 16:
                ((hea) this.a).b(anvx.MUSIC_RADIO_BUILDER_BUTTON_STATE_NO_DATA_AVAILABLE);
                break;
            case 17:
                anpk anpkVar = (anpk) obj;
                agkz agkzVarA = hfx.a(anpkVar.c);
                agkz agkzVar = hfx.c;
                Object obj2 = this.a;
                hfx.l(agkzVarA, agkzVar, new gmk(obj2, 5));
                hfx.l(hfx.a(anpkVar.d), hfx.b, new gmk(obj2, 6));
                hfx.l(hfx.a(anpkVar.e), hfx.d, new gmk(obj2, 7));
                hfx.l((agkz) Collection.EL.stream(anpkVar.f).map(new bwa(16)).collect(aghu.b), hfx.e, new gmk(obj2, 8));
                break;
            case 18:
                aink ainkVar = (aink) obj;
                int size = ainkVar.b.size();
                Object obj3 = this.a;
                if (size != 0) {
                    Stream stream = Collection.EL.stream(ainkVar.b);
                    agyg agygVar = agyg.f;
                    agygVar.getClass();
                    ((hfx) obj3).f((agke) stream.map(new hfw(agygVar, 0)).collect(aghu.a));
                } else {
                    ((hfx) obj3).f(hfx.a);
                }
                break;
            case 19:
                agrx agrxVar = agso.a;
                hgd hgdVar = (hgd) this.a;
                hgdVar.j();
                aceo aceoVar = (aceo) hgdVar.c.io();
                if (aceoVar.a != null) {
                    aceoVar.g(16384);
                }
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    hgk hgkVar = (hgk) this.a;
                    if (!((zwb) hgkVar.h.io()).u()) {
                        ((isw) hgkVar.d.io()).h(yno.ai(((hfy) hgkVar.i.io()).a().a().l));
                    }
                }
                break;
        }
    }
}
