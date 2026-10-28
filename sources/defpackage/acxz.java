package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$MultiLanguageStackInfo;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acxz implements nuc {
    private static final agkz a = agkz.u(aslh.LOG_TYPE_INVALID_FIELD, aslh.LOG_TYPE_MISSING_FIELD, aslh.LOG_TYPE_UNKNOWN_EXTENSION, aslh.LOG_TYPE_CONFIGURATION_ERROR, aslh.LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR, aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR, new aslh[0]);
    private static final agkz b = agkz.r(aslh.ERROR_TYPE_UNKNOWN, aslh.LOG_TYPE_PROPERTY_RESOLUTION_ERROR, aslh.LOG_LEVEL_WARN);
    private final zvl c;
    private final float d;
    private final Random e = new Random();
    private final boolean f;
    private final float g;
    private final agev h;
    private final boolean i;
    private final aunn j;

    public acxz(zvl zvlVar, float f, boolean z, float f2, agev agevVar, agev agevVar2, aunn aunnVar) {
        this.c = zvlVar;
        this.d = f;
        this.f = z;
        this.g = f2;
        this.h = agevVar;
        this.i = ((Boolean) agevVar2.e(Boolean.FALSE)).booleanValue();
        this.j = aunnVar;
    }

    private final boolean j(float f) {
        return f <= this.e.nextFloat();
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void a(aslh aslhVar, String str, Object... objArr) {
        nqy.a(this, aslhVar, str, objArr);
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void b(asnc asncVar, String str, Object... objArr) {
        nqy.b(this, asncVar, str, objArr);
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void c(aslh aslhVar, nsl nslVar, String str, Object... objArr) {
        nqy.d(this, aslhVar, nslVar, null, null, str, objArr);
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void d(asnc asncVar, nsl nslVar, String str, Object... objArr) {
        i(asncVar, nslVar, null, null, str, objArr);
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void e(asnc asncVar, Throwable th, String str, Object... objArr) {
        nqy.c(this, asncVar, th, str, objArr);
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void f(aslh aslhVar, nsl nslVar, Throwable th, String str, Object... objArr) {
        nqy.d(this, aslhVar, nslVar, th, null, str, objArr);
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void g(asnc asncVar, nsl nslVar, Throwable th, String str, Object... objArr) {
        i(asncVar, nslVar, th, null, str, objArr);
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void h(aslh aslhVar, nsl nslVar, Throwable th, asmw asmwVar, String str, Object... objArr) {
        nqy.d(this, aslhVar, nslVar, th, asmwVar, str, objArr);
    }

    /* JADX WARN: Code duplicated, block: B:129:0x033a A[EDGE_INSN: B:129:0x033a->B:130:0x0342 BREAK  A[LOOP:0: B:115:0x02e4->B:128:0x0331], PHI: r6 r7 r8 r9
      0x033a: PHI (r6v1 char) = (r6v0 char), (r6v0 char), (r6v4 char) binds: [B:108:0x02a0, B:113:0x02de, B:159:0x033a] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r7v18 int) = (r7v17 int), (r7v17 int), (r7v20 int) binds: [B:108:0x02a0, B:113:0x02de, B:159:0x033a] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r8v3 char) = (r8v2 char), (r8v2 char), (r8v4 char) binds: [B:108:0x02a0, B:113:0x02de, B:159:0x033a] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r9v14 java.lang.String) = (r9v13 java.lang.String), (r9v13 java.lang.String), (r9v15 java.lang.String) binds: [B:108:0x02a0, B:113:0x02de, B:159:0x033a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0243  */
    /* JADX WARN: Code duplicated, block: B:88:0x0249  */
    /* JADX WARN: Type inference failed for: r11v4, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, mbc] */
    @Override // defpackage.nuc
    public final void i(asnc asncVar, nsl nslVar, Throwable th, asmw asmwVar, String str, Object... objArr) {
        boolean z;
        int i;
        char c;
        int i2;
        char c2;
        String str2;
        aihf aihfVarCreateBuilder = aksg.a.createBuilder();
        if ((asncVar.b & 1) != 0) {
            int i3 = asncVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar = (aksg) aihfVarCreateBuilder.instance;
            aksgVar.c = 120;
            aksgVar.b |= 1;
        }
        char c3 = 2;
        if ((asncVar.b & 2) != 0) {
            aslh aslhVarA = aslh.a(asncVar.d);
            if (aslhVarA == null) {
                aslhVarA = aslh.ERROR_TYPE_UNKNOWN;
            }
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar2 = (aksg) aihfVarCreateBuilder.instance;
            aksgVar2.d = aslhVarA.I;
            aksgVar2.b |= 2;
        }
        if ((asncVar.b & 4) != 0) {
            String str3 = asncVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar3 = (aksg) aihfVarCreateBuilder.instance;
            str3.getClass();
            aksgVar3.b |= 4;
            aksgVar3.e = str3;
        }
        if ((asncVar.b & 8) != 0) {
            String str4 = asncVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar4 = (aksg) aihfVarCreateBuilder.instance;
            str4.getClass();
            aksgVar4.b |= 8;
            aksgVar4.f = str4;
        }
        if ((asncVar.b & 16) != 0) {
            int i4 = asncVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar5 = (aksg) aihfVarCreateBuilder.instance;
            aksgVar5.b |= 16;
            aksgVar5.g = i4;
        }
        aihv aihvVar = asncVar.h;
        aihfVarCreateBuilder.copyOnWrite();
        aksg aksgVar6 = (aksg) aihfVarCreateBuilder.instance;
        aihv aihvVar2 = aksgVar6.h;
        if (!aihvVar2.c()) {
            aksgVar6.h = aihn.mutableCopy(aihvVar2);
        }
        aifs.addAll(aihvVar, aksgVar6.h);
        if ((asncVar.b & 32) != 0) {
            String str5 = asncVar.i;
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar7 = (aksg) aihfVarCreateBuilder.instance;
            str5.getClass();
            aksgVar7.b |= 32;
            aksgVar7.i = str5;
        }
        if ((asncVar.b & 64) != 0) {
            agek agekVar = acyf.a;
            asnb asnbVar = asncVar.j;
            if (asnbVar == null) {
                asnbVar = asnb.a;
            }
            Object objApply = agekVar.apply(asnbVar);
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar8 = (aksg) aihfVarCreateBuilder.instance;
            objApply.getClass();
            aksgVar8.j = (aksf) objApply;
            aksgVar8.b |= 64;
        }
        if ((asncVar.b & SemanticState.Focused) != 0) {
            agek agekVar2 = acyf.b;
            asmz asmzVar = asncVar.k;
            if (asmzVar == null) {
                asmzVar = asmz.a;
            }
            Object objApply2 = agekVar2.apply(asmzVar);
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar9 = (aksg) aihfVarCreateBuilder.instance;
            objApply2.getClass();
            aksgVar9.k = (aksd) objApply2;
            aksgVar9.b |= SemanticState.Focused;
        }
        if ((asncVar.b & SemanticState.Hidden) != 0) {
            String str6 = asncVar.l;
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar10 = (aksg) aihfVarCreateBuilder.instance;
            str6.getClass();
            aksgVar10.b |= SemanticState.Hidden;
            aksgVar10.l = str6;
        }
        if ((asncVar.b & SemanticState.LiveRegion) != 0) {
            int i5 = asncVar.m;
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar11 = (aksg) aihfVarCreateBuilder.instance;
            aksgVar11.b |= SemanticState.LiveRegion;
            aksgVar11.m = i5;
        }
        if ((asncVar.b & SemanticState.ReadOnly) != 0) {
            agek agekVar3 = acyf.c;
            asmy asmyVar = asncVar.n;
            if (asmyVar == null) {
                asmyVar = asmy.a;
            }
            Object objApply3 = agekVar3.apply(asmyVar);
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar12 = (aksg) aihfVarCreateBuilder.instance;
            objApply3.getClass();
            aksgVar12.n = (aksc) objApply3;
            aksgVar12.b |= SemanticState.ReadOnly;
        }
        if ((asncVar.b & SemanticState.Modal) != 0) {
            String str7 = asncVar.o;
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar13 = (aksg) aihfVarCreateBuilder.instance;
            str7.getClass();
            aksgVar13.b |= SemanticState.Modal;
            aksgVar13.o = str7;
        }
        if ((asncVar.b & SemanticState.Obscured) != 0) {
            float f = asncVar.p;
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar14 = (aksg) aihfVarCreateBuilder.instance;
            aksgVar14.b |= SemanticState.Obscured;
            aksgVar14.p = f;
        }
        if ((asncVar.b & SemanticState.Multiline) != 0) {
            int i6 = asncVar.q;
            aihfVarCreateBuilder.copyOnWrite();
            aksg aksgVar15 = (aksg) aihfVarCreateBuilder.instance;
            aksgVar15.b |= SemanticState.Multiline;
            aksgVar15.q = i6;
        }
        aksg aksgVar16 = (aksg) aihfVarCreateBuilder.build();
        String strY = ket.Y(asmwVar);
        if ((aksgVar16.b & 4) != 0) {
            throw new IllegalArgumentException("`ClientError.error_metadata.elements_error_metadata.log_message` should not be set. Use the top-level ClientError.log_message.message proto message instead.");
        }
        String strE = nslVar.e("");
        if (!ahno.aa(strE)) {
            aihf builder = aksgVar16.toBuilder();
            builder.copyOnWrite();
            aksg aksgVar17 = (aksg) builder.instance;
            aksgVar17.b |= 8;
            aksgVar17.f = strE;
            aksgVar16 = (aksg) builder.build();
        }
        aslh aslhVarA2 = aslh.a(aksgVar16.d);
        if (aslhVarA2 == null) {
            aslhVarA2 = aslh.ERROR_TYPE_UNKNOWN;
        }
        if (aslhVarA2.equals(aslh.LOG_LEVEL_INFO_DEPRECATED)) {
            return;
        }
        ajtv ajtvVar = ajtv.ERROR_LEVEL_ERROR;
        aslh aslhVarA3 = aslh.a(aksgVar16.d);
        if (aslhVarA3 == null) {
            aslhVarA3 = aslh.ERROR_TYPE_UNKNOWN;
        }
        char c4 = 0;
        if (aslhVarA3.equals(aslh.LOG_LEVEL_WARN)) {
            z = this.i;
            ajtv ajtvVar2 = ajtv.ERROR_LEVEL_WARNING;
            if (z && j(this.d)) {
                return;
            } else {
                ajtvVar = ajtvVar2;
            }
        } else {
            aslh aslhVarA4 = aslh.a(aksgVar16.d);
            if (aslhVarA4 == null) {
                aslhVarA4 = aslh.ERROR_TYPE_UNKNOWN;
            }
            if (aslhVarA4.equals(aslh.LOG_TYPE_RESOURCE_WARNING)) {
                z = this.i;
                ajtv ajtvVar3 = ajtv.ERROR_LEVEL_WARNING;
                if (z) {
                }
                ajtvVar = ajtvVar3;
            } else if (((vxz) this.j.io()).k(45790234L, false)) {
                aslh aslhVarA5 = aslh.a(aksgVar16.d);
                if (aslhVarA5 == null) {
                    aslhVarA5 = aslh.ERROR_TYPE_UNKNOWN;
                }
                if (aslhVarA5.equals(aslh.LOG_TYPE_INTERNAL_DEBUG_WARNING)) {
                    z = this.i;
                    ajtv ajtvVar4 = ajtv.ERROR_LEVEL_WARNING;
                    if (z) {
                    }
                    ajtvVar = ajtvVar4;
                }
            }
        }
        agkz agkzVar = a;
        aslh aslhVarA6 = aslh.a(aksgVar16.d);
        if (aslhVarA6 == null) {
            aslhVarA6 = aslh.ERROR_TYPE_UNKNOWN;
        }
        if (agkzVar.contains(aslhVarA6)) {
            i = 235;
        } else {
            agkz agkzVar2 = b;
            aslh aslhVarA7 = aslh.a(aksgVar16.d);
            if (aslhVarA7 == null) {
                aslhVarA7 = aslh.ERROR_TYPE_UNKNOWN;
            }
            i = agkzVar2.contains(aslhVarA7) ? 243 : 234;
        }
        aslh aslhVarA8 = aslh.a(aksgVar16.d);
        if (aslhVarA8 == null) {
            aslhVarA8 = aslh.ERROR_TYPE_UNKNOWN;
        }
        String strReplace = aslhVarA8.name().toLowerCase(Locale.ENGLISH).replace('_', '-');
        String str8 = String.format(str, objArr);
        if (!this.i) {
            c = c3;
            i2 = i;
            c2 = c4;
            str2 = strReplace;
            break;
        }
        aciz acizVar = (aciz) ((agfa) this.h).a.io();
        aslh aslhVarA9 = aslh.a(aksgVar16.d);
        if (aslhVarA9 == null) {
            aslhVarA9 = aslh.ERROR_TYPE_UNKNOWN;
        }
        List list = (List) Collection.EL.stream(acizVar.b).filter(new iab(aslhVarA9, str8, 14)).collect(Collectors.toCollection(new yoj(13)));
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c = c3;
                    i2 = i;
                    c2 = c4;
                    str2 = strReplace;
                    break;
                }
                aeqc aeqcVar = (aeqc) it.next();
                aksa aksaVar = (aksa) aeqcVar.d;
                c2 = c4;
                str2 = strReplace;
                long j = aksaVar.e;
                if (j > 0) {
                    ?? r15 = acizVar.a;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c = c3;
                    i2 = i;
                    if ((r15.b() / 1000) - aeqcVar.a > j) {
                        continue;
                    }
                    c4 = c2;
                    strReplace = str2;
                    c3 = c;
                    i = i2;
                } else {
                    c = c3;
                    i2 = i;
                }
                long jIncrementAndGet = ((AtomicLong) aeqcVar.b).incrementAndGet();
                int i7 = aksaVar.d;
                if (i7 > 1) {
                    if (jIncrementAndGet % ((long) i7) == 1) {
                        break;
                    } else {
                        return;
                    }
                } else {
                    c4 = c2;
                    strReplace = str2;
                    c3 = c;
                    i = i2;
                }
            }
        } else {
            c = c3;
            i2 = i;
            c2 = c4;
            str2 = strReplace;
            break;
        }
        Object[] objArr2 = new Object[3];
        objArr2[c2] = str8;
        objArr2[1] = str2;
        objArr2[c] = strY;
        String str9 = String.format("%s Please consult go/elements-error#%s for the next steps. %s", objArr2);
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtvVar);
        zvjVarA.j = 5;
        zvjVarA.i = i2;
        zvjVarA.d(str9);
        zvjVarA.d = Optional.of(aksgVar16);
        if (th != null) {
            if (this.f && (th instanceof mhb)) {
                mhb mhbVar = (mhb) th;
                if (j(this.g)) {
                    nud nudVar = new nud(mhbVar.getMessage());
                    nudVar.setStackTrace(mhbVar.getStackTrace());
                    zvjVarA.f(nudVar);
                } else {
                    aiov aiovVar = mhbVar.b().g;
                    if (aiovVar == null) {
                        aiovVar = aiov.a;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(asjd.b);
                    aiovVar.c(aihlVarCheckIsLite);
                    Object objK = aiovVar.j.k(aihlVarCheckIsLite.d);
                    try {
                        zvjVarA.f = Optional.of((ClientErrorOuterClass$MultiLanguageStackInfo) aihn.parseFrom(ClientErrorOuterClass$MultiLanguageStackInfo.a, ((asjd) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).toByteArray(), ExtensionRegistryLite.getGeneratedRegistry()));
                    } catch (aiik e) {
                        throw new IllegalArgumentException("Unable to convert ElementsStatusException payload to MultiLanguageStackInfo", e);
                    }
                }
            } else {
                zvjVarA.f(th);
            }
        }
        this.c.a(zvjVarA.a());
    }
}
