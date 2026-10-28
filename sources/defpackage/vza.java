package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vza {
    public aihn b;
    private final awqg d;
    private final awqg e;
    private final aihn f;
    private final awqg g;
    private final boolean h;
    public String a = "";
    public final awli c = new awli();
    private final axff i = new axfi(false);

    public vza(awqg awqgVar, awqg awqgVar2, aihn aihnVar, awqg awqgVar3, boolean z) {
        this.d = awqgVar;
        this.e = awqgVar2;
        this.f = aihnVar;
        this.g = awqgVar3;
        this.h = z;
        this.b = aihnVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(aiqi aiqiVar, awoq awoqVar) throws Throwable {
        vyy vyyVar;
        axff axffVar;
        Boolean bool;
        aihn aihnVar;
        if (awoqVar instanceof vyy) {
            vyyVar = (vyy) awoqVar;
            int i = vyyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vyyVar.c = i - Integer.MIN_VALUE;
            } else {
                vyyVar = new vyy(this, awoqVar);
            }
        } else {
            vyyVar = new vyy(this, awoqVar);
        }
        Object obj = vyyVar.a;
        awox awoxVar = awox.a;
        int i2 = vyyVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            axffVar = this.i;
            vyyVar.d = aiqiVar;
            vyyVar.e = (axfi) axffVar;
            vyyVar.c = 1;
            if (axffVar.a(vyyVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            axfi axfiVar = vyyVar.e;
            aiqi aiqiVar2 = vyyVar.d;
            atqp.j(obj);
            axffVar = axfiVar;
            aiqiVar = aiqiVar2;
        }
        try {
            String str = (String) this.e.invoke(aiqiVar);
            if (str == null) {
                str = "";
            }
            if (str.length() == 0 || awrc.c(str, this.a)) {
                bool = Boolean.FALSE;
            } else {
                this.a = str;
                aigj aigjVar = (aigj) this.d.invoke(aiqiVar);
                if (!aigjVar.E() && (aihnVar = (aihn) this.g.invoke(aigjVar)) != null) {
                    this.b = aihnVar;
                    if (this.h) {
                        this.c.kk(aihnVar);
                    }
                }
                bool = Boolean.TRUE;
            }
            return bool;
        } finally {
            axffVar.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(aihn aihnVar, String str, awoq awoqVar) throws Throwable {
        vyz vyzVar;
        axff axffVar;
        Object obj;
        if (awoqVar instanceof vyz) {
            vyzVar = (vyz) awoqVar;
            int i = vyzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vyzVar.d = i - Integer.MIN_VALUE;
            } else {
                vyzVar = new vyz(this, awoqVar);
            }
        } else {
            vyzVar = new vyz(this, awoqVar);
        }
        Object obj2 = vyzVar.b;
        awox awoxVar = awox.a;
        int i2 = vyzVar.d;
        if (i2 == 0) {
            atqp.j(obj2);
            axffVar = this.i;
            vyzVar.a = aihnVar;
            vyzVar.e = str;
            vyzVar.f = (axfi) axffVar;
            vyzVar.d = 1;
            if (axffVar.a(vyzVar) == awoxVar) {
                obj = aihnVar;
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            axfi axfiVar = vyzVar.f;
            str = vyzVar.e;
            Object obj3 = vyzVar.a;
            atqp.j(obj2);
            axffVar = axfiVar;
            obj = obj3;
        }
        try {
            obj = aihnVar;
            this.b = (aihn) obj;
            this.a = str;
            return awmy.a;
        } finally {
            axffVar.c();
        }
    }

    public final void c() {
        this.c.kk(this.b);
    }
}
