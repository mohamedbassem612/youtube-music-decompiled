package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class yvh {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public yvh(String str, byte[] bArr, agke agkeVar, String str2, int i) {
        typ.f(str);
        zkf.d(bArr);
        this.b = bArr;
        this.c = agkeVar;
        typ.f(str2);
        this.d = str2;
        this.a = i;
    }

    public yvh(agke agkeVar, int i, agkj agkjVar, agkj agkjVar2) {
        this.d = agkeVar;
        this.a = i;
        this.c = agkjVar;
        this.b = agkjVar2;
    }

    public yvh(bye byeVar, byi byiVar, int i, crr crrVar) {
        this.c = byeVar;
        this.b = byiVar;
        this.a = i;
        this.d = crrVar;
    }

    public yvh(CharSequence charSequence, TextPaint textPaint, int i, Layout layout) {
        this.c = charSequence;
        this.b = textPaint;
        this.a = i;
        this.d = layout;
    }

    public yvh(String str, int i, String str2, Set set) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = set;
    }

    public yvh(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.c = uuid;
        this.a = i;
        this.b = bArr;
        this.d = uuidArr;
    }

    public yvh(List list, int i, vmn vmnVar) {
        this.c = new Canvas();
        this.b = list;
        this.a = i;
        this.d = vmnVar;
    }

    public yvh(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        this.a = i;
        this.b = iArr;
        this.c = iArr2;
        this.d = iArr3;
    }
}
