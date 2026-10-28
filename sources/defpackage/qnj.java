package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qnj {
    public final String a;
    public final agfr b;
    final /* synthetic */ qnk c;

    public qnj(qnk qnkVar, String str, final int i, final int i2) {
        this.c = qnkVar;
        this.a = str;
        this.b = new qnh(new agfr() { // from class: qni
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.agfr
            public final Object io() throws IOException {
                aihf aihfVarCreateBuilder = ahnn.a.createBuilder();
                qnj qnjVar = this.a;
                int i3 = i;
                try {
                    Resources resourcesA = qnjVar.c.a();
                    if (resourcesA == null) {
                        return null;
                    }
                    qnjVar.a(aihfVarCreateBuilder, resourcesA, i3);
                    long jLongValue = ((Long) qnjVar.c.c.io()).longValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    ahnn ahnnVar = (ahnn) aihfVarCreateBuilder.instance;
                    ahnnVar.b |= SemanticState.Focused;
                    ahnnVar.l = jLongValue;
                    String strB = yre.b(ahnnVar.g);
                    String str2 = qnjVar.a;
                    ahno.R(strB.equals(str2), "Resource package does not match expected package, expected package: %s", str2);
                    ahnn ahnnVar2 = (ahnn) aihfVarCreateBuilder.instance;
                    String strCl = ahnnVar2.g;
                    qnk qnkVar2 = qnjVar.c;
                    boolean z = ahnnVar2.h;
                    if (strCl.isEmpty()) {
                        throw new IllegalArgumentException("Empty configuration package");
                    }
                    String str3 = qnkVar2.a;
                    if (z) {
                        if (strCl.indexOf(35) >= 0) {
                            throw new IllegalArgumentException(String.format("When %s is present, %s should not contain subpackage separator %s (config package=%s)", "auto-subpackage", "configuration-package", '#', strCl));
                        }
                        strCl = a.cl(str3, (byte) 35, strCl);
                    }
                    if (((ahnn) aihfVarCreateBuilder.instance).c != 2) {
                        Integer num = (Integer) qnkVar2.d.io();
                        num.intValue();
                        aihfVarCreateBuilder.copyOnWrite();
                        ahnn ahnnVar3 = (ahnn) aihfVarCreateBuilder.instance;
                        ahnnVar3.c = 2;
                        ahnnVar3.d = num;
                    }
                    int i4 = i2;
                    aihfVarCreateBuilder.copyOnWrite();
                    ahnn ahnnVar4 = (ahnn) aihfVarCreateBuilder.instance;
                    strCl.getClass();
                    ahnnVar4.b |= 1;
                    ahnnVar4.g = strCl;
                    aihfVarCreateBuilder.copyOnWrite();
                    ahnn ahnnVar5 = (ahnn) aihfVarCreateBuilder.instance;
                    str3.getClass();
                    ahnnVar5.e = 7;
                    ahnnVar5.f = str3;
                    aihfVarCreateBuilder.copyOnWrite();
                    ahnn ahnnVar6 = (ahnn) aihfVarCreateBuilder.instance;
                    ahnnVar6.k = 3;
                    ahnnVar6.b |= 32;
                    if (i4 == 0) {
                        return (ahnn) aihfVarCreateBuilder.build();
                    }
                    aihf aihfVarCreateBuilder2 = qng.a.createBuilder();
                    qnjVar.a(aihfVarCreateBuilder2, resourcesA, i4);
                    String str4 = ((qng) aihfVarCreateBuilder2.instance).c;
                    String str5 = qnjVar.a;
                    ahno.U(str4.equals(str5), "Package in HeterodyneInfo binary %s does not match resource lookup for %s", ((qng) aihfVarCreateBuilder2.instance).c, str5);
                    aihfVarCreateBuilder2.copyOnWrite();
                    qng qngVar = (qng) aihfVarCreateBuilder2.instance;
                    qngVar.b &= -2;
                    qngVar.c = qng.a.c;
                    aigj byteString = ((qng) aihfVarCreateBuilder2.build()).toByteString();
                    aihfVarCreateBuilder.copyOnWrite();
                    ahnn ahnnVar7 = (ahnn) aihfVarCreateBuilder.instance;
                    ahnnVar7.b |= SemanticState.Hidden;
                    ahnnVar7.m = byteString;
                    return (ahnn) aihfVarCreateBuilder.build();
                } catch (PackageManager.NameNotFoundException | IOException | NullPointerException unused) {
                    return null;
                }
            }
        });
    }

    public final void a(aiir aiirVar, Resources resources, int i) throws IOException {
        InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        try {
            this.c.f.a++;
            aiirVar.mergeFrom(aigm.N(inputStreamOpenRawResource, Math.max(SemanticState.LiveRegion, Math.min(SemanticState.Obscured, inputStreamOpenRawResource.available()))), ExtensionRegistryLite.a);
            if (inputStreamOpenRawResource != null) {
                inputStreamOpenRawResource.close();
            }
        } catch (Throwable th) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
