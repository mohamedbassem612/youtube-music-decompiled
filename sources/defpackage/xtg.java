package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xtg implements adma {
    public final Context a;
    public final xsh b;
    private final View c;
    private final Resources d;

    public xtg(Context context, xsh xshVar, Resources resources) {
        this.a = context;
        this.c = View.inflate(context, R.layout.mdx_device_picker_metadata, null);
        this.b = xshVar;
        this.d = resources;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.c;
    }

    protected final int d() {
        kro kroVar = this.b.m;
        return kro.af(this.d);
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        Object obj2;
        Resources resourcesForApplication;
        View view = this.c;
        xtf xtfVar = (xtf) obj;
        TextView textView = (TextView) view.findViewById(R.id.device_picker_metadata_title);
        TextView textView2 = (TextView) view.findViewById(R.id.device_picker_metadata_subtitle);
        TextView textView3 = (TextView) view.findViewById(R.id.device_picker_metadata_ad_subtitle);
        ImageView imageView = (ImageView) view.findViewById(R.id.device_picker_metadata_icon);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.device_picker_metadata_container);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.device_picker_metadata_layout_parent);
        IconCompat iconCompat = xtfVar.g;
        String str = xtfVar.d;
        String str2 = xtfVar.e;
        if (textView == null || textView2 == null || textView3 == null || imageView == null || linearLayout2 == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            linearLayout2.setVisibility(8);
            return;
        }
        Context context = this.a;
        textView.setTextColor(tzk.i(context, R.attr.ytTextPrimary));
        textView2.setTextColor(tzk.i(context, R.attr.ytTextSecondary));
        textView3.setTextColor(tzk.i(context, R.attr.ytTextPrimary));
        if (xtfVar.h) {
            textView.setText(true != this.b.f() ? R.string.main_ad_playing_title : R.string.music_ad_playing_title);
            textView2.setVisibility(8);
            textView3.setText(R.string.sponsored_ad_badge);
            textView3.setVisibility(0);
        } else {
            textView.setText(str);
            textView2.setText(str2);
            textView2.setVisibility(0);
            textView3.setVisibility(8);
        }
        int iD = d();
        kro kroVar = this.b.m;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(iD, (int) this.d.getDimension(R.dimen.music_app_devicepicker_metadata_icon_layout_height)));
        linearLayout.requestLayout();
        if (iconCompat != null) {
            Context context2 = linearLayout2.getContext();
            if (iconCompat.b == 2 && (obj2 = iconCompat.c) != null) {
                String str3 = (String) obj2;
                if (str3.contains(":")) {
                    String str4 = str3.split(":", -1)[1];
                    String str5 = str4.split("/", -1)[0];
                    String str6 = str4.split("/", -1)[1];
                    String str7 = str3.split(":", -1)[0];
                    if (!"0_resource_name_obfuscated".equals(str6)) {
                        String strI = iconCompat.i();
                        if ("android".equals(strI)) {
                            resourcesForApplication = Resources.getSystem();
                        } else {
                            PackageManager packageManager = context2.getPackageManager();
                            try {
                                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strI, SemanticState.Multiline);
                                resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                            } catch (PackageManager.NameNotFoundException e) {
                                Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", strI), e);
                            }
                        }
                        int identifier = resourcesForApplication.getIdentifier(str6, str5, str7);
                        if (iconCompat.f != identifier) {
                            iconCompat.f = identifier;
                        }
                    }
                }
            }
            imageView.setImageDrawable(aaj.e(iconCompat, context2).loadDrawable(context2));
            Bitmap bitmap = xtfVar.f;
            if (bitmap != null) {
                kro kroVar2 = this.b.m;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int iD2 = width >= height ? (int) (d() * (height / width)) : d();
                imageView.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(d(), iD2));
                imageView.requestLayout();
            }
        }
        linearLayout2.setVisibility(0);
        xsj xsjVar = this.b.c;
        xgx xgxVarC = xsjVar.c(xsjVar.F, xhb.b(162179));
        if (xgxVarC != null) {
            xsjVar.F = xgxVarC;
        }
        linearLayout2.setOnClickListener(new xpr(this, 17, null));
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
