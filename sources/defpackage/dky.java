package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dky extends cc implements dlf, dld, dle, dka {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private static final String TAG = "PreferenceFragment";
    private boolean mHavePrefs;
    private boolean mInitDone;
    public RecyclerView mList;
    private dlg mPreferenceManager;
    private Runnable mSelectPreferenceRunnable;
    private final dkt mDividerDecoration = new dkt(this);
    private int mLayoutResId = R.layout.preference_list_fragment;
    private final Handler mHandler = new dks(this, Looper.getMainLooper());
    private final Runnable mRequestFocus = new cqc(this, 18, null);

    private void postBindPreferences() {
        if (this.mHandler.hasMessages(1)) {
            return;
        }
        this.mHandler.obtainMessage(1).sendToTarget();
    }

    private void requirePreferenceManager() {
        if (this.mPreferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void scrollToPreferenceInternal(Preference preference, String str) {
        bf bfVar = new bf(this, preference, str, 15);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = bfVar;
        } else {
            bfVar.run();
        }
    }

    private void unbindPreferences() {
        getListView().ad(null);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.E();
        }
        onUnbindPreferences();
    }

    public void addPreferencesFromResource(int i) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.e(requireContext(), i, getPreferenceScreen()));
    }

    public void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().ad(onCreateAdapter(preferenceScreen));
            preferenceScreen.B();
        }
        onBindPreferences();
    }

    @Override // defpackage.dka
    public Preference findPreference(CharSequence charSequence) {
        dlg dlgVar = this.mPreferenceManager;
        if (dlgVar == null) {
            return null;
        }
        return dlgVar.d(charSequence);
    }

    public cc getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.mList;
    }

    public dlg getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public PreferenceScreen getPreferenceScreen() {
        dlg dlgVar = this.mPreferenceManager;
        if (dlgVar == null) {
            return null;
        }
        return dlgVar.b;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        dlg dlgVar = new dlg(requireContext());
        this.mPreferenceManager = dlgVar;
        dlgVar.e = this;
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString(ARG_PREFERENCE_ROOT) : null);
    }

    protected nh onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new dlb(preferenceScreen);
    }

    public np onCreateLayoutManager() {
        return new LinearLayoutManager(requireContext());
    }

    public abstract void onCreatePreferences(Bundle bundle, String str);

    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.ah(onCreateLayoutManager());
        recyclerView2.ac(new dli(recyclerView2));
        return recyclerView2;
    }

    @Override // defpackage.cc
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, dlk.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.mLayoutResId = typedArrayObtainStyledAttributes.getResourceId(0, this.mLayoutResId);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewOnCreateRecyclerView = onCreateRecyclerView(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewOnCreateRecyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.mList = recyclerViewOnCreateRecyclerView;
        recyclerViewOnCreateRecyclerView.aJ(this.mDividerDecoration);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        this.mDividerDecoration.c = z;
        if (this.mList.getParent() == null) {
            viewGroup2.addView(this.mList);
        }
        this.mHandler.post(this.mRequestFocus);
        return viewInflate;
    }

    @Override // defpackage.cc
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    public void onDisplayPreferenceDialog(Preference preference) {
        bp dklVar;
        boolean zA = getCallbackFragment() instanceof dku ? ((dku) getCallbackFragment()).a() : false;
        cc parentFragment = this;
        while (!zA) {
            if (parentFragment == null) {
                if (!(getContext() instanceof dku)) {
                    break;
                }
                zA = ((dku) getContext()).a();
                break;
            } else {
                if (parentFragment instanceof dku) {
                    zA = ((dku) parentFragment).a();
                }
                parentFragment = parentFragment.getParentFragment();
            }
        }
        if (zA) {
            return;
        }
        if (!((getActivity() instanceof dku) && ((dku) getActivity()).a()) && getParentFragmentManager().g(DIALOG_FRAGMENT_TAG) == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.t;
                dklVar = new dkd();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                dklVar.setArguments(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.t;
                dklVar = new dki();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                dklVar.setArguments(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                String str3 = preference.t;
                dklVar = new dkl();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                dklVar.setArguments(bundle3);
            }
            dklVar.setTargetFragment(this, 0);
            dklVar.gT(getParentFragmentManager(), DIALOG_FRAGMENT_TAG);
        }
    }

    @Override // defpackage.dle
    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        if (getCallbackFragment() instanceof dkw) {
            ((dkw) getCallbackFragment()).g(preferenceScreen);
        }
        for (cc parentFragment = this; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof dkw) {
                ((dkw) parentFragment).g(preferenceScreen);
            }
        }
        if (getContext() instanceof dkw) {
            ((dkw) getContext()).g(preferenceScreen);
        }
        if (getActivity() instanceof dkw) {
            ((dkw) getActivity()).g(preferenceScreen);
        }
    }

    public boolean onPreferenceTreeClick(Preference preference) {
        boolean z;
        if (preference.v == null) {
            return false;
        }
        if (getCallbackFragment() instanceof dkv) {
            ((dkv) getCallbackFragment()).f(preference);
            z = true;
        } else {
            z = false;
        }
        cc parentFragment = this;
        while (!z) {
            if (parentFragment == null) {
                if (!(getContext() instanceof dkv)) {
                    if (!(getActivity() instanceof dkv)) {
                        Log.w(TAG, "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                        dd parentFragmentManager = getParentFragmentManager();
                        Bundle bundleS = preference.s();
                        cj cjVarJ = parentFragmentManager.j();
                        requireActivity().getClassLoader();
                        cc ccVarB = cjVarJ.b(preference.v);
                        ccVarB.setArguments(bundleS);
                        ccVarB.setTargetFragment(this, 0);
                        av avVar = new av(parentFragmentManager);
                        avVar.q(((View) requireView().getParent()).getId(), ccVarB, null);
                        avVar.o(null);
                        avVar.a(false, true);
                        break;
                    }
                    ((dkv) getActivity()).f(preference);
                    break;
                }
                ((dkv) getContext()).f(preference);
                break;
            }
            if (parentFragment instanceof dkv) {
                ((dkv) parentFragment).f(preference);
                z = true;
            }
            parentFragment = parentFragment.getParentFragment();
        }
        return true;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public void m668x22bc4f96(Bundle bundle) {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.y(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    @Override // defpackage.cc
    public void onStart() {
        super.onStart();
        dlg dlgVar = this.mPreferenceManager;
        dlgVar.c = this;
        dlgVar.d = this;
    }

    @Override // defpackage.cc
    public void onStop() {
        super.onStop();
        dlg dlgVar = this.mPreferenceManager;
        dlgVar.c = null;
        dlgVar.d = null;
    }

    @Override // defpackage.cc
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        if (bundle != null && (bundle2 = bundle.getBundle(PREFERENCES_TAG)) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.x(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    public void scrollToPreference(Preference preference) {
        scrollToPreferenceInternal(preference, null);
    }

    public void setDivider(Drawable drawable) {
        dkt dktVar = this.mDividerDecoration;
        if (drawable != null) {
            dktVar.b = drawable.getIntrinsicHeight();
        } else {
            dktVar.b = 0;
        }
        dktVar.a = drawable;
        dktVar.d.mList.P();
    }

    public void setDividerHeight(int i) {
        dkt dktVar = this.mDividerDecoration;
        dktVar.b = i;
        dktVar.d.mList.P();
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        dlg dlgVar;
        PreferenceScreen preferenceScreen2;
        if (preferenceScreen == null || preferenceScreen == (preferenceScreen2 = (dlgVar = this.mPreferenceManager).b)) {
            return;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.E();
        }
        dlgVar.b = preferenceScreen;
        onUnbindPreferences();
        this.mHavePrefs = true;
        if (this.mInitDone) {
            postBindPreferences();
        }
    }

    public void setPreferencesFromResource(int i, String str) {
        Preference preferenceL;
        requirePreferenceManager();
        PreferenceScreen preferenceScreenE = this.mPreferenceManager.e(requireContext(), i, null);
        PreferenceScreen preferenceScreen = preferenceScreenE;
        if (str != null) {
            preferenceL = preferenceScreenE.l(str);
            if (!(preferenceL instanceof PreferenceScreen)) {
                preferenceScreen = preferenceL;
                throw new IllegalArgumentException(a.bT(str, "Preference object with key ", " is not a PreferenceScreen"));
            }
        }
        preferenceScreen = preferenceL;
        setPreferenceScreen(preferenceScreen);
    }

    public void scrollToPreference(String str) {
        scrollToPreferenceInternal(null, str);
    }

    protected void onBindPreferences() {
    }

    protected void onUnbindPreferences() {
    }
}
