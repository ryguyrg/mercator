/**
 * Copyright 2017 Lending Club, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lendingclub.mercator.github;

import java.util.Map;

import org.lendingclub.mercator.core.ScannerBuilder;

import com.google.common.collect.Maps;

public class  GitHubScannerBuilder extends ScannerBuilder<GitHubScanner> {

	Map<String,String> props = Maps.newConcurrentMap();
	
	
	
	public GitHubScannerBuilder withToken(String token) {
		props.put("github.token", token);
		return this;
	}

	public GitHubScannerBuilder withUrl(String url) {
		props.put("github.url", url);
		return this;
	}
	
	public GitHubScannerBuilder withUsername(String username) {
		props.put("github.username", username);
		return this;
	}
	
	public GitHubScannerBuilder withPassword(String password) {
		props.put("github.password", password);
		return this;
	}
	
	@Override
	public GitHubScanner build() {

		
		return new GitHubScanner(this, props);
		
	}


}
