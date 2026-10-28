package defpackage;

import app.rive.semantics.SemanticState;
import io.grpc.Status;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acxl implements nzw {
    private static final Duration b = Duration.ofDays(7300);
    private final xit c;
    private final awmd d;
    private final long e;

    public acxl(xit xitVar, awmd awmdVar, mbc mbcVar) {
        this.c = xitVar;
        this.d = awmdVar;
        this.e = ahbu.b(mbcVar.f()) - (mbcVar.c() / 1000);
    }

    private static int h() {
        int iK = atqp.K(70);
        if (iK == 0) {
            return 71;
        }
        return iK;
    }

    @Override // defpackage.nzw
    public final int a() {
        return this.c.f();
    }

    @Override // defpackage.nzw
    public final String b() {
        return this.c.h();
    }

    @Override // defpackage.nzw
    public final void c(String str) {
        d(str);
    }

    @Override // defpackage.nzw
    public final void d(String str) {
        xit xitVar = this.c;
        xitVar.l(str);
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
        amiuVar.f = h() - 1;
        amiuVar.b |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
        str.getClass();
        amiuVar2.b |= 8;
        amiuVar2.g = str;
        xitVar.j((amiu) aihfVarCreateBuilder.build());
    }

    @Override // defpackage.nzw
    public final void e(String str, nzt nztVar) {
        f(str, a(), nztVar);
    }

    @Override // defpackage.nzw
    public final void f(String str, int i, nzt nztVar) {
        Long l;
        aihf aihfVarCreateBuilder = amix.a.createBuilder();
        if (nztVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amix amixVar = (amix) aihfVarCreateBuilder.instance;
            String str2 = nztVar.a;
            str2.getClass();
            amixVar.b |= 1;
            amixVar.c = str2;
            Long l2 = nztVar.b;
            if (l2 == null || (l = nztVar.c) == null) {
                Long l3 = nztVar.d;
                if (l3 != null) {
                    long jLongValue = l3.longValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    amix amixVar2 = (amix) aihfVarCreateBuilder.instance;
                    amixVar2.b |= 8;
                    amixVar2.e = jLongValue;
                }
            } else {
                awmd awmdVar = this.d;
                long jLongValue2 = l2.longValue();
                if (((vxz) awmdVar.io()).l(88, 45628047L, false) && jLongValue2 < b.toMillis() * 1000) {
                    jLongValue2 += this.e;
                }
                aihfVarCreateBuilder.copyOnWrite();
                amix amixVar3 = (amix) aihfVarCreateBuilder.instance;
                amixVar3.b |= 16;
                amixVar3.f = jLongValue2;
                long jLongValue3 = l.longValue() - l2.longValue();
                aihfVarCreateBuilder.copyOnWrite();
                amix amixVar4 = (amix) aihfVarCreateBuilder.instance;
                amixVar4.b |= 8;
                amixVar4.e = jLongValue3;
            }
            Integer num = nztVar.e;
            if (num != null) {
                int iIntValue = num.intValue();
                aihfVarCreateBuilder.copyOnWrite();
                amix amixVar5 = (amix) aihfVarCreateBuilder.instance;
                amixVar5.b |= SemanticState.Focused;
                amixVar5.i = iIntValue;
            }
            nzr nzrVar = nztVar.f;
            if (nzrVar != null) {
                aihf aihfVarCreateBuilder2 = amji.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amji amjiVar = (amji) aihfVarCreateBuilder2.instance;
                amjiVar.b |= 64;
                amjiVar.g = nzrVar.o;
                Integer num2 = nzrVar.p;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amji amjiVar2 = (amji) aihfVarCreateBuilder2.instance;
                    amjiVar2.b |= 65536;
                    amjiVar2.l = iIntValue2;
                }
                nzo nzoVar = nzrVar.c;
                if (nzoVar != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    amji amjiVar3 = (amji) aihfVarCreateBuilder2.instance;
                    amjiVar3.b |= 8;
                    amjiVar3.d = nzoVar.a;
                    aihfVarCreateBuilder2.copyOnWrite();
                    amji amjiVar4 = (amji) aihfVarCreateBuilder2.instance;
                    amjiVar4.b |= 16;
                    amjiVar4.e = nzoVar.b;
                }
                agkz<String> agkzVar = nzrVar.a;
                if (agkzVar != null && !agkzVar.isEmpty()) {
                    for (String str3 : agkzVar) {
                        aihf aihfVarCreateBuilder3 = amjh.a.createBuilder();
                        aihfVarCreateBuilder3.copyOnWrite();
                        amjh amjhVar = (amjh) aihfVarCreateBuilder3.instance;
                        str3.getClass();
                        amjhVar.b |= 1;
                        amjhVar.c = str3;
                        aihfVarCreateBuilder2.copyOnWrite();
                        amji amjiVar5 = (amji) aihfVarCreateBuilder2.instance;
                        amjh amjhVar2 = (amjh) aihfVarCreateBuilder3.build();
                        amjhVar2.getClass();
                        aiie aiieVar = amjiVar5.c;
                        if (!aiieVar.c()) {
                            amjiVar5.c = aihn.mutableCopy(aiieVar);
                        }
                        amjiVar5.c.add(amjhVar2);
                    }
                }
                Boolean bool = nzrVar.b;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amji amjiVar6 = (amji) aihfVarCreateBuilder2.instance;
                    amjiVar6.b |= 524288;
                    amjiVar6.n = zBooleanValue;
                }
                String str4 = nzrVar.d;
                if (str4 != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    amji amjiVar7 = (amji) aihfVarCreateBuilder2.instance;
                    amjiVar7.b |= 32;
                    amjiVar7.f = str4;
                }
                Integer num3 = nzrVar.k;
                if (num3 != null && num3.intValue() >= 0) {
                    int iIntValue3 = num3.intValue();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amji amjiVar8 = (amji) aihfVarCreateBuilder2.instance;
                    amjiVar8.b |= 262144;
                    amjiVar8.m = iIntValue3;
                }
                Boolean bool2 = nzrVar.l;
                if (bool2 != null) {
                    bool2.booleanValue();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amji amjiVar9 = (amji) aihfVarCreateBuilder2.instance;
                    amjiVar9.b |= 8388608;
                    amjiVar9.q = true;
                }
                Integer num4 = nzrVar.e;
                if (num4 != null) {
                    int iIntValue4 = num4.intValue();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amji amjiVar10 = (amji) aihfVarCreateBuilder2.instance;
                    amjiVar10.b |= SemanticState.Focused;
                    amjiVar10.h = iIntValue4;
                }
                Status status = nzrVar.f;
                if (status != null) {
                    aihf aihfVarCreateBuilder4 = amjg.a.createBuilder();
                    int iValue = status.getCode().value();
                    aihfVarCreateBuilder4.copyOnWrite();
                    amjg amjgVar = (amjg) aihfVarCreateBuilder4.instance;
                    amjgVar.b |= 2;
                    amjgVar.c = iValue;
                    String str5 = nzrVar.g;
                    if (str5 != null) {
                        aihfVarCreateBuilder4.copyOnWrite();
                        amjg amjgVar2 = (amjg) aihfVarCreateBuilder4.instance;
                        amjgVar2.b |= 4;
                        amjgVar2.d = str5;
                    }
                    String str6 = nzrVar.h;
                    if (str6 != null) {
                        aihfVarCreateBuilder4.copyOnWrite();
                        amjg amjgVar3 = (amjg) aihfVarCreateBuilder4.instance;
                        amjgVar3.b |= 8;
                        amjgVar3.e = str6;
                    }
                    Boolean bool3 = nzrVar.j;
                    if (bool3 != null) {
                        boolean zBooleanValue2 = bool3.booleanValue();
                        aihfVarCreateBuilder4.copyOnWrite();
                        amjg amjgVar4 = (amjg) aihfVarCreateBuilder4.instance;
                        amjgVar4.b |= 16;
                        amjgVar4.f = zBooleanValue2;
                    }
                    Integer num5 = nzrVar.i;
                    if (num5 != null) {
                        int iIntValue5 = num5.intValue();
                        aihfVarCreateBuilder4.copyOnWrite();
                        amjg amjgVar5 = (amjg) aihfVarCreateBuilder4.instance;
                        amjgVar5.b |= 32;
                        amjgVar5.g = iIntValue5;
                    }
                    amjg amjgVar6 = (amjg) aihfVarCreateBuilder4.build();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amji amjiVar11 = (amji) aihfVarCreateBuilder2.instance;
                    amjgVar6.getClass();
                    amjiVar11.i = amjgVar6;
                    amjiVar11.b |= SemanticState.LiveRegion;
                }
                Integer num6 = nzrVar.m;
                agke agkeVar = nzrVar.n;
                aguu.aj((num6 == null) == (agkeVar == null || agkeVar.isEmpty()), "Collection rate and collection reason should be both null or not null.", new Object[0]);
                if (num6 != null && agkeVar != null) {
                    int iIntValue6 = num6.intValue();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amji amjiVar12 = (amji) aihfVarCreateBuilder2.instance;
                    amjiVar12.b |= 1048576;
                    amjiVar12.o = iIntValue6;
                    int size = agkeVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ajwc ajwcVarA = ajwc.a(((Integer) agkeVar.get(i2)).intValue());
                        if (ajwcVarA != null) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            amji amjiVar13 = (amji) aihfVarCreateBuilder2.instance;
                            aihv aihvVar = amjiVar13.p;
                            if (!aihvVar.c()) {
                                amjiVar13.p = aihn.mutableCopy(aihvVar);
                            }
                            amjiVar13.p.h(ajwcVarA.f);
                        }
                    }
                }
                aihfVarCreateBuilder.copyOnWrite();
                amix amixVar6 = (amix) aihfVarCreateBuilder.instance;
                amji amjiVar14 = (amji) aihfVarCreateBuilder2.build();
                amjiVar14.getClass();
                amixVar6.g = amjiVar14;
                amixVar6.b |= 32;
            }
        }
        this.c.s(h(), i, str, (amix) aihfVarCreateBuilder.build());
    }

    @Override // defpackage.nzw
    public final int g(String str, nzt nztVar) {
        int iA = a();
        f(str, iA, nztVar);
        return iA;
    }
}
