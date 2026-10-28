package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbp implements zwz {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public ArrayList e;
    public acbq f;
    public acbs g;
    private final HashMap h;
    private final boolean i;
    private final abmt j;

    public acbp(boolean z, abmt abmtVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        HashMap map3 = new HashMap();
        this.c = map3;
        this.d = new HashMap();
        this.h = new HashMap();
        this.e = new ArrayList();
        new acbs().b = 0;
        new acbv().b = 0;
        new acbu().b = 0;
        map.put(0, new acbs());
        map2.put(0, new acbv());
        map3.put(0, new acbu());
        this.i = z;
        this.j = abmtVar;
        this.g = acbs.a;
    }

    private final CharSequence h(String str, acbs acbsVar) {
        StyleSpan styleSpan;
        int i;
        Integer numC;
        Integer numC2;
        if (!this.j.bw()) {
            return str;
        }
        awtk awtkVar = acbx.a;
        str.getClass();
        acbsVar.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        boolean z = acbsVar.c;
        byte[] bArr = null;
        if (z && acbsVar.e) {
            styleSpan = new StyleSpan(3);
        } else if (acbsVar.e) {
            styleSpan = new StyleSpan(1);
        } else {
            styleSpan = z ? new StyleSpan(2) : null;
        }
        acbx.a(spannableStringBuilder, styleSpan);
        if (acbsVar.d) {
            acbx.a(spannableStringBuilder, new UnderlineSpan());
        }
        int i2 = acbsVar.g;
        if (i2 != 100) {
            acbx.a(spannableStringBuilder, new RelativeSizeSpan(i2 < 100 ? i2 / 100.0f : (((i2 - 100) / 100.0f) * 0.25f) + 1.0f));
        }
        if (acbx.d(acbsVar) == 1 && (numC2 = acbx.c(acbsVar)) != null) {
            efi efiVar = new efi(acbx.e(acbsVar), numC2, 10);
            awtk awtkVar2 = acbx.a;
            if (spannableStringBuilder.length() < 0) {
                throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + spannableStringBuilder.length());
            }
            awsv awsvVar = new awsv(new awsw(new efi(awtkVar2, spannableStringBuilder, 14, bArr), awtj.a));
            while (awsvVar.hasNext()) {
                awtg awtgVar = (awtg) awsvVar.next();
                spannableStringBuilder.setSpan(efiVar.invoke(), awtgVar.a().a, awtgVar.a().b + 1, 33);
            }
        } else if (acbsVar.j || !acbsVar.l || (i = acbsVar.m) < 0 || i > 255) {
            Integer numE = acbx.e(acbsVar);
            if (numE != null) {
                acbx.a(spannableStringBuilder, new ForegroundColorSpan(numE.intValue()));
            }
        } else {
            acbx.a(spannableStringBuilder, new accq(i, 1, null));
        }
        if (acbx.d(acbsVar) == 2 && (numC = acbx.c(acbsVar)) != null) {
            acbx.a(spannableStringBuilder, new accq(numC.intValue(), 0));
        }
        return spannableStringBuilder;
    }

    @Override // defpackage.zwz
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final acbn a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            arrayList.add(((accd) it.next()).a());
        }
        return new acbn(arrayList);
    }

    public final acbs c(int i) {
        return (acbs) tym.R(this.a, Integer.valueOf(i), acbs.a);
    }

    public final acbt d(int i) {
        return (acbt) this.d.get(Integer.valueOf(i));
    }

    public final acbu e(int i) {
        return (acbu) tym.R(this.c, Integer.valueOf(i), acbu.a);
    }

    public final acbv f(int i) {
        return (acbv) tym.R(this.b, Integer.valueOf(i), acbv.a);
    }

    public final void g(acbq acbqVar) {
        Object obj;
        Integer numB;
        acby acbyVar;
        int i;
        int i2 = acbqVar.e.b;
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.h;
        accd accdVar = (accd) map.get(numValueOf);
        if (accdVar == null) {
            accd accdVar2 = new accd(i2, this.i, this.j);
            map.put(numValueOf, accdVar2);
            accdVar = accdVar2;
        }
        if (acbqVar.c) {
            CharSequence charSequenceH = h(acbqVar.h, acbqVar.d);
            int i3 = (int) acbqVar.a;
            accdVar.c(charSequenceH, i3, ((int) acbqVar.b) + i3);
        } else {
            CharSequence charSequenceH2 = h(acbqVar.h, acbqVar.d);
            int i4 = (int) acbqVar.a;
            accdVar.d(charSequenceH2, i4, ((int) acbqVar.b) + i4);
        }
        int i5 = (int) acbqVar.a;
        acbu acbuVar = acbqVar.e;
        int i6 = acbuVar.c;
        int i7 = acbuVar.e;
        int i8 = acbuVar.d;
        int i9 = 0;
        boolean z = acbqVar.f.c == 2;
        acbr acbrVar = null;
        if (this.j.bw()) {
            if (acbqVar.h.isEmpty()) {
                ArrayList arrayList = acbqVar.g;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj = acbqVar.d;
                        break;
                    }
                    acbr acbrVar2 = (acbr) arrayList.get(i10);
                    i10++;
                    if (!((String) acbrVar2.c).isEmpty()) {
                        obj = acbrVar2.b;
                        break;
                    }
                }
            } else {
                obj = acbqVar.d;
            }
            awtk awtkVar = acbx.a;
            obj.getClass();
            acbs acbsVar = (acbs) obj;
            if (!acbsVar.n || (i = acbsVar.q) < 0 || i >= 256) {
                numB = null;
            } else {
                String str = acbsVar.o;
                str.getClass();
                numB = acbx.b(str, i);
            }
            acbyVar = new acby(0, numB, (acbsVar.n || !acbsVar.p) ? null : Integer.valueOf(acbsVar.q));
        } else {
            acbyVar = null;
        }
        accdVar.e(i5, new accf(i6, i7, i8, true, z, acbyVar));
        if (acbqVar.g.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = acbqVar.g;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            acbr acbrVar3 = (acbr) arrayList2.get(i9);
            if (acbrVar != null) {
                CharSequence charSequenceH3 = h((String) acbrVar.c, (acbs) acbrVar.b);
                long j = acbqVar.a;
                accdVar.c(charSequenceH3, (int) (acbrVar.a + j), (int) (j + acbqVar.b));
            }
            i9++;
            acbrVar = acbrVar3;
        }
        if (acbrVar != null) {
            CharSequence charSequenceH4 = h((String) acbrVar.c, (acbs) acbrVar.b);
            long j2 = acbqVar.a;
            accdVar.c(charSequenceH4, (int) (acbrVar.a + j2), (int) (j2 + acbqVar.b));
        }
    }
}
