package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mow implements nvr {
    private final boolean a;

    public mow(agev agevVar) {
        this.a = ((Boolean) agevVar.e(Boolean.FALSE)).booleanValue();
    }

    public static void b(mwo mwoVar, ntq ntqVar) {
        if ((ntqVar.g() || ntqVar.e() || ntqVar.f()) && mwoVar.m()) {
            ntqVar.a().w(mwoVar.k());
        }
    }

    @Override // defpackage.nvr
    public final mep a() {
        return mwo.B;
    }

    @Override // defpackage.nvs
    public final /* bridge */ /* synthetic */ void c(fhd fhdVar, nsl nslVar, Object obj, ntq ntqVar) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0102  */
    /* JADX WARN: Code duplicated, block: B:70:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x009f A[SYNTHETIC] */
    @Override // defpackage.nvs
    public final /* synthetic */ void e(fhd fhdVar, nsl nslVar, String str, Object obj, ntq ntqVar, nru nruVar) {
        String str2;
        Resources resourcesC;
        int i;
        mwo mwoVar = (mwo) obj;
        fgv fgvVarA = ntqVar.a();
        String strH = mwoVar.h();
        CharSequence charSequenceJ = mwoVar.j();
        if (!TextUtils.isEmpty(mwoVar.i())) {
            fgvVarA.F(mwoVar.i());
        }
        if (!TextUtils.isEmpty(charSequenceJ)) {
            fgvVarA.t(charSequenceJ);
        }
        if (!TextUtils.isEmpty(strH)) {
            fgvVarA.b.k().F().d(strH);
        }
        if (mwoVar.m()) {
            fgvVarA.w(mwoVar.k());
        }
        String strI = mwoVar.i();
        int i2 = 2;
        if (!TextUtils.isEmpty(strI) && mwoVar.k()) {
            ntqVar.t(R.id.elements_accessibility_view_tag_id, strI);
        }
        int i3 = 2;
        boolean z = false;
        for (int i4 = 0; i4 < mwoVar.g(); i4++) {
            int iBA = mwoVar.bA(i4);
            int i5 = iBA - 1;
            if (i5 == 2 || i5 == 4) {
                if (i5 > i3 - 1) {
                    i3 = iBA;
                }
            } else if (i5 != 7) {
                switch (i5) {
                    case 10:
                        z = true;
                        break;
                    case 11:
                    case 12:
                    case 14:
                    case 15:
                        if (i5 > i3 - 1) {
                            i3 = iBA;
                        }
                        break;
                    case 13:
                        fgvVarA.b.k().F().e(true);
                        break;
                }
            } else {
                fgvVarA.b.k().F().o(false);
            }
        }
        int i6 = i3 - 1;
        String string = null;
        if (i6 == 2) {
            str2 = "android.widget.Button";
        } else if (i6 == 4) {
            str2 = "android.widget.ImageView";
        } else if (i6 == 11) {
            str2 = "android.widget.Spinner";
        } else if (i6 == 12) {
            str2 = "android.widget.RadioButton";
        } else if (i6 != 14) {
            str2 = i6 != 15 ? null : "android.widget.ToggleButton";
        } else {
            str2 = "android.widget.CompoundButton";
        }
        if (str2 != null) {
            fgvVarA.b.k().F().f(str2);
        }
        if (i3 == 13 || i3 == 15) {
            resourcesC = fhdVar.c();
            if (!this.a && i3 == 13) {
                string = resourcesC.getString(true != z ? R.string.elements_not_selected : R.string.elements_selected);
            } else if (i3 == 16) {
                if (true != z) {
                    i = R.string.elements_toggle_off;
                } else {
                    i = R.string.elements_toggle_on;
                }
                string = resourcesC.getString(i);
            }
            ntqVar.u(new ntf(z, string));
        } else if (i3 == 16) {
            i3 = 16;
            resourcesC = fhdVar.c();
            if (!this.a) {
                if (i3 == 16) {
                    if (true != z) {
                        i = R.string.elements_toggle_off;
                    } else {
                        i = R.string.elements_toggle_on;
                    }
                    string = resourcesC.getString(i);
                }
            } else if (i3 == 16) {
                if (true != z) {
                    i = R.string.elements_toggle_off;
                } else {
                    i = R.string.elements_toggle_on;
                }
                string = resourcesC.getString(i);
            }
            ntqVar.u(new ntf(z, string));
        }
        int iN = mwoVar.n() - 1;
        if (iN == 1) {
            i2 = 1;
        } else if (iN == 2) {
            i2 = 8;
        } else if (iN != 3) {
            i2 = iN != 4 ? 0 : 4;
        }
        fgt fgtVarD = fgvVarA.b.k().D();
        fgtVarD.a |= 1;
        fgtVarD.d = i2;
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void d(ntq ntqVar) {
    }
}
