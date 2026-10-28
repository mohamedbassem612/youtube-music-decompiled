package defpackage;

import android.util.Base64;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abyy implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abyy(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r4v48, types: [awqg, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        int i = 8;
        switch (this.$cid) {
            case 0:
                ((tyt) this.a).f("au_d", (String) obj);
                break;
            case 1:
                agke agkeVar = abvs.a;
                StringBuilder sb = (StringBuilder) this.a;
                sb.append(";p_cpn=");
                sb.append((String) obj);
                break;
            case 2:
                ((tyt) this.a).f("hb_data", Base64.encodeToString(((aigj) obj).G(), 8));
                break;
            case 3:
                String str = (String) obj;
                aihf aihfVar = ((abzh) this.a).D;
                aihfVar.copyOnWrite();
                arjb arjbVar = (arjb) aihfVar.instance;
                arjb arjbVar2 = arjb.a;
                str.getClass();
                arjbVar.b |= 262144;
                arjbVar.u = str;
                break;
            case 4:
                aihf aihfVar2 = ((abzh) this.a).D;
                String strEncodeToString = Base64.encodeToString(((aigj) obj).G(), 8);
                aihfVar2.copyOnWrite();
                arjb arjbVar3 = (arjb) aihfVar2.instance;
                arjb arjbVar4 = arjb.a;
                strEncodeToString.getClass();
                arjbVar3.b |= 67108864;
                arjbVar3.z = strEncodeToString;
                break;
            case 5:
                ((agjz) this.a).h((yxk) obj);
                break;
            case 6:
                ((acfs) this.a).K((abnp) obj);
                break;
            case 7:
                askp askpVarQ = aavv.q((String) obj);
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                amfh amfhVar = (amfh) aihfVar3.instance;
                amfh amfhVar2 = amfh.a;
                askpVarQ.getClass();
                amfhVar.d = askpVarQ;
                amfhVar.b |= 2;
                break;
            case 8:
                alqc alqcVar = (alqc) obj;
                if ((alqcVar.b & 65536) != 0) {
                    vxe vxeVar = ((acoi) this.a).L;
                    ajwo ajwoVar = alqcVar.q;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    vxeVar.a(ajwoVar);
                }
                break;
            case 9:
                ((acoi) this.a).L.a((ajwo) obj);
                break;
            case 10:
                ((acoi) this.a).L.a((ajwo) obj);
                break;
            case 11:
                this.a.a((ajwo) obj);
                break;
            case 12:
                acoi acoiVar = (acoi) this.a;
                acoiVar.Q.removeCallbacks((Runnable) obj);
                acoiVar.K();
                break;
            case 13:
                ((acoi) this.a).V((acra) obj);
                break;
            case 14:
                Object obj2 = this.a;
                ((acoi) obj2).cr.D(new aalq(obj2, (ilx) obj, 5, null));
                break;
            case 15:
                Object obj3 = this.a;
                ((acoi) obj3).cr.D(new acnd(obj3, i));
                break;
            case 16:
                ((acoi) this.a).L.a((ajwo) obj);
                break;
            case 17:
                ((acrp) obj).N((aazn) this.a);
                break;
            case 18:
                acph acphVar = (acph) this.a;
                acphVar.l.d();
                acphVar.d((apfp) obj);
                break;
            case 19:
                this.a.invoke(obj);
                break;
            default:
                Object obj4 = ((aciz) obj).a;
                Object obj5 = this.a;
                obj5.toString();
                ((acqk) obj4).b = Optional.of(obj5);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
