package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jvn extends ViewGroup.MarginLayoutParams implements jvk {
    public static final Parcelable.Creator CREATOR = new vj(19);
    public boolean a;
    private int b;
    private float c;
    private float d;
    private int e;
    private float f;
    private int g;
    private int h;
    private int i;
    private int j;

    public jvn(Parcel parcel) {
        super(0, 0);
        this.b = 1;
        this.c = 0.0f;
        this.d = 1.0f;
        this.e = -1;
        this.f = -1.0f;
        this.i = 16777215;
        this.j = 16777215;
        this.b = parcel.readInt();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readInt();
        this.f = parcel.readFloat();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.a = parcel.readByte() != 0;
        this.bottomMargin = parcel.readInt();
        this.leftMargin = parcel.readInt();
        this.rightMargin = parcel.readInt();
        this.topMargin = parcel.readInt();
        this.height = parcel.readInt();
        this.width = parcel.readInt();
    }

    @Override // defpackage.jvk
    public final float a() {
        return this.f;
    }

    @Override // defpackage.jvk
    public final float b() {
        return this.c;
    }

    @Override // defpackage.jvk
    public final float c() {
        return this.d;
    }

    @Override // defpackage.jvk
    public final int d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.jvk
    public final int e() {
        return this.height;
    }

    @Override // defpackage.jvk
    public final int f() {
        return this.bottomMargin;
    }

    @Override // defpackage.jvk
    public final int g() {
        return this.leftMargin;
    }

    @Override // defpackage.jvk
    public final int h() {
        return this.rightMargin;
    }

    @Override // defpackage.jvk
    public final int i() {
        return this.topMargin;
    }

    @Override // defpackage.jvk
    public final int j() {
        return this.j;
    }

    @Override // defpackage.jvk
    public final int k() {
        return this.i;
    }

    @Override // defpackage.jvk
    public final int l() {
        return this.h;
    }

    @Override // defpackage.jvk
    public final int m() {
        return this.g;
    }

    @Override // defpackage.jvk
    public final int n() {
        return this.b;
    }

    @Override // defpackage.jvk
    public final int o() {
        return this.width;
    }

    @Override // defpackage.jvk
    public final void p(int i) {
        this.h = i;
    }

    @Override // defpackage.jvk
    public final void q(int i) {
        this.g = i;
    }

    @Override // defpackage.jvk
    public final boolean r() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }

    public jvn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 1;
        this.c = 0.0f;
        this.d = 1.0f;
        this.e = -1;
        this.f = -1.0f;
        this.i = 16777215;
        this.j = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jvs.b);
        this.b = typedArrayObtainStyledAttributes.getInt(8, 1);
        this.c = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        this.d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        this.e = typedArrayObtainStyledAttributes.getInt(0, -1);
        this.f = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        this.a = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public jvn() {
        super(new ViewGroup.LayoutParams(-2, -2));
        this.b = 1;
        this.c = 0.0f;
        this.d = 1.0f;
        this.e = -1;
        this.f = -1.0f;
        this.i = 16777215;
        this.j = 16777215;
    }

    public jvn(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 1;
        this.c = 0.0f;
        this.d = 1.0f;
        this.e = -1;
        this.f = -1.0f;
        this.i = 16777215;
        this.j = 16777215;
    }

    public jvn(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = 1;
        this.c = 0.0f;
        this.d = 1.0f;
        this.e = -1;
        this.f = -1.0f;
        this.i = 16777215;
        this.j = 16777215;
    }

    public jvn(jvn jvnVar) {
        super((ViewGroup.MarginLayoutParams) jvnVar);
        this.b = 1;
        this.c = 0.0f;
        this.d = 1.0f;
        this.e = -1;
        this.f = -1.0f;
        this.i = 16777215;
        this.j = 16777215;
        this.b = jvnVar.b;
        this.c = jvnVar.c;
        this.d = jvnVar.d;
        this.e = jvnVar.e;
        this.f = jvnVar.f;
        this.g = jvnVar.g;
        this.h = jvnVar.h;
        this.i = jvnVar.i;
        this.j = jvnVar.j;
        this.a = jvnVar.a;
    }
}
