package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vdm implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vdm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v44, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r11v54, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v70, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        Object obj2;
        switch (this.$cid) {
            case 0:
                return this.a.invoke(obj);
            case 1:
                return this.a.invoke(obj);
            case 2:
                ((vfb) this.a).p(ajtv.ERROR_LEVEL_ERROR, "saveStagingOutput failed to save AI edited image", (Exception) obj);
                return Boolean.FALSE;
            case 3:
                aihf builder = ((vlg) obj).toBuilder();
                builder.copyOnWrite();
                vlg vlgVar = (vlg) builder.instance;
                Object obj3 = this.a;
                obj3.getClass();
                vlgVar.k = (String) obj3;
                return (vlg) builder.build();
            case 4:
                vlg vlgVar2 = (vlg) obj;
                if (vlgVar2.c == 0) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(((vhl) this.a).c.f().toEpochMilli() - vlgVar2.c > vhl.a);
            case 5:
                vlg vlgVar3 = (vlg) obj;
                if (vlgVar3 == null) {
                    return null;
                }
                Object obj4 = this.a;
                int i = vlgVar3.e;
                int i2 = vlgVar3.f;
                int i3 = vlgVar3.g;
                auir auirVarA = auir.a(vlgVar3.h);
                int i4 = vlgVar3.i;
                vkl vklVar = (vkl) obj4;
                vklVar.k(true);
                if (auirVarA == null) {
                    auirVarA = auir.FONT_FAMILY_UNSPECIFIED;
                }
                vklVar.q(i3, auirVarA, 36.0f, "", i, i2, i4);
                return null;
            case 6:
                return Boolean.valueOf(((String) this.a).equals((String) obj));
            case 7:
                return ((vvf) aguu.aw((Context) ((abxv) this.a).d, vvf.class, (affd) obj)).z();
            case 8:
                aqeg aqegVar = (aqeg) obj;
                aihf aihfVarCreateBuilder = asds.a.createBuilder();
                if ((aqegVar.b & 2) != 0) {
                    Object obj5 = this.a;
                    ajwo ajwoVar = aqegVar.f;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    ((agcl) obj5).b.a(ajwoVar);
                }
                int i5 = aqegVar.c;
                if (i5 == 2) {
                    aqeh aqehVar = (aqeh) aqegVar.d;
                    aihfVarCreateBuilder.copyOnWrite();
                    asds asdsVar = (asds) aihfVarCreateBuilder.instance;
                    aqehVar.getClass();
                    asdsVar.c = aqehVar;
                    asdsVar.b = 1;
                } else if (i5 == 3) {
                    aqee aqeeVar = (aqee) aqegVar.d;
                    aihfVarCreateBuilder.copyOnWrite();
                    asds asdsVar2 = (asds) aihfVarCreateBuilder.instance;
                    aqeeVar.getClass();
                    asdsVar2.c = aqeeVar;
                    asdsVar2.b = 2;
                }
                return (asds) aihfVarCreateBuilder.build();
            case 9:
                vzt vztVar = (vzt) this.a;
                return vztVar.i.g(vztVar.k.H((ohp) obj), 4);
            case 10:
                return ((wiu) this.a).d;
            case 11:
                aihf aihfVar = (aihf) obj;
                ((wkf) this.a).C(aihfVar);
                obj2 = aihfVar;
                break;
            case 12:
                return this.a.invoke(obj);
            case 13:
                return ((woo) this.a).N();
            case 14:
                alzm alzmVar = (alzm) obj;
                ((wjz) ((aend) this.a).c).a(alzmVar);
                obj2 = alzmVar;
                break;
            case 15:
                wru wruVar = (wru) obj;
                ((wne) this.a).b(wruVar);
                obj2 = wruVar;
                break;
            case 16:
                ajha ajhaVar = ((alsv) this.a).f;
                return ajhaVar == null ? ajha.a : ajhaVar;
            case 17:
                return yno.eh((alye) obj, this.a);
            case 18:
                return ((wty) aguu.aw((Context) ((xpl) this.a).a, wty.class, (affd) obj)).u();
            case 19:
                aihf builder2 = ((atou) obj).toBuilder();
                boolean zBooleanValue = ((wvl) this.a).c.booleanValue();
                builder2.copyOnWrite();
                atou atouVar = (atou) builder2.instance;
                atouVar.b |= 1;
                atouVar.c = zBooleanValue;
                return (atou) builder2.build();
            default:
                atov atovVar = (atov) obj;
                aihf builder3 = atovVar.toBuilder();
                wvl wvlVar = (wvl) this.a;
                agek agekVar = wvlVar.a;
                if (agekVar != null) {
                    aoqd aoqdVar = atovVar.c;
                    if (aoqdVar == null) {
                        aoqdVar = aoqd.a;
                    }
                    Object objApply = agekVar.apply(aoqdVar);
                    builder3.copyOnWrite();
                    atov atovVar2 = (atov) builder3.instance;
                    atovVar2.c = (aoqd) objApply;
                    atovVar2.b |= 1;
                }
                agek agekVar2 = wvlVar.b;
                if (agekVar2 != null) {
                    ajha ajhaVar2 = atovVar.d;
                    if (ajhaVar2 == null) {
                        ajhaVar2 = ajha.a;
                    }
                    ajha ajhaVar3 = (ajha) agekVar2.apply(ajhaVar2);
                    builder3.copyOnWrite();
                    atov atovVar3 = (atov) builder3.instance;
                    ajhaVar3.getClass();
                    atovVar3.d = ajhaVar3;
                    atovVar3.b |= 2;
                }
                return (atov) builder3.build();
        }
        return obj2;
    }
}
