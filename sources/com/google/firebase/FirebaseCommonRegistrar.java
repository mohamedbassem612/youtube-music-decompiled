package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ahno;
import defpackage.ahnr;
import defpackage.ahoe;
import defpackage.ahoi;
import defpackage.ahoj;
import defpackage.ahos;
import defpackage.ahpd;
import defpackage.ahpn;
import defpackage.ahqz;
import defpackage.ahra;
import defpackage.ahrc;
import defpackage.ahrd;
import defpackage.ahue;
import defpackage.ahug;
import defpackage.ahuh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ArrayList arrayList = new ArrayList();
        final int i = 0;
        ahoj ahojVar = new ahoj(ahuh.class, new Class[0]);
        final int i2 = 2;
        ahojVar.b(new ahos(ahue.class, 2, 0));
        ahojVar.b = new ahpn(12);
        arrayList.add(ahojVar.a());
        ahpd ahpdVar = new ahpd(ahoe.class, Executor.class);
        final int i3 = 1;
        ahoj ahojVar2 = new ahoj(ahqz.class, ahrc.class, ahrd.class);
        ahojVar2.b(new ahos(Context.class, 1, 0));
        ahojVar2.b(new ahos(ahnr.class, 1, 0));
        ahojVar2.b(new ahos(ahra.class, 2, 0));
        ahojVar2.b(new ahos(ahuh.class, 1, 1));
        ahojVar2.b(new ahos(ahpdVar, 1, 0));
        ahojVar2.b = new ahoi(ahpdVar, i2);
        arrayList.add(ahojVar2.a());
        ahue ahueVar = new ahue("fire-android", String.valueOf(Build.VERSION.SDK_INT));
        ahoj ahojVar3 = new ahoj(ahue.class, new Class[0]);
        ahojVar3.c();
        ahojVar3.b = new ahoi(ahueVar, i3);
        arrayList.add(ahojVar3.a());
        ahue ahueVar2 = new ahue("fire-core", "23.0.0_1p");
        ahoj ahojVar4 = new ahoj(ahue.class, new Class[0]);
        ahojVar4.c();
        ahojVar4.b = new ahoi(ahueVar2, i3);
        arrayList.add(ahojVar4.a());
        ahue ahueVar3 = new ahue("device-name", Build.PRODUCT.replace(' ', '_').replace('/', '_'));
        ahoj ahojVar5 = new ahoj(ahue.class, new Class[0]);
        ahojVar5.c();
        ahojVar5.b = new ahoi(ahueVar3, i3);
        arrayList.add(ahojVar5.a());
        ahue ahueVar4 = new ahue("device-model", Build.DEVICE.replace(' ', '_').replace('/', '_'));
        ahoj ahojVar6 = new ahoj(ahue.class, new Class[0]);
        ahojVar6.c();
        ahojVar6.b = new ahoi(ahueVar4, i3);
        arrayList.add(ahojVar6.a());
        ahue ahueVar5 = new ahue("device-brand", Build.BRAND.replace(' ', '_').replace('/', '_'));
        ahoj ahojVar7 = new ahoj(ahue.class, new Class[0]);
        ahojVar7.c();
        ahojVar7.b = new ahoi(ahueVar5, i3);
        arrayList.add(ahojVar7.a());
        arrayList.add(ahno.B("android-target-sdk", new ahug() { // from class: ahnt
            @Override // defpackage.ahug
            public final String a(Object obj) {
                int i4 = i3;
                if (i4 == 0) {
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
                }
                if (i4 == 1) {
                    ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i4 != 2) {
                    Context context = (Context) obj;
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    return installerPackageName != null ? installerPackageName.replace(' ', '_').replace('/', '_') : "";
                }
                Context context2 = (Context) obj;
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                return context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        arrayList.add(ahno.B("android-min-sdk", new ahug() { // from class: ahnt
            @Override // defpackage.ahug
            public final String a(Object obj) {
                int i4 = i;
                if (i4 == 0) {
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
                }
                if (i4 == 1) {
                    ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i4 != 2) {
                    Context context = (Context) obj;
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    return installerPackageName != null ? installerPackageName.replace(' ', '_').replace('/', '_') : "";
                }
                Context context2 = (Context) obj;
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                return context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        arrayList.add(ahno.B("android-platform", new ahug() { // from class: ahnt
            @Override // defpackage.ahug
            public final String a(Object obj) {
                int i4 = i2;
                if (i4 == 0) {
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
                }
                if (i4 == 1) {
                    ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i4 != 2) {
                    Context context = (Context) obj;
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    return installerPackageName != null ? installerPackageName.replace(' ', '_').replace('/', '_') : "";
                }
                Context context2 = (Context) obj;
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                return context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        final int i4 = 3;
        arrayList.add(ahno.B("android-installer", new ahug() { // from class: ahnt
            @Override // defpackage.ahug
            public final String a(Object obj) {
                int i5 = i4;
                if (i5 == 0) {
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
                }
                if (i5 == 1) {
                    ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i5 != 2) {
                    Context context = (Context) obj;
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    return installerPackageName != null ? installerPackageName.replace(' ', '_').replace('/', '_') : "";
                }
                Context context2 = (Context) obj;
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                return context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        return arrayList;
    }
}
