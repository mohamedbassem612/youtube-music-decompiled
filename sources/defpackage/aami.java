package defpackage;

import android.graphics.Typeface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aami {
    public final int a;
    public final Object b;

    public aami(ahuy ahuyVar) {
        agkg.b(ahuyVar.a);
        this.b = ahuyVar.c;
        this.a = ahuyVar.d;
        agke.n(ahuyVar.b);
    }

    public static aami e(aami aamiVar) {
        ahno.F(aamiVar.a == 5);
        ByteBuffer byteBufferAsReadOnlyBuffer = ((ByteBuffer) aamiVar.b).asReadOnlyBuffer();
        return new aami(atz.f(byteBufferAsReadOnlyBuffer), byteBufferAsReadOnlyBuffer);
    }

    public final String a() {
        return ((aamh) this.b).a;
    }

    public final boolean b(int i) {
        int i2 = this.a;
        if (i2 != 3) {
            return i2 == 1 || i != 1;
        }
        return false;
    }

    public final String c() {
        if (this.a == 0) {
            return (String) this.b;
        }
        throw new IllegalStateException("Wrong data accessor type detected. ArrayBuffer expected, but got String");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final axd[] d() {
        return (axd[]) this.b.get(0);
    }

    public aami(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public aami(Typeface typeface) {
        this.b = typeface;
        this.a = 0;
    }

    public aami(Object obj) {
        this.b = obj;
        this.a = 0;
    }

    public aami(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public aami(Object obj, int i, byte[] bArr) {
        this.b = obj;
        this.a = i;
    }

    public aami(List list) {
        this.a = 0;
        this.b = list;
    }

    @Deprecated
    public aami() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    public aami(aamh aamhVar, int i) {
        aamhVar.getClass();
        this.b = aamhVar;
        this.a = i;
    }

    public aami(int i) {
        this.b = null;
        this.a = i;
    }

    public aami(byte[] bArr) {
        bArr.getClass();
        this.b = null;
        this.a = 1;
    }

    public aami(klo kloVar, int i) {
        kro.l(kloVar);
        this.b = kloVar;
        this.a = i;
    }

    public aami(PaintUnit paintUnit, int i) {
        this.b = new WeakReference(paintUnit);
        this.a = i;
    }

    public aami(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        this.a = byteBuffer.position();
    }

    public aami(uom uomVar, int i) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(uomVar);
        this.a = i;
    }
}
