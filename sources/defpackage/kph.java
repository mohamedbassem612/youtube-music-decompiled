package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kph extends cc implements kou {
    public static final WeakHashMap a = new WeakHashMap();
    private final avju b = new avju(null, null);

    @Override // defpackage.kou
    public final Activity a() {
        return getActivity();
    }

    @Override // defpackage.kou
    public final kot b(String str, Class cls) {
        return this.b.f(str, cls);
    }

    @Override // defpackage.kou
    public final void c(String str, kot kotVar) {
        this.b.g(str, kotVar);
    }

    @Override // defpackage.cc
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.b.o();
    }

    @Override // defpackage.cc
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.b.h(i, i2, intent);
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.b.i(bundle);
    }

    @Override // defpackage.cc
    public final void onDestroy() {
        super.onDestroy();
        this.b.j();
    }

    @Override // defpackage.cc
    public final void onResume() {
        super.onResume();
        this.b.k();
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        this.b.l(bundle);
    }

    @Override // defpackage.cc
    public final void onStart() {
        super.onStart();
        this.b.m();
    }

    @Override // defpackage.cc
    public final void onStop() {
        super.onStop();
        this.b.n();
    }
}
