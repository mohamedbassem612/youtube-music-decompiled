package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ax(4);
    final String a;
    final String b;
    final boolean c;
    final boolean d;
    final int e;
    final int f;
    final String g;
    final boolean h;
    final boolean i;
    final boolean j;
    final boolean k;
    final int l;
    public final String m;
    public final int n;
    public final boolean o;

    public dj(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        this.o = parcel.readInt() != 0;
    }

    public final cc a(cj cjVar) {
        cc ccVarB = cjVar.b(this.a);
        ccVarB.mWho = this.b;
        ccVarB.mFromLayout = this.c;
        ccVarB.mInDynamicContainer = this.d;
        ccVarB.mRestored = true;
        ccVarB.mFragmentId = this.e;
        ccVarB.mContainerId = this.f;
        ccVarB.mTag = this.g;
        ccVarB.mRetainInstance = this.h;
        ccVarB.mRemoving = this.i;
        ccVarB.mDetached = this.j;
        ccVarB.mHidden = this.k;
        ccVarB.mMaxState = bob.values()[this.l];
        ccVarB.mTargetWho = this.m;
        ccVarB.mTargetRequestCode = this.n;
        ccVarB.mUserVisibleHint = this.o;
        return ccVarB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(SemanticState.Focused);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.d) {
            sb.append(" dynamicContainer");
        }
        int i = this.f;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.k) {
            sb.append(" hidden");
        }
        String str2 = this.m;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.n);
        }
        if (this.o) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public dj(cc ccVar) {
        this.a = ccVar.getClass().getName();
        this.b = ccVar.mWho;
        this.c = ccVar.mFromLayout;
        this.d = ccVar.mInDynamicContainer;
        this.e = ccVar.mFragmentId;
        this.f = ccVar.mContainerId;
        this.g = ccVar.mTag;
        this.h = ccVar.mRetainInstance;
        this.i = ccVar.mRemoving;
        this.j = ccVar.mDetached;
        this.k = ccVar.mHidden;
        this.l = ccVar.mMaxState.ordinal();
        this.m = ccVar.mTargetWho;
        this.n = ccVar.mTargetRequestCode;
        this.o = ccVar.mUserVisibleHint;
    }
}
