package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gxx extends gut {
    public final itu a;
    public final ttm b;
    public final tbt c;
    public final vxe d;
    public EditText e;
    public ajwo f;
    public final jin g;
    private final Activity h;
    private AlertDialog i;
    private final abfv k;

    public gxx(Activity activity, itu ituVar, ttm ttmVar, tbt tbtVar, vxe vxeVar, jin jinVar, abfv abfvVar) {
        activity.getClass();
        this.h = activity;
        ituVar.getClass();
        this.a = ituVar;
        ttmVar.getClass();
        this.b = ttmVar;
        tbtVar.getClass();
        this.c = tbtVar;
        vxeVar.getClass();
        this.d = vxeVar;
        this.g = jinVar;
        this.k = abfvVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apyq.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        this.f = ajwoVar;
        if (this.i == null) {
            Activity activity = this.h;
            View viewInflate = LayoutInflater.from(activity).inflate(R.layout.playlist_edit_metadata, (ViewGroup) null, false);
            viewInflate.findViewById(R.id.description_container).setVisibility(8);
            viewInflate.findViewById(R.id.privacy_container).setVisibility(8);
            viewInflate.findViewById(R.id.privacy_label).setVisibility(8);
            EditText editText = (EditText) viewInflate.findViewById(R.id.name);
            this.e = editText;
            editText.setOnFocusChangeListener(new gxs(this, 0));
            this.e.addTextChangedListener(new gxv(this, 0));
            AlertDialog.Builder view = this.k.g(activity).setView(viewInflate);
            AppCompatTextView appCompatTextView = new AppCompatTextView(activity);
            appCompatTextView.setText(R.string.create_new_playlist);
            appCompatTextView.setTypeface(ackm.YOUTUBE_SANS_BOLD.c(activity, 0));
            appCompatTextView.setTextSize(0, activity.getResources().getDimension(R.dimen.create_playlist_dialog_title_size));
            appCompatTextView.setTextColor(activity.getResources().getColor(R.color.ytm_text_color_primary));
            FrameLayout frameLayout = new FrameLayout(activity);
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.create_playlist_dialog_title_padding_horizontal);
            frameLayout.setPadding(dimensionPixelSize, activity.getResources().getDimensionPixelSize(R.dimen.create_playlist_dialog_title_padding_top), dimensionPixelSize, 0);
            frameLayout.addView(appCompatTextView);
            AlertDialog alertDialogCreate = view.setCustomTitle(frameLayout).setPositiveButton(activity.getString(R.string.create), new dkh(this, 4)).setNegativeButton(android.R.string.cancel, new dkh(this, 3, null)).setOnCancelListener(new gxt(this, 0)).create();
            this.i = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new gxu(this, 0));
        }
        this.e.setText("");
        this.i.show();
        d();
    }

    public final void d() {
        Button button = this.i.getButton(-1);
        if (button != null) {
            String strTrim = this.e.getText().toString().trim();
            boolean z = false;
            if (!TextUtils.isEmpty(strTrim) && strTrim.length() <= this.h.getResources().getInteger(R.integer.create_playlist_title_max_length)) {
                z = true;
            }
            button.setEnabled(z);
            button.setTextColor(this.h.getResources().getColor(true != z ? R.color.action_button_text_disabled : R.color.action_button_text));
        }
    }
}
