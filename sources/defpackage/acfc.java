package defpackage;

import app.rive.FontAsset;
import app.rive.ImageAsset;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acfc implements awqk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acfc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dc A[LOOP:1: B:26:0x00aa->B:37:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0113 A[LOOP:3: B:41:0x00e4->B:52:0x0113, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        Object next;
        String str;
        awml awmlVar;
        String str2;
        Object next2;
        String str3;
        String str4;
        awwd awwdVar = null;
        switch (this.$cid) {
            case 0:
                ((acfg) this.a).r.H((String) obj, (String) obj2, false);
                return awmy.a;
            case 1:
                acfd acfdVar = acfg.a;
                ((acfs) this.a).H((String) obj, (String) obj2, false);
                return awmy.a;
            case 2:
                acfd acfdVar2 = acfg.a;
                ((acfs) this.a).H((String) obj, (String) obj2, false);
                return awmy.a;
            case 3:
                agev agevVar = (agev) obj;
                agevVar.getClass();
                ((Boolean) obj2).getClass();
                return Boolean.valueOf(((acoq) this.a).b((vob) agevVar.f()));
            case 4:
                String str5 = (String) obj;
                ImageAsset imageAsset = (ImageAsset) obj2;
                str5.getClass();
                imageAsset.getClass();
                ((adrf) this.a).h.h(str5, new adou(imageAsset));
                return awmy.a;
            case 5:
                ((String) obj).getClass();
                ((FontAsset) obj2).getClass();
                adrf adrfVar = (adrf) this.a;
                if (adrfVar.b() != null && (function0 = adrfVar.m) != null) {
                    function0.invoke();
                }
                return awmy.a;
            case 6:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                charSequence.getClass();
                ?? r12 = this.a;
                if (r12.size() == 1) {
                    String str6 = (String) atqq.ad(r12);
                    int iP = awrc.p(charSequence, str6, iIntValue, false);
                    if (iP >= 0) {
                        awmlVar = new awml(Integer.valueOf(iP), str6);
                    } else {
                        awmlVar = null;
                    }
                } else {
                    awsa awsaVar = new awsa(awro.f(iIntValue, 0), charSequence.length());
                    boolean z = charSequence instanceof String;
                    int i = awsaVar.a;
                    if (z) {
                        int i2 = awsaVar.b;
                        if (i <= i2) {
                            int i3 = i;
                            while (true) {
                                Iterator it = r12.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        awmlVar = new awml(Integer.valueOf(i3), str3);
                                    } else if (i3 != i2) {
                                        i3++;
                                    } else {
                                        awmlVar = null;
                                    }
                                } while (!awrc.m(str4, 0, (String) charSequence, i3, str4.length(), false));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    awmlVar = new awml(Integer.valueOf(i3), str3);
                                } else if (i3 != i2) {
                                    i3++;
                                } else {
                                    awmlVar = null;
                                }
                            }
                        } else {
                            awmlVar = null;
                        }
                    } else {
                        int i4 = awsaVar.b;
                        if (i <= i4) {
                            int i5 = i;
                            while (true) {
                                Iterator it2 = r12.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        str2 = (String) next;
                                    } else {
                                        next = null;
                                    }
                                    str = (String) next;
                                    if (str != null) {
                                        awmlVar = new awml(Integer.valueOf(i5), str);
                                    } else if (i5 != i4) {
                                        i5++;
                                    } else {
                                        awmlVar = null;
                                    }
                                } while (!awrc.w(str2, 0, charSequence, i5, str2.length(), false));
                                str = (String) next;
                                if (str != null) {
                                    awmlVar = new awml(Integer.valueOf(i5), str);
                                } else if (i5 != i4) {
                                    i5++;
                                } else {
                                    awmlVar = null;
                                }
                            }
                        } else {
                            awmlVar = null;
                        }
                    }
                }
                if (awmlVar != null) {
                    return new awml(awmlVar.a, Integer.valueOf(((String) awmlVar.b).length()));
                }
                return null;
            case 7:
                awou awouVar = (awou) obj;
                awos awosVar = (awos) obj2;
                if (!(awosVar instanceof afwr)) {
                    return awouVar;
                }
                awrm awrmVar = (awrm) this.a;
                awos awosVar2 = ((awou) awrmVar.a).get(awosVar.getKey());
                if (awosVar2 == null) {
                    return awouVar.plus(((afwr) awosVar).d());
                }
                awrmVar.a = ((awou) awrmVar.a).minusKey(awosVar.getKey());
                return awouVar.plus(((afwr) awosVar).b(awosVar2));
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                awos awosVar3 = (awos) obj2;
                awot key = awosVar3.getKey();
                awos awosVar4 = ((axcb) this.a).b.get(key);
                if (key == awwd.d) {
                    awwd awwdVar2 = (awwd) awosVar4;
                    awosVar3.getClass();
                    for (awwd awwdVarO = (awwd) awosVar3; awwdVarO != null; awwdVarO = ((axdv) awwdVarO).o()) {
                        if (awwdVarO == awwdVar2 || !(awwdVarO instanceof axdv)) {
                            awwdVar = awwdVarO;
                            if (awwdVar == awwdVar2) {
                                throw new IllegalStateException(a.bW(awwdVar2, awwdVar, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ", ", expected child of ", ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"));
                            }
                            if (awwdVar2 != null) {
                                iIntValue2++;
                            }
                        }
                    }
                    if (awwdVar == awwdVar2) {
                        throw new IllegalStateException(a.bW(awwdVar2, awwdVar, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ", ", expected child of ", ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"));
                    }
                    if (awwdVar2 != null) {
                        iIntValue2++;
                    }
                } else if (awosVar3 != awosVar4) {
                    iIntValue2 = Integer.MIN_VALUE;
                } else {
                    iIntValue2++;
                }
                return Integer.valueOf(iIntValue2);
        }
    }
}
