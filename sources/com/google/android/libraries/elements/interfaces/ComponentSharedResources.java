package com.google.android.libraries.elements.interfaces;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentSharedResources {
    final DevResourceManager devResourceManager;
    final HashMap foreignFunctions;
    final TemplateMetadataRepository templateMetadataRepository;
    final TemplateResolver templateResolver;

    public ComponentSharedResources(HashMap map, DevResourceManager devResourceManager, TemplateMetadataRepository templateMetadataRepository, TemplateResolver templateResolver) {
        this.foreignFunctions = map;
        this.devResourceManager = devResourceManager;
        this.templateMetadataRepository = templateMetadataRepository;
        this.templateResolver = templateResolver;
    }

    public DevResourceManager getDevResourceManager() {
        return this.devResourceManager;
    }

    public HashMap getForeignFunctions() {
        return this.foreignFunctions;
    }

    public TemplateMetadataRepository getTemplateMetadataRepository() {
        return this.templateMetadataRepository;
    }

    public TemplateResolver getTemplateResolver() {
        return this.templateResolver;
    }

    public String toString() {
        TemplateResolver templateResolver = this.templateResolver;
        TemplateMetadataRepository templateMetadataRepository = this.templateMetadataRepository;
        DevResourceManager devResourceManager = this.devResourceManager;
        return "ComponentSharedResources{foreignFunctions=" + String.valueOf(this.foreignFunctions) + ",devResourceManager=" + String.valueOf(devResourceManager) + ",templateMetadataRepository=" + String.valueOf(templateMetadataRepository) + ",templateResolver=" + String.valueOf(templateResolver) + '}';
    }
}
