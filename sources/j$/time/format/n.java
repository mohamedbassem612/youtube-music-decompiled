package j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class n implements e {
    public final j$.time.temporal.a a;
    public final TextStyle b;
    public final a c;
    public volatile h d;

    public n(j$.time.temporal.a aVar, TextStyle textStyle, a aVar2) {
        this.a = aVar;
        this.b = textStyle;
        this.c = aVar2;
    }

    @Override // j$.time.format.e
    public final boolean h(t tVar, StringBuilder sb) {
        String strD;
        Long lA = tVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = tVar.b;
        if (lA == null) {
            return false;
        }
        j$.time.chrono.a aVar = (j$.time.chrono.a) tVar.a.w(j$.time.temporal.o.b);
        if (aVar == null || aVar == j$.time.chrono.s.c) {
            a aVar2 = this.c;
            long jLongValue = lA.longValue();
            TextStyle textStyle = this.b;
            Locale locale = dateTimeFormatter.b;
            strD = aVar2.a.d(jLongValue, textStyle);
        } else {
            a aVar3 = this.c;
            long jLongValue2 = lA.longValue();
            TextStyle textStyle2 = this.b;
            Locale locale2 = dateTimeFormatter.b;
            strD = aVar3.a.d(jLongValue2, textStyle2);
        }
        if (strD != null) {
            sb.append(strD);
            return true;
        }
        if (this.d == null) {
            this.d = new h(this.a, 1, 19, y.NORMAL);
        }
        return this.d.h(tVar, sb);
    }

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
    @Override // j$.time.format.e
    public final int k(r rVar, CharSequence charSequence, int i) {
        r rVar2;
        CharSequence charSequence2;
        int i2;
        a aVar = this.c;
        j$.time.temporal.a aVar2 = this.a;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        boolean z = rVar.c;
        DateTimeFormatter dateTimeFormatter = rVar.a;
        Iterator it = null;
        TextStyle textStyle = z ? this.b : null;
        j$.time.chrono.a aVar3 = rVar.c().c;
        if (aVar3 == null && (aVar3 = rVar.a.d) == null) {
            aVar3 = j$.time.chrono.s.c;
        }
        if (aVar3 == null || aVar3 == j$.time.chrono.s.c) {
            Locale locale = dateTimeFormatter.b;
            List list = (List) ((HashMap) aVar.a.c).get(textStyle);
            if (list != null) {
                it = list.iterator();
            }
        } else {
            List list2 = (List) ((HashMap) aVar.a.c).get(textStyle);
            if (list2 != null) {
                it = list2.iterator();
            }
        }
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                r rVar3 = rVar;
                CharSequence charSequence3 = charSequence;
                int i3 = i;
                if (rVar3.g(str, 0, charSequence3, i3, str.length())) {
                    return rVar3.f(this.a, ((Long) entry.getValue()).longValue(), i3, str.length() + i3);
                }
                rVar = rVar3;
                charSequence = charSequence3;
                i = i3;
            }
            rVar2 = rVar;
            charSequence2 = charSequence;
            i2 = i;
            if (aVar2 == j$.time.temporal.a.ERA && !rVar2.c) {
                for (j$.time.chrono.m mVar : aVar3.eras()) {
                    String string = mVar.toString();
                    if (rVar2.g(string, 0, charSequence2, i2, string.length())) {
                        return rVar2.f(this.a, mVar.getValue(), i2, string.length() + i2);
                    }
                }
            }
            if (rVar2.c) {
                return ~i2;
            }
        } else {
            rVar2 = rVar;
            charSequence2 = charSequence;
            i2 = i;
        }
        if (this.d == null) {
            this.d = new h(this.a, 1, 19, y.NORMAL);
        }
        return this.d.k(rVar2, charSequence2, i2);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TextStyle textStyle2 = this.b;
        j$.time.temporal.a aVar = this.a;
        if (textStyle2 == textStyle) {
            return j$.desugar.sun.nio.fs.i.a("Text(", String.valueOf(aVar), ")");
        }
        return "Text(" + String.valueOf(aVar) + "," + String.valueOf(textStyle2) + ")";
    }
}
