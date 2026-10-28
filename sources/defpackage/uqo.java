package defpackage;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uqo {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/gesture/GuidelineDataCreator");

    private uqo() {
    }

    public static uqp a(uqp uqpVar, Size size) {
        uqp uqpVar2;
        akgx akgxVar = uqpVar.a;
        float f = akgxVar.l;
        if (f == 0.0f) {
            return uqpVar;
        }
        Range range = new Range(Float.valueOf((-0.01f) + f), Float.valueOf(f + 0.01f));
        float width = size.getWidth() / size.getHeight();
        if (range.contains(Float.valueOf(width))) {
            return uqpVar;
        }
        if (width < ((Float) range.getLower()).floatValue()) {
            aihf builder = akgxVar.toBuilder();
            builder.copyOnWrite();
            akgx akgxVar2 = (akgx) builder.instance;
            akgxVar2.c = null;
            akgxVar2.b &= -2;
            builder.copyOnWrite();
            akgx akgxVar3 = (akgx) builder.instance;
            akgxVar3.d = null;
            akgxVar3.b &= -3;
            uqpVar2 = new uqp((akgx) builder.build(), uqpVar.b, uqpVar.c);
        } else {
            aihf builder2 = akgxVar.toBuilder();
            builder2.copyOnWrite();
            akgx akgxVar4 = (akgx) builder2.instance;
            akgxVar4.e = null;
            akgxVar4.b &= -5;
            builder2.copyOnWrite();
            akgx akgxVar5 = (akgx) builder2.instance;
            akgxVar5.f = null;
            akgxVar5.b &= -9;
            uqpVar2 = new uqp((akgx) builder2.build(), uqpVar.b, uqpVar.c);
        }
        return uqpVar2;
    }

    public static auak b(uqp uqpVar, int i, float f, boolean z, float f2) {
        aihf aihfVarCreateBuilder = auak.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        auak auakVar = (auak) aihfVarCreateBuilder.instance;
        int i2 = i - 1;
        auakVar.e = i2;
        auakVar.b |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        auak auakVar2 = (auak) aihfVarCreateBuilder.instance;
        auakVar2.b |= 8;
        auakVar2.f = f;
        aihfVarCreateBuilder.copyOnWrite();
        auak auakVar3 = (auak) aihfVarCreateBuilder.instance;
        auakVar3.b |= 16;
        auakVar3.g = z;
        if (i2 == 1 || i2 == 3 || i2 == 4) {
            auam auamVar = auam.a;
            aihf aihfVarCreateBuilder2 = auamVar.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            auam auamVar2 = (auam) aihfVarCreateBuilder2.instance;
            auamVar2.b |= 1;
            auamVar2.c = 0.0f;
            aihfVarCreateBuilder2.copyOnWrite();
            auam auamVar3 = (auam) aihfVarCreateBuilder2.instance;
            auamVar3.b |= 2;
            auamVar3.d = f2;
            aihfVarCreateBuilder.copyOnWrite();
            auak auakVar4 = (auak) aihfVarCreateBuilder.instance;
            auam auamVar4 = (auam) aihfVarCreateBuilder2.build();
            auamVar4.getClass();
            auakVar4.c = auamVar4;
            auakVar4.b |= 1;
            aihf aihfVarCreateBuilder3 = auamVar.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            auam auamVar5 = (auam) aihfVarCreateBuilder3.instance;
            auamVar5.b |= 1;
            auamVar5.c = 1.0f;
            aihfVarCreateBuilder3.copyOnWrite();
            auam auamVar6 = (auam) aihfVarCreateBuilder3.instance;
            auamVar6.b |= 2;
            auamVar6.d = f2;
            aihfVarCreateBuilder.copyOnWrite();
            auak auakVar5 = (auak) aihfVarCreateBuilder.instance;
            auam auamVar7 = (auam) aihfVarCreateBuilder3.build();
            auamVar7.getClass();
            auakVar5.d = auamVar7;
            auakVar5.b |= 2;
        } else {
            auam auamVar8 = auam.a;
            aihf aihfVarCreateBuilder4 = auamVar8.createBuilder();
            aihfVarCreateBuilder4.copyOnWrite();
            auam auamVar9 = (auam) aihfVarCreateBuilder4.instance;
            auamVar9.b |= 1;
            auamVar9.c = f2;
            aihfVarCreateBuilder4.copyOnWrite();
            auam auamVar10 = (auam) aihfVarCreateBuilder4.instance;
            auamVar10.b |= 2;
            auamVar10.d = 0.0f;
            aihfVarCreateBuilder.copyOnWrite();
            auak auakVar6 = (auak) aihfVarCreateBuilder.instance;
            auam auamVar11 = (auam) aihfVarCreateBuilder4.build();
            auamVar11.getClass();
            auakVar6.c = auamVar11;
            auakVar6.b |= 1;
            aihf aihfVarCreateBuilder5 = auamVar8.createBuilder();
            aihfVarCreateBuilder5.copyOnWrite();
            auam auamVar12 = (auam) aihfVarCreateBuilder5.instance;
            auamVar12.b |= 1;
            auamVar12.c = f2;
            aihfVarCreateBuilder5.copyOnWrite();
            auam auamVar13 = (auam) aihfVarCreateBuilder5.instance;
            auamVar13.b |= 2;
            auamVar13.d = 1.0f;
            aihfVarCreateBuilder.copyOnWrite();
            auak auakVar7 = (auak) aihfVarCreateBuilder.instance;
            auam auamVar14 = (auam) aihfVarCreateBuilder5.build();
            auamVar14.getClass();
            auakVar7.d = auamVar14;
            auakVar7.b |= 2;
        }
        if (uqpVar != null) {
            akgx akgxVar = uqpVar.a;
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (Math.abs(f2 - 0.5f) < 0.01f) {
                                for (akgv akgvVar : akgxVar.g) {
                                    if (Math.abs(akgvVar.c - 0.5f) < 0.01f) {
                                        d(akgvVar, aihfVarCreateBuilder);
                                        break;
                                    }
                                }
                            }
                        } else if ((akgxVar.b & 2) != 0) {
                            akgv akgvVar2 = akgxVar.d;
                            if (akgvVar2 == null) {
                                akgvVar2 = akgv.a;
                            }
                            d(akgvVar2, aihfVarCreateBuilder);
                        }
                    } else if ((akgxVar.b & 1) != 0) {
                        akgv akgvVar3 = akgxVar.c;
                        if (akgvVar3 == null) {
                            akgvVar3 = akgv.a;
                        }
                        d(akgvVar3, aihfVarCreateBuilder);
                    }
                } else if ((akgxVar.b & 8) != 0) {
                    akgv akgvVar4 = akgxVar.f;
                    if (akgvVar4 == null) {
                        akgvVar4 = akgv.a;
                    }
                    d(akgvVar4, aihfVarCreateBuilder);
                }
            } else if ((akgxVar.b & 4) != 0) {
                akgv akgvVar5 = akgxVar.e;
                if (akgvVar5 == null) {
                    akgvVar5 = akgv.a;
                }
                d(akgvVar5, aihfVarCreateBuilder);
            }
        }
        return (auak) aihfVarCreateBuilder.build();
    }

    public static Optional c(uqp uqpVar, int i, float f, int i2, int i3, Range range, int i4, Rect rect, boolean z) {
        int iHeight;
        int iHeight2;
        int i5 = ((int) (i2 * f)) - i;
        boolean z2 = false;
        if (z && Math.abs(i5) <= i3) {
            z2 = true;
        }
        if (!range.contains(Integer.valueOf(i5))) {
            return Optional.empty();
        }
        auak auakVarB = b(uqpVar, i4, i5, z2, f);
        int i6 = i4 - 1;
        if (i6 == 3) {
            akgx akgxVar = uqpVar.a;
            akgv akgvVar = akgxVar.e;
            if (akgvVar == null) {
                akgvVar = akgv.a;
            }
            int iAX = a.aX(akgvVar.d);
            if (iAX == 0) {
                iAX = 1;
            }
            int i7 = iAX - 1;
            if (i7 != 3) {
                if (i7 != 4) {
                    agrc agrcVar = (agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/gesture/GuidelineDataCreator", "calculateSnapDistance", 134, "GuidelineDataCreator.java");
                    String strC = atxy.c(i4);
                    akgv akgvVar2 = akgxVar.e;
                    if (akgvVar2 == null) {
                        akgvVar2 = akgv.a;
                    }
                    int iAX2 = a.aX(akgvVar2.d);
                    agrcVar.B("%s doesn't support given snap direction %s", strC, afxw.af(iAX2 != 0 ? iAX2 : 1));
                } else {
                    iHeight = rect.height();
                    i5 -= iHeight;
                }
            }
        } else if (i6 == 4) {
            akgx akgxVar2 = uqpVar.a;
            akgv akgvVar3 = akgxVar2.f;
            if (akgvVar3 == null) {
                akgvVar3 = akgv.a;
            }
            int iAX3 = a.aX(akgvVar3.d);
            if (iAX3 == 0) {
                iAX3 = 1;
            }
            int i8 = iAX3 - 1;
            if (i8 == 3) {
                iHeight2 = rect.height();
                i5 += iHeight2;
            } else if (i8 != 4) {
                agrc agrcVar2 = (agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/gesture/GuidelineDataCreator", "calculateSnapDistance", 147, "GuidelineDataCreator.java");
                String strC2 = atxy.c(i4);
                akgv akgvVar4 = akgxVar2.f;
                if (akgvVar4 == null) {
                    akgvVar4 = akgv.a;
                }
                int iAX4 = a.aX(akgvVar4.d);
                agrcVar2.B("%s doesn't support given snap direction %s", strC2, afxw.af(iAX4 != 0 ? iAX4 : 1));
            }
        } else if (i6 == 5) {
            akgx akgxVar3 = uqpVar.a;
            akgv akgvVar5 = akgxVar3.c;
            if (akgvVar5 == null) {
                akgvVar5 = akgv.a;
            }
            int iAX5 = a.aX(akgvVar5.d);
            if (iAX5 == 0) {
                iAX5 = 1;
            }
            int i9 = iAX5 - 1;
            if (i9 == 5) {
                iHeight = rect.width();
                i5 -= iHeight;
            } else if (i9 != 6) {
                agrc agrcVar3 = (agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/gesture/GuidelineDataCreator", "calculateSnapDistance", 100, "GuidelineDataCreator.java");
                String strC3 = atxy.c(i4);
                akgv akgvVar6 = akgxVar3.c;
                if (akgvVar6 == null) {
                    akgvVar6 = akgv.a;
                }
                int iAX6 = a.aX(akgvVar6.d);
                agrcVar3.B("%s doesn't support given snap direction %s", strC3, afxw.af(iAX6 != 0 ? iAX6 : 1));
            }
        } else if (i6 == 6) {
            akgx akgxVar4 = uqpVar.a;
            akgv akgvVar7 = akgxVar4.d;
            if (akgvVar7 == null) {
                akgvVar7 = akgv.a;
            }
            int iAX7 = a.aX(akgvVar7.d);
            if (iAX7 == 0) {
                iAX7 = 1;
            }
            int i10 = iAX7 - 1;
            if (i10 != 5) {
                if (i10 != 6) {
                    agrc agrcVar4 = (agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/gesture/GuidelineDataCreator", "calculateSnapDistance", 117, "GuidelineDataCreator.java");
                    String strC4 = atxy.c(i4);
                    akgv akgvVar8 = akgxVar4.d;
                    if (akgvVar8 == null) {
                        akgvVar8 = akgv.a;
                    }
                    int iAX8 = a.aX(akgvVar8.d);
                    agrcVar4.B("%s doesn't support given snap direction %s", strC4, afxw.af(iAX8 != 0 ? iAX8 : 1));
                } else {
                    iHeight2 = rect.width();
                    i5 += iHeight2;
                }
            }
        }
        return Optional.of(new uqn(auakVarB, i5));
    }

    private static void d(akgv akgvVar, aihf aihfVar) {
        if ((akgvVar.b & 4) != 0) {
            aihf aihfVarCreateBuilder = aual.a.createBuilder();
            akgu akguVar = akgvVar.e;
            if (akguVar == null) {
                akguVar = akgu.a;
            }
            if ((akguVar.b & 2) != 0) {
                akgu akguVar2 = akgvVar.e;
                if (akguVar2 == null) {
                    akguVar2 = akgu.a;
                }
                int i = akguVar2.d;
                aihfVarCreateBuilder.copyOnWrite();
                aual aualVar = (aual) aihfVarCreateBuilder.instance;
                aualVar.b |= 1;
                aualVar.c = i;
            }
            akgu akguVar3 = akgvVar.e;
            if (((akguVar3 == null ? akgu.a : akguVar3).b & 1) != 0) {
                if (akguVar3 == null) {
                    akguVar3 = akgu.a;
                }
                float f = akguVar3.c;
                aihfVarCreateBuilder.copyOnWrite();
                aual aualVar2 = (aual) aihfVarCreateBuilder.instance;
                aualVar2.b |= 2;
                aualVar2.d = f;
            }
            aihfVar.copyOnWrite();
            auak auakVar = (auak) aihfVar.instance;
            aual aualVar3 = (aual) aihfVarCreateBuilder.build();
            auak auakVar2 = auak.a;
            aualVar3.getClass();
            auakVar.h = aualVar3;
            auakVar.b |= 32;
        }
    }
}
