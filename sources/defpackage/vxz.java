package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import j$.util.DesugarCollections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vxz {
    private static final byte[] e = new byte[0];
    public final vyo a;
    public final int b;
    public final int c;
    protected final vxu d;
    private final int f;
    private final int g;
    private final int h;

    public vxz(vxu vxuVar, vyo vyoVar, String str) {
        int i;
        this.d = vxuVar;
        this.a = vyoVar;
        if (str == null) {
            i = 0;
        } else {
            boolean z = vyl.c.b;
            i = -100000;
        }
        this.f = i;
        this.g = i;
        this.h = i;
        this.b = i;
        this.c = i;
    }

    public final double a(int i, long j, double d) {
        if (this.h + i >= 0) {
            boolean z = vyl.c.b;
        }
        boolean z2 = vyl.c.b;
        vxu vxuVar = this.d;
        if (vxuVar == null) {
            return d;
        }
        akww akwwVar = vxuVar.c().u;
        if (akwwVar == null) {
            akwwVar = akww.a;
        }
        akwwVar.getClass();
        akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVar.c).get(Long.valueOf(j));
        if (akwxVar == null) {
            return d;
        }
        if (akwxVar.b == 4) {
            return ((Double) akwxVar.c).doubleValue();
        }
        return 0.0d;
    }

    public final double b(int i, long j) {
        if (this.h + i >= 0) {
            boolean z = vyl.c.b;
        }
        boolean z2 = vyl.c.b;
        if (this.a == null) {
            return 0.0d;
        }
        akww akwwVarI = i();
        akwwVarI.getClass();
        akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVarI.c).get(Long.valueOf(j));
        if (akwxVar == null || akwxVar.b != 4) {
            return 0.0d;
        }
        return ((Double) akwxVar.c).doubleValue();
    }

    public final long c(int i, long j, long j2) {
        if (this.g + i >= 0) {
            boolean z = vyl.c.b;
        }
        boolean z2 = vyl.c.b;
        vxu vxuVar = this.d;
        if (vxuVar == null) {
            return j2;
        }
        akww akwwVar = vxuVar.c().u;
        if (akwwVar == null) {
            akwwVar = akww.a;
        }
        akwwVar.getClass();
        akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVar.c).get(Long.valueOf(j));
        if (akwxVar == null) {
            return j2;
        }
        if (akwxVar.b == 2) {
            return ((Long) akwxVar.c).longValue();
        }
        return 0L;
    }

    public final long d(int i, long j) {
        if (this.g + i >= 0) {
            boolean z = vyl.c.b;
        }
        boolean z2 = vyl.c.b;
        if (this.a == null) {
            return 0L;
        }
        akww akwwVarI = i();
        akwwVarI.getClass();
        akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVarI.c).get(Long.valueOf(j));
        if (akwxVar == null || akwxVar.b != 2) {
            return 0L;
        }
        return ((Long) akwxVar.c).longValue();
    }

    public final aini e(int i, long j) {
        aigj aigjVar;
        Object objInvoke;
        Object objInvoke2;
        if (this.c + i >= 0) {
            vyl.d();
        }
        vyl.d();
        if (this.a == null) {
            byte[] bArr = e;
            vyb vybVar = vyb.a;
            objInvoke2 = aini.a;
            try {
                aigj aigjVarV = aigj.v(bArr);
                aigjVarV.getClass();
                ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                generatedRegistry.getClass();
                objInvoke2 = vybVar.invoke(aigjVarV, generatedRegistry);
            } catch (aiik e2) {
                twu.d("ExperimentFlagUtil", 6, "Unable to parse default value of proto typed experiment flag: ".concat(String.valueOf(e2.getMessage())), null);
            }
            objInvoke2.getClass();
        } else {
            akww akwwVarI = i();
            byte[] bArr2 = e;
            akwwVarI.getClass();
            akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVarI.c).get(Long.valueOf(j));
            if (akwxVar != null) {
                aigjVar = akwxVar.b == 5 ? (aigj) akwxVar.c : aigj.d;
            } else {
                aigjVar = null;
            }
            vya vyaVar = vya.a;
            aini ainiVar = aini.a;
            if (aigjVar != null) {
                try {
                    ExtensionRegistryLite generatedRegistry2 = ExtensionRegistryLite.getGeneratedRegistry();
                    generatedRegistry2.getClass();
                    objInvoke = vyaVar.invoke(aigjVar, generatedRegistry2);
                } catch (aiik e3) {
                    twu.d("ExperimentFlagUtil", 6, "Unable to parse proto typed experiment flag: ".concat(String.valueOf(e3.getMessage())), null);
                    try {
                        aigj aigjVarV2 = aigj.v(bArr2);
                        aigjVarV2.getClass();
                        ExtensionRegistryLite generatedRegistry3 = ExtensionRegistryLite.getGeneratedRegistry();
                        generatedRegistry3.getClass();
                        objInvoke = vyaVar.invoke(aigjVarV2, generatedRegistry3);
                    } catch (aiik e4) {
                        twu.d("ExperimentFlagUtil", 6, "Unable to parse default value of proto typed experiment flag: ".concat(String.valueOf(e4.getMessage())), null);
                        objInvoke2 = ainiVar;
                    }
                }
            } else {
                aigj aigjVarV3 = aigj.v(bArr2);
                aigjVarV3.getClass();
                ExtensionRegistryLite generatedRegistry4 = ExtensionRegistryLite.getGeneratedRegistry();
                generatedRegistry4.getClass();
                objInvoke = vyaVar.invoke(aigjVarV3, generatedRegistry4);
            }
            objInvoke2 = objInvoke;
            objInvoke2.getClass();
        }
        return (aini) objInvoke2;
    }

    public final aink f(int i, long j, byte[] bArr) {
        aigj aigjVar;
        Object objInvoke;
        Object objInvoke2;
        if (this.c + i >= 0) {
            boolean z = vyl.c.b;
        }
        boolean z2 = vyl.c.b;
        vxu vxuVar = this.d;
        if (vxuVar == null) {
            vyf vyfVar = vyf.a;
            objInvoke2 = aink.a;
            try {
                aigj aigjVar2 = aigj.d;
                try {
                    aigj aigjVarH = aigj.H(bArr, 0, bArr.length);
                    aigjVarH.getClass();
                    ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                    generatedRegistry.getClass();
                    objInvoke2 = vyfVar.invoke(aigjVarH, generatedRegistry);
                } catch (aiik e2) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                }
            } catch (aiik e3) {
                twu.d("ExperimentFlagUtil", 6, "Unable to parse default value of proto typed experiment flag: ".concat(String.valueOf(e3.getMessage())), null);
            }
            objInvoke2.getClass();
        } else {
            akww akwwVar = vxuVar.c().u;
            if (akwwVar == null) {
                akwwVar = akww.a;
            }
            akwwVar.getClass();
            akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVar.c).get(Long.valueOf(j));
            if (akwxVar != null) {
                aigjVar = akwxVar.b == 5 ? (aigj) akwxVar.c : aigj.d;
            } else {
                aigjVar = null;
            }
            vye vyeVar = vye.a;
            aink ainkVar = aink.a;
            if (aigjVar != null) {
                try {
                    ExtensionRegistryLite generatedRegistry2 = ExtensionRegistryLite.getGeneratedRegistry();
                    generatedRegistry2.getClass();
                    objInvoke = vyeVar.invoke(aigjVar, generatedRegistry2);
                } catch (aiik e4) {
                    twu.d("ExperimentFlagUtil", 6, "Unable to parse proto typed experiment flag: ".concat(String.valueOf(e4.getMessage())), null);
                    try {
                        aigj aigjVar3 = aigj.d;
                        try {
                            aigj aigjVarH2 = aigj.H(bArr, 0, bArr.length);
                            aigjVarH2.getClass();
                            ExtensionRegistryLite generatedRegistry3 = ExtensionRegistryLite.getGeneratedRegistry();
                            generatedRegistry3.getClass();
                            objInvoke = vyeVar.invoke(aigjVarH2, generatedRegistry3);
                        } catch (aiik e5) {
                            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e5);
                        }
                    } catch (aiik e6) {
                        twu.d("ExperimentFlagUtil", 6, "Unable to parse default value of proto typed experiment flag: ".concat(String.valueOf(e6.getMessage())), null);
                        objInvoke2 = ainkVar;
                    }
                }
            } else {
                aigj aigjVar4 = aigj.d;
                aigj aigjVarH3 = aigj.H(bArr, 0, bArr.length);
                aigjVarH3.getClass();
                ExtensionRegistryLite generatedRegistry4 = ExtensionRegistryLite.getGeneratedRegistry();
                generatedRegistry4.getClass();
                objInvoke = vyeVar.invoke(aigjVarH3, generatedRegistry4);
            }
            objInvoke2 = objInvoke;
            objInvoke2.getClass();
        }
        return (aink) objInvoke2;
    }

    public final aink g(long j) {
        aigj aigjVar;
        boolean z = vyl.c.b;
        if (this.a == null) {
            vyf vyfVar = vyf.a;
            Object objInvoke = aink.a;
            try {
                aigj aigjVar2 = aigj.d;
                try {
                    aigj aigjVar3 = aigj.d;
                    aigjVar3.getClass();
                    ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                    generatedRegistry.getClass();
                    objInvoke = vyfVar.invoke(aigjVar3, generatedRegistry);
                } catch (aiik e2) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                }
            } catch (aiik e3) {
                twu.d("ExperimentFlagUtil", 6, "Unable to parse default value of proto typed experiment flag: ".concat(String.valueOf(e3.getMessage())), null);
            }
            objInvoke.getClass();
            return (aink) objInvoke;
        }
        akww akwwVarI = i();
        akwwVarI.getClass();
        akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVarI.c).get(Long.valueOf(j));
        if (akwxVar != null) {
            aigjVar = akwxVar.b == 5 ? (aigj) akwxVar.c : aigj.d;
        } else {
            aigjVar = null;
        }
        vye vyeVar = vye.a;
        Object objInvoke2 = aink.a;
        if (aigjVar != null) {
            try {
                ExtensionRegistryLite generatedRegistry2 = ExtensionRegistryLite.getGeneratedRegistry();
                generatedRegistry2.getClass();
                objInvoke2 = vyeVar.invoke(aigjVar, generatedRegistry2);
            } catch (aiik e4) {
                twu.d("ExperimentFlagUtil", 6, "Unable to parse proto typed experiment flag: ".concat(String.valueOf(e4.getMessage())), null);
                try {
                    aigj aigjVar4 = aigj.d;
                    try {
                        aigj aigjVar5 = aigj.d;
                        aigjVar5.getClass();
                        ExtensionRegistryLite generatedRegistry3 = ExtensionRegistryLite.getGeneratedRegistry();
                        generatedRegistry3.getClass();
                        objInvoke2 = vyeVar.invoke(aigjVar5, generatedRegistry3);
                    } catch (aiik e5) {
                        throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e5);
                    }
                } catch (aiik e6) {
                    twu.d("ExperimentFlagUtil", 6, "Unable to parse default value of proto typed experiment flag: ".concat(String.valueOf(e6.getMessage())), null);
                }
            }
        } else {
            aigj aigjVar6 = aigj.d;
            aigj aigjVar7 = aigj.d;
            aigjVar7.getClass();
            ExtensionRegistryLite generatedRegistry4 = ExtensionRegistryLite.getGeneratedRegistry();
            generatedRegistry4.getClass();
            objInvoke2 = vyeVar.invoke(aigjVar7, generatedRegistry4);
        }
        objInvoke2.getClass();
        return (aink) objInvoke2;
    }

    public final aink h(int i, long j) {
        if (this.c + i >= 0) {
            boolean z = vyl.c.b;
        }
        return g(j);
    }

    final akww i() {
        akww akwwVar = this.a.b().v;
        return akwwVar == null ? akww.a : akwwVar;
    }

    public final String j(int i, long j) {
        if (this.b + i >= 0) {
            vyl.d();
        }
        vyl.d();
        if (this.a == null) {
            return "";
        }
        akww akwwVarI = i();
        akwwVarI.getClass();
        akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVarI.c).get(Long.valueOf(j));
        if (akwxVar == null) {
            return "";
        }
        String str = akwxVar.b == 3 ? (String) akwxVar.c : "";
        return str != null ? str : "";
    }

    public final boolean k(long j, boolean z) {
        boolean z2 = vyl.c.b;
        vxu vxuVar = this.d;
        if (vxuVar == null) {
            return z;
        }
        akww akwwVar = vxuVar.c().u;
        if (akwwVar == null) {
            akwwVar = akww.a;
        }
        akwwVar.getClass();
        akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVar.c).get(Long.valueOf(j));
        if (akwxVar == null) {
            return z;
        }
        if (akwxVar.b == 1) {
            return ((Boolean) akwxVar.c).booleanValue();
        }
        return false;
    }

    public final boolean l(int i, long j, boolean z) {
        if (this.f + i >= 0) {
            boolean z2 = vyl.c.b;
        }
        return k(j, z);
    }

    public final boolean m(int i, long j) {
        if (this.f + i >= 0) {
            boolean z = vyl.c.b;
        }
        boolean z2 = vyl.c.b;
        if (this.a == null) {
            return false;
        }
        akww akwwVarI = i();
        akwwVarI.getClass();
        akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVarI.c).get(Long.valueOf(j));
        if (akwxVar == null || akwxVar.b != 1) {
            return false;
        }
        return ((Boolean) akwxVar.c).booleanValue();
    }

    public final String n(int i, long j) {
        if (this.b + i >= 0) {
            boolean z = vyl.c.b;
        }
        boolean z2 = vyl.c.b;
        vxu vxuVar = this.d;
        if (vxuVar == null) {
            return "";
        }
        akww akwwVar = vxuVar.c().u;
        if (akwwVar == null) {
            akwwVar = akww.a;
        }
        akwwVar.getClass();
        akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVar.c).get(Long.valueOf(j));
        if (akwxVar == null) {
            return "";
        }
        String str = akwxVar.b == 3 ? (String) akwxVar.c : "";
        return str != null ? str : "";
    }

    public final ainj o() {
        aigj aigjVar;
        Object objInvoke;
        Object objInvoke2;
        if (this.c >= 0) {
            vyl.d();
        }
        vyl.d();
        if (this.a == null) {
            byte[] bArr = e;
            vyd vydVar = vyd.a;
            objInvoke = ainj.a;
            try {
                aigj aigjVarV = aigj.v(bArr);
                aigjVarV.getClass();
                ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                generatedRegistry.getClass();
                objInvoke = vydVar.invoke(aigjVarV, generatedRegistry);
            } catch (aiik e2) {
                twu.d("ExperimentFlagUtil", 6, "Unable to parse default value of proto typed experiment flag: ".concat(String.valueOf(e2.getMessage())), null);
            }
            objInvoke.getClass();
        } else {
            akww akwwVarI = i();
            byte[] bArr2 = e;
            akwwVarI.getClass();
            akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVarI.c).get(45624040L);
            if (akwxVar != null) {
                aigjVar = akwxVar.b == 5 ? (aigj) akwxVar.c : aigj.d;
            } else {
                aigjVar = null;
            }
            vyc vycVar = vyc.a;
            ainj ainjVar = ainj.a;
            if (aigjVar != null) {
                try {
                    ExtensionRegistryLite generatedRegistry2 = ExtensionRegistryLite.getGeneratedRegistry();
                    generatedRegistry2.getClass();
                    objInvoke2 = vycVar.invoke(aigjVar, generatedRegistry2);
                } catch (aiik e3) {
                    twu.d("ExperimentFlagUtil", 6, "Unable to parse proto typed experiment flag: ".concat(String.valueOf(e3.getMessage())), null);
                    try {
                        aigj aigjVarV2 = aigj.v(bArr2);
                        aigjVarV2.getClass();
                        ExtensionRegistryLite generatedRegistry3 = ExtensionRegistryLite.getGeneratedRegistry();
                        generatedRegistry3.getClass();
                        objInvoke2 = vycVar.invoke(aigjVarV2, generatedRegistry3);
                    } catch (aiik e4) {
                        twu.d("ExperimentFlagUtil", 6, "Unable to parse default value of proto typed experiment flag: ".concat(String.valueOf(e4.getMessage())), null);
                        objInvoke = ainjVar;
                    }
                }
            } else {
                aigj aigjVarV3 = aigj.v(bArr2);
                aigjVarV3.getClass();
                ExtensionRegistryLite generatedRegistry4 = ExtensionRegistryLite.getGeneratedRegistry();
                generatedRegistry4.getClass();
                objInvoke2 = vycVar.invoke(aigjVarV3, generatedRegistry4);
            }
            objInvoke = objInvoke2;
            objInvoke.getClass();
        }
        return (ainj) objInvoke;
    }

    public final avlr p(int i, long j) {
        if (this.f + i >= 0) {
            boolean z = vyl.c.b;
        }
        boolean z2 = vyl.c.b;
        vyo vyoVar = this.a;
        if (vyoVar != null) {
            return vyoVar.d().K(new vxy(j, 0)).r();
        }
        awdh awdhVar = new awdh(Boolean.FALSE);
        avnn avnnVar = atqp.l;
        return awdhVar;
    }

    public final aini q(int i, long j) {
        aigj aigjVar;
        Object objInvoke;
        Object objInvoke2;
        if (this.c + i >= 0) {
            boolean z = vyl.c.b;
        }
        boolean z2 = vyl.c.b;
        vxu vxuVar = this.d;
        if (vxuVar == null) {
            vyb vybVar = vyb.a;
            objInvoke2 = aini.a;
            try {
                aigj aigjVar2 = aigj.d;
                try {
                    aigj aigjVar3 = aigj.d;
                    aigjVar3.getClass();
                    ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                    generatedRegistry.getClass();
                    objInvoke2 = vybVar.invoke(aigjVar3, generatedRegistry);
                } catch (aiik e2) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                }
            } catch (aiik e3) {
                twu.d("ExperimentFlagUtil", 6, "Unable to parse default value of proto typed experiment flag: ".concat(String.valueOf(e3.getMessage())), null);
            }
            objInvoke2.getClass();
        } else {
            akww akwwVar = vxuVar.c().u;
            if (akwwVar == null) {
                akwwVar = akww.a;
            }
            akwwVar.getClass();
            akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVar.c).get(Long.valueOf(j));
            if (akwxVar != null) {
                aigjVar = akwxVar.b == 5 ? (aigj) akwxVar.c : aigj.d;
            } else {
                aigjVar = null;
            }
            vya vyaVar = vya.a;
            aini ainiVar = aini.a;
            if (aigjVar != null) {
                try {
                    ExtensionRegistryLite generatedRegistry2 = ExtensionRegistryLite.getGeneratedRegistry();
                    generatedRegistry2.getClass();
                    objInvoke = vyaVar.invoke(aigjVar, generatedRegistry2);
                } catch (aiik e4) {
                    twu.d("ExperimentFlagUtil", 6, "Unable to parse proto typed experiment flag: ".concat(String.valueOf(e4.getMessage())), null);
                    try {
                        aigj aigjVar4 = aigj.d;
                        try {
                            aigj aigjVar5 = aigj.d;
                            aigjVar5.getClass();
                            ExtensionRegistryLite generatedRegistry3 = ExtensionRegistryLite.getGeneratedRegistry();
                            generatedRegistry3.getClass();
                            objInvoke = vyaVar.invoke(aigjVar5, generatedRegistry3);
                        } catch (aiik e5) {
                            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e5);
                        }
                    } catch (aiik e6) {
                        twu.d("ExperimentFlagUtil", 6, "Unable to parse default value of proto typed experiment flag: ".concat(String.valueOf(e6.getMessage())), null);
                        objInvoke2 = ainiVar;
                    }
                }
            } else {
                aigj aigjVar6 = aigj.d;
                aigj aigjVar7 = aigj.d;
                aigjVar7.getClass();
                ExtensionRegistryLite generatedRegistry4 = ExtensionRegistryLite.getGeneratedRegistry();
                generatedRegistry4.getClass();
                objInvoke = vyaVar.invoke(aigjVar7, generatedRegistry4);
            }
            objInvoke2 = objInvoke;
            objInvoke2.getClass();
        }
        return (aini) objInvoke2;
    }
}
