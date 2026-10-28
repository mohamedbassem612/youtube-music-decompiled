package defpackage;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ce extends ck implements avi, avj, auz, ava, bpp, qw, rh, dow, dh, ayn {
    final /* synthetic */ cf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(cf cfVar) {
        super(cfVar, cfVar, new Handler());
        this.a = cfVar;
    }

    @Override // defpackage.ck, defpackage.ch
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.ayn
    public final void addMenuProvider(ayr ayrVar) {
        this.a.addMenuProvider(ayrVar);
    }

    @Override // defpackage.avi
    public final void addOnConfigurationChangedListener(axo axoVar) {
        this.a.addOnConfigurationChangedListener(axoVar);
    }

    @Override // defpackage.auz
    public final void addOnMultiWindowModeChangedListener(axo axoVar) {
        this.a.addOnMultiWindowModeChangedListener(axoVar);
    }

    @Override // defpackage.ava
    public final void addOnPictureInPictureModeChangedListener(axo axoVar) {
        this.a.addOnPictureInPictureModeChangedListener(axoVar);
    }

    @Override // defpackage.avj
    public final void addOnTrimMemoryListener(axo axoVar) {
        this.a.addOnTrimMemoryListener(axoVar);
    }

    @Override // defpackage.ck, defpackage.ch
    public final boolean b() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.ck
    public final LayoutInflater c() {
        cf cfVar = this.a;
        return cfVar.getLayoutInflater().cloneInContext(cfVar);
    }

    @Override // defpackage.ck
    public final /* synthetic */ Object d() {
        return this.a;
    }

    @Override // defpackage.ck
    public final void e() {
        this.a.invalidateMenu();
    }

    @Override // defpackage.ck
    public final boolean f(String str) {
        return atb.b(this.a, str);
    }

    @Override // defpackage.dh
    public final void g(cc ccVar) {
        this.a.onAttachFragment(ccVar);
    }

    @Override // defpackage.rh
    public final rg getActivityResultRegistry() {
        return this.a.getActivityResultRegistry();
    }

    @Override // defpackage.bog
    public final boc getLifecycle() {
        return this.a.mFragmentLifecycleRegistry;
    }

    @Override // defpackage.qw
    public final qv getOnBackPressedDispatcher() {
        return this.a.getOnBackPressedDispatcher();
    }

    @Override // defpackage.dow
    public final dou getSavedStateRegistry() {
        return this.a.getSavedStateRegistry();
    }

    @Override // defpackage.bpp
    public final bpo getViewModelStore() {
        return this.a.getViewModelStore();
    }

    @Override // defpackage.ck
    public final void h(PrintWriter printWriter, String[] strArr) {
        this.a.dump("  ", null, printWriter, strArr);
    }

    @Override // defpackage.ayn
    public final void removeMenuProvider(ayr ayrVar) {
        this.a.removeMenuProvider(ayrVar);
    }

    @Override // defpackage.avi
    public final void removeOnConfigurationChangedListener(axo axoVar) {
        this.a.removeOnConfigurationChangedListener(axoVar);
    }

    @Override // defpackage.auz
    public final void removeOnMultiWindowModeChangedListener(axo axoVar) {
        this.a.removeOnMultiWindowModeChangedListener(axoVar);
    }

    @Override // defpackage.ava
    public final void removeOnPictureInPictureModeChangedListener(axo axoVar) {
        this.a.removeOnPictureInPictureModeChangedListener(axoVar);
    }

    @Override // defpackage.avj
    public final void removeOnTrimMemoryListener(axo axoVar) {
        this.a.removeOnTrimMemoryListener(axoVar);
    }
}
