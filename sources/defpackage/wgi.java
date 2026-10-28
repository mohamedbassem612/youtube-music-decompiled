package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wgi implements Parcelable, acjy {
    public static final Parcelable.Creator CREATOR = new uwz(5);
    public final amae a;
    public final String b;
    public final String c;
    public final ajwo d;
    public final List e;
    public aouj f;
    public aorw g;
    public avbm h;
    private final Map i;
    private alzv j;
    private List k;
    private arej l;
    private aren m;
    private aptv n;
    private Object o;

    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    public wgi(amae amaeVar) {
        ajwo ajwoVar;
        String str;
        String str2;
        amaeVar.getClass();
        this.e = new ArrayList();
        this.i = new HashMap();
        avbm avbmVar = null;
        if ((amaeVar.b & SemanticState.Obscured) != 0) {
            ajwoVar = amaeVar.p;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        this.d = ajwoVar;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                arij arijVar = (arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                str2 = arijVar.d;
                str = arijVar.e;
            } else {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aohu.a);
                ajwoVar.c(aihlVarCheckIsLite3);
                if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aohu.a);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                    aoht aohtVar = (aoht) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                    str2 = aohtVar.c;
                    str = aohtVar.d;
                } else {
                    str = null;
                    str2 = null;
                }
            }
        } else {
            str = null;
            str2 = null;
        }
        this.b = str2;
        this.c = str;
        amaf amafVar = amaeVar.e;
        if ((amafVar == null ? amaf.a : amafVar).b == 51779735) {
            amaf amafVar2 = amaeVar.e;
            amafVar2 = amafVar2 == null ? amaf.a : amafVar2;
            this.j = amafVar2.b == 51779735 ? (alzv) amafVar2.c : alzv.a;
        }
        this.a = amaeVar;
        alzv alzvVar = this.j;
        if (alzvVar != null && (alzvVar.b & 1) != 0) {
            this.k = new ArrayList();
            alzu alzuVar = alzvVar.c;
            if ((alzuVar == null ? alzu.a : alzuVar).b == 49399797) {
                alzu alzuVar2 = alzvVar.c;
                alzuVar2 = alzuVar2 == null ? alzu.a : alzuVar2;
                apoq apoqVar = alzuVar2.b == 49399797 ? (apoq) alzuVar2.c : apoq.a;
                new wgd(apoqVar);
                g(apoqVar);
            } else {
                alzu alzuVar3 = alzvVar.c;
                if ((alzuVar3 == null ? alzu.a : alzuVar3).b == 91700600) {
                    alzuVar3 = alzuVar3 == null ? alzu.a : alzuVar3;
                    for (amah amahVar : (alzuVar3.b == 91700600 ? (amai) alzuVar3.c : amai.a).b) {
                        if (amahVar.b == 58174010) {
                            aftj aftjVar = new aftj((aqjj) amahVar.c);
                            this.k.add(aftjVar);
                            if (aftjVar.h() != null) {
                                g(aftjVar.h().a);
                            }
                        }
                    }
                }
            }
        }
        alzv alzvVar2 = this.j;
        if (alzvVar2 != null && (alzvVar2.b & 2) != 0) {
            alzt alztVar = alzvVar2.d;
            if ((alztVar == null ? alzt.a : alztVar).b == 50631000) {
                alzt alztVar2 = alzvVar2.d;
                alztVar2 = alztVar2 == null ? alzt.a : alztVar2;
                this.f = alztVar2.b == 50631000 ? (aouj) alztVar2.c : aouj.a;
            }
            String str3 = this.b;
            if (str3 != null) {
                str3.hashCode();
            }
            aouj aoujVar = this.f;
            if (aoujVar != null) {
                aoujVar.i.hashCode();
            }
        }
        alzv alzvVar3 = this.j;
        agem agemVar = agem.INSTANCE;
        if (alzvVar3 != null) {
            alzr alzrVar = alzvVar3.e;
            if ((alzrVar == null ? alzr.a : alzrVar).b == 46659098) {
                alzr alzrVar2 = alzvVar3.e;
                alzrVar2 = alzrVar2 == null ? alzr.a : alzrVar2;
                avbmVar = new avbm(alzrVar2.b == 46659098 ? (ajis) alzrVar2.c : ajis.a, agemVar);
            }
        }
        this.h = avbmVar;
        this.e.addAll(amaeVar.v);
        alzo alzoVar = amaeVar.h;
        if ((alzoVar == null ? alzo.a : alzoVar).b == 78882851) {
            alzo alzoVar2 = amaeVar.h;
            alzoVar2 = alzoVar2 == null ? alzo.a : alzoVar2;
            this.g = alzoVar2.b == 78882851 ? (aorw) alzoVar2.c : aorw.a;
        }
    }

    private final void g(apoq apoqVar) {
        Iterator it = apoqVar.f.iterator();
        loop0: while (it.hasNext()) {
            amgg amggVar = ((apox) it.next()).m;
            if (amggVar == null) {
                amggVar = amgg.a;
            }
            for (amgj amgjVar : amggVar.e) {
                if (this.l == null && (amgjVar.c & SemanticState.Multiline) != 0) {
                    arej arejVar = amgjVar.aj;
                    if (arejVar == null) {
                        arejVar = arej.a;
                    }
                    this.l = arejVar;
                } else if (this.m == null && (amgjVar.c & 16384) != 0) {
                    aren arenVar = amgjVar.ak;
                    if (arenVar == null) {
                        arenVar = aren.a;
                    }
                    this.m = arenVar;
                } else if (this.n == null && (amgjVar.e & SemanticState.ReadOnly) != 0) {
                    aptv aptvVar = amgjVar.bs;
                    if (aptvVar == null) {
                        aptvVar = aptv.a;
                    }
                    this.n = aptvVar;
                }
                if (this.l != null && this.m != null && this.n != null) {
                    break loop0;
                }
            }
        }
        Iterator it2 = apoqVar.f.iterator();
        while (it2.hasNext()) {
            apun apunVar = ((apox) it2.next()).F;
            if (apunVar == null) {
                apunVar = apun.a;
            }
            apup apupVar = apunVar.l;
            if (apupVar == null) {
                apupVar = apup.a;
            }
            alig aligVar = apupVar.e;
            if (aligVar == null) {
                aligVar = alig.a;
            }
            for (alih alihVar : aligVar.c) {
                if ((alihVar.b & 2097152) != 0) {
                    alfz alfzVar = alihVar.A;
                    if (alfzVar == null) {
                        alfzVar = alfz.a;
                    }
                    ajwo ajwoVar = alfzVar.b;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
                    ajwoVar.c(aihlVarCheckIsLite);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                    arij arijVar = (arij) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                    if ((arijVar.b & 524288) != 0) {
                        Map map = this.i;
                        String str = arijVar.d;
                        aojv aojvVar = arijVar.q;
                        if (aojvVar == null) {
                            aojvVar = aojv.a;
                        }
                        map.put(str, aojvVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.acjy
    public final apjh a() {
        apjh apjhVar = this.a.f;
        return apjhVar == null ? apjh.a : apjhVar;
    }

    @Override // defpackage.acjy
    public final Object b() {
        return this.o;
    }

    @Override // defpackage.acjy
    public final void c(Object obj) {
        this.o = obj;
    }

    @Override // defpackage.acjy
    public final byte[] d() {
        return this.a.u.G();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final agke e() {
        return (agke) Collection.EL.stream(this.a.i).filter(new uvm(12)).map(new vmw(5)).collect(aghu.a);
    }

    public final Optional f() {
        amae amaeVar = this.a;
        return (amaeVar.c & 2) != 0 ? Optional.of(amaeVar.y) : Optional.empty();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        tym.u(this.a, parcel);
    }
}
