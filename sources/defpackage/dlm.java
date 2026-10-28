package defpackage;

import android.widget.CompoundButton;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class dlm implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public dlm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ajwo ajwoVar;
        ajly ajlyVar;
        ajwo ajwoVar2;
        int i = 11;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                Object obj = this.a;
                if (!((Preference) obj).U(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    ((TwoStatePreference) obj).k(z);
                }
                break;
            case 1:
                Object obj2 = this.a;
                if (!((Preference) obj2).U(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    ((TwoStatePreference) obj2).k(z);
                }
                break;
            case 2:
                Object obj3 = this.a;
                if (!((Preference) obj3).U(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    ((TwoStatePreference) obj3).k(z);
                }
                break;
            case 3:
                abgt abgtVar = ((hyc) this.a).m;
                if (abgtVar != null) {
                    hyn hynVar = (hyn) abgtVar;
                    ((abgu) hynVar.a).a.an(z);
                    taf.j(hynVar.b.e.q(z), new hou(i));
                }
                break;
            case 4:
                Object obj4 = this.a;
                jge jgeVar = (jge) obj4;
                jgeVar.d.c();
                boolean z2 = jgeVar.e;
                if (z2) {
                    if (!z) {
                        if (jgeVar.c == null) {
                            jgeVar.c = jgeVar.f.g(jgeVar.a).setMessage(R.string.collab_playlist_turn_off_confirm_message).setPositiveButton(R.string.okay, new dkh(obj4, 10, bArr)).setNegativeButton(R.string.dialog_negative_text, new dkh(obj4, i, bArr)).setOnCancelListener(new gxt(obj4, 8)).create();
                        }
                        jgeVar.c.show();
                    } else {
                        z = true;
                    }
                }
                if (!z2 && z) {
                    jgeVar.d(true);
                    break;
                }
                break;
            case 5:
                if (compoundButton.isChecked()) {
                    ((rnp) this.a).l();
                }
                break;
            case 6:
                if (compoundButton.isChecked()) {
                    ((rnp) this.a).l();
                }
                break;
            case 7:
                adyc adycVar = (adyc) this.a;
                ajly ajlyVarN = ((aciz) adycVar.c).n();
                if (z) {
                    ajwoVar = ajlyVarN.g;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                } else {
                    ajwoVar = ajlyVarN.h;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                }
                adof.c(ajwoVar, adycVar);
                break;
            default:
                aekt aektVar = (aekt) ((xta) this.a).b;
                aqso aqsoVar = aektVar.b;
                ajlx ajlxVar = aqsoVar.d;
                if (ajlxVar == null) {
                    ajlxVar = ajlx.a;
                }
                if ((ajlxVar.b & 2) != 0) {
                    ajlx ajlxVar2 = aqsoVar.d;
                    if (ajlxVar2 == null) {
                        ajlxVar2 = ajlx.a;
                    }
                    ajlyVar = ajlxVar2.c;
                    if (ajlyVar == null) {
                        ajlyVar = ajly.a;
                    }
                } else {
                    ajlyVar = null;
                }
                if (ajlyVar != null) {
                    if (z) {
                        ajwoVar2 = ajlyVar.e;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                    } else {
                        ajwoVar2 = ajlyVar.f;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                    }
                    aektVar.a.c(ajwoVar2, null);
                }
                break;
        }
    }

    public /* synthetic */ dlm(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
