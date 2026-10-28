package defpackage;

import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gla implements tbu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gla(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.tbu
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((glb) this.a).b.kn();
                break;
            case 1:
                if (((hah) obj).a.a.equals("FEmusic_home")) {
                    ((glb) this.a).a.kn();
                }
                break;
            case 2:
                Object obj2 = this.a;
                hef hefVar = (hef) obj2;
                ((tbt) hefVar.a).l(obj2);
                ((awlk) hefVar.b).kn();
                break;
            case 3:
                Object obj3 = this.a;
                hef hefVar2 = (hef) obj3;
                ((tbt) hefVar2.a).l(obj3);
                ((awlk) hefVar2.b).kn();
                break;
            case 4:
                ((jkr) this.a).c();
                break;
            case 5:
                ruf rufVar = (ruf) this.a;
                seq seqVar = (seq) obj;
                if (rufVar.h.m(36, 45754294L)) {
                    if (seqVar.a == sep.d) {
                        seq seqVar2 = rufVar.g;
                        if (seqVar2 == null || Objects.equals(seqVar2.a(), seqVar.a())) {
                            rufVar.g = null;
                        }
                    } else {
                        rufVar.g = seqVar;
                    }
                }
                Iterator it = rufVar.c.iterator();
                while (it.hasNext()) {
                    ((sof) it.next()).u();
                }
                break;
            case 6:
                ((zwt) obj).getClass();
                ((zuh) this.a).d();
                break;
            case 7:
                ((zwu) obj).getClass();
                ((zuh) this.a).d();
                break;
            case 8:
                ((aera) this.a).c((aeqi) obj);
                break;
            default:
                ((aera) this.a).d((aeqj) obj);
                break;
        }
    }

    @Override // defpackage.tbu
    public final /* synthetic */ boolean b() {
        return false;
    }
}
