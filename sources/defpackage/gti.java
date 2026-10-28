package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.playlist.privacy.PlaylistPrivacySpinner;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gti extends gut {
    public final Activity a;
    public final wsg b;
    public final ttm c;
    public final tbt d;
    public final vxe e;
    public EditText f;
    public PlaylistPrivacySpinner g;
    public final jin h;
    private final aduv i;
    private final mfy k;
    private final acyx l;
    private fv m;

    public gti(Activity activity, wsg wsgVar, ttm ttmVar, tbt tbtVar, vxe vxeVar, jin jinVar, aduv aduvVar, mfy mfyVar, acyx acyxVar) {
        activity.getClass();
        this.a = activity;
        wsgVar.getClass();
        this.b = wsgVar;
        ttmVar.getClass();
        this.c = ttmVar;
        tbtVar.getClass();
        this.d = tbtVar;
        vxeVar.getClass();
        this.e = vxeVar;
        this.h = jinVar;
        this.i = aduvVar;
        this.k = mfyVar;
        this.l = acyxVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        alay alayVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akgk.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akgk.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        akgk akgkVar = (akgk) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        int i = akgkVar.d;
        if (i == 9) {
            apji apjiVar = i == 9 ? (apji) akgkVar.e : apji.a;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite3);
            if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                apji apjiVar2 = akgkVar.d == 9 ? (apji) akgkVar.e : apji.a;
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(akrs.a);
                apjiVar2.c(aihlVarCheckIsLite4);
                Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite4.d);
                try {
                    asmv asmvVar = (asmv) aihn.parseFrom(asmv.a, this.l.c((akrn) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).c, ExtensionRegistryLite.getGeneratedRegistry());
                    mfv mfvVarA = mfx.a();
                    mfvVarA.i = new gtf(this);
                    this.k.c(asmvVar, mfvVarA.a());
                    return;
                } catch (aiik unused) {
                    return;
                }
            }
        }
        byte[] bArr = null;
        if (this.m == null) {
            Activity activity = this.a;
            View viewInflate = LayoutInflater.from(activity).inflate(R.layout.playlist_edit_metadata, (ViewGroup) null, false);
            this.f = (EditText) viewInflate.findViewById(R.id.name);
            viewInflate.findViewById(R.id.description_container).setVisibility(8);
            PlaylistPrivacySpinner playlistPrivacySpinner = (PlaylistPrivacySpinner) viewInflate.findViewById(R.id.privacy_status);
            this.g = playlistPrivacySpinner;
            int i2 = 1;
            if (playlistPrivacySpinner != null) {
                playlistPrivacySpinner.c(this.i);
                this.g.setOnTouchListener(new jfs(this, viewInflate, i2));
            }
            this.f.setOnFocusChangeListener(new gxs(this, 1));
            this.f.addTextChangedListener(new gxv(this, 1));
            fu fuVar = new fu(activity);
            fuVar.setView(viewInflate);
            fuVar.setNegativeButton(android.R.string.cancel, new dkh(this, 2, bArr));
            fuVar.g(new gxt(this, 1));
            fv fvVarCreate = fuVar.create();
            this.m = fvVarCreate;
            Window window = fvVarCreate.getWindow();
            if (window != null) {
                window.setSoftInputMode(16);
            }
            this.m.setOnShowListener(new gxu(this, 1, null));
        }
        EditText editText = this.f;
        if (editText != null) {
            editText.setText("");
        }
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        fv fvVar = this.m;
        if (fvVar != null) {
            if (objS instanceof ajnf) {
                ajnf ajnfVar = (ajnf) objS;
                if ((ajnfVar.b & 64) != 0) {
                    alayVar = ajnfVar.m;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                fvVar.setTitle(ackj.k(null, alayVar, null, false));
            } else {
                fvVar.setTitle(R.string.create_new_playlist);
            }
            this.m.a.e(-1, this.a.getString(R.string.create), new gth(this, ajwoVar, objS));
            this.m.show();
        }
        d();
    }

    public final void d() {
        Button buttonB;
        fv fvVar = this.m;
        if (fvVar == null || this.f == null || (buttonB = fvVar.b(-1)) == null) {
            return;
        }
        String strTrim = this.f.getText().toString().trim();
        boolean z = false;
        if (!TextUtils.isEmpty(strTrim) && strTrim.length() <= this.a.getResources().getInteger(R.integer.create_playlist_title_max_length)) {
            z = true;
        }
        buttonB.setEnabled(z);
    }
}
