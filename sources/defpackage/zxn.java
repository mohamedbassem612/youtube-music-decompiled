package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zxn extends zsz {
    public final zrw a;
    public final zwb b;
    public final Executor c;
    private final tgg d;
    private final mbc e;
    private final Set f;
    private final vxz g;
    private final vxz h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxn(tgg tggVar, mbc mbcVar, zrw zrwVar, zwb zwbVar, Set set, vxz vxzVar, vxz vxzVar2, Executor executor) {
        super(10);
        tggVar.getClass();
        mbcVar.getClass();
        zrwVar.getClass();
        zwbVar.getClass();
        set.getClass();
        vxzVar.getClass();
        vxzVar2.getClass();
        executor.getClass();
        this.d = tggVar;
        this.e = mbcVar;
        this.a = zrwVar;
        this.b = zwbVar;
        this.f = set;
        this.g = vxzVar;
        this.h = vxzVar2;
        this.c = executor;
    }

    @Override // defpackage.zsz
    protected final zsa a() {
        return new zxm(this, 0);
    }

    @Override // defpackage.zsz
    public final String c() {
        return "Ping";
    }

    @Override // defpackage.zsz
    public final zsx j(zty ztyVar) {
        tok tokVar;
        Object next;
        agke agkeVarC = ztyVar.c();
        if (agkeVarC.isEmpty()) {
            zui zuiVar = this.j;
            return new zsx(zsw.b, new zsy(new ztg(zuiVar, 11), new jmj(zuiVar, 15)));
        }
        int i = ((agpi) agkeVarC).d;
        int i2 = 0;
        aigj aigjVar = ((zuq) agkeVarC.get(0)).a;
        try {
            jrh jrhVar = (jrh) aihn.parseFrom(jrh.a, aigjVar, ExtensionRegistryLite.getGeneratedRegistry());
            jrhVar.getClass();
            if ((jrhVar.b & 8) == 0) {
                throw new aiik("malformed request proto");
            }
            zxe zxeVar = new zxe(jrhVar, new zzc(new zxk(ztyVar, i2), new xoi(ztyVar, 2)), this.e, this.a, this.b, this.f, this.h);
            vxz vxzVar = this.g;
            if (vxzVar.m(14, 45627566L)) {
                if (!vxzVar.m(17, 45637284L) || (jrhVar.b & SemanticState.Multiline) == 0) {
                    tokVar = null;
                } else {
                    awnb awnbVar = new awnb((awne) zxl.a);
                    do {
                        if (!awnbVar.hasNext()) {
                            next = null;
                            break;
                        }
                        next = awnbVar.next();
                    } while (((tok) next).az != jrhVar.r);
                    tokVar = (tok) next;
                }
                if (tokVar == null) {
                    tokVar = tok.HTTP_PING_SERVICE;
                }
                zxeVar.B(tokVar);
            }
            ztyVar.o = aigjVar.d();
            ztyVar.p = 1;
            this.j.c(1L);
            this.d.b(zxeVar);
            return new zsx(zsw.c, null);
        } catch (aiik unused) {
            zui zuiVar2 = this.j;
            return new zsx(zsw.b, new zsy(new ztg(zuiVar2, 12), new jmj(zuiVar2, 16)));
        }
    }

    @Override // defpackage.zsz
    public final int l() {
        return 1;
    }
}
