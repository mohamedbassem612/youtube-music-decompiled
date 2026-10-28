package defpackage;

import android.accounts.Account;
import android.util.Pair;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ibj implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ibj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [awqg, java.lang.Object] */
    @Override // defpackage.avnn
    public final Object a(Object obj) {
        Object ibmVar;
        switch (this.$cid) {
            case 0:
                ibmVar = new ibm((aayw) this.a, ((Boolean) obj).booleanValue());
                break;
            case 1:
                agev agevVar = (agev) obj;
                boolean zG = agevVar.g();
                Object obj2 = this.a;
                if (zG) {
                    Object objC = agevVar.c();
                    if (objC instanceof amld) {
                        amld amldVar = (amld) objC;
                        ((hzp) obj2).e = Optional.of(amldVar);
                        return Optional.of(amldVar.getLikeStatus());
                    }
                }
                ((hzp) obj2).e = Optional.empty();
                return Optional.empty();
            case 2:
                obj.getClass();
                return this.a.invoke(obj);
            case 3:
                obj.getClass();
                return this.a.invoke(obj);
            case 4:
                return ((ied) this.a).a();
            case 5:
                obj.getClass();
                return this.a.invoke(obj);
            case 6:
                obj.getClass();
                return this.a.invoke(obj);
            case 7:
                obj.getClass();
                return this.a.invoke(obj);
            case 8:
                int i = ime.i;
                return ((aazq) this.a).b;
            case 9:
                obj.getClass();
                return this.a.invoke(obj);
            case 10:
                return a.m(this.a, obj);
            case 11:
                ?? r3 = this.a;
                agrf agrfVar = jah.a;
                return a.m(r3, obj);
            case 12:
                hzc hzcVar = (hzc) obj;
                jgs jgsVar = (jgs) this.a;
                return Boolean.valueOf(hzcVar.b(jgsVar.j, jgsVar.m.e != null));
            case 13:
                avmb avmbVar = awlg.a;
                return new awir(((mcm) this.a).c);
            case 14:
                Throwable th = (Throwable) obj;
                return th instanceof nrs ? avlb.m(th) : avlb.m(new nrs(((Integer) this.a.io()).intValue(), th));
            case 15:
                return Pair.create(this.a, (agev) obj);
            case 16:
                obj.getClass();
                return this.a.invoke(obj);
            case 17:
                obj.getClass();
                return this.a.invoke(obj);
            case 18:
                Object obj3 = this.a;
                typ.f((String) obj3);
                ibmVar = new agew(obj3, (Account) obj);
                break;
            case 19:
                agew agewVar = (agew) obj;
                Object obj4 = agewVar.b;
                sql sqlVar = (sql) this.a;
                String str = (String) agewVar.a;
                avlm avlmVarA = zvx.a(sqlVar.getActivity(), (Account) obj4, str);
                Executor executor = sqlVar.m;
                avmb avmbVar2 = awlg.a;
                avlm avlmVarS = avlmVarA.v(new awir(executor)).s(new awir(sqlVar.n));
                str.getClass();
                avzj avzjVar = new avzj(avlmVarS, new avog(str));
                avnn avnnVar = atqp.n;
                return avzjVar;
            default:
                tpk tpkVar = (tpk) this.a;
                return tpkVar.b.a(tpkVar.a.io(), (MessageLite) obj);
        }
        return ibmVar;
    }
}
