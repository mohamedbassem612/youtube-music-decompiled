package defpackage;

import com.google.research.xeno.effect.Control;
import j$.util.Optional;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qzl extends qvi {
    public static final /* synthetic */ int j = 0;
    public final String b;
    public String h;
    public String i;

    private qzl(qzl qzlVar) {
        super(qzlVar);
        this.h = qzlVar.h;
        this.i = qzlVar.i;
        this.b = qzlVar.b;
    }

    @Override // defpackage.qvi, defpackage.qvc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvc clone() {
        return new qzl(this);
    }

    @Override // defpackage.qvi, defpackage.qvc
    public final /* synthetic */ Object clone() {
        return new qzl(this);
    }

    @Override // defpackage.qvc
    public final void d(qvk qvkVar) {
        aihf aihfVarCreateBuilder = ahxc.a.createBuilder();
        String str = this.h;
        if (str != null) {
            aihf aihfVarCreateBuilder2 = ahxd.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ahxd ahxdVar = (ahxd) aihfVarCreateBuilder2.instance;
            ahxdVar.b |= 1;
            ahxdVar.c = "_txt_0";
            aihfVarCreateBuilder2.copyOnWrite();
            ahxd ahxdVar2 = (ahxd) aihfVarCreateBuilder2.instance;
            ahxdVar2.b |= 2;
            ahxdVar2.d = str;
            aihfVarCreateBuilder.as((ahxd) aihfVarCreateBuilder2.build());
        }
        String str2 = this.i;
        if (str2 != null) {
            aihf aihfVarCreateBuilder3 = ahxd.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            ahxd ahxdVar3 = (ahxd) aihfVarCreateBuilder3.instance;
            ahxdVar3.b |= 1;
            ahxdVar3.c = "_txt_1";
            aihfVarCreateBuilder3.copyOnWrite();
            ahxd ahxdVar4 = (ahxd) aihfVarCreateBuilder3.instance;
            ahxdVar4.b |= 2;
            ahxdVar4.d = str2;
            aihfVarCreateBuilder.as((ahxd) aihfVarCreateBuilder3.build());
        }
        jrr jrrVar = (jrr) atqs.a.createBuilder();
        ahxc ahxcVar = (ahxc) aihfVarCreateBuilder.build();
        jrrVar.copyOnWrite();
        atqs atqsVar = (atqs) jrrVar.instance;
        ahxcVar.getClass();
        atqsVar.f = ahxcVar;
        atqsVar.c |= 2;
        atqs atqsVar2 = (atqs) jrrVar.build();
        aihh aihhVar = (aihh) atwa.a.createBuilder();
        aihhVar.e(atqs.b, atqsVar2);
        atwa atwaVar = (atwa) aihhVar.build();
        Optional optionalOfNullable = Optional.ofNullable((Control) qvkVar.a.b.get(f("gl_skottie_renderer_calculator_runtime_options")));
        jfn jfnVar = new jfn(atwaVar, 15);
        if (true == optionalOfNullable.isPresent()) {
            ((Control) optionalOfNullable.get()).d.a((atwa) jfnVar.a);
        }
    }

    @Override // defpackage.qvi
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ qvi clone() {
        return new qzl(this);
    }

    public qzl(UUID uuid, qwx qwxVar, String str) {
        super(uuid, qwxVar);
        this.b = str;
    }
}
