package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dcv implements dbd {
    private final dcq a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map e;

    public dcv(dcq dcqVar, Map map, Map map2, Map map3) {
        this.a = dcqVar;
        this.d = map2;
        this.e = map3;
        this.c = DesugarCollections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        dcqVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    @Override // defpackage.dbd
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.dbd
    public final int b(long j) {
        long[] jArr = this.b;
        int iAl = bwp.al(jArr, j, false);
        if (iAl >= jArr.length) {
            return -1;
        }
        return iAl;
    }

    @Override // defpackage.dbd
    public final long c(int i) {
        return this.b[i];
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
    @Override // defpackage.dbd
    public final List e(long j) {
        ArrayList arrayList = new ArrayList();
        dcq dcqVar = this.a;
        String str = dcqVar.h;
        dcqVar.e(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        dcqVar.g(j, false, str, treeMap);
        Map map = this.c;
        Map map2 = this.d;
        dcqVar.f(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Map map3 = this.e;
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                dct dctVar = (dct) map2.get(pair.first);
                dctVar.getClass();
                bur burVar = new bur();
                burVar.b(bitmapDecodeByteArray);
                burVar.e = dctVar.b;
                burVar.f = 0;
                burVar.c(dctVar.c, 0);
                burVar.d = dctVar.e;
                burVar.g = dctVar.f;
                burVar.h = dctVar.g;
                burVar.j = dctVar.j;
                arrayList2.add(burVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            dct dctVar2 = (dct) map2.get(entry.getKey());
            dctVar2.getClass();
            bur burVar2 = (bur) entry.getValue();
            CharSequence charSequence = burVar2.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (dco dcoVar : (dco[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), dco.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(dcoVar), spannableStringBuilder.getSpanEnd(dcoVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            burVar2.c(dctVar2.c, dctVar2.d);
            burVar2.d = dctVar2.e;
            burVar2.e = dctVar2.b;
            burVar2.g = dctVar2.f;
            burVar2.e(dctVar2.i, dctVar2.h);
            burVar2.j = dctVar2.j;
            arrayList2.add(burVar2.a());
        }
        return arrayList2;
    }
}
