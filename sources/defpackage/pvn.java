package defpackage;

import internal.org.jni_zero.JniZero;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pvn extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvn(String str, vhu vhuVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = str;
        this.c = vhuVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            return new pvn((pvo) this.c, (List) this.d, awoqVar, 0);
        }
        if (i == 1) {
            return new pvn((pfu) this.c, (List) this.d, awoqVar, 1);
        }
        if (i == 2) {
            return new pvn((pvo) this.c, (List) this.d, awoqVar, 2, (byte[]) null);
        }
        if (i == 3) {
            return new pvn((Map) this.d, (ujb) this.c, awoqVar, 3);
        }
        if (i == 4) {
            return new pvn((Map) this.d, (ujb) this.c, awoqVar, 4, (byte[]) null);
        }
        return new pvn((String) this.d, (vhu) this.c, awoqVar, 5);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((pvn) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 1) {
            return ((pvn) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 2) {
            return ((pvn) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 3) {
            return ((pvn) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 4) {
            return ((pvn) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((pvn) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r9v28, types: [pvh] */
    /* JADX WARN: Type inference failed for: r9v6, types: [pvh] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        awox awoxVar;
        Object obj3;
        Object pkvVar;
        Object obj4;
        Object obj5;
        ?? r8;
        ?? r9;
        Object obj6;
        int i = this.$cid;
        int i2 = 1;
        if (i == 0) {
            awox awoxVar2 = awox.a;
            if (this.b != 0) {
                obj2 = this.a;
                try {
                    atqp.j(obj);
                } catch (Exception e) {
                    e = e;
                    awro.A(getContext());
                    return new pkv(e, (pkx) obj2);
                }
            } else {
                atqp.j(obj);
                Object obj7 = this.c;
                ?? r0 = this.d;
                pkx pkxVar = pkx.W;
                try {
                    ?? r10 = (pvh) ((pvo) obj7).a.io();
                    this.a = pkxVar;
                    this.b = 1;
                    obj = r10.b(r0, this);
                    if (obj == awoxVar2) {
                        return awoxVar2;
                    }
                    obj2 = pkxVar;
                } catch (Exception e2) {
                    e = e2;
                    obj2 = pkxVar;
                    awro.A(getContext());
                    return new pkv(e, (pkx) obj2);
                }
            }
            return new pla(obj);
        }
        byte[] bArr = null;
        if (i == 1) {
            awoxVar = awox.a;
            if (this.b != 0) {
                obj3 = this.a;
                try {
                    atqp.j(obj);
                } catch (Exception e3) {
                    e = e3;
                    awro.A(getContext());
                    pkvVar = new pkv(e, (pkx) obj3);
                }
            } else {
                atqp.j(obj);
                Object obj8 = this.c;
                ?? r3 = this.d;
                pkx pkxVar2 = pkx.e;
                try {
                    pgd pgdVarW = ((pfu) obj8).b.w();
                    this.a = pkxVar2;
                    this.b = 1;
                    StringBuilder sb = new StringBuilder();
                    sb.append("SELECT * FROM chime_thread_states WHERE thread_id IN (");
                    api.o(sb, r3.size());
                    sb.append(')');
                    obj = apb.g(((pgh) pgdVarW).a, true, false, new pge(sb.toString(), r3, i2, bArr), this);
                    if (obj != awoxVar) {
                        obj3 = pkxVar2;
                    }
                } catch (Exception e4) {
                    e = e4;
                    obj3 = pkxVar2;
                    awro.A(getContext());
                    pkvVar = new pkv(e, (pkx) obj3);
                }
            }
            pkvVar = new pla(obj);
            int iD = a.D(pkvVar);
            if (iD == 0) {
                obj4 = ((pla) pkvVar).a;
            } else {
                if (iD != 1) {
                    throw new awmj();
                }
                ((agsj) ((agsj) pfu.a.c()).j(((pku) pkvVar).b())).t("Failed to get thread states by id");
                obj4 = awno.a;
            }
            return obj4;
        }
        if (i == 2) {
            awox awoxVar3 = awox.a;
            if (this.b != 0) {
                obj5 = this.a;
                try {
                    atqp.j(obj);
                } catch (Exception e5) {
                    e = e5;
                    awro.A(getContext());
                    return new pkv(e, (pkx) obj5);
                }
            } else {
                atqp.j(obj);
                Object obj9 = this.c;
                ?? r1 = this.d;
                pkx pkxVar3 = pkx.W;
                try {
                    ?? r11 = (pvh) ((pvo) obj9).a.io();
                    this.a = pkxVar3;
                    this.b = 1;
                    obj = r11.c(r1, this);
                    if (obj == awoxVar3) {
                        return awoxVar3;
                    }
                    obj5 = pkxVar3;
                } catch (Exception e6) {
                    e = e6;
                    obj5 = pkxVar3;
                    awro.A(getContext());
                    return new pkv(e, (pkx) obj5);
                }
            }
            return new pla(obj);
        }
        if (i == 3) {
            awox awoxVar4 = awox.a;
            if (this.b != 0) {
                Object obj10 = this.a;
                atqp.j(obj);
                r8 = obj10;
            } else {
                atqp.j(obj);
                Object obj11 = this.d;
                Object obj12 = this.c;
                this.a = obj11;
                this.b = 1;
                Object objC = ((ujb) obj12).c(this);
                if (objC == awoxVar4) {
                    return awoxVar4;
                }
                obj = objC;
                r8 = obj11;
            }
            r8.putAll((Map) obj);
            return awmy.a;
        }
        if (i == 4) {
            awox awoxVar5 = awox.a;
            if (this.b != 0) {
                Object obj13 = this.a;
                atqp.j(obj);
                r9 = obj13;
            } else {
                atqp.j(obj);
                Object obj14 = this.d;
                Object obj15 = this.c;
                this.a = obj14;
                this.b = 1;
                Object objD = ((ujb) obj15).d(this);
                if (objD == awoxVar5) {
                    return awoxVar5;
                }
                obj = objD;
                r9 = obj14;
            }
            r9.putAll((Map) obj);
            return awmy.a;
        }
        awoxVar = awox.a;
        try {
            if (this.b != 0) {
                obj6 = this.a;
                atqp.j(obj);
            } else {
                atqp.j(obj);
                Object obj16 = this.d;
                Object obj17 = this.c;
                this.a = obj16;
                this.b = 1;
                awud awudVar = new awud(JniZero.q(this), 1);
                awudVar.w();
                ((vhu) obj17).e.downloadAsset((String) obj16, new vhs(awudVar, (String) obj16));
                Object objJ = awudVar.j();
                if (objJ != awoxVar) {
                    obj6 = obj16;
                    obj = objJ;
                }
            }
            return new awml(obj6, obj);
        } catch (IOException e7) {
            twu.d("SkottieEffectsController", 6, "Failed to download asset: ".concat(String.valueOf(this.d)), e7);
            return null;
        }
        return awoxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvn(Map map, ujb ujbVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = map;
        this.c = ujbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvn(Map map, ujb ujbVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = map;
        this.c = ujbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvn(pfu pfuVar, List list, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pfuVar;
        this.d = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvn(pvo pvoVar, List list, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pvoVar;
        this.d = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvn(pvo pvoVar, List list, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pvoVar;
        this.d = list;
    }
}
