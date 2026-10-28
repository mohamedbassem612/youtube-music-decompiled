package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acfq {
    private final ahbw a;
    private final awmd b;

    static {
        twu.b("PlaybackStartPositionResolver");
    }

    public acfq(ahbw ahbwVar, abmt abmtVar, awmd awmdVar) {
        ahbwVar.getClass();
        abmtVar.getClass();
        this.a = ahbwVar;
        this.b = awmdVar;
    }

    private static final Long b(wjf wjfVar) {
        wiu wiuVarF;
        if (wjfVar == null || (wiuVarF = wjfVar.f()) == null) {
            return null;
        }
        if (true != wiuVarF.ap()) {
            wiuVarF = null;
        }
        if (wiuVarF != null) {
            return Long.valueOf(wiuVarF.v());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01da  */
    /* JADX WARN: Code duplicated, block: B:101:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:118:0x0249  */
    /* JADX WARN: Code duplicated, block: B:119:0x025a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0275  */
    /* JADX WARN: Code duplicated, block: B:122:0x0278  */
    /* JADX WARN: Code duplicated, block: B:124:0x027e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0284  */
    /* JADX WARN: Code duplicated, block: B:129:0x0292  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Code duplicated, block: B:64:0x0146  */
    /* JADX WARN: Code duplicated, block: B:66:0x0149  */
    /* JADX WARN: Code duplicated, block: B:75:0x0160  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:79:0x016c  */
    /* JADX WARN: Code duplicated, block: B:81:0x016f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0176  */
    /* JADX WARN: Code duplicated, block: B:84:0x0179  */
    /* JADX WARN: Code duplicated, block: B:85:0x017e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0184  */
    /* JADX WARN: Code duplicated, block: B:89:0x018b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0190  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    /* JADX WARN: Code duplicated, block: B:95:0x019a  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c7  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, wbz] */
    public final Long a(abnl abnlVar, wjf wjfVar, awqk awqkVar) {
        String strW;
        abnl abnlVar2;
        Long lValueOf;
        long jLongValue;
        ahbw ahbwVar;
        Instant instantA;
        axlj axljVar;
        abmt abmtVar;
        wjf wjfVar2;
        aret aretVar;
        Duration durationS;
        areu areuVar;
        areu areuVar2;
        long jI;
        arev arevVar;
        Long lValueOf2;
        Instant instantOfEpochMilli;
        Instant instantY;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        wiu wiuVarF;
        Boolean boolValueOf;
        alvt alvtVarU;
        aoqd aoqdVar;
        ajui ajuiVar;
        String strG = wjfVar != null ? wjfVar.G() : null;
        if (strG == null || strG.length() == 0) {
            if (abnlVar != null) {
                strW = abnlVar.w();
            } else {
                strW = null;
                abnlVar2 = null;
            }
            if (strW != null || strW.length() == 0) {
                lValueOf = null;
            } else if (abnlVar2 == null) {
                ahbwVar = this.a;
                instantA = ahbwVar.a();
                instantA.getClass();
                Object objIo = this.b.io();
                objIo.getClass();
                axljVar = (axlj) objIo;
                abmtVar = (abmt) axljVar.b;
                if (abmtVar.aB()) {
                    if (wjfVar != null) {
                        alvtVarU = wjfVar.u();
                        if (alvtVarU == null) {
                            wjfVar2 = wjfVar;
                            boolValueOf = null;
                        } else {
                            aoqdVar = alvtVarU.e;
                            if (aoqdVar == null) {
                                aoqdVar = aoqd.a;
                            }
                            if (aoqdVar == null) {
                                wjfVar2 = wjfVar;
                                boolValueOf = null;
                            } else {
                                ajuiVar = aoqdVar.L;
                                if (ajuiVar == null) {
                                    ajuiVar = ajui.a;
                                }
                                if (ajuiVar != null) {
                                    boolValueOf = Boolean.valueOf(ajuiVar.b);
                                    wjfVar2 = wjfVar;
                                } else {
                                    wjfVar2 = wjfVar;
                                    boolValueOf = null;
                                }
                            }
                        }
                    } else {
                        boolValueOf = null;
                        wjfVar2 = null;
                    }
                    if (wjfVar2 == null && !awrc.c(boolValueOf, Boolean.TRUE)) {
                        areuVar2 = null;
                    }
                    if (wjfVar != null || (wiuVarF = wjfVar.f()) == null) {
                        arevVar = null;
                    } else {
                        aopd aopdVar = wiuVarF.d.h;
                        if (aopdVar == null) {
                            aopdVar = aopd.a;
                        }
                        if (aopdVar != null) {
                            arevVar = aopdVar.c;
                            if (arevVar == null) {
                                arevVar = arev.a;
                            }
                        } else {
                            arevVar = null;
                        }
                    }
                    Locale locale = Locale.US;
                    if (areuVar2 != null) {
                        lValueOf2 = Long.valueOf(areuVar2.f);
                    } else {
                        lValueOf2 = null;
                    }
                    if (areuVar2 != null) {
                        instantOfEpochMilli = Instant.ofEpochMilli(areuVar2.g);
                    } else {
                        instantOfEpochMilli = null;
                    }
                    if (wjfVar != null) {
                        instantY = wjfVar.y();
                    } else {
                        instantY = null;
                    }
                    if (arevVar != null) {
                        lValueOf3 = Long.valueOf(arevVar.c);
                    } else {
                        lValueOf3 = null;
                    }
                    if (arevVar != null) {
                        lValueOf4 = Long.valueOf(arevVar.e);
                    } else {
                        lValueOf4 = null;
                    }
                    if (abnlVar2 != null) {
                        lValueOf5 = Long.valueOf(abnlVar2.c());
                    } else {
                        lValueOf5 = null;
                    }
                    String.format(locale, "\n          clientPlaybackStartPosition=%d,\n          lastUpdatedClientTimestamp=%s,\n          playerResponseReceivedTimestamp=%s,\n          playerResponseStartPosition=%d,\n          playerResponseStartPositionRelativeFreshness=%d,\n          watchEndpointStartPosition=%d", Arrays.copyOf(new Object[]{lValueOf2, instantOfEpochMilli, instantY, lValueOf3, lValueOf4, lValueOf5}, 6)).getClass();
                    if (areuVar2 == null) {
                        aawr.a(awqkVar, new acgt(null, wjfVar, 3, null, ahbwVar));
                        lValueOf = b(wjfVar);
                    } else if (wjfVar == null && wjfVar.a() == 0) {
                        aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 3, null, ahbwVar));
                        lValueOf = b(wjfVar);
                    } else if (arevVar != null || (arevVar.b & 4) == 0) {
                        aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                        lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                    } else {
                        long j = arevVar.e;
                        if (j != 0 && j > 0) {
                            long j2 = areuVar2.g;
                            Instant instantY2 = wjfVar.y();
                            if (j2 > (instantY2 == null ? instantA : instantY2).minusSeconds(arevVar.e).toEpochMilli()) {
                                aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                                lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                            } else {
                                aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 3, null, ahbwVar));
                                lValueOf = b(wjfVar);
                            }
                        } else {
                            aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 3, null, ahbwVar));
                            lValueOf = b(wjfVar);
                        }
                    }
                } else {
                    wjfVar2 = wjfVar;
                }
                aretVar = (aret) axljVar.c.b(axljVar.a.e()).g(wfs.g(areu.b.a(), strW)).g(aret.class).E();
                if (aretVar != null) {
                    durationS = abmtVar.s();
                    durationS.getClass();
                    if (true == ugi.f(aretVar, instantA, durationS)) {
                        aretVar = null;
                    }
                    if (aretVar != null) {
                        areuVar = aretVar.c;
                        if ((areuVar.c & 4) != 0) {
                            aihf builder = areuVar.toBuilder();
                            jI = (wjfVar2 == null && aretVar.getLastPlaybackPositionSeconds().longValue() + abmtVar.j.c(22, 45705707L, 0L) > ((long) wjfVar2.a())) ? 0L : axljVar.I(aretVar.getLastPlaybackPositionSeconds().longValue());
                            builder.copyOnWrite();
                            areu areuVar3 = (areu) builder.instance;
                            areuVar3.c |= 4;
                            areuVar3.f = jI;
                            aihn aihnVarBuild = builder.build();
                            aihnVarBuild.getClass();
                            areuVar = (areu) aihnVarBuild;
                        } else {
                            areuVar.getClass();
                        }
                        areuVar2 = areuVar;
                    } else {
                        areuVar2 = null;
                    }
                } else {
                    areuVar2 = null;
                }
                if (wjfVar != null) {
                    arevVar = null;
                } else {
                    arevVar = null;
                }
                Locale locale2 = Locale.US;
                if (areuVar2 != null) {
                    lValueOf2 = Long.valueOf(areuVar2.f);
                } else {
                    lValueOf2 = null;
                }
                if (areuVar2 != null) {
                    instantOfEpochMilli = Instant.ofEpochMilli(areuVar2.g);
                } else {
                    instantOfEpochMilli = null;
                }
                if (wjfVar != null) {
                    instantY = wjfVar.y();
                } else {
                    instantY = null;
                }
                if (arevVar != null) {
                    lValueOf3 = Long.valueOf(arevVar.c);
                } else {
                    lValueOf3 = null;
                }
                if (arevVar != null) {
                    lValueOf4 = Long.valueOf(arevVar.e);
                } else {
                    lValueOf4 = null;
                }
                if (abnlVar2 != null) {
                    lValueOf5 = Long.valueOf(abnlVar2.c());
                } else {
                    lValueOf5 = null;
                }
                String.format(locale2, "\n          clientPlaybackStartPosition=%d,\n          lastUpdatedClientTimestamp=%s,\n          playerResponseReceivedTimestamp=%s,\n          playerResponseStartPosition=%d,\n          playerResponseStartPositionRelativeFreshness=%d,\n          watchEndpointStartPosition=%d", Arrays.copyOf(new Object[]{lValueOf2, instantOfEpochMilli, instantY, lValueOf3, lValueOf4, lValueOf5}, 6)).getClass();
                if (areuVar2 == null) {
                    aawr.a(awqkVar, new acgt(null, wjfVar, 3, null, ahbwVar));
                    lValueOf = b(wjfVar);
                } else if (wjfVar == null) {
                    if (arevVar != null) {
                        aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                        lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                    } else {
                        aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                        lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                    }
                } else if (arevVar != null) {
                    aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                    lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                } else {
                    aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                    lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                }
            } else {
                abnl abnlVar3 = true != abnlVar2.F() ? null : abnlVar2;
                if (abnlVar3 != null) {
                    aawr.a(awqkVar, new acgt(null, null, 3, null, this.a));
                    lValueOf = Long.valueOf(abnlVar3.c());
                } else {
                    ahbwVar = this.a;
                    instantA = ahbwVar.a();
                    instantA.getClass();
                    Object objIo2 = this.b.io();
                    objIo2.getClass();
                    axljVar = (axlj) objIo2;
                    abmtVar = (abmt) axljVar.b;
                    if (abmtVar.aB()) {
                        if (wjfVar != null) {
                            alvtVarU = wjfVar.u();
                            if (alvtVarU == null) {
                                wjfVar2 = wjfVar;
                                boolValueOf = null;
                            } else {
                                aoqdVar = alvtVarU.e;
                                if (aoqdVar == null) {
                                    aoqdVar = aoqd.a;
                                }
                                if (aoqdVar == null) {
                                    wjfVar2 = wjfVar;
                                    boolValueOf = null;
                                } else {
                                    ajuiVar = aoqdVar.L;
                                    if (ajuiVar == null) {
                                        ajuiVar = ajui.a;
                                    }
                                    if (ajuiVar != null) {
                                        boolValueOf = Boolean.valueOf(ajuiVar.b);
                                        wjfVar2 = wjfVar;
                                    } else {
                                        wjfVar2 = wjfVar;
                                        boolValueOf = null;
                                    }
                                }
                            }
                        } else {
                            boolValueOf = null;
                            wjfVar2 = null;
                        }
                        if (wjfVar2 == null) {
                        }
                        if (wjfVar != null) {
                            arevVar = null;
                        } else {
                            arevVar = null;
                        }
                        Locale locale3 = Locale.US;
                        if (areuVar2 != null) {
                            lValueOf2 = Long.valueOf(areuVar2.f);
                        } else {
                            lValueOf2 = null;
                        }
                        if (areuVar2 != null) {
                            instantOfEpochMilli = Instant.ofEpochMilli(areuVar2.g);
                        } else {
                            instantOfEpochMilli = null;
                        }
                        if (wjfVar != null) {
                            instantY = wjfVar.y();
                        } else {
                            instantY = null;
                        }
                        if (arevVar != null) {
                            lValueOf3 = Long.valueOf(arevVar.c);
                        } else {
                            lValueOf3 = null;
                        }
                        if (arevVar != null) {
                            lValueOf4 = Long.valueOf(arevVar.e);
                        } else {
                            lValueOf4 = null;
                        }
                        if (abnlVar2 != null) {
                            lValueOf5 = Long.valueOf(abnlVar2.c());
                        } else {
                            lValueOf5 = null;
                        }
                        String.format(locale3, "\n          clientPlaybackStartPosition=%d,\n          lastUpdatedClientTimestamp=%s,\n          playerResponseReceivedTimestamp=%s,\n          playerResponseStartPosition=%d,\n          playerResponseStartPositionRelativeFreshness=%d,\n          watchEndpointStartPosition=%d", Arrays.copyOf(new Object[]{lValueOf2, instantOfEpochMilli, instantY, lValueOf3, lValueOf4, lValueOf5}, 6)).getClass();
                        if (areuVar2 == null) {
                            aawr.a(awqkVar, new acgt(null, wjfVar, 3, null, ahbwVar));
                            lValueOf = b(wjfVar);
                        } else if (wjfVar == null) {
                            if (arevVar != null) {
                                aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                                lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                            } else {
                                aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                                lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                            }
                        } else if (arevVar != null) {
                            aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                            lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                        } else {
                            aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                            lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                        }
                    } else {
                        wjfVar2 = wjfVar;
                    }
                    aretVar = (aret) axljVar.c.b(axljVar.a.e()).g(wfs.g(areu.b.a(), strW)).g(aret.class).E();
                    if (aretVar != null) {
                        durationS = abmtVar.s();
                        durationS.getClass();
                        if (true == ugi.f(aretVar, instantA, durationS)) {
                            aretVar = null;
                        }
                        if (aretVar != null) {
                            areuVar = aretVar.c;
                            if ((areuVar.c & 4) != 0) {
                                aihf builder2 = areuVar.toBuilder();
                                if (wjfVar2 == null) {
                                    jI = axljVar.I(aretVar.getLastPlaybackPositionSeconds().longValue());
                                }
                                builder2.copyOnWrite();
                                areu areuVar4 = (areu) builder2.instance;
                                areuVar4.c |= 4;
                                areuVar4.f = jI;
                                aihn aihnVarBuild2 = builder2.build();
                                aihnVarBuild2.getClass();
                                areuVar = (areu) aihnVarBuild2;
                            } else {
                                areuVar.getClass();
                            }
                            areuVar2 = areuVar;
                        } else {
                            areuVar2 = null;
                        }
                    } else {
                        areuVar2 = null;
                    }
                    if (wjfVar != null) {
                        arevVar = null;
                    } else {
                        arevVar = null;
                    }
                    Locale locale4 = Locale.US;
                    if (areuVar2 != null) {
                        lValueOf2 = Long.valueOf(areuVar2.f);
                    } else {
                        lValueOf2 = null;
                    }
                    if (areuVar2 != null) {
                        instantOfEpochMilli = Instant.ofEpochMilli(areuVar2.g);
                    } else {
                        instantOfEpochMilli = null;
                    }
                    if (wjfVar != null) {
                        instantY = wjfVar.y();
                    } else {
                        instantY = null;
                    }
                    if (arevVar != null) {
                        lValueOf3 = Long.valueOf(arevVar.c);
                    } else {
                        lValueOf3 = null;
                    }
                    if (arevVar != null) {
                        lValueOf4 = Long.valueOf(arevVar.e);
                    } else {
                        lValueOf4 = null;
                    }
                    if (abnlVar2 != null) {
                        lValueOf5 = Long.valueOf(abnlVar2.c());
                    } else {
                        lValueOf5 = null;
                    }
                    String.format(locale4, "\n          clientPlaybackStartPosition=%d,\n          lastUpdatedClientTimestamp=%s,\n          playerResponseReceivedTimestamp=%s,\n          playerResponseStartPosition=%d,\n          playerResponseStartPositionRelativeFreshness=%d,\n          watchEndpointStartPosition=%d", Arrays.copyOf(new Object[]{lValueOf2, instantOfEpochMilli, instantY, lValueOf3, lValueOf4, lValueOf5}, 6)).getClass();
                    if (areuVar2 == null) {
                        aawr.a(awqkVar, new acgt(null, wjfVar, 3, null, ahbwVar));
                        lValueOf = b(wjfVar);
                    } else if (wjfVar == null) {
                        if (arevVar != null) {
                            aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                            lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                        } else {
                            aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                            lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                        }
                    } else if (arevVar != null) {
                        aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                        lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                    } else {
                        aawr.a(awqkVar, new acgt(areuVar2, wjfVar, 2, null, ahbwVar));
                        lValueOf = Long.valueOf(Duration.ofSeconds(areuVar2.f).toMillis());
                    }
                }
            }
            if (lValueOf != null) {
                return null;
            }
            jLongValue = lValueOf.longValue();
            if (abnlVar != null) {
                if (abnlVar.G()) {
                    jLongValue = Math.max(jLongValue, abnlVar.d());
                }
                if (abnlVar.E()) {
                    jLongValue = Math.min(jLongValue, abnlVar.b());
                }
            }
            return Long.valueOf(jLongValue);
        }
        strW = wjfVar.G();
        abnlVar2 = abnlVar;
        if (strW != null) {
            lValueOf = null;
        } else {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return null;
        }
        jLongValue = lValueOf.longValue();
        if (abnlVar != null) {
            if (abnlVar.G()) {
                jLongValue = Math.max(jLongValue, abnlVar.d());
            }
            if (abnlVar.E()) {
                jLongValue = Math.min(jLongValue, abnlVar.b());
            }
        }
        return Long.valueOf(jLongValue);
    }
}
