package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nj {
    public nj(List list) {
        DesugarCollections.unmodifiableList(list);
    }

    public static void a(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void b(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof pm) {
                editorInfo.hintText = ((pm) parent).a();
                return;
            }
        }
    }

    public static Object c(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static int e(bwb bwbVar) {
        int i = bwbVar.i();
        if (bwbVar.i() == 1684108385) {
            bwbVar.Q(8);
            int i2 = i - 16;
            if (i2 == 1) {
                return bwbVar.n();
            }
            if (i2 == 2) {
                return bwbVar.s();
            }
            if (i2 == 3) {
                return bwbVar.p();
            }
            if (i2 == 4 && (bwbVar.h() & SemanticState.Focused) == 0) {
                return bwbVar.q();
            }
        }
        bvx.e("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static cyh f(int i, String str, bwb bwbVar, boolean z, boolean z2) {
        int iE = e(bwbVar);
        if (z2) {
            iE = Math.min(1, iE);
        }
        if (iE >= 0) {
            return z ? new cym(str, null, agke.q(Integer.toString(iE))) : new cyd("und", str, Integer.toString(iE));
        }
        bvx.e("MetadataUtil", "Failed to parse uint8 attribute: ".concat(rpi.H(i)));
        return null;
    }

    public static cym g(int i, String str, bwb bwbVar) {
        int i2 = bwbVar.i();
        if (bwbVar.i() == 1684108385 && i2 >= 22) {
            bwbVar.Q(10);
            int iS = bwbVar.s();
            if (iS > 0) {
                String strValueOf = String.valueOf(iS);
                int iS2 = bwbVar.s();
                if (iS2 > 0) {
                    strValueOf = strValueOf + '/' + iS2;
                }
                return new cym(str, null, agke.q(strValueOf));
            }
        }
        bvx.e("MetadataUtil", "Failed to parse index/count attribute: ".concat(rpi.H(i)));
        return null;
    }

    public static cym h(int i, String str, bwb bwbVar) {
        int i2 = bwbVar.i();
        if (bwbVar.i() == 1684108385) {
            bwbVar.Q(8);
            return new cym(str, null, agke.q(bwbVar.B(i2 - 16)));
        }
        bvx.e("MetadataUtil", "Failed to parse text attribute: ".concat(rpi.H(i)));
        return null;
    }

    public static void i(int i, cvr cvrVar, bsd bsdVar) {
        if (i == 1 && cvrVar.a()) {
            bsdVar.K = cvrVar.a;
            bsdVar.L = cvrVar.b;
        }
    }

    public static void j(int i, bsx bsxVar, bsd bsdVar, bsx bsxVar2, bsx... bsxVarArr) {
        if (bsxVar2 == null) {
            bsxVar2 = new bsx(-9223372036854775807L, new bsw[0]);
        }
        if (bsxVar != null) {
            agjz agjzVar = new agjz(4);
            for (bsw bswVar : bsxVar.a) {
                if (bwu.class.isAssignableFrom(bswVar.getClass())) {
                    agjzVar.h((bsw) bwu.class.cast(bswVar));
                }
            }
            agke agkeVarG = agjzVar.g();
            int i2 = ((agpi) agkeVarG).d;
            for (int i3 = 0; i3 < i2; i3++) {
                bwu bwuVar = (bwu) agkeVarG.get(i3);
                if (!bwuVar.a.equals("com.android.capture.fps") || i == 2) {
                    bsxVar2 = bsxVar2.d(bwuVar);
                }
            }
        }
        for (bsx bsxVar3 : bsxVarArr) {
            bsxVar2 = bsxVar2.e(bsxVar3);
        }
        if (bsxVar2.a() > 0) {
            bsdVar.l = bsxVar2;
        }
    }

    public static final long k(cvu cvuVar, long j, int i, int i2) {
        if (j != -1 && j != 0) {
            long j2 = j * ((long) cvuVar.g);
            if (i != -1 && i2 != -1) {
                j2 -= (long) (i + i2);
            }
            if (j2 > 0) {
                return bwp.B(j2 - 1, cvuVar.d);
            }
        }
        return -9223372036854775807L;
    }

    public static int l(long j, long j2) {
        if (j > 0 && j2 > 0) {
            long jD = bwp.D(j, 8000000L, j2, RoundingMode.HALF_UP);
            if (jD > 0 && jD <= 2147483647L) {
                return (int) jD;
            }
        }
        return -2147483647;
    }
}
