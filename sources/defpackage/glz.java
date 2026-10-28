package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.JavaRuntime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class glz implements JavaRuntime.InstanceProxyFactory {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public glz(gma gmaVar, int i) {
        this.$cid = i;
        this.a = gmaVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.JavaRuntime.InstanceProxyFactory
    public final InstanceProxy a(may mayVar) {
        switch (this.$cid) {
            case 0:
                return new agae(((jqs) ((gma) this.a).a).a(mayVar));
            case 1:
                return new afyo(((gev) ((gma) this.a).a).k());
            case 2:
                return new agaf(((dov) ((gma) this.a).a).u());
            case 3:
                return new agax(((ayq) ((gma) this.a).a).E(mayVar));
            case 4:
                return new afzu(((hfn) ((gma) this.a).a).N());
            case 5:
                return new agbx(((hed) ((gma) this.a).a).l(), mfp.a);
            case 6:
                return new afyv(((dov) ((gma) this.a).a).al());
            case 7:
                return new afyz(((dov) ((gma) this.a).a).av());
            case 8:
                return new afza(((ayq) ((gma) this.a).a).R());
            case 9:
                return new agcm(((oml) ((gma) this.a).a).j());
            case 10:
                return new afzj(((wjr) ((gma) this.a).a).l());
            case 11:
                return new afzl(((wjr) ((gma) this.a).a).k());
            case 12:
                return new afyg(((dov) ((gma) this.a).a).aa());
            case 13:
                return new afzp(((omn) ((gma) this.a).a).m(mayVar), xlm.a);
            case 14:
                return new agaj(((abfv) ((gma) this.a).a).C(mayVar));
            default:
                return new agay(((ci) ((gma) this.a).a).an(mayVar));
        }
    }

    @Override // com.google.android.libraries.blocks.runtime.JavaRuntime.InstanceProxyFactory
    public final InstanceProxy b(may mayVar) {
        switch (this.$cid) {
            case 0:
                return new agae(((jqs) ((gma) this.a).a).a(mayVar));
            case 1:
                return new afyo(((gev) ((gma) this.a).a).k());
            case 2:
                return new agaf(((dov) ((gma) this.a).a).u());
            case 3:
                return new agax(((ayq) ((gma) this.a).a).E(mayVar));
            case 4:
                return new afzu(((hfn) ((gma) this.a).a).N());
            case 5:
                return new agbx(((hed) ((gma) this.a).a).l(), mfp.a);
            case 6:
                return new afyv(((dov) ((gma) this.a).a).al());
            case 7:
                return new afyz(((dov) ((gma) this.a).a).av());
            case 8:
                return new afza(((ayq) ((gma) this.a).a).R());
            case 9:
                return new agcm(((oml) ((gma) this.a).a).j());
            case 10:
                return new afzj(((wjr) ((gma) this.a).a).l());
            case 11:
                return new afzl(((wjr) ((gma) this.a).a).k());
            case 12:
                return new afyg(((dov) ((gma) this.a).a).aa());
            case 13:
                return new afzp(((omn) ((gma) this.a).a).m(mayVar), xlm.a);
            case 14:
                return new agaj(((abfv) ((gma) this.a).a).C(mayVar));
            default:
                return new agay(((ci) ((gma) this.a).a).an(mayVar));
        }
    }
}
