package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aebv extends aebr {
    public SharedPreferences a;
    public String[] b;
    public boolean c;
    public qcb d;
    private CharSequence e;
    private CharSequence f;
    private TextView g;
    private TextView h;
    private ImageView i;

    public static String[] c(Context context, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!tya.a(context, str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final void d() {
        this.g.setText(this.f);
        this.h.setText(R.string.permission_open_settings_button);
        this.c = true;
    }

    private static boolean e(Context context, String[] strArr) {
        return c(context, strArr).length == 0;
    }

    private final boolean f() {
        Set<String> stringSet = this.a.getStringSet("permissions_requested", null);
        if (stringSet == null) {
            return false;
        }
        for (String str : this.b) {
            if (!tya.a(getActivity(), str) && stringSet.contains(str) && !getActivity().shouldShowRequestPermissionRationale(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        Bundle arguments = getArguments();
        String[] stringArray = arguments.getStringArray("missing_permissions");
        stringArray.getClass();
        this.b = stringArray;
        this.e = arguments.getCharSequence("allow_access_description");
        this.f = arguments.getCharSequence("open_settings_description");
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.permission_fragment, viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.permission_description);
        this.g = textView;
        textView.setText(this.e);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.action_button);
        this.h = textView2;
        textView2.setOnClickListener(new aebu(this, 1));
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.close_button);
        this.i = imageView;
        imageView.setOnClickListener(new aebu(this, 0));
        if (f()) {
            d();
        }
        return viewInflate;
    }

    @Override // defpackage.cc
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        qcb qcbVar;
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.a.edit();
        HashSet hashSet = new HashSet(this.a.getStringSet("permissions_requested", agpr.a));
        Collections.addAll(hashSet, strArr);
        editorEdit.putStringSet("permissions_requested", hashSet);
        editorEdit.apply();
        if (f()) {
            d();
        }
        if (!e(getActivity(), this.b) || (qcbVar = this.d) == null) {
            return;
        }
        qcbVar.b();
    }

    @Override // defpackage.cc
    public final void onStart() {
        qcb qcbVar;
        super.onStart();
        if (this.c && e(getActivity(), this.b) && (qcbVar = this.d) != null) {
            qcbVar.b();
        }
    }
}
