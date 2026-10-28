package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abnk {
    public ajwo a;
    public boolean b;
    public boolean c;
    boolean d;
    boolean e;
    Boolean f;
    public Boolean g;
    Boolean h;
    Boolean i;
    Boolean j;
    public abnh o;
    public int p;
    public jrk q;
    public String r;
    public String s;
    String t;
    public String u;
    String v;
    public long k = -1;
    long l = -1;
    long m = -1;
    public int y = 1;
    public jrj n = jrj.AUDIO_ROUTE_UNSPECIFIED;
    Optional w = Optional.empty();
    Optional x = Optional.empty();

    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0136  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143  */
    /* JADX WARN: Code duplicated, block: B:78:0x0174  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    /* JADX WARN: Code duplicated, block: B:85:0x018a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0190  */
    public final abnl a() {
        aihf builder;
        int i;
        float fFloatValue;
        float fFloatValue2;
        int i2;
        float fFloatValue3;
        this.t = "";
        jrk jrkVar = this.q;
        if (jrkVar != null && this.a == null) {
            this.a = abnl.h(jrkVar);
        }
        if (!(this.r == null && this.s == null && this.u == null) && this.q == null) {
            throw new IllegalArgumentException("Can only set videoId/playlistId/playerParams when localProto is set");
        }
        jrk jrkVar2 = this.q;
        if (jrkVar2 == null) {
            ajwo ajwoVar = this.a;
            if (ajwoVar != null) {
                builder = abnn.b(ajwoVar).toBuilder();
                aigj byteString = ajwoVar.toByteString();
                builder.copyOnWrite();
                jrk jrkVar3 = (jrk) builder.instance;
                jrkVar3.b |= 8388608;
                jrkVar3.y = byteString;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    int iAV = a.aV(((arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).p);
                    if (iAV == 0) {
                        iAV = 1;
                    }
                    this.y = iAV;
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arik.a);
                    ajwoVar.c(aihlVarCheckIsLite3);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                    this.j = Boolean.valueOf(((arij) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).y);
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arik.a);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                    this.t = ((arij) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3))).C;
                } else {
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apfp.b);
                    ajwoVar.c(aihlVarCheckIsLite5);
                    if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(apfp.b);
                        ajwoVar.c(aihlVarCheckIsLite6);
                        Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
                        apfp apfpVar = (apfp) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4));
                        int i3 = apfpVar.e;
                        if (i3 != 64) {
                            i = apfpVar.e;
                            if (i == 35) {
                                if (i == 35) {
                                    fFloatValue = ((Float) apfpVar.f).floatValue();
                                } else {
                                    fFloatValue = 0.0f;
                                }
                                if (fFloatValue > 0.0f) {
                                    if (apfpVar.e == 35) {
                                        fFloatValue2 = ((Float) apfpVar.f).floatValue();
                                    } else {
                                        fFloatValue2 = 0.0f;
                                    }
                                    this.l = Duration.ofSeconds((long) fFloatValue2).toMillis();
                                }
                            }
                        } else {
                            if ((i3 == 64 ? ((Long) apfpVar.f).longValue() : 0L) > 0) {
                                this.l = apfpVar.e == 64 ? ((Long) apfpVar.f).longValue() : 0L;
                            } else {
                                i = apfpVar.e;
                                if (i == 35) {
                                    if (i == 35) {
                                        fFloatValue = ((Float) apfpVar.f).floatValue();
                                    } else {
                                        fFloatValue = 0.0f;
                                    }
                                    if (fFloatValue > 0.0f) {
                                        if (apfpVar.e == 35) {
                                            fFloatValue2 = ((Float) apfpVar.f).floatValue();
                                        } else {
                                            fFloatValue2 = 0.0f;
                                        }
                                        this.l = Duration.ofSeconds((long) fFloatValue2).toMillis();
                                    }
                                }
                            }
                        }
                        int i4 = apfpVar.g;
                        if (i4 != 65) {
                            i2 = apfpVar.g;
                            if (i2 == 37) {
                                if (i2 == 37) {
                                    fFloatValue3 = ((Float) apfpVar.h).floatValue();
                                } else {
                                    fFloatValue3 = 0.0f;
                                }
                                if (fFloatValue3 > 0.0f) {
                                    this.m = TimeUnit.SECONDS.toMillis((long) (apfpVar.g == 37 ? ((Float) apfpVar.h).floatValue() : 0.0f));
                                }
                            }
                        } else {
                            if ((i4 == 65 ? ((Long) apfpVar.h).longValue() : 0L) > 0) {
                                this.m = apfpVar.g == 65 ? ((Long) apfpVar.h).longValue() : 0L;
                            } else {
                                i2 = apfpVar.g;
                                if (i2 == 37) {
                                    if (i2 == 37) {
                                        fFloatValue3 = ((Float) apfpVar.h).floatValue();
                                    } else {
                                        fFloatValue3 = 0.0f;
                                    }
                                    if (fFloatValue3 > 0.0f) {
                                        this.m = TimeUnit.SECONDS.toMillis((long) (apfpVar.g == 37 ? ((Float) apfpVar.h).floatValue() : 0.0f));
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                builder = jrk.a.createBuilder();
            }
        } else {
            builder = jrkVar2.toBuilder();
        }
        builder.copyOnWrite();
        jrk jrkVar4 = (jrk) builder.instance;
        jrkVar4.b |= 65536;
        jrkVar4.u = false;
        boolean z = this.b;
        builder.copyOnWrite();
        jrk jrkVar5 = (jrk) builder.instance;
        jrkVar5.b |= 67108864;
        jrkVar5.A = z;
        boolean z2 = this.c;
        builder.copyOnWrite();
        jrk jrkVar6 = (jrk) builder.instance;
        jrkVar6.b |= 33554432;
        jrkVar6.z = z2;
        boolean z3 = this.e;
        builder.copyOnWrite();
        jrk jrkVar7 = (jrk) builder.instance;
        jrkVar7.b |= 268435456;
        jrkVar7.C = z3;
        long j = this.k;
        if (j > -1) {
            builder.copyOnWrite();
            jrk jrkVar8 = (jrk) builder.instance;
            jrkVar8.b |= SemanticState.LiveRegion;
            jrkVar8.n = j;
        }
        long j2 = this.l;
        if (j2 > -1) {
            builder.copyOnWrite();
            jrk jrkVar9 = (jrk) builder.instance;
            jrkVar9.b |= SemanticState.Modal;
            jrkVar9.p = j2;
        }
        long j3 = this.m;
        if (j3 > -1) {
            builder.copyOnWrite();
            jrk jrkVar10 = (jrk) builder.instance;
            jrkVar10.b |= SemanticState.ReadOnly;
            jrkVar10.o = j3;
        }
        Boolean bool = this.f;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            builder.copyOnWrite();
            jrk jrkVar11 = (jrk) builder.instance;
            jrkVar11.b |= 16384;
            jrkVar11.s = zBooleanValue;
        }
        Boolean bool2 = this.h;
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            builder.copyOnWrite();
            jrk jrkVar12 = (jrk) builder.instance;
            jrkVar12.b |= 64;
            jrkVar12.k = zBooleanValue2;
        }
        Boolean bool3 = this.i;
        if (bool3 != null) {
            bool3.booleanValue();
            builder.copyOnWrite();
            jrk jrkVar13 = (jrk) builder.instance;
            jrkVar13.b |= SemanticState.Focused;
            jrkVar13.l = true;
        }
        Boolean bool4 = this.g;
        if (bool4 != null) {
            boolean zBooleanValue3 = bool4.booleanValue();
            builder.copyOnWrite();
            jrk jrkVar14 = (jrk) builder.instance;
            jrkVar14.b |= 32768;
            jrkVar14.t = zBooleanValue3;
        }
        String str = this.r;
        if (str != null) {
            builder.copyOnWrite();
            jrk jrkVar15 = (jrk) builder.instance;
            jrkVar15.b |= 1;
            jrkVar15.d = str;
        }
        String str2 = this.s;
        if (str2 != null) {
            builder.copyOnWrite();
            jrk jrkVar16 = (jrk) builder.instance;
            jrkVar16.b |= 2;
            jrkVar16.f = str2;
        }
        String str3 = this.u;
        if (str3 != null) {
            builder.copyOnWrite();
            jrk jrkVar17 = (jrk) builder.instance;
            jrkVar17.b |= SemanticState.Obscured;
            jrkVar17.q = str3;
        }
        jrj jrjVar = this.n;
        if (jrjVar != jrj.AUDIO_ROUTE_UNSPECIFIED) {
            builder.copyOnWrite();
            jrk jrkVar18 = (jrk) builder.instance;
            jrkVar18.D = jrjVar.d;
            jrkVar18.b |= Integer.MIN_VALUE;
        }
        Boolean bool5 = this.j;
        if (bool5 != null) {
            boolean zBooleanValue4 = bool5.booleanValue();
            builder.copyOnWrite();
            jrk jrkVar19 = (jrk) builder.instance;
            jrkVar19.c |= 2;
            jrkVar19.G = zBooleanValue4;
        }
        ajwo ajwoVar2 = this.a;
        if (ajwoVar2 != null) {
            aigj aigjVar = ajwoVar2.c;
            builder.copyOnWrite();
            jrk jrkVar20 = (jrk) builder.instance;
            aigjVar.getClass();
            jrkVar20.b |= 32;
            jrkVar20.j = aigjVar;
        }
        int i5 = this.p;
        if (i5 > 0) {
            builder.copyOnWrite();
            jrk jrkVar21 = (jrk) builder.instance;
            jrkVar21.c |= SemanticState.LiveRegion;
            jrkVar21.O = i5;
        }
        Optional optional = this.w;
        builder.getClass();
        hkp hkpVar = new hkp(builder, 18);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) hkpVar.a;
            aihfVar.copyOnWrite();
            jrk jrkVar22 = (jrk) aihfVar.instance;
            jrkVar22.c |= 16;
            jrkVar22.J = (aigj) obj;
        }
        Optional optional2 = this.x;
        hkp hkpVar2 = new hkp(builder, 19);
        if (true == optional2.isPresent()) {
            Object obj2 = optional2.get();
            aihf aihfVar2 = (aihf) hkpVar2.a;
            aihfVar2.copyOnWrite();
            jrk jrkVar23 = (jrk) aihfVar2.instance;
            jrkVar23.K = (apla) obj2;
            jrkVar23.c |= 32;
        }
        this.q = (jrk) builder.build();
        abnl abnlVar = new abnl(this.q, this.y, this.a, this.o);
        abnlVar.c = this.v;
        abnlVar.e = this.d;
        abnlVar.f = this.t;
        return abnlVar;
    }

    public final void b() {
        this.i = Boolean.TRUE;
    }

    public final void c(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void d(aigj aigjVar) {
        this.w = Optional.ofNullable(aigjVar);
    }

    public final void e(apla aplaVar) {
        this.x = Optional.ofNullable(aplaVar);
    }

    public final void f(boolean z) {
        this.f = Boolean.valueOf(z);
    }
}
