package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class avju {
    public final Object a;
    public int b;
    public Object c;

    public avju(byte[] bArr, byte[] bArr2) {
        this.a = DesugarCollections.synchronizedMap(new afv());
        this.b = 0;
    }

    public static int a(int i, float f) {
        return (int) ((-i) * f);
    }

    public final void b(float f) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        this.b = a(recyclerView.getHeight(), f);
        c();
        if (f > 0.0f) {
            vqa vqaVar = new vqa(this, getClass().getSimpleName(), f);
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(vqaVar);
            this.c = Optional.of(vqaVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, java.lang.Object] */
    public final void c() {
        Object obj = this.c;
        urh urhVar = new urh(this, 17);
        Optional optional = (Optional) obj;
        if (true == optional.isPresent()) {
            ((RecyclerView) ((avju) urhVar.a).a).getViewTreeObserver().removeOnGlobalLayoutListener(optional.get());
        }
        this.c = Optional.empty();
    }

    public final Optional d(int i) {
        return (i < 0 || i >= this.b) ? Optional.empty() : Optional.of(((uhz[]) this.c)[i]);
    }

    public final void e(float f, float f2) {
        int i = this.b;
        Object obj = this.c;
        int length = ((uhz[]) obj).length;
        if (i >= length) {
            this.c = (uhz[]) Arrays.copyOf((Object[]) obj, length << 1);
        }
        uhz[] uhzVarArr = (uhz[]) this.c;
        uhz uhzVar = uhzVarArr[i];
        if (uhzVar == null) {
            uhzVar = new uhz(i, f, f2);
            uhzVarArr[i] = uhzVar;
        } else {
            uhzVar.a = i;
            uhzVar.b = f;
            uhzVar.c = f2;
        }
        this.b++;
        ((PriorityQueue) this.a).add(uhzVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final kot f(String str, Class cls) {
        return (kot) cls.cast(this.a.get(str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void g(String str, kot kotVar) {
        ?? r0 = this.a;
        if (r0.containsKey(str)) {
            throw new IllegalArgumentException(a.bT(str, "LifecycleCallback with tag ", " already added to this fragment."));
        }
        r0.put(str, kotVar);
        if (this.b > 0) {
            new afkg(Looper.getMainLooper(), (byte[]) null).post(new gwb((Object) this, (Object) kotVar, str, 14));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void h(int i, int i2, Intent intent) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((kot) it.next()).d(i, i2, intent);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void i(Bundle bundle) {
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.a.entrySet()) {
            ((kot) entry.getValue()).e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void j() {
        this.b = 5;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((kot) it.next()).n();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void k() {
        this.b = 3;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((kot) it.next()).k();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void l(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : this.a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((kot) entry.getValue()).h(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void m() {
        this.b = 2;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((kot) it.next()).i();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void n() {
        this.b = 4;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((kot) it.next()).j();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void o() {
        for (kot kotVar : this.a.values()) {
        }
    }

    public final void p(int i) {
        azs.i(i, 1, 3, "cardinality");
        this.b = i;
    }

    public final si q() {
        Object obj = this.c;
        int i = this.b;
        obj.getClass();
        return new si(new vg((String) this.a, 5, i, null, null, null, null, null, (String) obj, null, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Appendable, java.lang.Object] */
    public final void r(CharSequence charSequence) {
        try {
            this.a.append(charSequence);
            this.b += charSequence.length();
        } catch (IOException e) {
            throw new ad(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Appendable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final void s(Format format, Object obj) {
        if (this.c == null) {
            r(format.format(obj));
            return;
        }
        AttributedCharacterIterator toCharacterIterator = format.formatToCharacterIterator(obj);
        int i = this.b;
        ?? r0 = this.a;
        try {
            int beginIndex = toCharacterIterator.getBeginIndex();
            int endIndex = toCharacterIterator.getEndIndex();
            int i2 = endIndex - beginIndex;
            if (beginIndex < endIndex) {
                r0.append(toCharacterIterator.first());
                while (true) {
                    beginIndex++;
                    if (beginIndex >= endIndex) {
                        break;
                    } else {
                        r0.append(toCharacterIterator.next());
                    }
                }
            }
            this.b = i2 + i;
            toCharacterIterator.first();
            int index = toCharacterIterator.getIndex();
            int endIndex2 = toCharacterIterator.getEndIndex();
            int i3 = i - index;
            while (index < endIndex2) {
                Map<AttributedCharacterIterator.Attribute, Object> attributes = toCharacterIterator.getAttributes();
                int runLimit = toCharacterIterator.getRunLimit();
                if (attributes.size() != 0) {
                    for (Map.Entry<AttributedCharacterIterator.Attribute, Object> entry : attributes.entrySet()) {
                        this.c.add(new asd(entry.getKey(), entry.getValue(), i3 + index, i3 + runLimit));
                    }
                }
                toCharacterIterator.setIndex(runLimit);
                index = runLimit;
            }
        } catch (IOException e) {
            throw new ad(e);
        }
    }

    public final void t(Format format, Object obj, String str) {
        if (this.c != null || str == null) {
            s(format, obj);
        } else {
            r(str);
        }
    }

    public avju(StringBuffer stringBuffer) {
        this.a = stringBuffer;
        this.b = stringBuffer.length();
        this.c = null;
    }

    public avju(StringBuilder sb) {
        this.a = sb;
        this.b = sb.length();
        this.c = null;
    }

    public avju(String str) {
        this.c = "";
        this.b = 2;
        azs.l(str);
        this.a = str;
    }

    public avju(Object obj) {
        this.a = obj;
    }

    public avju(byte[] bArr) {
        this.b = 3;
        this.a = UUID.randomUUID().toString();
    }

    public avju() {
        this.c = new uhz[1];
        this.a = new PriorityQueue(1);
    }

    public avju(RecyclerView recyclerView) {
        this.a = recyclerView;
        this.c = Optional.empty();
        this.b = 0;
    }

    public avju(actw actwVar) {
        this.b = 0;
        this.a = actwVar;
        this.c = Optional.empty();
    }
}
