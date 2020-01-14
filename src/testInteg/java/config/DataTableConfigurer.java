package config;

import java.util.Locale;
import java.util.Map;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import test.UserLoginTest;

/*
 * Maps datatables in feature files to custom domain objects.
 */
public class DataTableConfigurer implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry registry) {
        registry.defineDataTableType(new DataTableType(UserLoginTest.class, new TableEntryTransformer<UserLoginTest>() {
            @Override
            public UserLoginTest transform(Map<String, String> entry) {
                return new UserLoginTest(entry.get("userId"), entry.get("password"));
            }
        }));


    }

}
